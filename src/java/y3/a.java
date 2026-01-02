package y3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6783a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f6784b;

    public /* synthetic */ a(h hVar, int i) {
        this.f6783a = i;
        this.f6784b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6783a) {
            case 0:
                this.f6784b.c();
                return;
            case 1:
                this.f6784b.d();
                return;
            case 2:
                this.f6784b.c();
                return;
            default:
                this.f6784b.d();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6783a) {
            case 1:
                h hVar = this.f6784b;
                SnackbarContentLayout snackbarContentLayout = hVar.j;
                int i = hVar.f6810c;
                int i9 = hVar.f6808a;
                int i10 = i - i9;
                SnackbarContentLayout snackbarContentLayout2 = snackbarContentLayout;
                snackbarContentLayout2.a.setAlpha(0.0f);
                long j = i9;
                ViewPropertyAnimator duration = snackbarContentLayout2.a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout2.c;
                long j8 = i10;
                duration.setInterpolator(timeInterpolator).setStartDelay(j8).start();
                if (snackbarContentLayout2.b.getVisibility() == 0) {
                    snackbarContentLayout2.b.setAlpha(0.0f);
                    snackbarContentLayout2.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j8).start();
                    return;
                }
                return;
            case 2:
                h hVar2 = this.f6784b;
                SnackbarContentLayout snackbarContentLayout3 = hVar2.j;
                int i11 = hVar2.f6809b;
                SnackbarContentLayout snackbarContentLayout4 = snackbarContentLayout3;
                snackbarContentLayout4.a.setAlpha(1.0f);
                long j9 = i11;
                ViewPropertyAnimator duration2 = snackbarContentLayout4.a.animate().alpha(0.0f).setDuration(j9);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout4.c;
                long j10 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                if (snackbarContentLayout4.b.getVisibility() == 0) {
                    snackbarContentLayout4.b.setAlpha(1.0f);
                    snackbarContentLayout4.b.animate().alpha(0.0f).setDuration(j9).setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ a(h hVar, int i, int i9) {
        this.f6783a = i9;
        this.f6784b = hVar;
    }
}
