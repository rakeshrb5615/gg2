package f2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class x extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1484a = 1;

    /* renamed from: b  reason: collision with root package name */
    public s f1485b;

    public /* synthetic */ x() {
    }

    @Override // f2.t, f2.q
    public void a(s sVar) {
        switch (this.f1484a) {
            case 1:
                y yVar = (y) this.f1485b;
                if (yVar.K) {
                    return;
                }
                yVar.K();
                yVar.K = true;
                return;
            default:
                return;
        }
    }

    @Override // f2.q
    public final void f(s sVar) {
        switch (this.f1484a) {
            case 0:
                this.f1485b.D();
                sVar.A(this);
                return;
            default:
                y yVar = (y) this.f1485b;
                int i = yVar.J - 1;
                yVar.J = i;
                if (i == 0) {
                    yVar.K = false;
                    yVar.p();
                }
                sVar.A(this);
                return;
        }
    }

    public x(s sVar) {
        this.f1485b = sVar;
    }
}
