package h;

import android.view.ViewGroup;
import q0.q0;
import q0.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c0 f2106b;

    public /* synthetic */ q(c0 c0Var, int i) {
        this.f2105a = i;
        this.f2106b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2105a) {
            case 0:
                c0 c0Var = this.f2106b;
                if ((c0Var.f1999g0 & 1) != 0) {
                    c0Var.y(0);
                }
                if ((c0Var.f1999g0 & 4096) != 0) {
                    c0Var.y(108);
                }
                c0Var.f0 = false;
                c0Var.f1999g0 = 0;
                return;
            default:
                c0 c0Var2 = this.f2106b;
                c0Var2.C.showAtLocation(c0Var2.B, 55, 0, 0);
                t0 t0Var = c0Var2.E;
                if (t0Var != null) {
                    t0Var.b();
                }
                if (!c0Var2.G || (viewGroup = c0Var2.H) == null || !viewGroup.isLaidOut()) {
                    c0Var2.B.setAlpha(1.0f);
                    c0Var2.B.setVisibility(0);
                    return;
                }
                c0Var2.B.setAlpha(0.0f);
                t0 b10 = q0.b(c0Var2.B);
                b10.a(1.0f);
                c0Var2.E = b10;
                b10.d(new s(this, 0));
                return;
        }
    }
}
