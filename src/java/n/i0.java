package n;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i0 extends w1 {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ o0 f4174p;
    public final /* synthetic */ r0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r0 r0Var, r0 r0Var2, o0 o0Var) {
        super(r0Var2);
        this.q = r0Var;
        this.f4174p = o0Var;
    }

    @Override // n.w1
    public final m.c0 b() {
        return this.f4174p;
    }

    @Override // n.w1
    public final boolean c() {
        r0 r0Var = this.q;
        if (r0Var.getInternalPopup().b()) {
            return true;
        }
        r0Var.f4271f.l(r0Var.getTextDirection(), r0Var.getTextAlignment());
        return true;
    }
}
