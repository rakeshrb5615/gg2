package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g extends AnimatorListenerAdapter implements q {

    /* renamed from: a  reason: collision with root package name */
    public final View f1423a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1424b = false;

    public g(View view) {
        this.f1423a = view;
    }

    @Override // f2.q
    public final void a(s sVar) {
    }

    @Override // f2.q
    public final void b() {
        View view = this.f1423a;
        view.setTag(2131362552, Float.valueOf(view.getVisibility() == 0 ? c0.f1403a.G(view) : 0.0f));
    }

    @Override // f2.q
    public final void c(s sVar) {
    }

    @Override // f2.q
    public final void d() {
        this.f1423a.setTag(2131362552, null);
    }

    @Override // f2.q
    public final void e(s sVar) {
    }

    @Override // f2.q
    public final void f(s sVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        c0.f1403a.S(this.f1423a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f1423a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f1424b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        boolean z10 = this.f1424b;
        View view = this.f1423a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z9) {
            return;
        }
        d0 d0Var = c0.f1403a;
        d0Var.S(view, 1.0f);
        d0Var.getClass();
    }
}
