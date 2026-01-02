package f2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e0 extends d0 {
    @Override // j5.t1
    public final float G(View view) {
        return view.getTransitionAlpha();
    }

    @Override // j5.t1
    public final void S(View view, float f9) {
        view.setTransitionAlpha(f9);
    }

    @Override // f2.d0, j5.t1
    public final void T(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // f2.d0
    public final void W(View view, int i, int i9, int i10, int i11) {
        view.setLeftTopRightBottom(i, i9, i10, i11);
    }

    @Override // f2.d0
    public final void X(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // f2.d0
    public final void Y(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
