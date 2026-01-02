package g5;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final q4.f f1856a;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1859d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f1860e;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1857b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f1858c = new TaskCompletionSource();

    /* renamed from: f  reason: collision with root package name */
    public final TaskCompletionSource f1861f = new TaskCompletionSource();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(q4.f r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f1857b = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r6.f1858c = r0
            r0 = 0
            r6.f1859d = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f1861f = r1
            r7.a()
            android.content.Context r1 = r7.f5386a
            r6.f1856a = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f1859d = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "Could not read data collection permission from manifest"
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r1, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f1859d = r0
            r7 = r5
            goto L84
        L78:
            r6.f1859d = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f1860e = r7
            java.lang.Object r7 = r6.f1857b
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L97
            com.google.android.gms.tasks.TaskCompletionSource r0 = r6.f1858c     // Catch: java.lang.Throwable -> L95
            r0.trySetResult(r5)     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r0 = move-exception
            goto L99
        L97:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L95
            return
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L95
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.v.<init>(q4.f):void");
    }

    public final synchronized boolean a() {
        boolean z9;
        Boolean bool = this.f1860e;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            try {
                z9 = this.f1856a.j();
            } catch (IllegalStateException unused) {
                z9 = false;
            }
        }
        b(z9);
        return z9;
    }

    public final void b(boolean z9) {
        String str = "Crashlytics automatic data collection " + (z9 ? "ENABLED" : "DISABLED") + " by " + (this.f1860e == null ? "global Firebase setting" : this.f1859d ? "firebase_crashlytics_collection_enabled manifest flag" : "API") + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
