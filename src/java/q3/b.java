package q3;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f5309a;

    /* renamed from: a0  reason: collision with root package name */
    public float f5310a0;

    /* renamed from: b  reason: collision with root package name */
    public float f5311b;

    /* renamed from: b0  reason: collision with root package name */
    public float f5312b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f5313c;

    /* renamed from: c0  reason: collision with root package name */
    public float f5314c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5315d;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f5316d0;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f5317e;
    public ColorStateList j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5326k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5327k0;

    /* renamed from: l  reason: collision with root package name */
    public int f5328l;

    /* renamed from: m  reason: collision with root package name */
    public float f5329m;

    /* renamed from: n  reason: collision with root package name */
    public float f5330n;

    /* renamed from: o  reason: collision with root package name */
    public float f5331o;

    /* renamed from: p  reason: collision with root package name */
    public float f5332p;
    public float q;

    /* renamed from: r  reason: collision with root package name */
    public float f5333r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f5334s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f5335t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f5336u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f5337v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f5338w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f5339x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f5340y;

    /* renamed from: z  reason: collision with root package name */
    public s3.a f5341z;

    /* renamed from: f  reason: collision with root package name */
    public int f5319f = 16;

    /* renamed from: g  reason: collision with root package name */
    public int f5320g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f5322h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0  reason: collision with root package name */
    public int f5318e0 = 1;
    public int f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public final float f5321g0 = 1.0f;

    /* renamed from: h0  reason: collision with root package name */
    public final int f5323h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public int f5324i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public int f5325j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f5309a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f5315d = new Rect();
        this.f5313c = new Rect();
        this.f5317e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i9, float f9) {
        float f10 = 1.0f - f9;
        return Color.argb(Math.round((Color.alpha(i9) * f9) + (Color.alpha(i) * f10)), Math.round((Color.red(i9) * f9) + (Color.red(i) * f10)), Math.round((Color.green(i9) * f9) + (Color.green(i) * f10)), Math.round((Color.blue(i9) * f9) + (Color.blue(i) * f10)));
    }

    public static float h(float f9, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return d3.a.a(f9, f10, f11);
    }

    public final void b() {
        float f9 = this.f5311b;
        Rect rect = this.f5313c;
        Rect rect2 = this.f5315d;
        float h9 = h(rect.left, rect2.left, f9, this.Q);
        RectF rectF = this.f5317e;
        rectF.left = h9;
        rectF.top = h(this.f5329m, this.f5330n, f9, this.Q);
        rectF.right = h(rect.right, rect2.right, f9, this.Q);
        rectF.bottom = h(rect.bottom, rect2.bottom, f9, this.Q);
        this.q = h(this.f5331o, this.f5332p, f9, this.Q);
        this.f5333r = h(this.f5329m, this.f5330n, f9, this.Q);
        d(f9, false);
        TextInputLayout textInputLayout = this.f5309a;
        textInputLayout.postInvalidateOnAnimation();
        l1.a aVar = d3.a.f1074b;
        this.f5312b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f9, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f5314c0 = h(1.0f, 0.0f, f9, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f5326k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f5326k), f9));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f10 = this.W;
        float f11 = this.X;
        if (f10 != f11) {
            textPaint.setLetterSpacing(h(f11, f10, f9, aVar));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.H = d3.a.a(0.0f, this.S, f9);
        this.I = d3.a.a(0.0f, this.T, f9);
        this.J = d3.a.a(0.0f, this.U, f9);
        int a10 = a(0, g(this.V), f9);
        this.K = a10;
        textPaint.setShadowLayer(this.H, this.I, this.J, a10);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z9 = this.f5309a.getLayoutDirection() == 1;
        if (this.E) {
            return (z9 ? o0.f.f4998d : o0.f.f4997c).g(charSequence, charSequence.length());
        }
        return z9;
    }

    public final void d(float f9, boolean z9) {
        float f10;
        Typeface typeface;
        float f11;
        if (this.B == null) {
            return;
        }
        float width = this.f5315d.width();
        float width2 = this.f5313c.width();
        if (Math.abs(f9 - 1.0f) < 1.0E-5f) {
            f10 = o() ? this.i : this.f5322h;
            f11 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f5322h, this.i, f9, this.R) / this.f5322h;
            if (!o()) {
                width = width2;
            }
            typeface = this.f5334s;
            width2 = width;
        } else {
            f10 = this.f5322h;
            float f12 = this.X;
            typeface = this.f5337v;
            if (Math.abs(f9 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f5322h, this.i, f9, this.R) / this.f5322h;
            }
            float f13 = this.i / this.f5322h;
            float f14 = width2 * f13;
            if (!z9 && f14 > width && o()) {
                width2 = Math.min(width / f13, width2);
            }
            f11 = f12;
        }
        int i = f9 < 0.5f ? this.f5318e0 : this.f0;
        int i9 = (width2 > 0.0f ? 1 : (width2 == 0.0f ? 0 : -1));
        TextPaint textPaint = this.O;
        if (i9 > 0) {
            boolean z10 = this.G != f10;
            boolean z11 = this.Y != f11;
            boolean z12 = this.f5340y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z13 = z10 || z11 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z12 || (this.L != i) || this.N;
            this.G = f10;
            this.Y = f11;
            this.f5340y = typeface;
            this.N = false;
            this.L = i;
            textPaint.setLinearText(this.F != 1.0f);
            r7 = z13;
        }
        if (this.C == null || r7) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f5340y);
            textPaint.setLetterSpacing(this.Y);
            boolean c9 = c(this.B);
            this.D = c9;
            StaticLayout e9 = e(((this.f5318e0 > 1 || this.f0 > 1) && !c9) ? i : 1, textPaint, this.B, width2 * (o() ? 1.0f : this.F), this.D);
            this.Z = e9;
            this.C = e9.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f9, boolean z9) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f5319f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        g gVar = new g(charSequence, textPaint, (int) f9);
        gVar.f5358l = this.A;
        gVar.f5357k = z9;
        gVar.f5353e = alignment;
        gVar.j = false;
        gVar.f5354f = i;
        float f10 = this.f5321g0;
        gVar.f5355g = 0.0f;
        gVar.f5356h = f10;
        gVar.i = this.f5323h0;
        gVar.f5359m = null;
        StaticLayout a10 = gVar.a();
        a10.getClass();
        return a10;
    }

    public final float f() {
        int i = this.f5324i0;
        if (i != -1) {
            return i;
        }
        float f9 = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f9);
        textPaint.setTypeface(this.f5334s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f5336u;
            if (typeface != null) {
                this.f5335t = k0.a.b(configuration, typeface);
            }
            Typeface typeface2 = this.f5339x;
            if (typeface2 != null) {
                this.f5338w = k0.a.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f5335t;
            if (typeface3 == null) {
                typeface3 = this.f5336u;
            }
            this.f5334s = typeface3;
            Typeface typeface4 = this.f5338w;
            if (typeface4 == null) {
                typeface4 = this.f5339x;
            }
            this.f5337v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z9) {
        StaticLayout staticLayout;
        float measureText;
        TextInputLayout textInputLayout = this.f5309a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z9) {
            return;
        }
        d(1.0f, z9);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f5316d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f5316d0;
        if (charSequence2 != null) {
            this.f5310a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f5310a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f5320g, this.D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f5315d;
        if (i == 48) {
            this.f5330n = rect.top;
        } else if (i != 80) {
            this.f5330n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f5330n = textPaint.ascent() + rect.bottom;
        }
        int i9 = absoluteGravity & 8388615;
        if (i9 == 1) {
            this.f5332p = rect.centerX() - (this.f5310a0 / 2.0f);
        } else if (i9 != 5) {
            this.f5332p = rect.left;
        } else {
            this.f5332p = rect.right - this.f5310a0;
        }
        if (this.f5310a0 <= rect.width()) {
            float f9 = this.f5332p;
            float max = Math.max(0.0f, rect.left - f9) + f9;
            this.f5332p = max;
            this.f5332p = Math.min(0.0f, rect.right - (this.f5310a0 + max)) + max;
        }
        float f10 = this.i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f10);
        textPaint2.setTypeface(this.f5334s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f11 = this.f5330n;
            float max2 = Math.max(0.0f, rect.top - f11) + f11;
            this.f5330n = max2;
            this.f5330n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
        }
        d(0.0f, z9);
        float height = this.Z != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Z;
        if (staticLayout2 == null || this.f5318e0 <= 1) {
            CharSequence charSequence3 = this.C;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Z;
        this.f5328l = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f5319f, this.D ? 1 : 0);
        int i10 = absoluteGravity2 & 112;
        Rect rect2 = this.f5313c;
        if (i10 == 48) {
            this.f5329m = rect2.top;
        } else if (i10 != 80) {
            this.f5329m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f5329m = (rect2.bottom - height) + (this.f5327k0 ? textPaint.descent() : 0.0f);
        }
        int i11 = absoluteGravity2 & 8388615;
        if (i11 == 1) {
            this.f5331o = rect2.centerX() - (measureText / 2.0f);
        } else if (i11 != 5) {
            this.f5331o = rect2.left;
        } else {
            this.f5331o = rect2.right - measureText;
        }
        d(this.f5311b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f5326k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f5326k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        s3.a aVar = this.f5341z;
        if (aVar != null) {
            aVar.f5819h = true;
        }
        if (this.f5336u != typeface) {
            this.f5336u = typeface;
            Typeface b10 = k0.a.b(this.f5309a.getContext().getResources().getConfiguration(), typeface);
            this.f5335t = b10;
            if (b10 == null) {
                b10 = this.f5336u;
            }
            this.f5334s = b10;
            return true;
        }
        return false;
    }

    public final void m(float f9) {
        float g3 = c4.b.g(f9, 0.0f, 1.0f);
        if (g3 != this.f5311b) {
            this.f5311b = g3;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z9;
        boolean l5 = l(typeface);
        if (this.f5339x != typeface) {
            this.f5339x = typeface;
            Typeface b10 = k0.a.b(this.f5309a.getContext().getResources().getConfiguration(), typeface);
            this.f5338w = b10;
            if (b10 == null) {
                b10 = this.f5339x;
            }
            this.f5337v = b10;
            z9 = true;
        } else {
            z9 = false;
        }
        if (l5 || z9) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f0 == 1;
    }
}
