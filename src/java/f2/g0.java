package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g0 extends AnimatorListenerAdapter implements q {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1425a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1426b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1427c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1428d = true;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f1429e;

    public g0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f1429e = hVar;
        this.f1425a = viewGroup;
        this.f1426b = view;
        this.f1427c = view2;
    }

    @Override // f2.q
    public final void a(s sVar) {
    }

    @Override // f2.q
    public final void b() {
    }

    @Override // f2.q
    public final void c(s sVar) {
        if (this.f1428d) {
            g();
        }
    }

    @Override // f2.q
    public final void d() {
    }

    @Override // f2.q
    public final void f(s sVar) {
        sVar.A(this);
    }

    public final void g() {
        this.f1427c.setTag(2131362366, null);
        this.f1425a.getOverlay().remove(this.f1426b);
        this.f1428d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f1425a.getOverlay().remove(this.f1426b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f1426b;
        if (view.getParent() == null) {
            q0.a(this.f1425a, view);
        } else {
            this.f1429e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z9) {
        if (z9) {
            View view = this.f1427c;
            View view2 = this.f1426b;
            view.setTag(2131362366, view2);
            q0.a(this.f1425a, view2);
            this.f1428d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        if (z9) {
            return;
        }
        g();
    }
}
