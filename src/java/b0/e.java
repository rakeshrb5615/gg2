package b0;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i2.t0;
import l2.a0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f697b;

    public /* synthetic */ e(Object obj, int i) {
        this.f696a = i;
        this.f697b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f696a) {
            case 0:
                ((CoordinatorLayout) this.f697b).p(0);
                return true;
            default:
                a0 a0Var = (a0) this.f697b;
                a0Var.f3567h2.getViewTreeObserver().removeOnPreDrawListener(this);
                int width = a0Var.f3540a.getResources().getConfiguration().orientation == 1 ? a0Var.f3567h2.getWidth() : a0Var.f3567h2.getHeight();
                t0 t0Var = (t0) a0Var.f3567h2.getAdapter();
                if (t0Var != null) {
                    t0Var.f2519d = width;
                    t0Var.f350a.b();
                }
                return true;
        }
    }
}
