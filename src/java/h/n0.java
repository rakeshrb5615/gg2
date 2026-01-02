package h;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import j5.t1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.f3;
import n.k1;
import n.q2;
import q0.q0;
import q0.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n0 extends t1 implements n.d {
    public static final AccelerateInterpolator D = new AccelerateInterpolator();
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public final l0 A;
    public final l0 B;
    public final l6.c C;

    /* renamed from: f  reason: collision with root package name */
    public Context f2076f;

    /* renamed from: g  reason: collision with root package name */
    public Context f2077g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarOverlayLayout f2078h;
    public ActionBarContainer i;
    public k1 j;

    /* renamed from: k  reason: collision with root package name */
    public ActionBarContextView f2079k;

    /* renamed from: l  reason: collision with root package name */
    public final View f2080l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2081m;

    /* renamed from: n  reason: collision with root package name */
    public m0 f2082n;

    /* renamed from: o  reason: collision with root package name */
    public m0 f2083o;

    /* renamed from: p  reason: collision with root package name */
    public k2.c f2084p;
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f2085r;

    /* renamed from: s  reason: collision with root package name */
    public int f2086s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2087t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2088u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2089v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2090w;

    /* renamed from: x  reason: collision with root package name */
    public l.j f2091x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2092y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2093z;

    public n0(Activity activity, boolean z9) {
        new ArrayList();
        this.f2085r = new ArrayList();
        this.f2086s = 0;
        this.f2087t = true;
        this.f2090w = true;
        this.A = new l0(this, 0);
        this.B = new l0(this, 1);
        this.C = new l6.c(this, 22);
        View decorView = activity.getWindow().getDecorView();
        Y(decorView);
        if (z9) {
            return;
        }
        this.f2080l = decorView.findViewById(16908290);
    }

    public final void W(boolean z9) {
        t0 i;
        t0 t0Var;
        if (z9) {
            if (!this.f2089v) {
                this.f2089v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2078h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                b0(false);
            }
        } else if (this.f2089v) {
            this.f2089v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2078h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            b0(false);
        }
        if (!this.i.isLaidOut()) {
            if (z9) {
                ((f3) this.j).f4117a.setVisibility(4);
                this.f2079k.setVisibility(0);
                return;
            }
            ((f3) this.j).f4117a.setVisibility(0);
            this.f2079k.setVisibility(8);
            return;
        }
        if (z9) {
            f3 f3Var = (f3) this.j;
            i = q0.b(f3Var.f4117a);
            i.a(0.0f);
            i.c(100L);
            i.d(new l.i(f3Var, 4));
            t0Var = this.f2079k.i(0, 200L);
        } else {
            f3 f3Var2 = (f3) this.j;
            t0 b10 = q0.b(f3Var2.f4117a);
            b10.a(1.0f);
            b10.c(200L);
            b10.d(new l.i(f3Var2, 0));
            i = this.f2079k.i(8, 100L);
            t0Var = b10;
        }
        l.j jVar = new l.j();
        ArrayList arrayList = jVar.f3524a;
        arrayList.add(i);
        View view = (View) i.f5184a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) t0Var.f5184a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(t0Var);
        jVar.b();
    }

    public final Context X() {
        if (this.f2077g == null) {
            TypedValue typedValue = new TypedValue();
            this.f2076f.getTheme().resolveAttribute(2130968589, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2077g = new ContextThemeWrapper(this.f2076f, i);
            } else {
                this.f2077g = this.f2076f;
            }
        }
        return this.f2077g;
    }

    public final void Y(View view) {
        k1 wrapper;
        ActionBarOverlayLayout findViewById = view.findViewById(2131362007);
        this.f2078h = findViewById;
        if (findViewById != null) {
            findViewById.setActionBarVisibilityCallback(this);
        }
        Toolbar findViewById2 = view.findViewById(2131361846);
        if (findViewById2 instanceof k1) {
            wrapper = (k1) findViewById2;
        } else if (!(findViewById2 instanceof Toolbar)) {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById2 != null ? findViewById2.getClass().getSimpleName() : "null"));
        } else {
            wrapper = findViewById2.getWrapper();
        }
        this.j = wrapper;
        this.f2079k = view.findViewById(2131361854);
        ActionBarContainer findViewById3 = view.findViewById(2131361848);
        this.i = findViewById3;
        k1 k1Var = this.j;
        if (k1Var == null || this.f2079k == null || findViewById3 == null) {
            throw new IllegalStateException(n0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((f3) k1Var).f4117a.getContext();
        this.f2076f = context;
        if ((((f3) this.j).f4118b & 4) != 0) {
            this.f2081m = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.j.getClass();
        a0(context.getResources().getBoolean(2131034112));
        TypedArray obtainStyledAttributes = this.f2076f.obtainStyledAttributes(null, g.a.f1570a, 2130968584, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2078h;
            if (!actionBarOverlayLayout.m) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2093z = true;
            actionBarOverlayLayout.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer = this.i;
            WeakHashMap weakHashMap = q0.f5172a;
            q0.i0.i(actionBarContainer, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void Z(boolean z9) {
        if (this.f2081m) {
            return;
        }
        int i = z9 ? 4 : 0;
        f3 f3Var = (f3) this.j;
        int i9 = f3Var.f4118b;
        this.f2081m = true;
        f3Var.a((i & 4) | (i9 & (-5)));
    }

    public final void a0(boolean z9) {
        if (z9) {
            this.i.setTabContainer((q2) null);
            ((f3) this.j).getClass();
        } else {
            ((f3) this.j).getClass();
            this.i.setTabContainer((q2) null);
        }
        this.j.getClass();
        ((f3) this.j).f4117a.setCollapsible(false);
        this.f2078h.setHasNonEmbeddedTabs(false);
    }

    public final void b0(boolean z9) {
        int[] iArr;
        int[] iArr2;
        boolean z10 = this.f2088u;
        boolean z11 = this.f2089v;
        l6.c cVar = this.C;
        View view = this.f2080l;
        if (!z11 && z10) {
            if (this.f2090w) {
                this.f2090w = false;
                l.j jVar = this.f2091x;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2086s;
                l0 l0Var = this.A;
                if (i != 0 || (!this.f2092y && !z9)) {
                    l0Var.a();
                    return;
                }
                this.i.setAlpha(1.0f);
                this.i.setTransitioning(true);
                l.j jVar2 = new l.j();
                float f9 = -this.i.getHeight();
                if (z9) {
                    this.i.getLocationInWindow(new int[]{0, 0});
                    f9 -= iArr2[1];
                }
                t0 b10 = q0.b(this.i);
                b10.e(f9);
                View view2 = (View) b10.f5184a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new i2.j(cVar, view2) : null);
                }
                boolean z12 = jVar2.f3528e;
                ArrayList arrayList = jVar2.f3524a;
                if (!z12) {
                    arrayList.add(b10);
                }
                if (this.f2087t && view != null) {
                    t0 b11 = q0.b(view);
                    b11.e(f9);
                    if (!jVar2.f3528e) {
                        arrayList.add(b11);
                    }
                }
                boolean z13 = jVar2.f3528e;
                if (!z13) {
                    jVar2.f3526c = D;
                }
                if (!z13) {
                    jVar2.f3525b = 250L;
                }
                if (!z13) {
                    jVar2.f3527d = l0Var;
                }
                this.f2091x = jVar2;
                jVar2.b();
            }
        } else if (this.f2090w) {
        } else {
            this.f2090w = true;
            l.j jVar3 = this.f2091x;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.i.setVisibility(0);
            int i9 = this.f2086s;
            l0 l0Var2 = this.B;
            if (i9 == 0 && (this.f2092y || z9)) {
                this.i.setTranslationY(0.0f);
                float f10 = -this.i.getHeight();
                if (z9) {
                    this.i.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                this.i.setTranslationY(f10);
                l.j jVar4 = new l.j();
                t0 b12 = q0.b(this.i);
                b12.e(0.0f);
                View view3 = (View) b12.f5184a.get();
                if (view3 != null) {
                    view3.animate().setUpdateListener(cVar != null ? new i2.j(cVar, view3) : null);
                }
                boolean z14 = jVar4.f3528e;
                ArrayList arrayList2 = jVar4.f3524a;
                if (!z14) {
                    arrayList2.add(b12);
                }
                if (this.f2087t && view != null) {
                    view.setTranslationY(f10);
                    t0 b13 = q0.b(view);
                    b13.e(0.0f);
                    if (!jVar4.f3528e) {
                        arrayList2.add(b13);
                    }
                }
                boolean z15 = jVar4.f3528e;
                if (!z15) {
                    jVar4.f3526c = E;
                }
                if (!z15) {
                    jVar4.f3525b = 250L;
                }
                if (!z15) {
                    jVar4.f3527d = l0Var2;
                }
                this.f2091x = jVar4;
                jVar4.b();
            } else {
                this.i.setAlpha(1.0f);
                this.i.setTranslationY(0.0f);
                if (this.f2087t && view != null) {
                    view.setTranslationY(0.0f);
                }
                l0Var2.a();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2078h;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = q0.f5172a;
                q0.g0.c(actionBarOverlayLayout);
            }
        }
    }

    public n0(Dialog dialog) {
        new ArrayList();
        this.f2085r = new ArrayList();
        this.f2086s = 0;
        this.f2087t = true;
        this.f2090w = true;
        this.A = new l0(this, 0);
        this.B = new l0(this, 1);
        this.C = new l6.c(this, 22);
        Y(dialog.getWindow().getDecorView());
    }
}
