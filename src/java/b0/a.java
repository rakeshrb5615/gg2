package b0;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a {
    public boolean e(View view) {
        return false;
    }

    public void f(View view) {
    }

    public void g(d dVar) {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void i() {
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i9, int i10) {
        return false;
    }

    public boolean m(View view) {
        return false;
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i9, int[] iArr, int i10) {
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, int i, int i9, int i10, int[] iArr) {
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void q(View view, Parcelable parcelable) {
    }

    public Parcelable r(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean s(View view, int i, int i9) {
        return false;
    }

    public void t(View view, View view2, int i) {
    }

    public boolean u(View view, MotionEvent motionEvent) {
        return false;
    }
}
