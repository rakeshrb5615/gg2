package n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g0 extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f4132a;

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969700);
        t2.a(this, getContext());
        h0 h0Var = new h0(this);
        this.f4132a = h0Var;
        h0Var.b(attributeSet, 2130969700);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h0 h0Var = this.f4132a;
        g0 g0Var = h0Var.f4164e;
        Drawable drawable = h0Var.f4165f;
        if (drawable != null && drawable.isStateful() && drawable.setState(g0Var.getDrawableState())) {
            g0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4132a.f4165f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4132a.g(canvas);
    }
}
