package f2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class d0 extends t1 {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1407f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f1408g = true;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1409h = true;
    public static boolean i = true;

    @Override // j5.t1
    public void T(View view, int i9) {
        if (Build.VERSION.SDK_INT == 28) {
            super.T(view, i9);
        } else if (i) {
            try {
                b0.l(view, i9);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void W(View view, int i9, int i10, int i11, int i12) {
        if (f1409h) {
            try {
                b0.j(view, i9, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f1409h = false;
            }
        }
    }

    public void X(View view, Matrix matrix) {
        if (f1407f) {
            try {
                b0.n(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1407f = false;
            }
        }
    }

    public void Y(View view, Matrix matrix) {
        if (f1408g) {
            try {
                b0.o(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1408g = false;
            }
        }
    }
}
