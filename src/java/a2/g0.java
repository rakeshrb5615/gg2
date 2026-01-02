package a2;

import android.view.animation.Interpolator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g0 implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f325a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        switch (this.f325a) {
            case 0:
            default:
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }
}
