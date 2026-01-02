package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f339b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f340c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f341d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f342e;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f338a = i;
        this.f342e = kVar;
        this.f339b = iVar;
        this.f340c = viewPropertyAnimator;
        this.f341d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f338a) {
            case 0:
                this.f340c.setListener(null);
                View view = this.f341d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f339b;
                k1 k1Var = iVar.f344a;
                k kVar = this.f342e;
                kVar.c(k1Var);
                kVar.f374r.remove(iVar.f344a);
                kVar.i();
                return;
            default:
                this.f340c.setListener(null);
                View view2 = this.f341d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f339b;
                k1 k1Var2 = iVar2.f345b;
                k kVar2 = this.f342e;
                kVar2.c(k1Var2);
                kVar2.f374r.remove(iVar2.f345b);
                kVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f338a) {
            case 0:
                k1 k1Var = this.f339b.f344a;
                this.f342e.getClass();
                return;
            default:
                k1 k1Var2 = this.f339b.f345b;
                this.f342e.getClass();
                return;
        }
    }
}
