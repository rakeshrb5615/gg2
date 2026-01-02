package e3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    public b f1307a;

    @Override // b0.a
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        if (this.f1307a == null) {
            this.f1307a = new b(view);
        }
        b bVar = this.f1307a;
        View view2 = (View) bVar.f1310c;
        bVar.f1308a = view2.getTop();
        bVar.f1309b = view2.getLeft();
        b bVar2 = this.f1307a;
        View view3 = (View) bVar2.f1310c;
        WeakHashMap weakHashMap = q0.f5172a;
        view3.offsetTopAndBottom(0 - (view3.getTop() - bVar2.f1308a));
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f1309b));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
