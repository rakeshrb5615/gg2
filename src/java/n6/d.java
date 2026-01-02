package n6;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g5.p;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f4898d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final x1.d f4899e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4900a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4901b;

    /* renamed from: c  reason: collision with root package name */
    public Task f4902c = null;

    public d(Executor executor, o oVar) {
        this.f4900a = executor;
        this.f4901b = oVar;
    }

    public static Object a(Task task) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j6.o oVar = new j6.o(7);
        x1.d dVar = f4899e;
        task.addOnSuccessListener(dVar, oVar);
        task.addOnFailureListener(dVar, oVar);
        task.addOnCanceledListener(dVar, oVar);
        if (((CountDownLatch) oVar.f3275b).await(5L, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public final synchronized Task b() {
        try {
            Task task = this.f4902c;
            if (task != null) {
                if (task.isComplete() && !this.f4902c.isSuccessful()) {
                }
            }
            this.f4902c = Tasks.call(this.f4900a, new p(this.f4901b, 2));
        } catch (Throwable th) {
            throw th;
        }
        return this.f4902c;
    }

    public final f c() {
        synchronized (this) {
            try {
                Task task = this.f4902c;
                if (task != null && task.isSuccessful()) {
                    return (f) this.f4902c.getResult();
                }
                try {
                    Task b10 = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (f) a(b10);
                } catch (InterruptedException | ExecutionException | TimeoutException e9) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e9);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
