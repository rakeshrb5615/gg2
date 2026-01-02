package q0;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a1 extends b1 {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsAnimation f5092e;

    public a1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f5092e = windowInsetsAnimation;
    }

    public static h0.b e(WindowInsetsAnimation.Bounds bounds) {
        return h0.b.c(bounds.getUpperBound());
    }

    public static h0.b f(WindowInsetsAnimation.Bounds bounds) {
        return h0.b.c(bounds.getLowerBound());
    }

    public static void g(View view, h3.k kVar) {
        view.setWindowInsetsAnimationCallback(new z0(kVar));
    }

    @Override // q0.b1
    public final long a() {
        return this.f5092e.getDurationMillis();
    }

    @Override // q0.b1
    public final float b() {
        return this.f5092e.getInterpolatedFraction();
    }

    @Override // q0.b1
    public final int c() {
        return this.f5092e.getTypeMask();
    }

    @Override // q0.b1
    public final void d(float f9) {
        this.f5092e.setFraction(f9);
    }
}
