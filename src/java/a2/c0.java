package a2;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c0 extends v0 {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f285a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f286b;

    /* renamed from: c  reason: collision with root package name */
    public final n1 f287c = new n1(this);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f288d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f289e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f290f;

    public c0(int i) {
        this.f288d = i;
    }

    public static int c(View view, e0 e0Var) {
        return ((e0Var.c(view) / 2) + e0Var.e(view)) - ((e0Var.l() / 2) + e0Var.k());
    }

    public static View e(t0 t0Var, e0 e0Var) {
        int v2 = t0Var.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l5 = (e0Var.l() / 2) + e0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v2; i9++) {
            View u9 = t0Var.u(i9);
            int abs = Math.abs(((e0Var.c(u9) / 2) + e0Var.e(u9)) - l5);
            if (abs < i) {
                view = u9;
                i = abs;
            }
        }
        return view;
    }

    public static View f(t0 t0Var, e0 e0Var) {
        int v2 = t0Var.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l5 = (e0Var.l() / 2) + e0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v2; i9++) {
            View u9 = t0Var.u(i9);
            int abs = Math.abs(((e0Var.c(u9) / 2) + e0Var.e(u9)) - l5);
            if (abs < i) {
                view = u9;
                i = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f285a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        n1 n1Var = this.f287c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.m0;
            if (arrayList != null) {
                arrayList.remove(n1Var);
            }
            this.f285a.setOnFlingListener((v0) null);
        }
        this.f285a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f285a.j(n1Var);
            this.f285a.setOnFlingListener(this);
            this.f286b = new Scroller(this.f285a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public final int[] b(t0 t0Var, View view) {
        switch (this.f288d) {
            case 0:
                int[] iArr = new int[2];
                if (t0Var.d()) {
                    e0 h9 = h(t0Var);
                    iArr[0] = ((h9.c(view) / 2) + h9.e(view)) - ((h9.l() / 2) + h9.k());
                } else {
                    iArr[0] = 0;
                }
                if (t0Var.e()) {
                    e0 j = j(t0Var);
                    iArr[1] = ((j.c(view) / 2) + j.e(view)) - ((j.l() / 2) + j.k());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (t0Var.d()) {
                    iArr2[0] = c(view, i(t0Var));
                } else {
                    iArr2[0] = 0;
                }
                if (t0Var.e()) {
                    iArr2[1] = c(view, k(t0Var));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public int d(t0 t0Var, e0 e0Var, int i, int i9) {
        this.f286b.fling(0, 0, i, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f286b.getFinalX(), this.f286b.getFinalY()};
        int v2 = t0Var.v();
        float f9 = 1.0f;
        if (v2 != 0) {
            View view = null;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i12 = 0; i12 < v2; i12++) {
                View u9 = t0Var.u(i12);
                int G = t0.G(u9);
                if (G != -1) {
                    if (G < i11) {
                        view = u9;
                        i11 = G;
                    }
                    if (G > i10) {
                        view2 = u9;
                        i10 = G;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(e0Var.b(view), e0Var.b(view2)) - Math.min(e0Var.e(view), e0Var.e(view2));
                if (max != 0) {
                    f9 = (max * 1.0f) / ((i10 - i11) + 1);
                }
            }
        }
        if (f9 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f9);
    }

    public final View g(t0 t0Var) {
        switch (this.f288d) {
            case 0:
                if (t0Var.e()) {
                    return e(t0Var, j(t0Var));
                }
                if (t0Var.d()) {
                    return e(t0Var, h(t0Var));
                }
                return null;
            default:
                if (t0Var.e()) {
                    return f(t0Var, k(t0Var));
                }
                if (t0Var.d()) {
                    return f(t0Var, i(t0Var));
                }
                return null;
        }
    }

    public e0 h(t0 t0Var) {
        d0 d0Var = this.f290f;
        if (d0Var == null || ((t0) d0Var.f304b) != t0Var) {
            this.f290f = new d0(t0Var, 0);
        }
        return this.f290f;
    }

    public e0 i(t0 t0Var) {
        d0 d0Var = this.f290f;
        if (d0Var == null || ((t0) d0Var.f304b) != t0Var) {
            this.f290f = new d0(t0Var, 0);
        }
        return this.f290f;
    }

    public e0 j(t0 t0Var) {
        d0 d0Var = this.f289e;
        if (d0Var == null || ((t0) d0Var.f304b) != t0Var) {
            this.f289e = new d0(t0Var, 1);
        }
        return this.f289e;
    }

    public e0 k(t0 t0Var) {
        d0 d0Var = this.f289e;
        if (d0Var == null || ((t0) d0Var.f304b) != t0Var) {
            this.f289e = new d0(t0Var, 1);
        }
        return this.f289e;
    }

    public final void l() {
        t0 layoutManager;
        View g3;
        RecyclerView recyclerView = this.f285a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (g3 = g(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, g3);
        int i = b10[0];
        if (i == 0 && b10[1] == 0) {
            return;
        }
        this.f285a.h0(i, false, b10[1]);
    }
}
