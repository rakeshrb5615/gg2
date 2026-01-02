package k4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f3370a;

    public a0() {
        this.f3370a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f3370a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f3370a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e9) {
            a(e9);
        }
    }

    public a0(TaskCompletionSource taskCompletionSource) {
        this.f3370a = taskCompletionSource;
    }
}
