package k1;

import android.util.Log;
import androidx.fragment.app.b1;
import androidx.fragment.app.e0;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3350a = b.f3349a;

    public static b a(e0 e0Var) {
        while (e0Var != null) {
            if (e0Var.isAdded()) {
                j.d(e0Var.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            e0Var = e0Var.getParentFragment();
        }
        return f3350a;
    }

    public static void b(g gVar) {
        if (b1.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(gVar.f3351a.getClass().getName()), gVar);
        }
    }

    public static final void c(e0 e0Var, String str) {
        j.e(e0Var, "fragment");
        j.e(str, "previousFragmentId");
        b(new g(e0Var, "Attempting to reuse fragment " + e0Var + " with previous ID " + str));
        a(e0Var).getClass();
    }
}
