package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k1 extends i1 {

    /* renamed from: e  reason: collision with root package name */
    public final r1 f1207e;

    /* renamed from: f  reason: collision with root package name */
    public final l1 f1208f;

    /* renamed from: m  reason: collision with root package name */
    public final r f1209m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f1210n;

    public k1(r1 r1Var, l1 l1Var, r rVar, Object obj) {
        this.f1207e = r1Var;
        this.f1208f = l1Var;
        this.f1209m = rVar;
        this.f1210n = obj;
    }

    @Override // d8.i1
    public final boolean j() {
        return false;
    }

    @Override // d8.i1
    public final void k(Throwable th) {
        r rVar = this.f1209m;
        r D = r1.D(rVar);
        r1 r1Var = this.f1207e;
        l1 l1Var = this.f1208f;
        Object obj = this.f1210n;
        if (D == null || !r1Var.N(l1Var, D, obj)) {
            l1Var.f1215a.d(new i8.h(2), 2);
            r D2 = r1.D(rVar);
            if (D2 == null || !r1Var.N(l1Var, D2, obj)) {
                r1Var.f(r1Var.p(l1Var, obj));
            }
        }
    }
}
