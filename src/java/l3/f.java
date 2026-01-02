package l3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import q3.h;
import q3.i;
import v3.k;
import v3.o;
import v3.p;
import v3.r;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f extends k implements Drawable.Callback, h {
    public static final int[] U0 = {16842910};
    public static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public ColorFilter J0;
    public PorterDuffColorFilter K0;
    public ColorStateList L0;
    public ColorStateList M;
    public PorterDuff.Mode M0;
    public ColorStateList N;
    public int[] N0;
    public float O;
    public ColorStateList O0;
    public float P;
    public WeakReference P0;
    public ColorStateList Q;
    public TextUtils.TruncateAt Q0;
    public float R;
    public boolean R0;
    public ColorStateList S;
    public int S0;
    public CharSequence T;
    public boolean T0;
    public boolean U;
    public Drawable V;
    public ColorStateList W;
    public float X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f3751a0;

    /* renamed from: b0  reason: collision with root package name */
    public RippleDrawable f3752b0;

    /* renamed from: c0  reason: collision with root package name */
    public ColorStateList f3753c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f3754d0;

    /* renamed from: e0  reason: collision with root package name */
    public SpannableStringBuilder f3755e0;
    public boolean f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3756g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f3757h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f3758i0;

    /* renamed from: j0  reason: collision with root package name */
    public d3.b f3759j0;

    /* renamed from: k0  reason: collision with root package name */
    public d3.b f3760k0;
    public float l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f3761m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f3762n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f3763o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f3764p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f3765q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f3766r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f3767s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Context f3768t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Paint f3769u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Paint.FontMetrics f3770v0;

    /* renamed from: w0  reason: collision with root package name */
    public final RectF f3771w0;

    /* renamed from: x0  reason: collision with root package name */
    public final PointF f3772x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Path f3773y0;
    public final i z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968800, 2132018373);
        this.P = -1.0f;
        this.f3769u0 = new Paint(1);
        this.f3770v0 = new Paint.FontMetrics();
        this.f3771w0 = new RectF();
        this.f3772x0 = new PointF();
        this.f3773y0 = new Path();
        this.I0 = 255;
        this.M0 = PorterDuff.Mode.SRC_IN;
        this.P0 = new WeakReference(null);
        l(context);
        this.f3768t0 = context;
        i iVar = new i(this);
        this.z0 = iVar;
        this.T = "";
        iVar.f5360a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = U0;
        setState(iArr);
        U(iArr);
        this.R0 = true;
        V0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void d0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (this.T0) {
            float[] fArr = this.H;
            return fArr != null ? fArr[3] : this.f6213b.f6196a.f6248e.a(h());
        }
        return this.P;
    }

    public final void D() {
        Chip chip = (e) this.P0.get();
        if (chip != null) {
            Chip chip2 = chip;
            chip2.c(chip2.v);
            chip2.requestLayout();
            chip2.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.f.E(int[], int[]):boolean");
    }

    public final void F(boolean z9) {
        if (this.f0 != z9) {
            this.f0 = z9;
            float y9 = y();
            if (!z9 && this.G0) {
                this.G0 = false;
            }
            float y10 = y();
            invalidateSelf();
            if (y9 != y10) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.f3757h0 != drawable) {
            float y9 = y();
            this.f3757h0 = drawable;
            float y10 = y();
            d0(this.f3757h0);
            w(this.f3757h0);
            invalidateSelf();
            if (y9 != y10) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3758i0 != colorStateList) {
            this.f3758i0 = colorStateList;
            if (this.f3756g0 && (drawable = this.f3757h0) != null && this.f0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z9) {
        if (this.f3756g0 != z9) {
            boolean a02 = a0();
            this.f3756g0 = z9;
            boolean a03 = a0();
            if (a02 != a03) {
                if (a03) {
                    w(this.f3757h0);
                } else {
                    d0(this.f3757h0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void J(float f9) {
        if (this.P != f9) {
            this.P = f9;
            o f10 = this.f6213b.f6196a.f();
            f10.f6238e = new v3.a(f9);
            f10.f6239f = new v3.a(f9);
            f10.f6240g = new v3.a(f9);
            f10.f6241h = new v3.a(f9);
            setShapeAppearanceModel(f10.a());
        }
    }

    public final void K(Drawable drawable) {
        Drawable drawable2 = this.V;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof i0.a) {
            i0.a aVar = (i0.a) drawable2;
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float y9 = y();
            this.V = drawable != null ? drawable.mutate() : null;
            float y10 = y();
            d0(drawable2);
            if (b0()) {
                w(this.V);
            }
            invalidateSelf();
            if (y9 != y10) {
                D();
            }
        }
    }

    public final void L(float f9) {
        if (this.X != f9) {
            float y9 = y();
            this.X = f9;
            float y10 = y();
            invalidateSelf();
            if (y9 != y10) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.Y = true;
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (b0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z9) {
        if (this.U != z9) {
            boolean b02 = b0();
            this.U = z9;
            boolean b03 = b0();
            if (b02 != b03) {
                if (b03) {
                    w(this.V);
                } else {
                    d0(this.V);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (this.T0) {
                r(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(float f9) {
        if (this.R != f9) {
            this.R = f9;
            this.f3769u0.setStrokeWidth(f9);
            if (this.T0) {
                this.f6213b.f6204k = f9;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void Q(Drawable drawable) {
        Drawable drawable2 = this.f3751a0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof i0.a) {
            i0.a aVar = (i0.a) drawable2;
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z9 = z();
            this.f3751a0 = drawable != null ? drawable.mutate() : null;
            this.f3752b0 = new RippleDrawable(t3.a.a(this.S), this.f3751a0, V0);
            float z10 = z();
            d0(drawable2);
            if (c0()) {
                w(this.f3751a0);
            }
            invalidateSelf();
            if (z9 != z10) {
                D();
            }
        }
    }

    public final void R(float f9) {
        if (this.f3766r0 != f9) {
            this.f3766r0 = f9;
            invalidateSelf();
            if (c0()) {
                D();
            }
        }
    }

    public final void S(float f9) {
        if (this.f3754d0 != f9) {
            this.f3754d0 = f9;
            invalidateSelf();
            if (c0()) {
                D();
            }
        }
    }

    public final void T(float f9) {
        if (this.f3765q0 != f9) {
            this.f3765q0 = f9;
            invalidateSelf();
            if (c0()) {
                D();
            }
        }
    }

    public final boolean U(int[] iArr) {
        if (Arrays.equals(this.N0, iArr)) {
            return false;
        }
        this.N0 = iArr;
        if (c0()) {
            return E(getState(), iArr);
        }
        return false;
    }

    public final void V(ColorStateList colorStateList) {
        if (this.f3753c0 != colorStateList) {
            this.f3753c0 = colorStateList;
            if (c0()) {
                this.f3751a0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z9) {
        if (this.Z != z9) {
            boolean c02 = c0();
            this.Z = z9;
            boolean c03 = c0();
            if (c02 != c03) {
                if (c03) {
                    w(this.f3751a0);
                } else {
                    d0(this.f3751a0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void X(float f9) {
        if (this.f3762n0 != f9) {
            float y9 = y();
            this.f3762n0 = f9;
            float y10 = y();
            invalidateSelf();
            if (y9 != y10) {
                D();
            }
        }
    }

    public final void Y(float f9) {
        if (this.f3761m0 != f9) {
            float y9 = y();
            this.f3761m0 = f9;
            float y10 = y();
            invalidateSelf();
            if (y9 != y10) {
                D();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.O0 = null;
            onStateChange(getState());
        }
    }

    @Override // v3.k, q3.h
    public final void a() {
        D();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.f3756g0 && this.f3757h0 != null && this.G0;
    }

    public final boolean b0() {
        return this.U && this.V != null;
    }

    public final boolean c0() {
        return this.Z && this.f3751a0 != null;
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i9;
        float f9;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.I0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i9 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i9 = 0;
        }
        boolean z9 = this.T0;
        Paint paint = this.f3769u0;
        RectF rectF = this.f3771w0;
        if (!z9) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (!this.T0) {
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.J0;
            if (colorFilter == null) {
                colorFilter = this.K0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (this.T0) {
            super.draw(canvas);
        }
        if (this.R > 0.0f && !this.T0) {
            paint.setColor(this.D0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.T0) {
                ColorFilter colorFilter2 = this.J0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.K0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f10 = this.R / 2.0f;
            rectF.set(bounds.left + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
            float f11 = this.P - (this.R / 2.0f);
            canvas2.drawRoundRect(rectF, f11, f11, paint);
        }
        paint.setColor(this.E0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.T0) {
            RectF rectF2 = new RectF(bounds);
            v3.i iVar = this.f6213b;
            p pVar = iVar.f6196a;
            float[] fArr = this.H;
            float f12 = iVar.j;
            v3.h hVar = this.f6228x;
            r rVar = this.f6229y;
            f9 = 2.0f;
            Path path = this.f3773y0;
            rVar.a(pVar, fArr, f12, rectF2, hVar, path);
            f(canvas2, paint, path, this.f6213b.f6196a, this.H, h());
        } else {
            canvas2.drawRoundRect(rectF, A(), A(), paint);
            f9 = 2.0f;
        }
        if (b0()) {
            x(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.V.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (a0()) {
            x(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f3757h0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f3757h0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.R0 && this.T != null) {
            PointF pointF = this.f3772x0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.T;
            i iVar2 = this.z0;
            if (charSequence != null) {
                float y9 = y() + this.l0 + this.f3763o0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + y9;
                } else {
                    pointF.x = bounds.right - y9;
                    align = Paint.Align.RIGHT;
                }
                TextPaint textPaint = iVar2.f5360a;
                Paint.FontMetrics fontMetrics = this.f3770v0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / f9);
            }
            rectF.setEmpty();
            if (this.T != null) {
                float y10 = y() + this.l0 + this.f3763o0;
                float z10 = z() + this.f3767s0 + this.f3764p0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + y10;
                    rectF.right = bounds.right - z10;
                } else {
                    rectF.left = bounds.left + z10;
                    rectF.right = bounds.right - y10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            s3.d dVar = iVar2.f5365f;
            TextPaint textPaint2 = iVar2.f5360a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar2.f5365f.d(this.f3768t0, textPaint2, iVar2.f5361b);
            }
            textPaint2.setTextAlign(align);
            boolean z11 = Math.round(iVar2.a(this.T.toString())) > Math.round(rectF.width());
            if (z11) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = save;
            } else {
                i10 = 0;
            }
            CharSequence charSequence2 = this.T;
            if (z11 && this.Q0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.Q0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z11) {
                canvas2.restoreToCount(i10);
            }
        }
        if (c0()) {
            rectF.setEmpty();
            if (c0()) {
                float f17 = this.f3767s0 + this.f3766r0;
                if (getLayoutDirection() == 0) {
                    float f18 = bounds.right - f17;
                    rectF.right = f18;
                    rectF.left = f18 - this.f3754d0;
                } else {
                    float f19 = bounds.left + f17;
                    rectF.left = f19;
                    rectF.right = f19 + this.f3754d0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f20 = this.f3754d0;
                float f21 = exactCenterY - (f20 / f9);
                rectF.top = f21;
                rectF.bottom = f21 + f20;
            }
            float f22 = rectF.left;
            float f23 = rectF.top;
            canvas2.translate(f22, f23);
            this.f3751a0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f3752b0.setBounds(this.f3751a0.getBounds());
            this.f3752b0.jumpToCurrentState();
            this.f3752b0.draw(canvas2);
            canvas2.translate(-f22, -f23);
        }
        if (this.I0 < 255) {
            canvas2.restoreToCount(i9);
        }
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(z() + this.z0.a(this.T.toString()) + y() + this.l0 + this.f3763o0 + this.f3764p0 + this.f3767s0), this.S0);
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.O, this.P);
        } else {
            outline.setRoundRect(bounds, this.P);
            outline2 = outline;
        }
        outline2.setAlpha(this.I0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (B(this.M) || B(this.N) || B(this.Q)) {
            return true;
        }
        s3.d dVar = this.z0.f5365f;
        if (dVar == null || (colorStateList = dVar.f5832k) == null || !colorStateList.isStateful()) {
            return (this.f3756g0 && this.f3757h0 != null && this.f0) || C(this.V) || C(this.f3757h0) || B(this.L0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (b0()) {
            onLayoutDirectionChanged |= this.V.setLayoutDirection(i);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.f3757h0.setLayoutDirection(i);
        }
        if (c0()) {
            onLayoutDirectionChanged |= this.f3751a0.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (b0()) {
            onLevelChange |= this.V.setLevel(i);
        }
        if (a0()) {
            onLevelChange |= this.f3757h0.setLevel(i);
        }
        if (c0()) {
            onLevelChange |= this.f3751a0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // v3.k, android.graphics.drawable.Drawable, q3.h
    public final boolean onStateChange(int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.N0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.I0 != i) {
            this.I0 = i;
            invalidateSelf();
        }
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.J0 != colorFilter) {
            this.J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.M0 != mode) {
            this.M0 = mode;
            ColorStateList colorStateList = this.L0;
            this.K0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (b0()) {
            visible |= this.V.setVisible(z9, z10);
        }
        if (a0()) {
            visible |= this.f3757h0.setVisible(z9, z10);
        }
        if (c0()) {
            visible |= this.f3751a0.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f3751a0) {
            if (drawable.isStateful()) {
                drawable.setState(this.N0);
            }
            drawable.setTintList(this.f3753c0);
            return;
        }
        Drawable drawable2 = this.V;
        if (drawable == drawable2 && this.Y) {
            drawable2.setTintList(this.W);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b0() || a0()) {
            float f9 = this.l0 + this.f3761m0;
            Drawable drawable = this.G0 ? this.f3757h0 : this.V;
            float f10 = this.X;
            if (f10 <= 0.0f && drawable != null) {
                f10 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f9;
                rectF.left = f11;
                rectF.right = f11 + f10;
            } else {
                float f12 = rect.right - f9;
                rectF.right = f12;
                rectF.left = f12 - f10;
            }
            Drawable drawable2 = this.G0 ? this.f3757h0 : this.V;
            float f13 = this.X;
            if (f13 <= 0.0f && drawable2 != null) {
                f13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f3768t0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f13) {
                    f13 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f13;
        }
    }

    public final float y() {
        if (b0() || a0()) {
            float f9 = this.f3761m0;
            Drawable drawable = this.G0 ? this.f3757h0 : this.V;
            float f10 = this.X;
            if (f10 <= 0.0f && drawable != null) {
                f10 = drawable.getIntrinsicWidth();
            }
            return f10 + f9 + this.f3762n0;
        }
        return 0.0f;
    }

    public final float z() {
        if (c0()) {
            return this.f3765q0 + this.f3754d0 + this.f3766r0;
        }
        return 0.0f;
    }
}
