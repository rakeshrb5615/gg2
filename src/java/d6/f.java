package d6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final j f1144a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f1145b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f1144a = jVar;
        this.f1145b = taskCompletionSource;
    }

    @Override // d6.i
    public final boolean a(e6.b bVar) {
        if (bVar.f1321b != 4 || this.f1144a.a(bVar)) {
            return false;
        }
        String str = bVar.f1322c;
        if (str != null) {
            this.f1145b.setResult(new a(str, bVar.f1324e, bVar.f1325f));
            return true;
        }
        throw new NullPointerException("Null token");
    }

    @Override // d6.i
    public final boolean b(Exception exc) {
        this.f1145b.trySetException(exc);
        return true;
    }
}
