package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j1 extends n {

    /* renamed from: o  reason: collision with root package name */
    public final r1 f1206o;

    public j1(r1 r1Var, l7.c cVar) {
        super(1, cVar);
        this.f1206o = r1Var;
    }

    @Override // d8.n
    public final Throwable p(r1 r1Var) {
        Throwable b10;
        r1 r1Var2 = this.f1206o;
        r1Var2.getClass();
        Object obj = r1.f1241a.get(r1Var2);
        return (!(obj instanceof l1) || (b10 = ((l1) obj).b()) == null) ? obj instanceof w ? ((w) obj).f1256a : r1Var.getCancellationException() : b10;
    }

    @Override // d8.n
    public final String x() {
        return "AwaitContinuation";
    }
}
