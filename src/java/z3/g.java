package z3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g extends v3.k {
    public static final /* synthetic */ int N = 0;
    public f M;

    @Override // v3.k
    public final void g(Canvas canvas) {
        if (this.M.f7202s.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.M.f7202s);
        super.g(canvas);
        canvas.restore();
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.M = new f(this.M);
        return this;
    }

    public final void w(float f9, float f10, float f11, float f12) {
        RectF rectF = this.M.f7202s;
        if (f9 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f9, f10, f11, f12);
        invalidateSelf();
    }
}
