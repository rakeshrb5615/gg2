package v3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class v extends x {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f6271h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f6272b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6273c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6274d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6275e;

    /* renamed from: f  reason: collision with root package name */
    public float f6276f;

    /* renamed from: g  reason: collision with root package name */
    public float f6277g;

    public v(float f9, float f10, float f11, float f12) {
        this.f6272b = f9;
        this.f6273c = f10;
        this.f6274d = f11;
        this.f6275e = f12;
    }

    @Override // v3.x
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6280a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f9 = this.f6274d;
        float f10 = this.f6275e;
        RectF rectF = f6271h;
        rectF.set(this.f6272b, this.f6273c, f9, f10);
        path.arcTo(rectF, this.f6276f, this.f6277g, false);
        path.transform(matrix);
    }
}
