package d6;

import a5.r;
import android.net.TrafficStats;
import android.util.Log;
import b5.m;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c implements d {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f1133m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final q4.f f1134a;

    /* renamed from: b  reason: collision with root package name */
    public final f6.c f1135b;

    /* renamed from: c  reason: collision with root package name */
    public final k2.c f1136c;

    /* renamed from: d  reason: collision with root package name */
    public final j f1137d;

    /* renamed from: e  reason: collision with root package name */
    public final r f1138e;

    /* renamed from: f  reason: collision with root package name */
    public final h f1139f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1140g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f1141h;
    public final m i;
    public String j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f1142k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f1143l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [v3.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d6.h, java.lang.Object] */
    public c(q4.f fVar, c6.b bVar, ExecutorService executorService, m mVar) {
        fVar.a();
        f6.c cVar = new f6.c(fVar.f5386a, bVar);
        k2.c cVar2 = new k2.c(fVar);
        if (v3.f.f6187b == null) {
            v3.f.f6187b = new Object();
        }
        v3.f fVar2 = v3.f.f6187b;
        if (j.f1151d == null) {
            j.f1151d = new j(fVar2);
        }
        j jVar = j.f1151d;
        r rVar = new r(new a5.e(fVar, 2));
        ?? obj = new Object();
        this.f1140g = new Object();
        this.f1142k = new HashSet();
        this.f1143l = new ArrayList();
        this.f1134a = fVar;
        this.f1135b = cVar;
        this.f1136c = cVar2;
        this.f1137d = jVar;
        this.f1138e = rVar;
        this.f1139f = obj;
        this.f1141h = executorService;
        this.i = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        r3 = f(r2);
        r4 = r6.f1136c;
        r2 = r2.a();
        r2.f1311a = r3;
        r2.f1312b = 3;
        r2 = r2.a();
        r4.r(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = d6.c.f1133m
            monitor-enter(r0)
            q4.f r1 = r6.f1134a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.f5386a     // Catch: java.lang.Throwable -> L3f
            k2.c r1 = k2.c.g(r1)     // Catch: java.lang.Throwable -> L3f
            k2.c r2 = r6.f1136c     // Catch: java.lang.Throwable -> L37
            e6.b r2 = r2.A()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.f1321b     // Catch: java.lang.Throwable -> L37
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1e
            if (r3 != r5) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L39
            java.lang.String r3 = r6.f(r2)     // Catch: java.lang.Throwable -> L37
            k2.c r4 = r6.f1136c     // Catch: java.lang.Throwable -> L37
            e6.a r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.f1311a = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.f1312b = r3     // Catch: java.lang.Throwable -> L37
            e6.b r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r4.r(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.B()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.i(r2)
            b5.m r0 = r6.i
            d6.b r1 = new d6.b
            r2 = 2
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.B()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.c.a():void");
    }

    public final e6.b b(e6.b bVar) {
        int i;
        int responseCode;
        f6.b bVar2;
        f6.b bVar3;
        f6.c cVar = this.f1135b;
        q4.f fVar = this.f1134a;
        fVar.a();
        String str = fVar.f5388c.f5399a;
        String str2 = bVar.f1320a;
        q4.f fVar2 = this.f1134a;
        fVar2.a();
        String str3 = fVar2.f5388c.f5405g;
        String str4 = bVar.f1323d;
        f6.d dVar = cVar.f1513c;
        if (dVar.a()) {
            URL a10 = f6.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i9 = 0; i9 <= 1; i9 = i + 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c9 = cVar.c(a10, str);
                try {
                    try {
                        c9.setRequestMethod("POST");
                        c9.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c9.setDoOutput(true);
                        f6.c.h(c9);
                        responseCode = c9.getResponseCode();
                        dVar.b(responseCode);
                    } finally {
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                    i = i9;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVar3 = f6.c.f(c9);
                } else {
                    f6.c.b(c9, null, str, str3);
                    i = i9;
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        bVar2 = new f6.b(null, 0L, 3);
                    } else if (responseCode == 429) {
                        throw new q4.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    } else {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new f6.b(null, 0L, 2);
                        }
                    }
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    bVar3 = bVar2;
                }
                int c10 = u.e.c(bVar3.f1508c);
                if (c10 != 0) {
                    if (c10 == 1) {
                        e6.a a11 = bVar.a();
                        a11.f1317g = "BAD CONFIG";
                        a11.f1312b = 5;
                        return a11.a();
                    } else if (c10 == 2) {
                        synchronized (this) {
                            this.j = null;
                        }
                        e6.a a12 = bVar.a();
                        a12.f1312b = 2;
                        return a12.a();
                    } else {
                        throw new q4.h("Firebase Installations Service is unavailable. Please try again later.");
                    }
                }
                String str5 = bVar3.f1506a;
                long j = bVar3.f1507b;
                j jVar = this.f1137d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f1152a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                e6.a a13 = bVar.a();
                a13.f1313c = str5;
                a13.f1315e = j;
                a13.f1316f = seconds;
                a13.f1318h = (byte) (((byte) (a13.f1318h | 1)) | 2);
                return a13.a();
            }
            throw new q4.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new q4.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(taskCompletionSource);
        synchronized (this.f1140g) {
            this.f1143l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f1141h.execute(new b(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(this.f1137d, taskCompletionSource);
        synchronized (this.f1140g) {
            this.f1143l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f1141h.execute(new b(this, 1));
        return task;
    }

    public final void e() {
        q4.f fVar = this.f1134a;
        fVar.a();
        Preconditions.checkNotEmpty(fVar.f5388c.f5400b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        Preconditions.checkNotEmpty(fVar.f5388c.f5405g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        Preconditions.checkNotEmpty(fVar.f5388c.f5399a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f5388c.f5400b;
        Pattern pattern = j.f1150c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        Preconditions.checkArgument(j.f1150c.matcher(fVar.f5388c.f5399a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f5387b) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(e6.b r6) {
        /*
            r5 = this;
            q4.f r0 = r5.f1134a
            r0.a()
            java.lang.String r0 = r0.f5387b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            q4.f r0 = r5.f1134a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f5387b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.f1321b
            r0 = 1
            if (r6 != r0) goto L5c
            a5.r r6 = r5.f1138e
            java.lang.Object r6 = r6.get()
            e6.c r6 = (e6.c) r6
            android.content.SharedPreferences r0 = r6.f1328a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f1328a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f1328a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            d6.h r6 = r5.f1139f
            r6.getClass()
            java.lang.String r6 = d6.h.a()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            d6.h r6 = r5.f1139f
            r6.getClass()
            java.lang.String r6 = d6.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.c.f(e6.b):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [f6.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [f6.a] */
    public final e6.b g(e6.b bVar) {
        int responseCode;
        String str = bVar.f1320a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            e6.c cVar = (e6.c) this.f1138e.get();
            synchronized (cVar.f1328a) {
                try {
                    String[] strArr = e6.c.f1327c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String str4 = cVar.f1329b;
                            String string = cVar.f1328a.getString("|T|" + str4 + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        f6.c cVar2 = this.f1135b;
        q4.f fVar = this.f1134a;
        fVar.a();
        String str5 = fVar.f5388c.f5399a;
        String str6 = bVar.f1320a;
        q4.f fVar2 = this.f1134a;
        fVar2.a();
        String str7 = fVar2.f5388c.f5405g;
        q4.f fVar3 = this.f1134a;
        fVar3.a();
        String str8 = fVar3.f5388c.f5400b;
        f6.d dVar = cVar2.f1513c;
        if (dVar.a()) {
            URL a10 = f6.c.a("projects/" + str7 + "/installations");
            int i9 = 0;
            f6.a aVar = cVar2;
            while (i9 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c9 = aVar.c(a10, str5);
                try {
                    try {
                        c9.setRequestMethod("POST");
                        c9.setDoOutput(true);
                        if (str2 != null) {
                            c9.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        f6.c.g(c9, str6, str8);
                        responseCode = c9.getResponseCode();
                        dVar.b(responseCode);
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (!(responseCode >= 200 && responseCode < 300)) {
                        try {
                            f6.c.b(c9, str8, str5, str7);
                        } catch (IOException | AssertionError unused3) {
                            c9.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i9++;
                            aVar = aVar;
                        }
                        if (responseCode == 429) {
                            throw new q4.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        } else if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            f6.a aVar2 = new f6.a(null, null, null, null, 2);
                            c9.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            aVar = aVar2;
                        } else {
                            c9.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i9++;
                            aVar = aVar;
                        }
                    } else {
                        f6.a e9 = f6.c.e(c9);
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e9;
                    }
                    int c10 = u.e.c(aVar.f1505e);
                    if (c10 != 0) {
                        if (c10 == 1) {
                            e6.a a11 = bVar.a();
                            a11.f1317g = "BAD CONFIG";
                            a11.f1312b = 5;
                            return a11.a();
                        }
                        throw new q4.h("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar.f1502b;
                    String str10 = aVar.f1503c;
                    j jVar = this.f1137d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f1152a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    f6.b bVar2 = aVar.f1504d;
                    String str11 = bVar2.f1506a;
                    long j = bVar2.f1507b;
                    e6.a a12 = bVar.a();
                    a12.f1311a = str9;
                    a12.f1312b = 4;
                    a12.f1313c = str11;
                    a12.f1314d = str10;
                    a12.f1315e = j;
                    a12.f1316f = seconds;
                    a12.f1318h = (byte) (((byte) (a12.f1318h | 1)) | 2);
                    return a12.a();
                } finally {
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new q4.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new q4.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f1140g) {
            try {
                Iterator it = this.f1143l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(e6.b bVar) {
        synchronized (this.f1140g) {
            try {
                Iterator it = this.f1143l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
