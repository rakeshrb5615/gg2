package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f4308b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static u f4309c;

    /* renamed from: a  reason: collision with root package name */
    public n2 f4310a;

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            try {
                if (f4309c == null) {
                    d();
                }
                uVar = f4309c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e9;
        synchronized (u.class) {
            e9 = n2.e(i, mode);
        }
        return e9;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n.u, java.lang.Object] */
    public static synchronized void d() {
        synchronized (u.class) {
            if (f4309c == null) {
                ?? obj = new Object();
                f4309c = obj;
                obj.f4310a = n2.b();
                n2 n2Var = f4309c.f4310a;
                a5.z zVar = new a5.z();
                synchronized (n2Var) {
                    n2Var.f4234e = zVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, v2 v2Var, int[] iArr) {
        PorterDuff.Mode mode = n2.f4227f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z9 = v2Var.f4318d;
        if (!z9 && !v2Var.f4317c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z9 ? v2Var.f4315a : null;
        PorterDuff.Mode mode2 = v2Var.f4317c ? v2Var.f4316b : n2.f4227f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = n2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f4310a.c(context, i);
    }
}
