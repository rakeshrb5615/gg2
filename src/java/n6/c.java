package n6;

import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f4890a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpURLConnection f4891b;

    /* renamed from: c  reason: collision with root package name */
    public final i f4892c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4893d;

    /* renamed from: e  reason: collision with root package name */
    public final k f4894e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f4895f;
    public final n i;

    /* renamed from: g  reason: collision with root package name */
    public final Random f4896g = new Random();
    public boolean j = false;

    /* renamed from: h  reason: collision with root package name */
    public final Clock f4897h = DefaultClock.getInstance();

    public c(HttpURLConnection httpURLConnection, i iVar, d dVar, LinkedHashSet linkedHashSet, k kVar, ScheduledExecutorService scheduledExecutorService, n nVar) {
        this.f4891b = httpURLConnection;
        this.f4892c = iVar;
        this.f4893d = dVar;
        this.f4890a = linkedHashSet;
        this.f4894e = kVar;
        this.f4895f = scheduledExecutorService;
        this.i = nVar;
    }

    public final void a(int i, long j) {
        if (i == 0) {
            new m6.f("Unable to fetch the latest version of the template.");
            d();
            return;
        }
        int nextInt = this.f4896g.nextInt(4);
        this.f4895f.schedule(new b(this, i, j), nextInt, TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = g2.g.d(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                str = (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e9) {
                        new q4.h("Unable to parse config update message.", e9.getCause());
                        d();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e9);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        k kVar = this.f4894e;
                        new m6.f("The server is temporarily unavailable. Try again in a few minutes.");
                        kVar.a();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = this.f4890a.isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = this.f4892c.f4933h.f4962a.getLong("last_template_version", 0L);
                        long j8 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j8 > j) {
                            a(3, j8);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        e(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f4891b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e9) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e9);
                }
            } catch (IOException e10) {
                if (!this.j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e10);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e11);
                }
            }
            throw th;
        }
    }

    public final synchronized void d() {
        for (k kVar : this.f4890a) {
            kVar.a();
        }
    }

    public final synchronized void e(int i) {
        Date date = new Date(new Date(this.f4897h.currentTimeMillis()).getTime() + (i * 1000));
        n nVar = this.i;
        synchronized (nVar.f4965d) {
            nVar.f4962a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
