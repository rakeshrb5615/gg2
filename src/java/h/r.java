package h;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n.i1;
import n.j3;
import n.k3;
import q0.d1;
import q0.f1;
import q0.g1;
import q0.h1;
import q0.q0;
import q0.s1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class r implements q0.t, i1, m.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c0 f2108b;

    public /* synthetic */ r(c0 c0Var, int i) {
        this.f2107a = i;
        this.f2108b = c0Var;
    }

    @Override // m.x
    public void a(m.m mVar, boolean z9) {
        b0 b0Var;
        switch (this.f2107a) {
            case 2:
                this.f2108b.u(mVar);
                return;
            default:
                m.m k9 = mVar.k();
                int i = 0;
                boolean z10 = k9 != mVar;
                if (z10) {
                    mVar = k9;
                }
                c0 c0Var = this.f2108b;
                b0[] b0VarArr = c0Var.S;
                int length = b0VarArr != null ? b0VarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        b0Var = null;
                    } else {
                        b0Var = b0VarArr[i];
                        if (b0Var == null || b0Var.f1982h != mVar) {
                            i++;
                        }
                    }
                }
                if (b0Var != null) {
                    if (!z10) {
                        c0Var.v(b0Var, z9);
                        return;
                    }
                    c0Var.t(b0Var.f1975a, b0Var, k9);
                    c0Var.v(b0Var, true);
                    return;
                }
                return;
        }
    }

    @Override // m.x
    public boolean h(m.m mVar) {
        Window.Callback callback;
        switch (this.f2107a) {
            case 2:
                Window.Callback callback2 = this.f2108b.f2007r.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                    return true;
                }
                return true;
            default:
                if (mVar == mVar.k()) {
                    c0 c0Var = this.f2108b;
                    if (!c0Var.M || (callback = c0Var.f2007r.getCallback()) == null || c0Var.X) {
                        return true;
                    }
                    callback.onMenuOpened(108, mVar);
                    return true;
                }
                return true;
        }
    }

    @Override // q0.t
    public s1 i(View view, s1 s1Var) {
        int i;
        boolean z9;
        s1 s1Var2;
        boolean z10;
        int d9 = s1Var.d();
        c0 c0Var = this.f2108b;
        Context context = c0Var.q;
        int d10 = s1Var.d();
        ActionBarContextView actionBarContextView = c0Var.B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0Var.B.getLayoutParams();
            if (c0Var.B.isShown()) {
                if (c0Var.f2002j0 == null) {
                    c0Var.f2002j0 = new Rect();
                    c0Var.f2003k0 = new Rect();
                }
                Rect rect = c0Var.f2002j0;
                Rect rect2 = c0Var.f2003k0;
                rect.set(s1Var.b(), s1Var.d(), s1Var.c(), s1Var.a());
                ViewGroup viewGroup = c0Var.H;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = k3.f4203a;
                    j3.a(viewGroup, rect, rect2);
                } else {
                    if (!k3.f4203a) {
                        k3.f4203a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            k3.f4204b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                k3.f4204b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = k3.f4204b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e9) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e9);
                        }
                    }
                }
                int i9 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = c0Var.H;
                WeakHashMap weakHashMap = q0.f5172a;
                s1 a10 = q0.j0.a(viewGroup2);
                int b10 = a10 == null ? 0 : a10.b();
                int c9 = a10 == null ? 0 : a10.c();
                if (marginLayoutParams.topMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i9;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                if (i9 <= 0 || c0Var.J != null) {
                    View view2 = c0Var.J;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c9) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c9;
                            c0Var.J.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    c0Var.J = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c9;
                    c0Var.H.addView(c0Var.J, -1, layoutParams);
                }
                View view4 = c0Var.J;
                r12 = view4 != null;
                if (r12 && view4.getVisibility() != 0) {
                    View view5 = c0Var.J;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? e0.c.getColor(context, 2131099654) : e0.c.getColor(context, 2131099653));
                }
                if (!c0Var.O && r12) {
                    d10 = 0;
                }
                z9 = r12;
                i = 0;
                r12 = z10;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z9 = false;
                } else {
                    z9 = false;
                    r12 = false;
                }
            }
            if (r12) {
                c0Var.B.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = c0Var.J;
        if (view6 != null) {
            view6.setVisibility(z9 ? i : 8);
        }
        if (d9 != d10) {
            int b11 = s1Var.b();
            int c10 = s1Var.c();
            int a11 = s1Var.a();
            int i14 = Build.VERSION.SDK_INT;
            q0.i1 h1Var = i14 >= 34 ? new h1(s1Var) : i14 >= 30 ? new g1(s1Var) : i14 >= 29 ? new f1(s1Var) : new d1(s1Var);
            h1Var.g(h0.b.b(b11, d10, c10, a11));
            s1Var2 = h1Var.b();
        } else {
            s1Var2 = s1Var;
        }
        WeakHashMap weakHashMap2 = q0.f5172a;
        WindowInsets f9 = s1Var2.f();
        if (f9 != null) {
            WindowInsets b12 = q0.g0.b(view, f9);
            return !b12.equals(f9) ? s1.g(view, b12) : s1Var2;
        }
        return s1Var2;
    }
}
