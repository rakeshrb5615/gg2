package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f1170a;

    public d(c[] cVarArr) {
        this.f1170a = cVarArr;
    }

    @Override // d8.k
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f1170a) {
            p0 p0Var = cVar.f1166f;
            if (p0Var == null) {
                kotlin.jvm.internal.j.i("handle");
                throw null;
            }
            p0Var.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f1170a + ']';
    }
}
