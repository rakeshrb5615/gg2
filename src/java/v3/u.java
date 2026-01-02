package v3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class u extends y {

    /* renamed from: c  reason: collision with root package name */
    public final w f6268c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6269d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6270e;

    public u(w wVar, float f9, float f10) {
        this.f6268c = wVar;
        this.f6269d = f9;
        this.f6270e = f10;
    }

    @Override // v3.y
    public final void a(Matrix matrix, u3.a aVar, int i, Canvas canvas) {
        w wVar = this.f6268c;
        float f9 = wVar.f6279c;
        float f10 = this.f6270e;
        float f11 = wVar.f6278b;
        float f12 = this.f6269d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f9 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f6282a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i9 = aVar.f6068f;
        int[] iArr = u3.a.i;
        iArr[0] = i9;
        iArr[1] = aVar.f6067e;
        iArr[2] = aVar.f6066d;
        Paint paint = aVar.f6065c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, u3.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        w wVar = this.f6268c;
        return (float) Math.toDegrees(Math.atan((wVar.f6279c - this.f6270e) / (wVar.f6278b - this.f6269d)));
    }
}
