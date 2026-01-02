package j6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f3226f = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static Boolean f3227m;

    /* renamed from: n  reason: collision with root package name */
    public static Boolean f3228n;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3229a;

    /* renamed from: b  reason: collision with root package name */
    public final h3.k f3230b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f3231c;

    /* renamed from: d  reason: collision with root package name */
    public final z f3232d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3233e;

    public b0(z zVar, Context context, h3.k kVar, long j) {
        this.f3232d = zVar;
        this.f3229a = context;
        this.f3233e = j;
        this.f3230b = kVar;
        this.f3231c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f3226f) {
            try {
                Boolean bool = f3228n;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f3228n = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z9 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z9;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f3226f) {
            try {
                Boolean bool = f3227m;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f3227m = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z9;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f3229a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z9 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z9;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f3232d;
        Context context = this.f3229a;
        boolean c9 = c(context);
        PowerManager.WakeLock wakeLock = this.f3231c;
        if (c9) {
            wakeLock.acquire(f.f3244a);
        }
        try {
            try {
                try {
                    zVar.d(true);
                    if (!this.f3230b.d()) {
                        zVar.d(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else if (!a(context) || d()) {
                        if (zVar.e()) {
                            zVar.d(false);
                        } else {
                            zVar.f(this.f3233e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                        }
                    } else {
                        new a0(this, this).a();
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    }
                } catch (IOException e9) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e9.getMessage());
                    zVar.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
