package i2;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2388b;

    public /* synthetic */ j(Object obj, int i) {
        this.f2387a = i;
        this.f2388b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2387a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f2388b;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Drawable) obj).setTint(intValue);
                }
                return;
            case 1:
                Slider slider = (Slider) this.f2388b;
                if (slider.isAttachedToWindow()) {
                    slider.setValue(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 2:
                ((View) ((h.n0) ((l6.c) this.f2388b).f3791b).i.getParent()).invalidate();
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                x3.e eVar = (x3.e) this.f2388b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = eVar.f6595r;
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = arrayList2.get(i9);
                    i9++;
                    b4.b bVar = (b4.b) obj2;
                    bVar.Z = floatValue;
                    bVar.f713a0 = floatValue;
                    bVar.f716d0 = d3.a.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                    bVar.invalidateSelf();
                }
                eVar.postInvalidateOnAnimation();
                return;
            default:
                z3.k kVar = (z3.k) this.f2388b;
                kVar.getClass();
                kVar.f7245d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public /* synthetic */ j(l6.c cVar, View view) {
        this.f2387a = 2;
        this.f2388b = cVar;
    }
}
