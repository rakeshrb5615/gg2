package l2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class h implements x3.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3697b;

    public /* synthetic */ h(a0 a0Var, int i) {
        this.f3696a = i;
        this.f3697b = a0Var;
    }

    @Override // x3.g
    public final void a(float f9) {
        switch (this.f3696a) {
            case 0:
                a0 a0Var = this.f3697b;
                float f10 = f9 * 0.016666668f;
                a0Var.F(f10);
                a0Var.Z1.f2564j2 = f10;
                a0Var.f3573j2 = true;
                return;
            default:
                a0 a0Var2 = this.f3697b;
                a0Var2.f3613v.edit().putInt(a0Var2.U0, (int) f9).apply();
                a0Var2.Z1.f2533b.Q = f9 * 0.05f;
                return;
        }
    }
}
