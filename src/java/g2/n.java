package g2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f1731p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f1732a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f1733b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f1734c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f1735d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f1736e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f1737f;

    /* renamed from: g  reason: collision with root package name */
    public final k f1738g;

    /* renamed from: h  reason: collision with root package name */
    public float f1739h;
    public float i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f1740k;

    /* renamed from: l  reason: collision with root package name */
    public int f1741l;

    /* renamed from: m  reason: collision with root package name */
    public String f1742m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f1743n;

    /* renamed from: o  reason: collision with root package name */
    public final r.e f1744o;

    /* JADX WARN: Type inference failed for: r0v4, types: [r.e, r.j] */
    public n() {
        this.f1734c = new Matrix();
        this.f1739h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f1740k = 0.0f;
        this.f1741l = 255;
        this.f1742m = null;
        this.f1743n = null;
        this.f1744o = new r.j(0);
        this.f1738g = new k();
        this.f1732a = new Path();
        this.f1733b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i, int i9) {
        int i10;
        float f9;
        int i11;
        float f10;
        Matrix matrix2 = kVar.f1719a;
        ArrayList arrayList = kVar.f1720b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.f1719a;
        matrix3.preConcat(kVar.j);
        canvas.save();
        char c9 = 0;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            l lVar = (l) arrayList.get(i12);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i, i9);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f11 = i / this.j;
                float f12 = i9 / this.f1740k;
                float min = Math.min(f11, f12);
                Matrix matrix4 = this.f1734c;
                matrix4.set(matrix3);
                matrix4.postScale(f11, f12);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z9 = c9;
                i10 = i12;
                float f13 = (fArr[z9 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c9], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                float abs = max > 0.0f ? Math.abs(f13) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f1732a;
                    path.reset();
                    h0.d[] dVarArr = mVar.f1728a;
                    if (dVarArr != null) {
                        h0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f1733b;
                    path2.reset();
                    if (mVar instanceof i) {
                        path2.setFillType(mVar.f1730c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f14 = jVar.i;
                        if (f14 != 0.0f || jVar.j != 1.0f) {
                            float f15 = jVar.f1715k;
                            float f16 = (f14 + f15) % 1.0f;
                            float f17 = (jVar.j + f15) % 1.0f;
                            if (this.f1737f == null) {
                                this.f1737f = new PathMeasure();
                            }
                            this.f1737f.setPath(path, z9);
                            float length = this.f1737f.getLength();
                            float f18 = f16 * length;
                            float f19 = f17 * length;
                            path.reset();
                            if (f18 > f19) {
                                this.f1737f.getSegment(f18, length, path, true);
                                f9 = 0.0f;
                                this.f1737f.getSegment(0.0f, f19, path, true);
                            } else {
                                f9 = 0.0f;
                                this.f1737f.getSegment(f18, f19, path, true);
                            }
                            path.rLineTo(f9, f9);
                        }
                        path2.addPath(path, matrix4);
                        g0.d dVar = jVar.f1712f;
                        if (((Shader) dVar.f1609c) == null && dVar.f1608b == 0) {
                            f10 = 255.0f;
                            i11 = 16777215;
                        } else {
                            if (this.f1736e == null) {
                                i11 = 16777215;
                                Paint paint = new Paint(1);
                                this.f1736e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i11 = 16777215;
                            }
                            Paint paint2 = this.f1736e;
                            Shader shader = (Shader) dVar.f1609c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.f1714h * 255.0f));
                                f10 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i13 = dVar.f1608b;
                                float f20 = jVar.f1714h;
                                PorterDuff.Mode mode = q.f1756p;
                                f10 = 255.0f;
                                paint2.setColor((i13 & i11) | (((int) (Color.alpha(i13) * f20)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(jVar.f1730c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        g0.d dVar2 = jVar.f1710d;
                        if (((Shader) dVar2.f1609c) != null || dVar2.f1608b != 0) {
                            if (this.f1735d == null) {
                                Paint paint3 = new Paint(1);
                                this.f1735d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f1735d;
                            Paint.Join join = jVar.f1717m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.f1716l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.f1718n);
                            Shader shader2 = (Shader) dVar2.f1609c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.f1713g * f10));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i14 = dVar2.f1608b;
                                float f21 = jVar.f1713g;
                                PorterDuff.Mode mode2 = q.f1756p;
                                paint4.setColor((i14 & i11) | (((int) (Color.alpha(i14) * f21)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.f1711e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i12 = i10 + 1;
                c9 = 0;
            }
            i10 = i12;
            i12 = i10 + 1;
            c9 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1741l;
    }

    public void setAlpha(float f9) {
        setRootAlpha((int) (f9 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f1741l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [r.e, r.j] */
    public n(n nVar) {
        this.f1734c = new Matrix();
        this.f1739h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f1740k = 0.0f;
        this.f1741l = 255;
        this.f1742m = null;
        this.f1743n = null;
        ?? jVar = new r.j(0);
        this.f1744o = jVar;
        this.f1738g = new k(nVar.f1738g, jVar);
        this.f1732a = new Path(nVar.f1732a);
        this.f1733b = new Path(nVar.f1733b);
        this.f1739h = nVar.f1739h;
        this.i = nVar.i;
        this.j = nVar.j;
        this.f1740k = nVar.f1740k;
        this.f1741l = nVar.f1741l;
        this.f1742m = nVar.f1742m;
        String str = nVar.f1742m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.f1743n = nVar.f1743n;
    }
}
