package n;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n0 implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.d f4222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o0 f4223b;

    public n0(o0 o0Var, m.d dVar) {
        this.f4223b = o0Var;
        this.f4222a = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4223b.M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4222a);
        }
    }
}
