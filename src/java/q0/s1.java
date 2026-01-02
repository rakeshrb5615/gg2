package q0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s1 {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f5182b;

    /* renamed from: a  reason: collision with root package name */
    public final p1 f5183a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f5182b = o1.f5160s;
        } else if (i >= 30) {
            f5182b = n1.f5156r;
        } else {
            f5182b = p1.f5165b;
        }
    }

    public s1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f5183a = new o1(this, windowInsets);
        } else if (i >= 30) {
            this.f5183a = new n1(this, windowInsets);
        } else if (i >= 29) {
            this.f5183a = new m1(this, windowInsets);
        } else if (i >= 28) {
            this.f5183a = new l1(this, windowInsets);
        } else {
            this.f5183a = new k1(this, windowInsets);
        }
    }

    public static h0.b e(h0.b bVar, int i, int i9, int i10, int i11) {
        int max = Math.max(0, bVar.f2125a - i);
        int max2 = Math.max(0, bVar.f2126b - i9);
        int max3 = Math.max(0, bVar.f2127c - i10);
        int max4 = Math.max(0, bVar.f2128d - i11);
        return (max == i && max2 == i9 && max3 == i10 && max4 == i11) ? bVar : h0.b.b(max, max2, max3, max4);
    }

    public static s1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        s1 s1Var = new s1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = q0.f5172a;
            s1 a10 = j0.a(view);
            p1 p1Var = s1Var.f5183a;
            p1Var.p(a10);
            p1Var.d(view.getRootView());
            p1Var.r(view.getWindowSystemUiVisibility());
        }
        return s1Var;
    }

    public final int a() {
        return this.f5183a.j().f2128d;
    }

    public final int b() {
        return this.f5183a.j().f2125a;
    }

    public final int c() {
        return this.f5183a.j().f2127c;
    }

    public final int d() {
        return this.f5183a.j().f2126b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s1) {
            return Objects.equals(this.f5183a, ((s1) obj).f5183a);
        }
        return false;
    }

    public final WindowInsets f() {
        p1 p1Var = this.f5183a;
        if (p1Var instanceof j1) {
            return ((j1) p1Var).f5142c;
        }
        return null;
    }

    public final int hashCode() {
        p1 p1Var = this.f5183a;
        if (p1Var == null) {
            return 0;
        }
        return p1Var.hashCode();
    }

    public s1() {
        this.f5183a = new p1(this);
    }
}
