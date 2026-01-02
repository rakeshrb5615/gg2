package q0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class w0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final h3.k f5197a;

    /* renamed from: b  reason: collision with root package name */
    public s1 f5198b;

    public w0(View view, h3.k kVar) {
        s1 s1Var;
        this.f5197a = kVar;
        WeakHashMap weakHashMap = q0.f5172a;
        s1 a10 = j0.a(view);
        if (a10 != null) {
            int i = Build.VERSION.SDK_INT;
            s1Var = (i >= 34 ? new h1(a10) : i >= 30 ? new g1(a10) : i >= 29 ? new f1(a10) : new d1(a10)).b();
        } else {
            s1Var = null;
        }
        this.f5198b = s1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z9;
        if (!view.isLaidOut()) {
            this.f5198b = s1.g(view, windowInsets);
            return x0.i(view, windowInsets);
        }
        s1 g3 = s1.g(view, windowInsets);
        p1 p1Var = g3.f5183a;
        if (this.f5198b == null) {
            WeakHashMap weakHashMap = q0.f5172a;
            this.f5198b = j0.a(view);
        }
        if (this.f5198b == null) {
            this.f5198b = g3;
            return x0.i(view, windowInsets);
        }
        h3.k j = x0.j(view);
        if (j == null || !Objects.equals((s1) j.f2191c, g3)) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            s1 s1Var = this.f5198b;
            int i = 1;
            while (i <= 512) {
                h0.b f9 = p1Var.f(i);
                h0.b f10 = s1Var.f5183a.f(i);
                int i9 = f9.f2125a;
                int i10 = f9.f2128d;
                int i11 = f9.f2127c;
                int i12 = f9.f2126b;
                int i13 = f10.f2125a;
                int i14 = f10.f2128d;
                int i15 = f10.f2127c;
                int i16 = f10.f2126b;
                if (i9 > i13 || i12 > i16 || i11 > i15 || i10 > i14) {
                    iArr = iArr2;
                    z9 = true;
                } else {
                    iArr = iArr2;
                    z9 = false;
                }
                if (z9 != (i9 < i13 || i12 < i16 || i11 < i15 || i10 < i14)) {
                    if (z9) {
                        iArr[0] = iArr[0] | i;
                    } else {
                        iArr3[0] = iArr3[0] | i;
                    }
                }
                i <<= 1;
                iArr2 = iArr;
            }
            int i17 = iArr2[0];
            int i18 = iArr3[0];
            int i19 = i17 | i18;
            if (i19 == 0) {
                this.f5198b = g3;
                return x0.i(view, windowInsets);
            }
            s1 s1Var2 = this.f5198b;
            c1 c1Var = new c1(i19, (i17 & 8) != 0 ? x0.f5199e : (i18 & 8) != 0 ? x0.f5200f : (i17 & 519) != 0 ? x0.f5201g : (i18 & 519) != 0 ? x0.f5202h : null, (i19 & 8) != 0 ? 160L : 250L);
            c1Var.f5108a.d(0.0f);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1Var.f5108a.a());
            h0.b f11 = p1Var.f(i19);
            h0.b f12 = s1Var2.f5183a.f(i19);
            int min = Math.min(f11.f2125a, f12.f2125a);
            int i20 = f11.f2126b;
            int i21 = f12.f2126b;
            int min2 = Math.min(i20, i21);
            int i22 = f11.f2127c;
            int i23 = f12.f2127c;
            int min3 = Math.min(i22, i23);
            int i24 = f11.f2128d;
            int i25 = f12.f2128d;
            n0.a aVar = new n0.a(6, h0.b.b(min, min2, min3, Math.min(i24, i25)), h0.b.b(Math.max(f11.f2125a, f12.f2125a), Math.max(i20, i21), Math.max(i22, i23), Math.max(i24, i25)));
            x0.f(view, g3, false);
            duration.addUpdateListener(new v0(c1Var, g3, s1Var2, i19, view));
            duration.addListener(new f2.n(c1Var, view));
            v.a(view, new n0.l(view, c1Var, aVar, duration));
            this.f5198b = g3;
            return x0.i(view, windowInsets);
        }
        return x0.i(view, windowInsets);
    }
}
