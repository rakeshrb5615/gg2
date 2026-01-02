package q0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class x0 extends b1 {

    /* renamed from: e  reason: collision with root package name */
    public static final PathInterpolator f5199e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final l1.a f5200f = new l1.a(0);

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f5201g = new DecelerateInterpolator(1.5f);

    /* renamed from: h  reason: collision with root package name */
    public static final AccelerateInterpolator f5202h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        h3.k j = j(view);
        if (j != null) {
            ((View) j.f2192d).setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, s1 s1Var, boolean z9) {
        h3.k j = j(view);
        if (j != null) {
            j.f2191c = s1Var;
            if (!z9) {
                int[] iArr = (int[]) j.f2193e;
                ((View) j.f2192d).getLocationOnScreen(iArr);
                z9 = true;
                j.f2189a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), s1Var, z9);
            }
        }
    }

    public static void g(View view, s1 s1Var, List list) {
        h3.k j = j(view);
        if (j != null) {
            j.e(s1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), s1Var, list);
            }
        }
    }

    public static void h(View view, n0.a aVar) {
        h3.k j = j(view);
        if (j != null) {
            View view2 = (View) j.f2192d;
            int[] iArr = (int[]) j.f2193e;
            view2.getLocationOnScreen(iArr);
            int i = j.f2189a - iArr[1];
            j.f2190b = i;
            view2.setTranslationY(i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                h(viewGroup.getChildAt(i9), aVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(2131362480) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static h3.k j(View view) {
        Object tag = view.getTag(2131362489);
        if (tag instanceof w0) {
            return ((w0) tag).f5197a;
        }
        return null;
    }
}
