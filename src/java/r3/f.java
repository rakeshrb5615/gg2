package r3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f extends a {

    /* renamed from: g  reason: collision with root package name */
    public final float f5567g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5568h;

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f5567g = resources.getDimension(2131165376);
        this.f5568h = resources.getDimension(2131165377);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f5559b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new l1.a(1));
        return animatorSet;
    }

    public final void b(float f9) {
        float interpolation = this.f5558a.getInterpolation(f9);
        View view = this.f5559b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float a10 = 1.0f - d3.a.a(0.0f, this.f5567g / width, interpolation);
        float a11 = 1.0f - d3.a.a(0.0f, this.f5568h / height, interpolation);
        if (Float.isNaN(a10) || Float.isNaN(a11)) {
            return;
        }
        view.setScaleX(a10);
        view.setPivotY(height);
        view.setScaleY(a11);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a11 != 0.0f ? a10 / a11 : 1.0f);
            }
        }
    }
}
