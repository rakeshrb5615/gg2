package z3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7193b;

    public /* synthetic */ c(d dVar, int i) {
        this.f7192a = i;
        this.f7193b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f7192a) {
            case 1:
                this.f7193b.f7243b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f7192a) {
            case 0:
                this.f7193b.f7243b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
