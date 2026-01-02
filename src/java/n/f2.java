package n;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f2 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f4116a;

    public f2(g2 g2Var) {
        this.f4116a = g2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g2 g2Var = this.f4116a;
        c2 c2Var = g2Var.f4160x;
        Handler handler = g2Var.B;
        b0 b0Var = g2Var.F;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        if (action == 0 && b0Var != null && b0Var.isShowing() && x9 >= 0 && x9 < b0Var.getWidth() && y9 >= 0 && y9 < b0Var.getHeight()) {
            handler.postDelayed(c2Var, 250L);
            return false;
        } else if (action == 1) {
            handler.removeCallbacks(c2Var);
            return false;
        } else {
            return false;
        }
    }
}
