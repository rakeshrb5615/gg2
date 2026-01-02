package d6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f1146a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f1146a = taskCompletionSource;
    }

    @Override // d6.i
    public final boolean a(e6.b bVar) {
        int i = bVar.f1321b;
        if (i == 3 || i == 4 || i == 5) {
            this.f1146a.trySetResult(bVar.f1320a);
            return true;
        }
        return false;
    }

    @Override // d6.i
    public final boolean b(Exception exc) {
        return false;
    }
}
