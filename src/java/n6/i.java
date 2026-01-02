package n6;

import a5.u;
import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i {
    public static final long j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4925k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final d6.d f4926a;

    /* renamed from: b  reason: collision with root package name */
    public final c6.b f4927b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f4928c;

    /* renamed from: d  reason: collision with root package name */
    public final Clock f4929d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f4930e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4931f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigFetchHttpClient f4932g;

    /* renamed from: h  reason: collision with root package name */
    public final n f4933h;
    public final Map i;

    public i(d6.d dVar, c6.b bVar, Executor executor, Clock clock, Random random, d dVar2, ConfigFetchHttpClient configFetchHttpClient, n nVar, HashMap hashMap) {
        this.f4926a = dVar;
        this.f4927b = bVar;
        this.f4928c = executor;
        this.f4929d = clock;
        this.f4930e = random;
        this.f4931f = dVar2;
        this.f4932g = configFetchHttpClient;
        this.f4933h = nVar;
        this.i = hashMap;
    }

    public final h a(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b10 = this.f4932g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f4932g;
            HashMap d9 = d();
            String string = this.f4933h.f4962a.getString("last_fetch_etag", null);
            u4.b bVar = (u4.b) this.f4927b.get();
            h fetch = configFetchHttpClient.fetch(b10, str, str2, d9, string, hashMap, bVar != null ? (Long) ((u4.c) bVar).f6085a.getUserProperties((String) null, (String) null, true).get("_fot") : null, date, this.f4933h.b());
            f fVar = fetch.f4923b;
            if (fVar != null) {
                n nVar = this.f4933h;
                long j8 = fVar.f4915f;
                synchronized (nVar.f4963b) {
                    nVar.f4962a.edit().putLong("last_template_version", j8).apply();
                }
            }
            String str4 = fetch.f4924c;
            if (str4 != null) {
                n nVar2 = this.f4933h;
                synchronized (nVar2.f4963b) {
                    nVar2.f4962a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f4933h.d(0, n.f4961f);
            return fetch;
        } catch (m6.f e9) {
            int i = e9.f4035a;
            n nVar3 = this.f4933h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i9 = nVar3.a().f4958a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f4925k;
                long millis = timeUnit.toMillis(iArr[Math.min(i9, iArr.length) - 1]);
                nVar3.d(i9, new Date(date.getTime() + (millis / 2) + this.f4930e.nextInt((int) millis)));
            }
            m a10 = nVar3.a();
            int i10 = e9.f4035a;
            if (a10.f4958a > 1 || i10 == 429) {
                a10.f4959b.getTime();
                throw new q4.h("Fetch was throttled.");
            }
            if (i10 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i10 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else if (i10 == 429) {
                throw new q4.h("The throttled response from the server was not handled correctly by the FRC SDK.");
            } else {
                if (i10 != 500) {
                    switch (i10) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new m6.f(e9.f4035a, "Fetch failed: ".concat(str3), e9);
        }
    }

    public final Task b(Task task, long j8, final HashMap hashMap) {
        Task continueWithTask;
        final Date date = new Date(this.f4929d.currentTimeMillis());
        boolean isSuccessful = task.isSuccessful();
        n nVar = this.f4933h;
        if (isSuccessful) {
            Date date2 = new Date(nVar.f4962a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(n.f4960e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j8) + date2.getTime()))) {
                return Tasks.forResult(new h(2, null, null));
            }
        }
        Date date3 = nVar.a().f4959b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f4928c;
        if (date4 != null) {
            date4.getTime();
            continueWithTask = Tasks.forException(new q4.h("Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()))));
        } else {
            d6.c cVar = (d6.c) this.f4926a;
            final Task c9 = cVar.c();
            final Task d9 = cVar.d();
            continueWithTask = Tasks.whenAllComplete(new Task[]{c9, d9}).continueWithTask(executor, new Continuation() { // from class: n6.g
                public final Object then(Task task2) {
                    i iVar = i.this;
                    Date date5 = date;
                    HashMap hashMap2 = hashMap;
                    Task task3 = c9;
                    if (task3.isSuccessful()) {
                        Task task4 = d9;
                        if (task4.isSuccessful()) {
                            try {
                                h a10 = iVar.a((String) task3.getResult(), ((d6.a) task4.getResult()).f1128a, date5, hashMap2);
                                if (a10.f4922a != 0) {
                                    return Tasks.forResult(a10);
                                }
                                d dVar = iVar.f4931f;
                                f fVar = a10.f4923b;
                                Executor executor2 = dVar.f4900a;
                                return Tasks.call(executor2, new j6.h(2, dVar, fVar)).onSuccessTask(executor2, new u(5, dVar, fVar)).onSuccessTask(iVar.f4928c, new a5.a(a10, 14));
                            } catch (m6.d e9) {
                                return Tasks.forException(e9);
                            }
                        }
                        return Tasks.forException(new q4.h("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    return Tasks.forException(new q4.h("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                }
            });
        }
        return continueWithTask.continueWithTask(executor, new u(6, this, date));
    }

    public final Task c(int i) {
        HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return this.f4931f.b().continueWithTask(this.f4928c, new u(7, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        u4.b bVar = (u4.b) this.f4927b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((u4.c) bVar).f6085a.getUserProperties((String) null, (String) null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
