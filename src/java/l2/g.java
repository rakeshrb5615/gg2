package l2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class g implements x3.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3693a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3694b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3695c;

    public /* synthetic */ g(a0 a0Var, Object obj, int i) {
        this.f3693a = i;
        this.f3694b = a0Var;
        this.f3695c = obj;
    }

    @Override // x3.g
    public final void a(float f9) {
        n2.s sVar;
        switch (this.f3693a) {
            case 0:
                int round = Math.round(f9);
                a0 a0Var = this.f3694b;
                a0Var.f3613v.edit().putInt((String) this.f3695c, a0Var.J2[round]).apply();
                return;
            default:
                n2.f fVar = (n2.f) this.f3695c;
                a0 a0Var2 = this.f3694b;
                int i = (int) f9;
                a0Var2.f3613v.edit().putInt(a0Var2.b1, i).apply();
                if (a0Var2.Y1 == null || a0Var2.Z1 == null || fVar == null || (sVar = fVar.f4501p) == null) {
                    return;
                }
                sVar.U = i;
                return;
        }
    }
}
