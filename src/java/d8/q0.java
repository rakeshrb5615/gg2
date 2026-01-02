package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class q0 extends i1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1236e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f1237f;

    public /* synthetic */ q0(Object obj, int i) {
        this.f1236e = i;
        this.f1237f = obj;
    }

    @Override // d8.i1
    public final boolean j() {
        switch (this.f1236e) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override // d8.i1
    public final void k(Throwable th) {
        switch (this.f1236e) {
            case 0:
                ((p0) this.f1237f).a();
                return;
            case 1:
                ((u7.l) this.f1237f).invoke(th);
                return;
            case 2:
                r1 r1Var = (r1) this.f1237f;
                r1Var.getClass();
                r1.f1241a.get(r1Var);
                throw null;
            default:
                j1 j1Var = (j1) this.f1237f;
                Object obj = r1.f1241a.get(i());
                if (obj instanceof w) {
                    j1Var.resumeWith(c4.b.p(((w) obj).f1256a));
                    return;
                } else {
                    j1Var.resumeWith(f0.v(obj));
                    return;
                }
        }
    }

    public q0(r1 r1Var) {
        this.f1236e = 2;
        this.f1237f = r1Var;
    }
}
