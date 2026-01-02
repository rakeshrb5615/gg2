package j6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.lifecycle.g0;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3245a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f3246b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3247c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f3248d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f3249e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3250f;

    public f0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, (ThreadFactory) new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3248d = new ArrayDeque();
        this.f3250f = false;
        Context applicationContext = context.getApplicationContext();
        this.f3245a = applicationContext;
        this.f3246b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f3247c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f3248d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                d0 d0Var = this.f3249e;
                if (d0Var == null || !d0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f3249e.a((e0) this.f3248d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task b(Intent intent) {
        e0 e0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            e0Var = new e0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f3247c;
            e0Var.f3243b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new a5.a(scheduledThreadPoolExecutor.schedule((Runnable) new g0(e0Var, 11), 20L, TimeUnit.SECONDS), 13));
            this.f3248d.add(e0Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return e0Var.f3243b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f3250f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f3250f) {
            return;
        }
        this.f3250f = true;
        try {
        } catch (SecurityException e9) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e9);
        }
        if (ConnectionTracker.getInstance().bindService(this.f3245a, this.f3246b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f3250f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f3248d;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ((e0) arrayDeque.poll()).f3243b.trySetResult((Object) null);
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f3250f = false;
            if (iBinder instanceof d0) {
                this.f3249e = (d0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f3248d;
            while (!arrayDeque.isEmpty()) {
                ((e0) arrayDeque.poll()).f3243b.trySetResult((Object) null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
