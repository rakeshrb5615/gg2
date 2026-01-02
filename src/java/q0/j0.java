package q0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class j0 {
    public static s1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        s1 g3 = s1.g(null, rootWindowInsets);
        p1 p1Var = g3.f5183a;
        p1Var.p(g3);
        p1Var.d(view.getRootView());
        return g3;
    }

    public static void b(View view, int i, int i9) {
        view.setScrollIndicators(i, i9);
    }
}
