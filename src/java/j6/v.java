package j6;

import android.content.BroadcastReceiver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f3292a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f3293b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f3294c;

    public v(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new NamedThreadFactory("firebase-iid-executor"));
        this.f3294c = firebaseMessaging;
        this.f3292a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f3293b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f3294c.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f3294c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e9) {
            String message = e9.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e9.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e9;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e9.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [j6.u, android.content.BroadcastReceiver] */
    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f3293b;
        s g3 = s.g();
        FirebaseMessaging firebaseMessaging = this.f3294c;
        if (g3.k(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.h.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                    if (s.g().k(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                } else if (s.g().j(firebaseMessaging.b) && !a()) {
                    ?? broadcastReceiver = new BroadcastReceiver();
                    broadcastReceiver.f3290a = this;
                    broadcastReceiver.a();
                    if (s.g().k(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                } else {
                    if (b()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                        }
                    } else {
                        firebaseMessaging.f(this.f3292a);
                    }
                    if (s.g().k(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            } catch (IOException e9) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e9.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = false;
                    if (s.g().k(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (s.g().k(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
