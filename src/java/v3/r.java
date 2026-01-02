package v3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j5.t1;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final z[] f6255a = new z[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f6256b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f6257c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f6258d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f6259e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f6260f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final z f6261g = new z();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f6262h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f6263k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6264l = true;

    public r() {
        for (int i = 0; i < 4; i++) {
            this.f6255a[i] = new z();
            this.f6256b[i] = new Matrix();
            this.f6257c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(p pVar, float[] fArr, float f9, RectF rectF, h hVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        z[] zVarArr;
        ?? r16;
        Matrix[] matrixArr2;
        boolean z9;
        int i9;
        path.rewind();
        Path path2 = this.f6259e;
        path2.rewind();
        Path path3 = this.f6260f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            matrixArr = this.f6257c;
            fArr2 = this.f6262h;
            zVarArr = this.f6255a;
            r16 = 0;
            matrixArr2 = this.f6256b;
            if (i10 >= 4) {
                break;
            }
            d cVar = fArr == null ? i10 != 1 ? i10 != 2 ? i10 != 3 ? pVar.f6249f : pVar.f6248e : pVar.f6251h : pVar.f6250g : new c(fArr[i10]);
            t1 t1Var = i10 != 1 ? i10 != 2 ? i10 != 3 ? pVar.f6245b : pVar.f6244a : pVar.f6247d : pVar.f6246c;
            z zVar = zVarArr[i10];
            t1Var.getClass();
            t1Var.x(zVar, f9, cVar.a(rectF));
            int i11 = i10 + 1;
            float f10 = (i11 % 4) * 90;
            matrixArr2[i10].reset();
            PointF pointF = this.f6258d;
            if (i10 == 1) {
                i9 = i10;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i10 == 2) {
                i9 = i10;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i10 != 3) {
                i9 = i10;
                pointF.set(rectF.right, rectF.top);
            } else {
                i9 = i10;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i9].setTranslate(pointF.x, pointF.y);
            matrixArr2[i9].preRotate(f10);
            z zVar2 = zVarArr[i9];
            fArr2[0] = zVar2.f6285c;
            fArr2[1] = zVar2.f6286d;
            matrixArr2[i9].mapPoints(fArr2);
            matrixArr[i9].reset();
            matrixArr[i9].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i9].preRotate(f10);
            i10 = i11;
        }
        char c9 = 1;
        int i12 = 0;
        for (i = 4; i12 < i; i = 4) {
            z zVar3 = zVarArr[i12];
            fArr2[r16] = zVar3.f6283a;
            fArr2[c9] = zVar3.f6284b;
            matrixArr2[i12].mapPoints(fArr2);
            if (i12 == 0) {
                path.moveTo(fArr2[r16], fArr2[c9]);
            } else {
                path.lineTo(fArr2[r16], fArr2[c9]);
            }
            zVarArr[i12].b(matrixArr2[i12], path);
            if (hVar != null) {
                z zVar4 = zVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                k kVar = hVar.f6195a;
                BitSet bitSet = kVar.f6216e;
                zVar4.getClass();
                bitSet.set(i12, (boolean) r16);
                y[] yVarArr = kVar.f6214c;
                zVar4.a(zVar4.f6288f);
                yVarArr[i12] = new s(new ArrayList(zVar4.f6290h), new Matrix(matrix));
            }
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            z zVar5 = zVarArr[i12];
            fArr2[0] = zVar5.f6285c;
            fArr2[1] = zVar5.f6286d;
            matrixArr2[i12].mapPoints(fArr2);
            z zVar6 = zVarArr[i14];
            float f11 = zVar6.f6283a;
            float[] fArr3 = this.i;
            fArr3[0] = f11;
            fArr3[1] = zVar6.f6284b;
            matrixArr2[i14].mapPoints(fArr3);
            z[] zVarArr2 = zVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            z zVar7 = zVarArr2[i12];
            fArr2[0] = zVar7.f6285c;
            fArr2[1] = zVar7.f6286d;
            matrixArr2[i12].mapPoints(fArr2);
            float abs = (i12 == 1 || i12 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            z zVar8 = this.f6261g;
            zVar8.d(0.0f, 0.0f, 270.0f, 0.0f);
            f fVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? pVar.j : pVar.i : pVar.f6253l : pVar.f6252k;
            fVar.k(max, abs, f9, zVar8);
            Path path4 = this.j;
            path4.reset();
            zVar8.b(matrixArr[i12], path4);
            if (this.f6264l && (fVar.j() || b(path4, i12) || b(path4, i14))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = zVar8.f6283a;
                c9 = 1;
                fArr2[1] = zVar8.f6284b;
                matrixArr[i12].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                zVar8.b(matrixArr[i12], path2);
            } else {
                c9 = 1;
                zVar8.b(matrixArr[i12], path);
            }
            if (hVar != null) {
                Matrix matrix2 = matrixArr[i12];
                k kVar2 = hVar.f6195a;
                z9 = false;
                kVar2.f6216e.set(i12 + 4, false);
                y[] yVarArr2 = kVar2.f6215d;
                zVar8.a(zVar8.f6288f);
                yVarArr2[i12] = new s(new ArrayList(zVar8.f6290h), new Matrix(matrix2));
            } else {
                z9 = false;
            }
            i12 = i13;
            r16 = z9;
            zVarArr = zVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f6263k;
        path2.reset();
        this.f6255a[i].b(this.f6256b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
