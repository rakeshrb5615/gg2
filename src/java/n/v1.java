package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class v1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w1 f4314b;

    public /* synthetic */ v1(w1 w1Var, int i) {
        this.f4313a = i;
        this.f4314b = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4313a) {
            case 0:
                ViewParent parent = this.f4314b.f4328d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                w1 w1Var = this.f4314b;
                w1Var.a();
                View view = w1Var.f4328d;
                if (view.isEnabled() && !view.isLongClickable() && w1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    w1Var.f4331m = true;
                    return;
                }
                return;
        }
    }
}
