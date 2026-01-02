package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class s extends c4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2109c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2110d;

    public /* synthetic */ s(Object obj, int i) {
        this.f2109c = i;
        this.f2110d = obj;
    }

    @Override // q0.u0
    public final void a() {
        int i = this.f2109c;
        Object obj = this.f2110d;
        switch (i) {
            case 0:
                c0 c0Var = ((q) obj).f2106b;
                c0Var.B.setAlpha(1.0f);
                c0Var.E.d(null);
                c0Var.E = null;
                return;
            case 1:
                c0 c0Var2 = (c0) obj;
                c0Var2.B.setAlpha(1.0f);
                c0Var2.E.d(null);
                c0Var2.E = null;
                return;
            default:
                c0 c0Var3 = (c0) ((k2.c) obj).f3364c;
                c0Var3.B.setVisibility(8);
                PopupWindow popupWindow = c0Var3.C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (c0Var3.B.getParent() instanceof View) {
                    WeakHashMap weakHashMap = q0.f5172a;
                    q0.g0.c((View) c0Var3.B.getParent());
                }
                c0Var3.B.e();
                c0Var3.E.d(null);
                c0Var3.E = null;
                ViewGroup viewGroup = c0Var3.H;
                WeakHashMap weakHashMap2 = q0.f5172a;
                q0.g0.c(viewGroup);
                return;
        }
    }

    @Override // c4.b, q0.u0
    public void c() {
        int i = this.f2109c;
        Object obj = this.f2110d;
        switch (i) {
            case 0:
                ((q) obj).f2106b.B.setVisibility(0);
                return;
            case 1:
                c0 c0Var = (c0) obj;
                c0Var.B.setVisibility(0);
                if (c0Var.B.getParent() instanceof View) {
                    WeakHashMap weakHashMap = q0.f5172a;
                    q0.g0.c((View) c0Var.B.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
