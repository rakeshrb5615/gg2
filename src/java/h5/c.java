package h5;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f2212a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2213b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public Task f2214c = Tasks.forResult((Object) null);

    public c(ExecutorService executorService) {
        this.f2212a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f2213b) {
            continueWithTask = this.f2214c.continueWithTask(this.f2212a, new a5.a(runnable, 7));
            this.f2214c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2212a.execute(runnable);
    }
}
