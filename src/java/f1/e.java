package f1;

import android.view.View;
import v3.a0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        super(5);
        this.f1373f = i;
    }

    @Override // q4.b
    public final void R(a0 a0Var, float f9) {
        switch (this.f1373f) {
            case 0:
                ((View) a0Var).setAlpha(f9);
                return;
            case 1:
                ((View) a0Var).setScaleX(f9);
                return;
            case 2:
                ((View) a0Var).setScaleY(f9);
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) a0Var).setRotation(f9);
                return;
            case 4:
                ((View) a0Var).setRotationX(f9);
                return;
            default:
                ((View) a0Var).setRotationY(f9);
                return;
        }
    }

    @Override // q4.b
    public final float y(a0 a0Var) {
        switch (this.f1373f) {
            case 0:
                return ((View) a0Var).getAlpha();
            case 1:
                return ((View) a0Var).getScaleX();
            case 2:
                return ((View) a0Var).getScaleY();
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return ((View) a0Var).getRotation();
            case 4:
                return ((View) a0Var).getRotationX();
            default:
                return ((View) a0Var).getRotationY();
        }
    }
}
