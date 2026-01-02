package v3;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class w extends x {

    /* renamed from: b  reason: collision with root package name */
    public float f6278b;

    /* renamed from: c  reason: collision with root package name */
    public float f6279c;

    @Override // v3.x
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6280a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f6278b, this.f6279c);
        path.transform(matrix);
    }
}
