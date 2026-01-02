package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import q0.c1;
import q0.x0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1444a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1445b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1446c;

    public n(c1 c1Var, View view) {
        this.f1445b = c1Var;
        this.f1446c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1444a) {
            case 0:
                ((r.e) this.f1445b).remove(animator);
                ((s) this.f1446c).f1470t.remove(animator);
                return;
            default:
                ((c1) this.f1445b).f5108a.d(1.0f);
                x0.e((View) this.f1446c);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1444a) {
            case 0:
                ((s) this.f1446c).f1470t.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public n(s sVar, r.e eVar) {
        this.f1446c = sVar;
        this.f1445b = eVar;
    }
}
