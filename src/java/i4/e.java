package i4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f2675a;

    public e() {
        this.f2675a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e9) {
            TaskCompletionSource taskCompletionSource = this.f2675a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e9);
            }
        }
    }

    public e(TaskCompletionSource taskCompletionSource) {
        this.f2675a = taskCompletionSource;
    }
}
