package f2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f1403a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f1404b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, f2.d0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, f2.d0] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1403a = new Object();
        } else {
            f1403a = new Object();
        }
        f1404b = new b("translationAlpha", 5, Float.class);
        new b("clipBounds", 6, Rect.class);
    }

    public static void a(View view, int i, int i9, int i10, int i11) {
        f1403a.W(view, i, i9, i10, i11);
    }

    public static void b(View view, int i) {
        f1403a.T(view, i);
    }
}
