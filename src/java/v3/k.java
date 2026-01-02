package v3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import j5.t1;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class k extends Drawable implements a0 {
    public static final Paint K;
    public static final j[] L;
    public PorterDuffColorFilter A;
    public final RectF B;
    public final boolean C;
    public boolean D;
    public p E;
    public f1.h F;
    public final f1.g[] G;
    public float[] H;
    public float[] I;
    public a5.a J;

    /* renamed from: a  reason: collision with root package name */
    public final h f6212a;

    /* renamed from: b  reason: collision with root package name */
    public i f6213b;

    /* renamed from: c  reason: collision with root package name */
    public final y[] f6214c;

    /* renamed from: d  reason: collision with root package name */
    public final y[] f6215d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f6216e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6217f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6218m;

    /* renamed from: n  reason: collision with root package name */
    public final Matrix f6219n;

    /* renamed from: o  reason: collision with root package name */
    public final Path f6220o;

    /* renamed from: p  reason: collision with root package name */
    public final Path f6221p;
    public final RectF q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f6222r;

    /* renamed from: s  reason: collision with root package name */
    public final Region f6223s;

    /* renamed from: t  reason: collision with root package name */
    public final Region f6224t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f6225u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f6226v;

    /* renamed from: w  reason: collision with root package name */
    public final u3.a f6227w;

    /* renamed from: x  reason: collision with root package name */
    public final h f6228x;

    /* renamed from: y  reason: collision with root package name */
    public final r f6229y;

    /* renamed from: z  reason: collision with root package name */
    public PorterDuffColorFilter f6230z;

    static {
        Paint paint = new Paint(1);
        K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        L = new j[4];
        int i = 0;
        while (true) {
            j[] jVarArr = L;
            if (i >= jVarArr.length) {
                return;
            }
            jVarArr[i] = new j(i);
            i++;
        }
    }

    public k() {
        this(new p());
    }

    public static float c(RectF rectF, p pVar, float[] fArr) {
        if (fArr == null) {
            if (pVar.e(rectF)) {
                return pVar.f6248e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f9 = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f9) {
                    return -1.0f;
                }
            }
        }
        if (pVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        i iVar = this.f6213b;
        this.f6229y.a(iVar.f6196a, this.H, iVar.j, rectF, this.f6228x, path);
        if (this.f6213b.i != 1.0f) {
            Matrix matrix = this.f6219n;
            matrix.reset();
            float f9 = this.f6213b.i;
            matrix.setScale(f9, f9, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.B, true);
    }

    public final int d(int i) {
        int i9;
        i iVar = this.f6213b;
        float f9 = iVar.f6207n + 0.0f + iVar.f6206m;
        p3.a aVar = iVar.f6198c;
        if (aVar != null && aVar.f5085a && h0.a.h(i, 255) == aVar.f5088d) {
            float f10 = aVar.f5089e;
            float min = (f10 <= 0.0f || f9 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f9 / f10)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            int alpha = Color.alpha(i);
            int L2 = t1.L(h0.a.h(i, 255), aVar.f5086b, min);
            if (min > 0.0f && (i9 = aVar.f5087c) != 0) {
                L2 = h0.a.e(h0.a.h(i9, p3.a.f5084f), L2);
            }
            return h0.a.h(L2, alpha);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r19.f6213b.f6196a.d() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L55;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.k.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f6216e.cardinality() > 0) {
            Log.w("k", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f6213b.q;
        Path path = this.f6220o;
        u3.a aVar = this.f6227w;
        if (i != 0) {
            canvas.drawPath(path, aVar.f6063a);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            y yVar = this.f6214c[i9];
            int i10 = this.f6213b.f6209p;
            Matrix matrix = y.f6281b;
            yVar.a(matrix, aVar, i10, canvas);
            this.f6215d[i9].a(matrix, aVar, this.f6213b.f6209p, canvas);
        }
        if (this.C) {
            double d9 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d9)) * this.f6213b.q);
            int cos = (int) (Math.cos(Math.toRadians(d9)) * this.f6213b.q);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, K);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, p pVar, float[] fArr, RectF rectF) {
        float c9 = c(rectF, pVar, fArr);
        if (c9 < 0.0f) {
            canvas.drawPath(path, paint);
            return;
        }
        float f9 = c9 * this.f6213b.j;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    public void g(Canvas canvas) {
        p pVar = this.E;
        float[] fArr = this.I;
        RectF h9 = h();
        RectF rectF = this.f6222r;
        rectF.set(h9);
        float j = j();
        rectF.inset(j, j);
        f(canvas, this.f6226v, this.f6221p, pVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6213b.f6205l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6213b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f6213b.f6208o == 2) {
            return;
        }
        RectF h9 = h();
        if (h9.isEmpty()) {
            return;
        }
        float c9 = c(h9, this.f6213b.f6196a, this.H);
        if (c9 >= 0.0f) {
            outline.setRoundRect(getBounds(), c9 * this.f6213b.j);
            return;
        }
        boolean z9 = this.f6217f;
        Path path = this.f6220o;
        if (z9) {
            b(h9, path);
            this.f6217f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            o3.b.a(outline, path);
        } else if (i >= 29) {
            try {
                o3.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            o3.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6213b.f6203h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f6223s;
        region.set(bounds);
        RectF h9 = h();
        Path path = this.f6220o;
        b(h9, path);
        Region region2 = this.f6224t;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.q;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.H;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h9 = h();
        p pVar = this.f6213b.f6196a;
        r rVar = this.f6229y;
        rVar.getClass();
        float a10 = pVar.f6248e.a(h9);
        p pVar2 = this.f6213b.f6196a;
        rVar.getClass();
        float a11 = pVar2.f6251h.a(h9) + a10;
        p pVar3 = this.f6213b.f6196a;
        rVar.getClass();
        float a12 = a11 - pVar3.f6250g.a(h9);
        p pVar4 = this.f6213b.f6196a;
        rVar.getClass();
        return (a12 - pVar4.f6249f.a(h9)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6217f = true;
        this.f6218m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f6213b.f6201f;
        if (colorStateList == null || !colorStateList.isStateful()) {
            this.f6213b.getClass();
            ColorStateList colorStateList2 = this.f6213b.f6200e;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                ColorStateList colorStateList3 = this.f6213b.f6199d;
                if (colorStateList3 == null || !colorStateList3.isStateful()) {
                    d0 d0Var = this.f6213b.f6197b;
                    return d0Var != null && d0Var.d();
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final float j() {
        if (k()) {
            return this.f6226v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean k() {
        Paint.Style style = this.f6213b.f6210r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6226v.getStrokeWidth() > 0.0f;
    }

    public final void l(Context context) {
        this.f6213b.f6198c = new p3.a(context);
        v();
    }

    public final void m(f1.h hVar) {
        if (this.F == hVar) {
            return;
        }
        this.F = hVar;
        int i = 0;
        while (true) {
            f1.g[] gVarArr = this.G;
            if (i >= gVarArr.length) {
                t(getState(), true);
                invalidateSelf();
                return;
            }
            if (gVarArr[i] == null) {
                gVarArr[i] = new f1.g(this, L[i]);
            }
            f1.g gVar = gVarArr[i];
            f1.h hVar2 = new f1.h();
            float f9 = (float) hVar.f1392b;
            if (f9 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            hVar2.f1392b = f9;
            hVar2.f1393c = false;
            double d9 = hVar.f1391a;
            float f10 = (float) (d9 * d9);
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            hVar2.f1391a = Math.sqrt(f10);
            hVar2.f1393c = false;
            gVar.j = hVar2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6213b = new i(this.f6213b);
        return this;
    }

    public final void n(float f9) {
        i iVar = this.f6213b;
        if (iVar.f6207n != f9) {
            iVar.f6207n = f9;
            v();
        }
    }

    public final void o(ColorStateList colorStateList) {
        i iVar = this.f6213b;
        if (iVar.f6199d != colorStateList) {
            iVar.f6199d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6217f = true;
        this.f6218m = true;
        super.onBoundsChange(rect);
        if (this.f6213b.f6197b != null && !rect.isEmpty()) {
            t(getState(), this.D);
        }
        this.D = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, q3.h
    public boolean onStateChange(int[] iArr) {
        boolean z9 = false;
        if (this.f6213b.f6197b != null) {
            t(iArr, false);
        }
        z9 = (s(iArr) || u()) ? true : true;
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    public final void p() {
        i iVar = this.f6213b;
        if (iVar.f6208o != 2) {
            iVar.f6208o = 2;
            super.invalidateSelf();
        }
    }

    public final void q(d0 d0Var) {
        i iVar = this.f6213b;
        if (iVar.f6197b != d0Var) {
            iVar.f6197b = d0Var;
            t(getState(), true);
            invalidateSelf();
        }
    }

    public final void r(ColorStateList colorStateList) {
        i iVar = this.f6213b;
        if (iVar.f6200e != colorStateList) {
            iVar.f6200e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean s(int[] iArr) {
        boolean z9;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f6213b.f6199d == null || color2 == (colorForState2 = this.f6213b.f6199d.getColorForState(iArr, (color2 = (paint2 = this.f6225u).getColor())))) {
            z9 = false;
        } else {
            paint2.setColor(colorForState2);
            z9 = true;
        }
        if (this.f6213b.f6200e == null || color == (colorForState = this.f6213b.f6200e.getColorForState(iArr, (color = (paint = this.f6226v).getColor())))) {
            return z9;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        i iVar = this.f6213b;
        if (iVar.f6205l != i) {
            iVar.f6205l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6213b.getClass();
        super.invalidateSelf();
    }

    @Override // v3.a0
    public final void setShapeAppearanceModel(p pVar) {
        i iVar = this.f6213b;
        iVar.f6196a = pVar;
        iVar.f6197b = null;
        this.H = null;
        this.I = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6213b.f6201f = colorStateList;
        u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        i iVar = this.f6213b;
        if (iVar.f6202g != mode) {
            iVar.f6202g = mode;
            u();
            super.invalidateSelf();
        }
    }

    public final void t(int[] iArr, boolean z9) {
        p a10;
        int i;
        RectF h9 = h();
        if (this.f6213b.f6197b == null || h9.isEmpty()) {
            return;
        }
        boolean z10 = z9 | (this.F == null);
        if (this.H == null) {
            this.H = new float[4];
        }
        d0 d0Var = this.f6213b.f6197b;
        p[] pVarArr = d0Var.f6179d;
        int i9 = d0Var.f6176a;
        int[][] iArr2 = d0Var.f6178c;
        b0 b0Var = d0Var.f6183h;
        b0 b0Var2 = d0Var.f6182g;
        b0 b0Var3 = d0Var.f6181f;
        b0 b0Var4 = d0Var.f6180e;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                i10 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i11 = 0;
            while (true) {
                if (i11 >= i9) {
                    i = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr2[i11], iArr3)) {
                    i = i11;
                    break;
                } else {
                    i11++;
                }
            }
            i10 = i;
        }
        if (b0Var4 == null && b0Var3 == null && b0Var2 == null && b0Var == null) {
            a10 = pVarArr[i10];
        } else {
            o f9 = pVarArr[i10].f();
            if (b0Var4 != null) {
                f9.f6238e = b0Var4.c(iArr);
            }
            if (b0Var3 != null) {
                f9.f6239f = b0Var3.c(iArr);
            }
            if (b0Var2 != null) {
                f9.f6241h = b0Var2.c(iArr);
            }
            if (b0Var != null) {
                f9.f6240g = b0Var.c(iArr);
            }
            a10 = f9.a();
        }
        int i12 = 0;
        while (i12 < 4) {
            this.f6229y.getClass();
            float a11 = (i12 != 1 ? i12 != 2 ? i12 != 3 ? a10.f6249f : a10.f6248e : a10.f6251h : a10.f6250g).a(h9);
            if (z10) {
                this.H[i12] = a11;
            }
            f1.g[] gVarArr = this.G;
            f1.g gVar = gVarArr[i12];
            if (gVar != null) {
                gVar.a(a11);
                if (z10) {
                    gVarArr[i12].d();
                }
            }
            i12++;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final boolean u() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6230z;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A;
        i iVar = this.f6213b;
        ColorStateList colorStateList = iVar.f6201f;
        PorterDuff.Mode mode = iVar.f6202g;
        if (colorStateList == null || mode == null) {
            int color = this.f6225u.getColor();
            int d9 = d(color);
            porterDuffColorFilter = d9 != color ? new PorterDuffColorFilter(d9, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f6230z = porterDuffColorFilter;
        this.f6213b.getClass();
        this.A = null;
        this.f6213b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f6230z) && Objects.equals(porterDuffColorFilter3, this.A)) ? false : true;
    }

    public final void v() {
        i iVar = this.f6213b;
        float f9 = iVar.f6207n + 0.0f;
        iVar.f6209p = (int) Math.ceil(0.75f * f9);
        this.f6213b.q = (int) Math.ceil(f9 * 0.25f);
        u();
        super.invalidateSelf();
    }

    public k(Context context, AttributeSet attributeSet, int i, int i9) {
        this(p.b(context, attributeSet, i, i9).a());
    }

    public k(p pVar) {
        this(new i(pVar));
    }

    public k(i iVar) {
        r rVar;
        this.f6212a = new h(this);
        this.f6214c = new y[4];
        this.f6215d = new y[4];
        this.f6216e = new BitSet(8);
        this.f6219n = new Matrix();
        this.f6220o = new Path();
        this.f6221p = new Path();
        this.q = new RectF();
        this.f6222r = new RectF();
        this.f6223s = new Region();
        this.f6224t = new Region();
        Paint paint = new Paint(1);
        this.f6225u = paint;
        Paint paint2 = new Paint(1);
        this.f6226v = paint2;
        this.f6227w = new u3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            rVar = q.f6254a;
        } else {
            rVar = new r();
        }
        this.f6229y = rVar;
        this.B = new RectF();
        this.C = true;
        this.D = true;
        this.G = new f1.g[4];
        this.f6213b = iVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u();
        s(getState());
        this.f6228x = new h(this);
    }
}
