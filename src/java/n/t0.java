package n;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class t0 extends g0.b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f4288h;
    public final /* synthetic */ int i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ x0 f4289k;

    public t0(x0 x0Var, int i, int i9, WeakReference weakReference) {
        this.f4289k = x0Var;
        this.f4288h = i;
        this.i = i9;
        this.j = weakReference;
    }

    @Override // g0.b
    public final void h(int i) {
    }

    @Override // g0.b
    public final void i(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f4288h) != -1) {
            typeface = w0.a(typeface, i, (this.i & 2) != 0);
        }
        x0 x0Var = this.f4289k;
        if (x0Var.f4346m) {
            x0Var.f4345l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new h3.a(textView, typeface, x0Var.j));
                } else {
                    textView.setTypeface(typeface, x0Var.j);
                }
            }
        }
    }
}
