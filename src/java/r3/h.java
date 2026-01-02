package r3;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h extends a {

    /* renamed from: g  reason: collision with root package name */
    public final float f5572g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5573h;
    public final float i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f5572g = resources.getDimension(2131165381);
        this.f5573h = resources.getDimension(2131165380);
        this.i = resources.getDimension(2131165382);
    }

    public final void a(float f9, boolean z9, int i) {
        float interpolation = this.f5558a.getInterpolation(f9);
        View view = this.f5559b;
        boolean z10 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z11 = z9 == z10;
        int width = view.getWidth();
        int height = view.getHeight();
        float f10 = width;
        if (f10 > 0.0f) {
            float f11 = height;
            if (f11 <= 0.0f) {
                return;
            }
            float f12 = this.f5572g / f10;
            float f13 = this.f5573h / f10;
            float f14 = this.i / f11;
            if (z10) {
                f10 = 0.0f;
            }
            view.setPivotX(f10);
            if (!z11) {
                f13 = -f12;
            }
            float a10 = d3.a.a(0.0f, f13, interpolation);
            float f15 = a10 + 1.0f;
            float a11 = 1.0f - d3.a.a(0.0f, f14, interpolation);
            if (Float.isNaN(f15) || Float.isNaN(a11)) {
                return;
            }
            view.setScaleX(f15);
            view.setScaleY(a11);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    childAt.setPivotX(z10 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f16 = z11 ? 1.0f - a10 : 1.0f;
                    float f17 = a11 != 0.0f ? (f15 / a11) * f16 : 1.0f;
                    if (!Float.isNaN(f16) && !Float.isNaN(f17)) {
                        childAt.setScaleX(f16);
                        childAt.setScaleY(f17);
                    }
                }
            }
        }
    }
}
