package q0;

import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class k1 extends j1 {

    /* renamed from: n  reason: collision with root package name */
    public h0.b f5148n;

    public k1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
        this.f5148n = null;
    }

    @Override // q0.p1
    public s1 b() {
        return s1.g(null, this.f5142c.consumeStableInsets());
    }

    @Override // q0.p1
    public s1 c() {
        return s1.g(null, this.f5142c.consumeSystemWindowInsets());
    }

    @Override // q0.p1
    public final h0.b h() {
        if (this.f5148n == null) {
            WindowInsets windowInsets = this.f5142c;
            this.f5148n = h0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5148n;
    }

    @Override // q0.p1
    public boolean m() {
        return this.f5142c.isConsumed();
    }

    @Override // q0.p1
    public void q(h0.b bVar) {
        this.f5148n = bVar;
    }
}
