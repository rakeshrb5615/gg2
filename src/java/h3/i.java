package h3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.m;
import h.e0;
import j5.t1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.i0;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class i extends e0 {

    /* renamed from: m  reason: collision with root package name */
    public BottomSheetBehavior f2179m;

    /* renamed from: n  reason: collision with root package name */
    public FrameLayout f2180n;

    /* renamed from: o  reason: collision with root package name */
    public CoordinatorLayout f2181o;

    /* renamed from: p  reason: collision with root package name */
    public FrameLayout f2182p;
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2183r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2184s;

    /* renamed from: t  reason: collision with root package name */
    public h f2185t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2186u;

    /* renamed from: v  reason: collision with root package name */
    public b8.g f2187v;

    /* renamed from: w  reason: collision with root package name */
    public g f2188w;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f2179m == null) {
            e();
        }
        super.cancel();
    }

    public final void e() {
        if (this.f2180n == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), 2131558436, null);
            this.f2180n = frameLayout;
            this.f2181o = frameLayout.findViewById(2131361993);
            FrameLayout frameLayout2 = (FrameLayout) this.f2180n.findViewById(2131362011);
            this.f2182p = frameLayout2;
            BottomSheetBehavior A = BottomSheetBehavior.A(frameLayout2);
            this.f2179m = A;
            g gVar = this.f2188w;
            ArrayList arrayList = A.Y;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            this.f2179m.F(this.q);
            this.f2187v = new b8.g((r3.b) this.f2179m, (View) this.f2182p);
        }
    }

    public final FrameLayout f(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout findViewById = this.f2180n.findViewById(2131361993);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) findViewById, false);
        }
        if (this.f2186u) {
            FrameLayout frameLayout = this.f2180n;
            l6.c cVar = new l6.c(this, 24);
            WeakHashMap weakHashMap = q0.f5172a;
            i0.j(frameLayout, cVar);
        }
        this.f2182p.removeAllViews();
        if (layoutParams == null) {
            this.f2182p.addView(view);
        } else {
            this.f2182p.addView(view, layoutParams);
        }
        findViewById.findViewById(2131362545).setOnClickListener(new m(this, 2));
        q0.n(this.f2182p, new com.google.android.material.datepicker.k(this, 1));
        this.f2182p.setOnTouchListener(new f(0));
        return this.f2180n;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z9 = this.f2186u && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f2180n;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z9);
            }
            CoordinatorLayout coordinatorLayout = this.f2181o;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z9);
            }
            t1.R(window, !z9);
            h hVar = this.f2185t;
            if (hVar != null) {
                hVar.e(window);
            }
        }
        b8.g gVar = this.f2187v;
        if (gVar == null) {
            return;
        }
        View view = (View) gVar.f791d;
        r3.c cVar = (r3.c) gVar.f789b;
        if (this.q) {
            if (cVar != null) {
                cVar.b((r3.b) gVar.f790c, view, false);
            }
        } else if (cVar != null) {
            cVar.c(view);
        }
    }

    @Override // h.e0, c.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        r3.c cVar;
        h hVar = this.f2185t;
        if (hVar != null) {
            hVar.e(null);
        }
        b8.g gVar = this.f2187v;
        if (gVar == null || (cVar = (r3.c) gVar.f789b) == null) {
            return;
        }
        cVar.c((View) gVar.f791d);
    }

    @Override // c.p, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f2179m;
        if (bottomSheetBehavior == null || bottomSheetBehavior.N != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z9) {
        b8.g gVar;
        super.setCancelable(z9);
        if (this.q != z9) {
            this.q = z9;
            BottomSheetBehavior bottomSheetBehavior = this.f2179m;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z9);
            }
            if (getWindow() == null || (gVar = this.f2187v) == null) {
                return;
            }
            View view = (View) gVar.f791d;
            r3.c cVar = (r3.c) gVar.f789b;
            if (this.q) {
                if (cVar != null) {
                    cVar.b((r3.b) gVar.f790c, view, false);
                }
            } else if (cVar != null) {
                cVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z9) {
        super.setCanceledOnTouchOutside(z9);
        if (z9 && !this.q) {
            this.q = true;
        }
        this.f2183r = z9;
        this.f2184s = true;
    }

    @Override // h.e0, c.p, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(f(null, i, null));
    }

    @Override // h.e0, c.p, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(view, 0, null));
    }

    @Override // h.e0, c.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(view, 0, layoutParams));
    }
}
