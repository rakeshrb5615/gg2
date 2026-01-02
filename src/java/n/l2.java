package n;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class l2 extends g2 implements h2 {
    public static final Method J;
    public j6.o I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // n.h2
    public final void d(m.m mVar, m.o oVar) {
        j6.o oVar2 = this.I;
        if (oVar2 != null) {
            oVar2.d(mVar, oVar);
        }
    }

    @Override // n.h2
    public final void n(m.m mVar, MenuItem menuItem) {
        j6.o oVar = this.I;
        if (oVar != null) {
            oVar.n(mVar, menuItem);
        }
    }

    @Override // n.g2
    public final t1 q(Context context, boolean z9) {
        k2 k2Var = new k2(context, z9);
        k2Var.setHoverListener(this);
        return k2Var;
    }
}
