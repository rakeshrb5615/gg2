package d4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f1098a;

    public m() {
        this.f1098a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e9) {
            TaskCompletionSource taskCompletionSource = this.f1098a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e9);
            }
        }
    }

    public m(TaskCompletionSource taskCompletionSource) {
        this.f1098a = taskCompletionSource;
    }
}
