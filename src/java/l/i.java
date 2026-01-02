package l;

import n.f3;
import q0.u0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i extends c4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3520c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3521d;

    /* renamed from: e  reason: collision with root package name */
    public int f3522e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3523f;

    public i(j jVar) {
        this.f3520c = 0;
        this.f3523f = jVar;
        this.f3521d = false;
        this.f3522e = 0;
    }

    @Override // q0.u0
    public final void a() {
        switch (this.f3520c) {
            case 0:
                int i = this.f3522e + 1;
                this.f3522e = i;
                j jVar = (j) this.f3523f;
                if (i == jVar.f3524a.size()) {
                    u0 u0Var = jVar.f3527d;
                    if (u0Var != null) {
                        u0Var.a();
                    }
                    this.f3522e = 0;
                    this.f3521d = false;
                    jVar.f3528e = false;
                    return;
                }
                return;
            default:
                if (this.f3521d) {
                    return;
                }
                ((f3) this.f3523f).f4117a.setVisibility(this.f3522e);
                return;
        }
    }

    @Override // c4.b, q0.u0
    public void b() {
        switch (this.f3520c) {
            case 1:
                this.f3521d = true;
                return;
            default:
                return;
        }
    }

    @Override // c4.b, q0.u0
    public final void c() {
        switch (this.f3520c) {
            case 0:
                if (this.f3521d) {
                    return;
                }
                this.f3521d = true;
                u0 u0Var = ((j) this.f3523f).f3527d;
                if (u0Var != null) {
                    u0Var.c();
                    return;
                }
                return;
            default:
                ((f3) this.f3523f).f4117a.setVisibility(0);
                return;
        }
    }

    public i(f3 f3Var, int i) {
        this.f3520c = 1;
        this.f3523f = f3Var;
        this.f3522e = i;
        this.f3521d = false;
    }
}
