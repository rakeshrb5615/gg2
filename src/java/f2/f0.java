package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f0 extends AnimatorListenerAdapter implements q {

    /* renamed from: a  reason: collision with root package name */
    public final View f1417a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1418b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f1419c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1421e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1422f = false;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1420d = true;

    public f0(View view, int i) {
        this.f1417a = view;
        this.f1418b = i;
        this.f1419c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // f2.q
    public final void a(s sVar) {
    }

    @Override // f2.q
    public final void b() {
        g(false);
        if (this.f1422f) {
            return;
        }
        c0.b(this.f1417a, this.f1418b);
    }

    @Override // f2.q
    public final void c(s sVar) {
    }

    @Override // f2.q
    public final void d() {
        g(true);
        if (this.f1422f) {
            return;
        }
        c0.b(this.f1417a, 0);
    }

    @Override // f2.q
    public final void f(s sVar) {
        sVar.A(this);
    }

    public final void g(boolean z9) {
        ViewGroup viewGroup;
        if (!this.f1420d || this.f1421e == z9 || (viewGroup = this.f1419c) == null) {
            return;
        }
        this.f1421e = z9;
        c4.b.d0(viewGroup, z9);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1422f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1422f) {
            c0.b(this.f1417a, this.f1418b);
            ViewGroup viewGroup = this.f1419c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z9) {
        if (z9) {
            c0.b(this.f1417a, 0);
            ViewGroup viewGroup = this.f1419c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        if (z9) {
            return;
        }
        if (!this.f1422f) {
            c0.b(this.f1417a, this.f1418b);
            ViewGroup viewGroup = this.f1419c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
