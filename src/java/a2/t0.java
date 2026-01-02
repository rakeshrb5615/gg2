package a2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public d f487a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f488b;

    /* renamed from: c  reason: collision with root package name */
    public final k2.c f489c;

    /* renamed from: d  reason: collision with root package name */
    public final k2.c f490d;

    /* renamed from: e  reason: collision with root package name */
    public b0 f491e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f492f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f493g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f494h;
    public final boolean i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f495k;

    /* renamed from: l  reason: collision with root package name */
    public int f496l;

    /* renamed from: m  reason: collision with root package name */
    public int f497m;

    /* renamed from: n  reason: collision with root package name */
    public int f498n;

    /* renamed from: o  reason: collision with root package name */
    public int f499o;

    public t0() {
        r0 r0Var = new r0(this, 0);
        r0 r0Var2 = new r0(this, 1);
        this.f489c = new k2.c(r0Var);
        this.f490d = new k2.c(r0Var2);
        this.f492f = false;
        this.f493g = false;
        this.f494h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((u0) view.getLayoutParams()).f508b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((u0) view.getLayoutParams()).f507a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a2.s0, java.lang.Object] */
    public static s0 H(Context context, AttributeSet attributeSet, int i, int i9) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z1.a.f7185a, i, i9);
        obj.f471a = obtainStyledAttributes.getInt(0, 1);
        obj.f472b = obtainStyledAttributes.getInt(10, 1);
        obj.f473c = obtainStyledAttributes.getBoolean(9, false);
        obj.f474d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (i10 <= 0 || i == i10) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void N(View view, int i, int i9, int i10, int i11) {
        u0 u0Var = (u0) view.getLayoutParams();
        Rect rect = u0Var.f508b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) u0Var).leftMargin, i9 + rect.top + ((ViewGroup.MarginLayoutParams) u0Var).topMargin, (i10 - rect.right) - ((ViewGroup.MarginLayoutParams) u0Var).rightMargin, (i11 - rect.bottom) - ((ViewGroup.MarginLayoutParams) u0Var).bottomMargin);
    }

    public static int g(int i, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i9, i10) : size : Math.min(size, Math.max(i9, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((u0) view.getLayoutParams()).f508b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        RecyclerView recyclerView = this.f488b;
        i0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void B0(b0 b0Var) {
        b0 b0Var2 = this.f491e;
        if (b0Var2 != null && b0Var != b0Var2 && b0Var2.f272e) {
            b0Var2.i();
        }
        this.f491e = b0Var;
        RecyclerView recyclerView = this.f488b;
        j1 j1Var = recyclerView.h0;
        j1Var.f364m.removeCallbacks(j1Var);
        j1Var.f360c.abortAnimation();
        if (b0Var.f275h) {
            Log.w("RecyclerView", "An instance of " + b0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + b0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        b0Var.f269b = recyclerView;
        b0Var.f270c = this;
        int i = b0Var.f268a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.k0.f326a = i;
        b0Var.f272e = true;
        b0Var.f271d = true;
        b0Var.f273f = recyclerView.s.q(i);
        b0Var.f269b.h0.b();
        b0Var.f275h = true;
    }

    public final int C() {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(z0 z0Var, g1 g1Var) {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView == null || recyclerView.r == null || !e()) {
            return 1;
        }
        return this.f488b.r.a();
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((u0) view.getLayoutParams()).f508b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f488b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f488b.q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            int r8 = recyclerView.f.r();
            for (int i9 = 0; i9 < r8; i9++) {
                recyclerView.f.q(i9).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            int r8 = recyclerView.f.r();
            for (int i9 = 0; i9 < r8; i9++) {
                recyclerView.f.q(i9).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, z0 z0Var, g1 g1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f488b;
        z0 z0Var = recyclerView.c;
        g1 g1Var = recyclerView.k0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z9 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f488b.canScrollVertically(-1) && !this.f488b.canScrollHorizontally(-1) && !this.f488b.canScrollHorizontally(1)) {
            z9 = false;
        }
        accessibilityEvent.setScrollable(z9);
        i0 i0Var = this.f488b.r;
        if (i0Var != null) {
            accessibilityEvent.setItemCount(i0Var.a());
        }
    }

    public void V(z0 z0Var, g1 g1Var, r0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        if (this.f488b.canScrollVertically(-1) || this.f488b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
            cVar.h(67108864, true);
        }
        if (this.f488b.canScrollVertically(1) || this.f488b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
            cVar.h(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(z0Var, g1Var), x(z0Var, g1Var), false, 0));
    }

    public void W(z0 z0Var, g1 g1Var, View view, r0.c cVar) {
        cVar.j(k4.i.c(false, e() ? G(view) : 0, 1, d() ? G(view) : 0, 1));
    }

    public final void X(View view, r0.c cVar) {
        k1 M = RecyclerView.M(view);
        if (M == null || M.h()) {
            return;
        }
        d dVar = this.f487a;
        if (((ArrayList) dVar.f296e).contains(M.f376a)) {
            return;
        }
        RecyclerView recyclerView = this.f488b;
        W(recyclerView.c, recyclerView.k0, view, cVar);
    }

    public void Y(int i, int i9) {
    }

    public void Z() {
    }

    public void a0(int i, int i9) {
    }

    public final void b(View view, int i, boolean z9) {
        k1 M = RecyclerView.M(view);
        if (z9 || M.h()) {
            r.j jVar = (r.j) this.f488b.m.f3363b;
            u1 u1Var = (u1) jVar.get(M);
            if (u1Var == null) {
                u1Var = u1.a();
                jVar.put(M, u1Var);
            }
            u1Var.f512a |= 1;
        } else {
            this.f488b.m.C(M);
        }
        u0 u0Var = (u0) view.getLayoutParams();
        if (M.p() || M.i()) {
            if (M.i()) {
                M.f387n.m(M);
            } else {
                M.j &= -33;
            }
            this.f487a.c(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f488b) {
                d dVar = this.f487a;
                c cVar = (c) dVar.f295d;
                int indexOfChild = ((h0) dVar.f294c).f343a.indexOfChild(view);
                int b10 = (indexOfChild == -1 || cVar.d(indexOfChild)) ? -1 : indexOfChild - cVar.b(indexOfChild);
                if (i == -1) {
                    i = this.f487a.r();
                }
                if (b10 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f488b.indexOfChild(view));
                    throw new IllegalStateException(v1.a.h(this.f488b, sb));
                } else if (b10 != i) {
                    t0 t0Var = this.f488b.s;
                    View u9 = t0Var.u(b10);
                    if (u9 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b10 + t0Var.f488b.toString());
                    }
                    t0Var.u(b10);
                    t0Var.f487a.l(b10);
                    u0 u0Var2 = (u0) u9.getLayoutParams();
                    k1 M2 = RecyclerView.M(u9);
                    if (M2.h()) {
                        r.j jVar2 = (r.j) t0Var.f488b.m.f3363b;
                        u1 u1Var2 = (u1) jVar2.get(M2);
                        if (u1Var2 == null) {
                            u1Var2 = u1.a();
                            jVar2.put(M2, u1Var2);
                        }
                        u1Var2.f512a = 1 | u1Var2.f512a;
                    } else {
                        t0Var.f488b.m.C(M2);
                    }
                    t0Var.f487a.c(u9, i, u0Var2, M2.h());
                }
            } else {
                this.f487a.a(view, i, false);
                u0Var.f509c = true;
                b0 b0Var = this.f491e;
                if (b0Var != null && b0Var.f272e) {
                    b0Var.f269b.getClass();
                    k1 M3 = RecyclerView.M(view);
                    if ((M3 != null ? M3.b() : -1) == b0Var.f268a) {
                        b0Var.f273f = view;
                        if (RecyclerView.G0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (u0Var.f510d) {
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + u0Var.f507a);
            }
            M.f376a.invalidate();
            u0Var.f510d = false;
        }
    }

    public void b0(int i, int i9) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i9) {
    }

    public abstract boolean d();

    public abstract void d0(z0 z0Var, g1 g1Var);

    public abstract boolean e();

    public abstract void e0(g1 g1Var);

    public boolean f(u0 u0Var) {
        return u0Var != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i9, g1 g1Var, r rVar) {
    }

    public void h0(int i) {
    }

    public void i(int i, r rVar) {
    }

    public boolean i0(int i, Bundle bundle) {
        int F;
        int D;
        float f9;
        z0 z0Var = this.f488b.c;
        int i9 = this.f499o;
        int i10 = this.f498n;
        Rect rect = new Rect();
        if (this.f488b.getMatrix().isIdentity() && this.f488b.getGlobalVisibleRect(rect)) {
            i9 = rect.height();
            i10 = rect.width();
        }
        if (i == 4096) {
            F = this.f488b.canScrollVertically(1) ? (i9 - F()) - C() : 0;
            if (this.f488b.canScrollHorizontally(1)) {
                D = (i10 - D()) - E();
            }
            D = 0;
        } else if (i != 8192) {
            F = 0;
            D = 0;
        } else {
            F = this.f488b.canScrollVertically(-1) ? -((i9 - F()) - C()) : 0;
            if (this.f488b.canScrollHorizontally(-1)) {
                D = -((i10 - D()) - E());
            }
            D = 0;
        }
        if (F != 0 || D != 0) {
            if (bundle != null) {
                f9 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f9 < 0.0f) {
                    if (RecyclerView.F0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f9 + ")");
                    }
                }
            } else {
                f9 = 1.0f;
            }
            if (Float.compare(f9, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f9) != 0 && Float.compare(0.0f, f9) != 0) {
                    D = (int) (D * f9);
                    F = (int) (F * f9);
                }
                this.f488b.h0(D, true, F);
                return true;
            }
            RecyclerView recyclerView = this.f488b;
            i0 i0Var = recyclerView.r;
            if (i0Var != null) {
                if (i == 4096) {
                    recyclerView.i0(i0Var.a() - 1);
                    return true;
                } else if (i != 8192) {
                    return true;
                } else {
                    recyclerView.i0(0);
                    return true;
                }
            }
        }
        return false;
    }

    public abstract int j(g1 g1Var);

    public final void j0(z0 z0Var) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.M(u(v2)).o()) {
                View u9 = u(v2);
                m0(v2);
                z0Var.i(u9);
            }
        }
    }

    public abstract int k(g1 g1Var);

    public final void k0(z0 z0Var) {
        ArrayList arrayList = z0Var.f550a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((k1) arrayList.get(i)).f376a;
            k1 M = RecyclerView.M(view);
            if (!M.o()) {
                M.n(false);
                if (M.j()) {
                    this.f488b.removeDetachedView(view, false);
                }
                p0 p0Var = this.f488b.P;
                if (p0Var != null) {
                    p0Var.d(M);
                }
                M.n(true);
                k1 M2 = RecyclerView.M(view);
                M2.f387n = null;
                M2.f388o = false;
                M2.j &= -33;
                z0Var.j(M2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = z0Var.f551b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f488b.invalidate();
        }
    }

    public abstract int l(g1 g1Var);

    public final void l0(View view, z0 z0Var) {
        d dVar = this.f487a;
        h0 h0Var = (h0) dVar.f294c;
        int i = dVar.f293b;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            dVar.f293b = 1;
            dVar.f297f = view;
            int indexOfChild = h0Var.f343a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (((c) dVar.f295d).f(indexOfChild)) {
                    dVar.A(view);
                }
                h0Var.i(indexOfChild);
            }
            dVar.f293b = 0;
            dVar.f297f = null;
            z0Var.i(view);
        } catch (Throwable th) {
            dVar.f293b = 0;
            dVar.f297f = null;
            throw th;
        }
    }

    public abstract int m(g1 g1Var);

    public final void m0(int i) {
        if (u(i) != null) {
            d dVar = this.f487a;
            h0 h0Var = (h0) dVar.f294c;
            int i9 = dVar.f293b;
            if (i9 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i9 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int s5 = dVar.s(i);
                View childAt = h0Var.f343a.getChildAt(s5);
                if (childAt != null) {
                    dVar.f293b = 1;
                    dVar.f297f = childAt;
                    if (((c) dVar.f295d).f(s5)) {
                        dVar.A(childAt);
                    }
                    h0Var.i(s5);
                }
                dVar.f293b = 0;
                dVar.f297f = null;
            } catch (Throwable th) {
                dVar.f293b = 0;
                dVar.f297f = null;
                throw th;
            }
        }
    }

    public abstract int n(g1 g1Var);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.D()
            int r1 = r8.F()
            int r2 = r8.f498n
            int r3 = r8.E()
            int r2 = r2 - r3
            int r3 = r8.f499o
            int r4 = r8.C()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f488b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.D()
            int r2 = r8.F()
            int r3 = r8.f498n
            int r4 = r8.E()
            int r3 = r3 - r4
            int r4 = r8.f499o
            int r5 = r8.C()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f488b
            android.graphics.Rect r5 = r5.o
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb5
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb5
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb5
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.h0(r11, r0, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t0.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int o(g1 g1Var);

    public final void o0() {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(z0 z0Var) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u9 = u(v2);
            k1 M = RecyclerView.M(u9);
            if (M.o()) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "ignoring view " + M);
                }
            } else if (!M.f() || M.h() || this.f488b.r.f351b) {
                u(v2);
                this.f487a.l(v2);
                z0Var.k(u9);
                this.f488b.m.C(M);
            } else {
                m0(v2);
                z0Var.j(M);
            }
        }
    }

    public abstract int p0(int i, z0 z0Var, g1 g1Var);

    public View q(int i) {
        int v2 = v();
        for (int i9 = 0; i9 < v2; i9++) {
            View u9 = u(i9);
            k1 M = RecyclerView.M(u9);
            if (M != null && M.b() == i && !M.o() && (this.f488b.k0.f332g || !M.h())) {
                return u9;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract u0 r();

    public abstract int r0(int i, z0 z0Var, g1 g1Var);

    public u0 s(Context context, AttributeSet attributeSet) {
        return new u0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public u0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u0 ? new u0((u0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new u0((ViewGroup.MarginLayoutParams) layoutParams) : new u0(layoutParams);
    }

    public final void t0(int i, int i9) {
        this.f498n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f496l = mode;
        if (mode == 0 && !RecyclerView.J0) {
            this.f498n = 0;
        }
        this.f499o = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        this.f497m = mode2;
        if (mode2 != 0 || RecyclerView.J0) {
            return;
        }
        this.f499o = 0;
    }

    public final View u(int i) {
        d dVar = this.f487a;
        if (dVar != null) {
            return dVar.q(i);
        }
        return null;
    }

    public void u0(Rect rect, int i, int i9) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f488b;
        WeakHashMap weakHashMap = q0.q0.f5172a;
        RecyclerView.g(this.f488b, g(i, E, recyclerView.getMinimumWidth()), g(i9, C, this.f488b.getMinimumHeight()));
    }

    public final int v() {
        d dVar = this.f487a;
        if (dVar != null) {
            return dVar.r();
        }
        return 0;
    }

    public final void v0(int i, int i9) {
        int v2 = v();
        if (v2 == 0) {
            this.f488b.q(i, i9);
            return;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < v2; i14++) {
            View u9 = u(i14);
            Rect rect = this.f488b.o;
            y(u9, rect);
            int i15 = rect.left;
            if (i15 < i13) {
                i13 = i15;
            }
            int i16 = rect.right;
            if (i16 > i10) {
                i10 = i16;
            }
            int i17 = rect.top;
            if (i17 < i11) {
                i11 = i17;
            }
            int i18 = rect.bottom;
            if (i18 > i12) {
                i12 = i18;
            }
        }
        this.f488b.o.set(i13, i11, i10, i12);
        u0(this.f488b.o, i, i9);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f488b = null;
            this.f487a = null;
            this.f498n = 0;
            this.f499o = 0;
        } else {
            this.f488b = recyclerView;
            this.f487a = recyclerView.f;
            this.f498n = recyclerView.getWidth();
            this.f499o = recyclerView.getHeight();
        }
        this.f496l = 1073741824;
        this.f497m = 1073741824;
    }

    public int x(z0 z0Var, g1 g1Var) {
        RecyclerView recyclerView = this.f488b;
        if (recyclerView == null || recyclerView.r == null || !d()) {
            return 1;
        }
        return this.f488b.r.a();
    }

    public final boolean x0(View view, int i, int i9, u0 u0Var) {
        return (!view.isLayoutRequested() && this.f494h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) u0Var).width) && M(view.getHeight(), i9, ((ViewGroup.MarginLayoutParams) u0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        boolean z9 = RecyclerView.F0;
        u0 u0Var = (u0) view.getLayoutParams();
        Rect rect2 = u0Var.f508b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) u0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) u0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) u0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) u0Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i9, u0 u0Var) {
        return (this.f494h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) u0Var).width) && M(view.getMeasuredHeight(), i9, ((ViewGroup.MarginLayoutParams) u0Var).height)) ? false : true;
    }
}
