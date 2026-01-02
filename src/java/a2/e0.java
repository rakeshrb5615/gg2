package a2;

import android.graphics.Rect;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f303a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f304b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f305c;

    public e0(t0 t0Var) {
        this.f303a = Integer.MIN_VALUE;
        this.f305c = new Rect();
        this.f304b = t0Var;
    }

    public static e0 a(t0 t0Var, int i) {
        if (i != 0) {
            if (i == 1) {
                return new d0(t0Var, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new d0(t0Var, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public e0(g1.h hVar) {
        this.f303a = 0;
        this.f305c = new g1.d();
        this.f304b = hVar;
    }
}
