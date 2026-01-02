package m;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import n.l2;
import n.o0;
import n.r0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3814b;

    public /* synthetic */ d(Object obj, int i) {
        this.f3813a = i;
        this.f3814b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3813a) {
            case 0:
                g gVar = (g) this.f3814b;
                ArrayList arrayList = gVar.f3847n;
                if (!gVar.b() || arrayList.size() <= 0) {
                    return;
                }
                int i = 0;
                if (((f) arrayList.get(0)).f3838a.E) {
                    return;
                }
                View view = gVar.f3853u;
                if (view == null || !view.isShown()) {
                    gVar.dismiss();
                    return;
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((f) obj).f3838a.c();
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f3814b;
                l2 l2Var = d0Var.f3821n;
                if (!d0Var.b() || l2Var.E) {
                    return;
                }
                View view2 = d0Var.f3825s;
                if (view2 == null || !view2.isShown()) {
                    d0Var.dismiss();
                    return;
                } else {
                    l2Var.c();
                    return;
                }
            case 2:
                r0 r0Var = (r0) this.f3814b;
                if (!r0Var.getInternalPopup().b()) {
                    r0Var.f4271f.l(r0Var.getTextDirection(), r0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = r0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                o0 o0Var = (o0) this.f3814b;
                r0 r0Var2 = o0Var.M;
                o0Var.getClass();
                if (!r0Var2.isAttachedToWindow() || !r0Var2.getGlobalVisibleRect(o0Var.K)) {
                    o0Var.dismiss();
                    return;
                }
                o0Var.s();
                o0Var.c();
                return;
        }
    }
}
