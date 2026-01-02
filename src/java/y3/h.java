package y3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import j5.t1;
import j6.s;
import java.util.List;
import java.util.WeakHashMap;
import q0.i0;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f6808a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6809b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6810c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f6811d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f6812e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f6813f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f6814g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f6815h;
    public final g i;
    public final i j;

    /* renamed from: k  reason: collision with root package name */
    public int f6816k;

    /* renamed from: m  reason: collision with root package name */
    public int f6818m;

    /* renamed from: n  reason: collision with root package name */
    public int f6819n;

    /* renamed from: o  reason: collision with root package name */
    public int f6820o;

    /* renamed from: p  reason: collision with root package name */
    public int f6821p;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6822r;

    /* renamed from: s  reason: collision with root package name */
    public final AccessibilityManager f6823s;

    /* renamed from: u  reason: collision with root package name */
    public static final l1.a f6802u = d3.a.f1074b;

    /* renamed from: v  reason: collision with root package name */
    public static final LinearInterpolator f6803v = d3.a.f1073a;

    /* renamed from: w  reason: collision with root package name */
    public static final l1.a f6804w = d3.a.f1076d;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f6806y = {2130969756};

    /* renamed from: z  reason: collision with root package name */
    public static final String f6807z = h.class.getSimpleName();

    /* renamed from: x  reason: collision with root package name */
    public static final Handler f6805x = new Handler(Looper.getMainLooper(), new Object());

    /* renamed from: l  reason: collision with root package name */
    public final d f6817l = new d(this, 0);

    /* renamed from: t  reason: collision with root package name */
    public final f f6824t = new f(this);

    public h(Context context, ViewGroup viewGroup, View view, i iVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f6814g = viewGroup;
        this.j = iVar;
        this.f6815h = context;
        q3.k.c(context, q3.k.f5366a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6806y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        g gVar = (g) from.inflate(resourceId != -1 ? 2131558506 : 2131558437, viewGroup, false);
        this.i = gVar;
        g.a(gVar, this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = gVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.b.setTextColor(t1.L(t1.u(snackbarContentLayout, 2130968890), snackbarContentLayout.b.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(gVar.getMaxInlineActionWidth());
        }
        gVar.addView(view);
        gVar.setAccessibilityLiveRegion(1);
        gVar.setImportantForAccessibility(1);
        gVar.setFitsSystemWindows(true);
        e eVar = new e(this);
        WeakHashMap weakHashMap = q0.f5172a;
        i0.j(gVar, eVar);
        q0.n(gVar, new com.google.android.material.datepicker.k(this, 5));
        this.f6823s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f6810c = t1.P(context, 2130969523, 250);
        this.f6808a = t1.P(context, 2130969523, 150);
        this.f6809b = t1.P(context, 2130969526, 75);
        this.f6811d = t1.Q(context, 2130969539, f6803v);
        this.f6813f = t1.Q(context, 2130969539, f6804w);
        this.f6812e = t1.Q(context, 2130969539, f6802u);
    }

    public final void a(int i) {
        s h9 = s.h();
        f fVar = this.f6824t;
        synchronized (h9.f3282b) {
            try {
                if (h9.l(fVar)) {
                    h9.c((l) h9.f3284d, i);
                } else {
                    l lVar = (l) h9.f3285e;
                    if (lVar != null && lVar.f6826a.get() == fVar) {
                        h9.c((l) h9.f3285e, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        this.f6821p = l4.h.f(rootWindowInsets.getMandatorySystemGestureInsets());
        f();
    }

    public final void c() {
        s h9 = s.h();
        f fVar = this.f6824t;
        synchronized (h9.f3282b) {
            try {
                if (h9.l(fVar)) {
                    h9.f3284d = null;
                    if (((l) h9.f3285e) != null) {
                        h9.s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        s h9 = s.h();
        f fVar = this.f6824t;
        synchronized (h9.f3282b) {
            try {
                if (h9.l(fVar)) {
                    h9.r((l) h9.f3284d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        g gVar = this.i;
        AccessibilityManager accessibilityManager = this.f6823s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            gVar.post(new d(this, 2));
            return;
        }
        if (gVar.getParent() != null) {
            gVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        g gVar = this.i;
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        boolean z9 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f6807z;
        if (!z9) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (gVar.f6801p == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
        } else if (gVar.getParent() == null) {
        } else {
            int i = this.f6818m;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = gVar.f6801p;
            int i9 = rect.bottom + i;
            int i10 = rect.left + this.f6819n;
            int i11 = rect.right + this.f6820o;
            int i12 = rect.top;
            boolean z10 = (marginLayoutParams.bottomMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.topMargin == i12) ? false : true;
            if (z10) {
                marginLayoutParams.bottomMargin = i9;
                marginLayoutParams.leftMargin = i10;
                marginLayoutParams.rightMargin = i11;
                marginLayoutParams.topMargin = i12;
                gVar.requestLayout();
            }
            if ((z10 || this.q != this.f6821p) && Build.VERSION.SDK_INT >= 29 && this.f6821p > 0) {
                ViewGroup.LayoutParams layoutParams2 = gVar.getLayoutParams();
                if ((layoutParams2 instanceof b0.d) && (((b0.d) layoutParams2).f683a instanceof SwipeDismissBehavior)) {
                    d dVar = this.f6817l;
                    gVar.removeCallbacks(dVar);
                    gVar.post(dVar);
                }
            }
        }
    }
}
