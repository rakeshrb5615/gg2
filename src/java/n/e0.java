package n;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e0 extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f4112a;

    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969665);
        t2.a(this, getContext());
        c0 c0Var = new c0(this);
        this.f4112a = c0Var;
        c0Var.b(attributeSet, 2130969665);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        Bitmap bitmap = (Bitmap) this.f4112a.f4102c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
