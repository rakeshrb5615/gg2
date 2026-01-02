package v3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class t extends y {

    /* renamed from: c  reason: collision with root package name */
    public final v f6267c;

    public t(v vVar) {
        this.f6267c = vVar;
    }

    @Override // v3.y
    public final void a(Matrix matrix, u3.a aVar, int i, Canvas canvas) {
        float f9;
        v vVar = this.f6267c;
        float f10 = vVar.f6276f;
        float f11 = vVar.f6277g;
        RectF rectF = new RectF(vVar.f6272b, vVar.f6273c, vVar.f6274d, vVar.f6275e);
        Paint paint = aVar.f6064b;
        boolean z9 = f11 < 0.0f;
        Path path = aVar.f6069g;
        int[] iArr = u3.a.f6061k;
        if (z9) {
            iArr[0] = 0;
            iArr[1] = aVar.f6068f;
            iArr[2] = aVar.f6067e;
            iArr[3] = aVar.f6066d;
            f9 = 0.0f;
        } else {
            path.rewind();
            f9 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f6066d;
            iArr[2] = aVar.f6067e;
            iArr[3] = aVar.f6068f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f9) {
            return;
        }
        float f13 = 1.0f - (i / width);
        float[] fArr = u3.a.f6062l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f6070h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
