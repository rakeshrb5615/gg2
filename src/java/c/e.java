package c;

import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class e implements androidx.lifecycle.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f808b;

    public /* synthetic */ e(Object obj, int i) {
        this.f807a = i;
        this.f808b = obj;
    }

    public final void c(androidx.lifecycle.u uVar, androidx.lifecycle.n nVar) {
        Window window;
        View peekDecorView;
        switch (this.f807a) {
            case 0:
                n nVar2 = (n) this.f808b;
                if (nVar != androidx.lifecycle.n.ON_STOP || (window = nVar2.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                peekDecorView.cancelPendingInputEvents();
                return;
            case 1:
                n.d((n) this.f808b, uVar, nVar);
                return;
            default:
                c2.a aVar = (c2.a) this.f808b;
                if (nVar == androidx.lifecycle.n.ON_START) {
                    aVar.f872h = true;
                    return;
                } else if (nVar == androidx.lifecycle.n.ON_STOP) {
                    aVar.f872h = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
