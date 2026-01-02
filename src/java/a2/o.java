package a2;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f404a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f405b;

    public /* synthetic */ o(Object obj, int i) {
        this.f404a = i;
        this.f405b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f404a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                p pVar = (p) this.f405b;
                pVar.f417c.setAlpha(floatValue);
                pVar.f418d.setAlpha(floatValue);
                pVar.f430s.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3.k kVar = ((BottomSheetBehavior) this.f405b).i;
                if (kVar != null) {
                    v3.i iVar = kVar.f6213b;
                    if (iVar.j != floatValue2) {
                        iVar.j = floatValue2;
                        kVar.f6217f = true;
                        kVar.f6218m = true;
                        kVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) this.f405b).C0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
