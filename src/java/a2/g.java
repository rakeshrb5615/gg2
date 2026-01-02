package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k1 f319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f320b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f321c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f322d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f323e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f324f;

    public g(k kVar, k1 k1Var, int i, View view, int i9, ViewPropertyAnimator viewPropertyAnimator) {
        this.f324f = kVar;
        this.f319a = k1Var;
        this.f320b = i;
        this.f321c = view;
        this.f322d = i9;
        this.f323e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f320b;
        View view = this.f321c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f322d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f323e.setListener(null);
        k kVar = this.f324f;
        k1 k1Var = this.f319a;
        kVar.c(k1Var);
        kVar.f373p.remove(k1Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f324f.getClass();
    }
}
