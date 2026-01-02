package h;

import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a0 extends ContentFrameLayout {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c0 f1966o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, l.c cVar) {
        super(cVar, (AttributeSet) null);
        this.f1966o = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1966o.x(keyEvent) || super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (x9 < -5 || y9 < -5 || x9 > getWidth() + 5 || y9 > getHeight() + 5) {
                c0 c0Var = this.f1966o;
                c0Var.v(c0Var.C(0), true);
                return true;
            }
        }
        return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(t1.A(getContext(), i));
    }
}
