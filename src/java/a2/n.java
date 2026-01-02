package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f400a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f401b;

    public n(p pVar) {
        this.f401b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f400a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f400a) {
            this.f400a = false;
            return;
        }
        p pVar = this.f401b;
        if (((Float) pVar.f437z.getAnimatedValue()).floatValue() == 0.0f) {
            pVar.A = 0;
            pVar.f(0);
            return;
        }
        pVar.A = 2;
        pVar.f430s.invalidate();
    }
}
