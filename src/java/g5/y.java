package g5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class y {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f1866g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f1867h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final d4.l f1868a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1869b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1870c;

    /* renamed from: d  reason: collision with root package name */
    public final d6.d f1871d;

    /* renamed from: e  reason: collision with root package name */
    public final v f1872e;

    /* renamed from: f  reason: collision with root package name */
    public c f1873f;

    public y(Context context, String str, d6.d dVar, v vVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f1869b = context;
        this.f1870c = str;
        this.f1871d = dVar;
        this.f1872e = vVar;
        this.f1868a = new d4.l();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f1866g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g5.x b(boolean r9) {
        /*
            r8 = this;
            h5.d r0 = new h5.d
            r6 = 0
            r7 = 2
            r1 = 0
            h5.e r2 = h5.f.f2216d
            java.lang.Class<h5.e> r3 = h5.e.class
            java.lang.String r4 = "isNotMainThread"
            java.lang.String r5 = "isNotMainThread()Z"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Must not be called on a main thread, was called on "
            r0.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L44
            android.util.Log.d(r2, r0, r1)
        L44:
            r3 = 10000(0x2710, double:4.9407E-320)
            d6.d r5 = r8.f1871d
            if (r9 == 0) goto L63
            r9 = r5
            d6.c r9 = (d6.c) r9     // Catch: java.lang.Exception -> L5c
            com.google.android.gms.tasks.Task r9 = r9.d()     // Catch: java.lang.Exception -> L5c
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L5c
            java.lang.Object r9 = com.google.android.gms.tasks.Tasks.await(r9, r3, r0)     // Catch: java.lang.Exception -> L5c
            d6.a r9 = (d6.a) r9     // Catch: java.lang.Exception -> L5c
            java.lang.String r9 = r9.f1128a     // Catch: java.lang.Exception -> L5c
            goto L64
        L5c:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r0, r9)
        L63:
            r9 = r1
        L64:
            d6.c r5 = (d6.c) r5     // Catch: java.lang.Exception -> L74
            com.google.android.gms.tasks.Task r0 = r5.c()     // Catch: java.lang.Exception -> L74
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L74
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r3, r5)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L74
            r1 = r0
            goto L7a
        L74:
            r0 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r3, r0)
        L7a:
            g5.x r0 = new g5.x
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.b(boolean):g5.x");
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f1873f;
        if (cVar != null && (cVar.f1777b != null || !this.f1872e.a())) {
            return this.f1873f;
        }
        d5.d dVar = d5.d.f1126a;
        dVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f1869b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.c("Cached Firebase Installation ID: " + string);
        if (this.f1872e.a()) {
            x b10 = b(false);
            dVar.c("Fetched Firebase Installation ID: " + b10.f1864a);
            if (b10.f1864a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b10 = new x(str, null);
            }
            if (Objects.equals(b10.f1864a, string)) {
                this.f1873f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b10.f1864a, b10.f1865b);
            } else {
                this.f1873f = new c(a(sharedPreferences, b10.f1864a), b10.f1864a, b10.f1865b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f1873f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f1873f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        dVar.c("Install IDs: " + this.f1873f);
        return this.f1873f;
    }

    public final String d() {
        String str;
        d4.l lVar = this.f1868a;
        Context context = this.f1869b;
        synchronized (lVar) {
            try {
                if (lVar.f1097b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    lVar.f1097b = installerPackageName;
                }
                str = "".equals(lVar.f1097b) ? null : lVar.f1097b;
            } finally {
            }
        }
        return str;
    }
}
