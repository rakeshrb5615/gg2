package c;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class d implements androidx.lifecycle.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f806c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f804a = i;
        this.f805b = obj;
        this.f806c = obj2;
    }

    public final void c(androidx.lifecycle.u uVar, androidx.lifecycle.n nVar) {
        switch (this.f804a) {
            case 0:
                n.b((v) this.f805b, (n) this.f806c, uVar, nVar);
                return;
            default:
                q0.o oVar = (q0.o) this.f805b;
                q0.p pVar = (q0.p) this.f806c;
                oVar.getClass();
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    oVar.b(pVar);
                    return;
                }
                return;
        }
    }
}
