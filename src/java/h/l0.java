package h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class l0 extends c4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2065c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n0 f2066d;

    public /* synthetic */ l0(n0 n0Var, int i) {
        this.f2065c = i;
        this.f2066d = n0Var;
    }

    @Override // q0.u0
    public final void a() {
        View view;
        int i = this.f2065c;
        n0 n0Var = this.f2066d;
        switch (i) {
            case 0:
                if (n0Var.f2087t && (view = n0Var.f2080l) != null) {
                    view.setTranslationY(0.0f);
                    n0Var.i.setTranslationY(0.0f);
                }
                n0Var.i.setVisibility(8);
                n0Var.i.setTransitioning(false);
                n0Var.f2091x = null;
                k2.c cVar = n0Var.f2084p;
                if (cVar != null) {
                    cVar.w(n0Var.f2083o);
                    n0Var.f2083o = null;
                    n0Var.f2084p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = n0Var.f2078h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = q0.f5172a;
                    q0.g0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                n0Var.f2091x = null;
                n0Var.i.requestLayout();
                return;
        }
    }
}
