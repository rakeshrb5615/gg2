package i2;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f2391b;

    public /* synthetic */ k(int i, TextView textView) {
        this.f2390a = i;
        this.f2391b = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2390a) {
            case 0:
                this.f2391b.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                this.f2391b.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
