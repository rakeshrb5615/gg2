package j6;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class g extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3251a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f3252b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3253c;

    /* renamed from: d  reason: collision with root package name */
    public int f3254d;

    /* renamed from: e  reason: collision with root package name */
    public int f3255e;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3251a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f3253c = new Object();
        this.f3255e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            c0.a(intent);
        }
        synchronized (this.f3253c) {
            try {
                int i = this.f3255e - 1;
                this.f3255e = i;
                if (i == 0) {
                    stopSelfResult(this.f3254d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f3252b == null) {
                this.f3252b = new d0(new l6.c(this, 29));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3252b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f3251a.shutdown();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i9) {
        synchronized (this.f3253c) {
            this.f3254d = i9;
            this.f3255e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) s.g().f3285e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3251a.execute(new androidx.fragment.app.l(this, intent2, taskCompletionSource, 4));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener((Executor) new Object(), new a5.u(2, this, intent));
        return 3;
    }
}
