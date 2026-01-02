package q0;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public b1 f5108a;

    public c1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5108a = new a1(y0.b(i, interpolator, j));
        } else {
            this.f5108a = new b1(i, interpolator, j);
        }
    }
}
