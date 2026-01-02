package q0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class j1 extends p1 {
    public static boolean i;
    public static Method j;

    /* renamed from: k  reason: collision with root package name */
    public static Class f5139k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f5140l;

    /* renamed from: m  reason: collision with root package name */
    public static Field f5141m;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f5142c;

    /* renamed from: d  reason: collision with root package name */
    public h0.b[] f5143d;

    /* renamed from: e  reason: collision with root package name */
    public h0.b f5144e;

    /* renamed from: f  reason: collision with root package name */
    public s1 f5145f;

    /* renamed from: g  reason: collision with root package name */
    public h0.b f5146g;

    /* renamed from: h  reason: collision with root package name */
    public int f5147h;

    public j1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var);
        this.f5144e = null;
        this.f5142c = windowInsets;
    }

    private h0.b s(int i9, boolean z9) {
        h0.b bVar = h0.b.f2124e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                bVar = h0.b.a(bVar, t(i10, z9));
            }
        }
        return bVar;
    }

    private h0.b u() {
        s1 s1Var = this.f5145f;
        return s1Var != null ? s1Var.f5183a.h() : h0.b.f2124e;
    }

    private h0.b v(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!i) {
                w();
            }
            Method method = j;
            if (method != null && f5139k != null && f5140l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f5140l.get(f5141m.get(invoke));
                    if (rect != null) {
                        return h0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void w() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5139k = cls;
            f5140l = cls.getDeclaredField("mVisibleInsets");
            f5141m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5140l.setAccessible(true);
            f5141m.setAccessible(true);
        } catch (ReflectiveOperationException e9) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
        }
        i = true;
    }

    public static boolean y(int i9, int i10) {
        return (i9 & 6) == (i10 & 6);
    }

    @Override // q0.p1
    public void d(View view) {
        h0.b v2 = v(view);
        if (v2 == null) {
            v2 = h0.b.f2124e;
        }
        x(v2);
    }

    @Override // q0.p1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            j1 j1Var = (j1) obj;
            return Objects.equals(this.f5146g, j1Var.f5146g) && y(this.f5147h, j1Var.f5147h);
        }
        return false;
    }

    @Override // q0.p1
    public h0.b f(int i9) {
        return s(i9, false);
    }

    @Override // q0.p1
    public final h0.b j() {
        if (this.f5144e == null) {
            WindowInsets windowInsets = this.f5142c;
            this.f5144e = h0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5144e;
    }

    @Override // q0.p1
    public s1 l(int i9, int i10, int i11, int i12) {
        s1 g3 = s1.g(null, this.f5142c);
        int i13 = Build.VERSION.SDK_INT;
        i1 h1Var = i13 >= 34 ? new h1(g3) : i13 >= 30 ? new g1(g3) : i13 >= 29 ? new f1(g3) : new d1(g3);
        h1Var.g(s1.e(j(), i9, i10, i11, i12));
        h1Var.e(s1.e(h(), i9, i10, i11, i12));
        return h1Var.b();
    }

    @Override // q0.p1
    public boolean n() {
        return this.f5142c.isRound();
    }

    @Override // q0.p1
    public void o(h0.b[] bVarArr) {
        this.f5143d = bVarArr;
    }

    @Override // q0.p1
    public void p(s1 s1Var) {
        this.f5145f = s1Var;
    }

    @Override // q0.p1
    public void r(int i9) {
        this.f5147h = i9;
    }

    public h0.b t(int i9, boolean z9) {
        h0.b h9;
        int i10;
        h0.b bVar = h0.b.f2124e;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 8) {
                    h0.b[] bVarArr = this.f5143d;
                    h9 = bVarArr != null ? bVarArr[q4.b.B(8)] : null;
                    if (h9 != null) {
                        return h9;
                    }
                    h0.b j8 = j();
                    h0.b u9 = u();
                    int i11 = j8.f2128d;
                    if (i11 > u9.f2128d) {
                        return h0.b.b(0, 0, 0, i11);
                    }
                    h0.b bVar2 = this.f5146g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i10 = this.f5146g.f2128d) > u9.f2128d) {
                        return h0.b.b(0, 0, 0, i10);
                    }
                } else if (i9 == 16) {
                    return i();
                } else {
                    if (i9 == 32) {
                        return g();
                    }
                    if (i9 == 64) {
                        return k();
                    }
                    if (i9 == 128) {
                        s1 s1Var = this.f5145f;
                        j e9 = s1Var != null ? s1Var.f5183a.e() : e();
                        if (e9 != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return h0.b.b(i12 >= 28 ? e0.a.i(e9.f5138a) : 0, i12 >= 28 ? e0.a.k(e9.f5138a) : 0, i12 >= 28 ? e0.a.j(e9.f5138a) : 0, i12 >= 28 ? e0.a.h(e9.f5138a) : 0);
                        }
                    }
                }
            } else if (z9) {
                h0.b u10 = u();
                h0.b h10 = h();
                return h0.b.b(Math.max(u10.f2125a, h10.f2125a), 0, Math.max(u10.f2127c, h10.f2127c), Math.max(u10.f2128d, h10.f2128d));
            } else if ((this.f5147h & 2) == 0) {
                h0.b j9 = j();
                s1 s1Var2 = this.f5145f;
                h9 = s1Var2 != null ? s1Var2.f5183a.h() : null;
                int i13 = j9.f2128d;
                if (h9 != null) {
                    i13 = Math.min(i13, h9.f2128d);
                }
                return h0.b.b(j9.f2125a, 0, j9.f2127c, i13);
            }
        } else if (z9) {
            return h0.b.b(0, Math.max(u().f2126b, j().f2126b), 0, 0);
        } else {
            if ((this.f5147h & 4) == 0) {
                return h0.b.b(0, j().f2126b, 0, 0);
            }
        }
        return bVar;
    }

    public void x(h0.b bVar) {
        this.f5146g = bVar;
    }
}
