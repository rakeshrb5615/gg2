package n6;

import android.content.Context;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class l {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f4941s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f4942t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f4943a;

    /* renamed from: c  reason: collision with root package name */
    public int f4945c;

    /* renamed from: f  reason: collision with root package name */
    public HttpURLConnection f4948f;

    /* renamed from: g  reason: collision with root package name */
    public c f4949g;

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledExecutorService f4950h;
    public final i i;
    public final q4.f j;

    /* renamed from: k  reason: collision with root package name */
    public final d6.d f4951k;

    /* renamed from: l  reason: collision with root package name */
    public final d f4952l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f4953m;
    public final n q;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4944b = false;

    /* renamed from: o  reason: collision with root package name */
    public final Random f4955o = new Random();

    /* renamed from: p  reason: collision with root package name */
    public final Clock f4956p = DefaultClock.getInstance();

    /* renamed from: n  reason: collision with root package name */
    public final String f4954n = "firebase";

    /* renamed from: d  reason: collision with root package name */
    public boolean f4946d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4947e = false;

    /* renamed from: r  reason: collision with root package name */
    public final Object f4957r = new Object();

    public l(q4.f fVar, d6.d dVar, i iVar, d dVar2, Context context, LinkedHashSet linkedHashSet, n nVar, ScheduledExecutorService scheduledExecutorService) {
        this.f4943a = linkedHashSet;
        this.f4950h = scheduledExecutorService;
        this.f4945c = Math.max(8 - nVar.c().f4958a, 1);
        this.j = fVar;
        this.i = iVar;
        this.f4951k = dVar;
        this.f4952l = dVar2;
        this.f4953m = context;
        this.q = nVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z9;
        if (!this.f4943a.isEmpty() && !this.f4944b && !this.f4946d) {
            z9 = this.f4947e ? false : true;
        }
        return z9;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f4948f;
        if (httpURLConnection != null && !this.f4947e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e9) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e9);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    public final String c(String str) {
        q4.f fVar = this.j;
        fVar.a();
        Matcher matcher = f4942t.matcher(fVar.f5388c.f5400b);
        String group = matcher.matches() ? matcher.group(1) : null;
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + group + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.f4945c;
                if (i > 0) {
                    this.f4945c = i - 1;
                    this.f4950h.schedule(new a2.l(this, 7), j, TimeUnit.MILLISECONDS);
                } else if (!this.f4947e) {
                    new q4.h("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        for (k kVar : this.f4943a) {
            kVar.a();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.q.c().f4959b.getTime() - new Date(this.f4956p.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            q4.f r9 = r6.j
            r9.a()
            q4.j r0 = r9.f5388c
            java.lang.String r1 = r0.f5399a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f4953m
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L45:
            r1 = r4
            goto L63
        L47:
            r3 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            goto L63
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L63:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f5400b
            java.util.regex.Pattern r3 = n6.l.f4942t
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9d
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9d:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f4954n
            r1.put(r2, r3)
            n6.i r2 = r6.i
            n6.n r2 = r2.f4933h
            android.content.SharedPreferences r2 = r2.f4962a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.f5400b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "23.0.1"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.l.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized c j(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.i, this.f4952l, this.f4943a, new k(this), this.f4950h, this.q);
    }

    public final void k(Date date) {
        n nVar = this.q;
        int i = nVar.c().f4958a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f4941s[(i < 8 ? i : 8) - 1]);
        nVar.e(i, new Date(date.getTime() + (millis / 2) + this.f4955o.nextInt((int) millis)));
    }
}
