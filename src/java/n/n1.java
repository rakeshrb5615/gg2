package n;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4224a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4225b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f4226c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f4224a);
        } else {
            drawable.setState(f4225b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a10 = m1.a(drawable);
            return new Rect(l4.h.a(a10), l4.h.c(a10), l4.h.d(a10), l4.h.f(a10));
        }
        if (drawable instanceof i0.a) {
            ((i0.b) ((i0.a) drawable)).getClass();
            drawable = null;
        }
        if (i >= 29) {
            boolean z9 = l1.f4208a;
        } else if (l1.f4208a) {
            try {
                Object invoke = l1.f4209b.invoke(drawable, null);
                if (invoke != null) {
                    return new Rect(l1.f4210c.getInt(invoke), l1.f4211d.getInt(invoke), l1.f4212e.getInt(invoke), l1.f4213f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f4226c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
