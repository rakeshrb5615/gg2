package l1;

import android.view.animation.Interpolator;
import g2.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f3533a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3534b;

    public b(float[] fArr) {
        this.f3533a = fArr;
        this.f3534b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3533a;
        int min = Math.min((int) ((fArr.length - 1) * f9), fArr.length - 2);
        float f10 = this.f3534b;
        float f11 = fArr[min];
        return g.b(fArr[min + 1], f11, (f9 - (min * f10)) / f10, f11);
    }
}
