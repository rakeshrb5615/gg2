package q0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public s1 f5133a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5134b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f5135c;

    public h0(View view, t tVar) {
        this.f5134b = view;
        this.f5135c = tVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        s1 g3 = s1.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        t tVar = this.f5135c;
        if (i < 30) {
            i0.a(windowInsets, this.f5134b);
            if (g3.equals(this.f5133a)) {
                return tVar.i(view, g3).f();
            }
        }
        this.f5133a = g3;
        s1 i9 = tVar.i(view, g3);
        if (i >= 30) {
            return i9.f();
        }
        WeakHashMap weakHashMap = q0.f5172a;
        g0.c(view);
        return i9.f();
    }
}
