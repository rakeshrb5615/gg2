package d3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import g2.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f1073a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final l1.a f1074b = new l1.a(1);

    /* renamed from: c  reason: collision with root package name */
    public static final l1.a f1075c = new l1.a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final l1.a f1076d = new l1.b(l1.a.f3532e);

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f1077e = new DecelerateInterpolator();

    public static float a(float f9, float f10, float f11) {
        return g.b(f10, f9, f11, f9);
    }

    public static float b(float f9, float f10, float f11, float f12, float f13) {
        return f13 <= f11 ? f9 : f13 >= f12 ? f10 : a(f9, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(int i, int i9, float f9) {
        return Math.round(f9 * (i9 - i)) + i;
    }
}
