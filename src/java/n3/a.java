package n3;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f4851a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4852b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4853c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4854d;

    public a(Dialog dialog, Rect rect) {
        this.f4851a = dialog;
        this.f4852b = rect.left;
        this.f4853c = rect.top;
        this.f4854d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f4852b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f4853c;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f4854d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f4851a.onTouchEvent(obtain);
    }
}
