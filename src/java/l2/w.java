package l2;

import android.view.ViewTreeObserver;
import i2.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0.k f3736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f3737b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f3738c;

    public w(a0 a0Var, g0.k kVar, v vVar) {
        this.f3738c = a0Var;
        this.f3736a = kVar;
        this.f3737b = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        a0 a0Var = this.f3738c;
        if (a0Var.f3567h2.getWidth() > 0) {
            a0Var.f3564g2.getClass();
            this.f3736a.run();
            a0Var.f3567h2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            try {
                t0 t0Var = a0Var.f3564g2;
                t0Var.f350a.unregisterObserver(this.f3737b);
            } catch (Exception unused) {
            }
        }
    }
}
