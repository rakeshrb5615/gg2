package y3;

import android.animation.ValueAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6785a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f6786b;

    public /* synthetic */ b(h hVar, int i) {
        this.f6785a = i;
        this.f6786b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6785a) {
            case 0:
                this.f6786b.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = this.f6786b;
                hVar.i.setScaleX(floatValue);
                hVar.i.setScaleY(floatValue);
                return;
            case 2:
                this.f6786b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                this.f6786b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
