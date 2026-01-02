package q0;

import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class m1 extends l1 {

    /* renamed from: o  reason: collision with root package name */
    public h0.b f5152o;

    /* renamed from: p  reason: collision with root package name */
    public h0.b f5153p;
    public h0.b q;

    public m1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
        this.f5152o = null;
        this.f5153p = null;
        this.q = null;
    }

    @Override // q0.p1
    public h0.b g() {
        if (this.f5153p == null) {
            this.f5153p = h0.b.c(this.f5142c.getMandatorySystemGestureInsets());
        }
        return this.f5153p;
    }

    @Override // q0.p1
    public h0.b i() {
        if (this.f5152o == null) {
            this.f5152o = h0.b.c(this.f5142c.getSystemGestureInsets());
        }
        return this.f5152o;
    }

    @Override // q0.p1
    public h0.b k() {
        if (this.q == null) {
            this.q = h0.b.c(this.f5142c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // q0.j1, q0.p1
    public s1 l(int i, int i9, int i10, int i11) {
        return s1.g(null, this.f5142c.inset(i, i9, i10, i11));
    }

    @Override // q0.k1, q0.p1
    public void q(h0.b bVar) {
    }
}
