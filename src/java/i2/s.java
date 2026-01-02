package i2;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2515b;

    public /* synthetic */ s(View view, int i) {
        this.f2514a = i;
        this.f2515b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2514a) {
            case 0:
                View view = this.f2515b;
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
                return;
            case 1:
                View view2 = this.f2515b;
                view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view2.requestLayout();
                return;
            default:
                View view3 = this.f2515b;
                view3.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view3.requestLayout();
                return;
        }
    }
}
