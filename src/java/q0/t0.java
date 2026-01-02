package q0;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f5184a;

    public t0(View view) {
        this.f5184a = new WeakReference(view);
    }

    public final void a(float f9) {
        View view = (View) this.f5184a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
    }

    public final void b() {
        View view = (View) this.f5184a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f5184a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(u0 u0Var) {
        View view = (View) this.f5184a.get();
        if (view != null) {
            if (u0Var != null) {
                view.animate().setListener(new f2.o(u0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f9) {
        View view = (View) this.f5184a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
    }
}
