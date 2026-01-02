package q0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d1 extends i1 {

    /* renamed from: e  reason: collision with root package name */
    public static Field f5109e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f5110f;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f5111g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f5112h;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f5113c;

    /* renamed from: d  reason: collision with root package name */
    public h0.b f5114d;

    public d1() {
        this.f5113c = i();
    }

    private static WindowInsets i() {
        if (!f5110f) {
            try {
                f5109e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
            }
            f5110f = true;
        }
        Field field = f5109e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f5112h) {
            try {
                f5111g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f5112h = true;
        }
        Constructor constructor = f5111g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // q0.i1
    public s1 b() {
        a();
        s1 g3 = s1.g(null, this.f5113c);
        h0.b[] bVarArr = this.f5137b;
        p1 p1Var = g3.f5183a;
        p1Var.o(bVarArr);
        p1Var.q(this.f5114d);
        return g3;
    }

    @Override // q0.i1
    public void e(h0.b bVar) {
        this.f5114d = bVar;
    }

    @Override // q0.i1
    public void g(h0.b bVar) {
        WindowInsets windowInsets = this.f5113c;
        if (windowInsets != null) {
            this.f5113c = windowInsets.replaceSystemWindowInsets(bVar.f2125a, bVar.f2126b, bVar.f2127c, bVar.f2128d);
        }
    }

    public d1(s1 s1Var) {
        super(s1Var);
        this.f5113c = s1Var.f();
    }
}
