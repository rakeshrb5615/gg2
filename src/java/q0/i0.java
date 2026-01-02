package q0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class i0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131362489);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static s1 b(View view, s1 s1Var, Rect rect) {
        WindowInsets f9 = s1Var.f();
        if (f9 != null) {
            return s1.g(view, view.computeSystemWindowInsets(f9, rect));
        }
        rect.setEmpty();
        return s1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static float f(View view) {
        return view.getZ();
    }

    public static void g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void h(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void i(View view, float f9) {
        view.setElevation(f9);
    }

    public static void j(View view, t tVar) {
        View.OnApplyWindowInsetsListener h0Var = tVar != null ? new h0(view, tVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131362480, h0Var);
        }
        if (view.getTag(2131362479) != null) {
            return;
        }
        if (h0Var != null) {
            view.setOnApplyWindowInsetsListener(h0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131362489));
        }
    }

    public static void k(View view, String str) {
        view.setTransitionName(str);
    }

    public static void l(View view) {
        view.stopNestedScroll();
    }
}
