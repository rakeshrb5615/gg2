package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f313a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k1 f314b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f315c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f316d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f317e;

    public f(k kVar, k1 k1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f317e = kVar;
        this.f314b = k1Var;
        this.f316d = viewPropertyAnimator;
        this.f315c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f313a) {
            case 1:
                this.f315c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f313a) {
            case 0:
                this.f316d.setListener(null);
                this.f315c.setAlpha(1.0f);
                k kVar = this.f317e;
                k1 k1Var = this.f314b;
                kVar.c(k1Var);
                kVar.q.remove(k1Var);
                kVar.i();
                return;
            default:
                this.f316d.setListener(null);
                k kVar2 = this.f317e;
                k1 k1Var2 = this.f314b;
                kVar2.c(k1Var2);
                kVar2.f372o.remove(k1Var2);
                kVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f313a) {
            case 0:
                this.f317e.getClass();
                return;
            default:
                this.f317e.getClass();
                return;
        }
    }

    public f(k kVar, k1 k1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f317e = kVar;
        this.f314b = k1Var;
        this.f315c = view;
        this.f316d = viewPropertyAnimator;
    }
}
