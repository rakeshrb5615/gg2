package x3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.g0;
import com.google.android.material.slider.Slider;
import f2.o;
import i2.j;
import j5.t1;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l2.a0;
import q0.q0;
import q3.i;
import v3.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class e extends View {
    public static final /* synthetic */ int b1 = 0;
    public final int A;
    public int A0;
    public final int B;
    public boolean B0;
    public final int C;
    public boolean C0;
    public final int D;
    public ColorStateList D0;
    public final int E;
    public ColorStateList E0;
    public int F;
    public ColorStateList F0;
    public final int G;
    public ColorStateList G0;
    public int H;
    public ColorStateList H0;
    public int I;
    public final Path I0;
    public int J;
    public final RectF J0;
    public int K;
    public final RectF K0;
    public int L;
    public final RectF L0;
    public int M;
    public final RectF M0;
    public int N;
    public final Rect N0;
    public int O;
    public final RectF O0;
    public int P;
    public final Rect P0;
    public int Q;
    public final Matrix Q0;
    public int R;
    public final k R0;
    public int S;
    public Drawable S0;
    public int T;
    public List T0;
    public boolean U;
    public float U0;
    public Drawable V;
    public int V0;
    public boolean W;
    public final int W0;
    public final a X0;
    public final b Y0;
    public final g0 Z0;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f6569a;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f6570a0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f6571a1;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f6572b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6573b0;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f6574c;

    /* renamed from: c0  reason: collision with root package name */
    public ColorStateList f6575c0;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f6576d;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f6577d0;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f6578e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6579e0;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f6580f;
    public Drawable f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f6581g0;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f6582h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f6583i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f6584j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f6585k0;
    public float l0;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f6586m;

    /* renamed from: m0  reason: collision with root package name */
    public float f6587m0;

    /* renamed from: n  reason: collision with root package name */
    public final c f6588n;

    /* renamed from: n0  reason: collision with root package name */
    public MotionEvent f6589n0;

    /* renamed from: o  reason: collision with root package name */
    public final AccessibilityManager f6590o;

    /* renamed from: o0  reason: collision with root package name */
    public f f6591o0;

    /* renamed from: p  reason: collision with root package name */
    public com.google.android.material.datepicker.g f6592p;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6593p0;
    public final int q;

    /* renamed from: q0  reason: collision with root package name */
    public float f6594q0;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f6595r;

    /* renamed from: r0  reason: collision with root package name */
    public float f6596r0;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f6597s;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f6598s0;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f6599t;

    /* renamed from: t0  reason: collision with root package name */
    public int f6600t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6601u;

    /* renamed from: u0  reason: collision with root package name */
    public int f6602u0;

    /* renamed from: v  reason: collision with root package name */
    public ValueAnimator f6603v;

    /* renamed from: v0  reason: collision with root package name */
    public float f6604v0;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f6605w;

    /* renamed from: w0  reason: collision with root package name */
    public float[] f6606w0;

    /* renamed from: x  reason: collision with root package name */
    public final int f6607x;

    /* renamed from: x0  reason: collision with root package name */
    public int f6608x0;

    /* renamed from: y  reason: collision with root package name */
    public final int f6609y;

    /* renamed from: y0  reason: collision with root package name */
    public int f6610y0;

    /* renamed from: z  reason: collision with root package name */
    public final int f6611z;
    public int z0;

    /* JADX WARN: Type inference failed for: r1v11, types: [x3.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [x3.b] */
    public e(Context context, AttributeSet attributeSet) {
        super(a4.a.a(context, attributeSet, 2130969754, 2132018429), attributeSet, 2130969754);
        this.f6595r = new ArrayList();
        this.f6597s = new ArrayList();
        this.f6599t = new ArrayList();
        this.f6601u = false;
        this.P = -1;
        this.Q = -1;
        this.U = false;
        this.W = false;
        this.f6573b0 = false;
        this.f6579e0 = false;
        this.f6581g0 = false;
        this.f6593p0 = false;
        this.f6598s0 = new ArrayList();
        this.f6600t0 = -1;
        this.f6602u0 = -1;
        this.f6604v0 = 0.0f;
        this.B0 = false;
        this.I0 = new Path();
        this.J0 = new RectF();
        this.K0 = new RectF();
        this.L0 = new RectF();
        this.M0 = new RectF();
        this.N0 = new Rect();
        this.O0 = new RectF();
        this.P0 = new Rect();
        this.Q0 = new Matrix();
        k kVar = new k();
        this.R0 = kVar;
        this.T0 = Collections.EMPTY_LIST;
        this.V0 = 0;
        final Slider slider = (Slider) this;
        this.X0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: x3.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                slider.D();
            }
        };
        this.Y0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: x3.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                slider.D();
            }
        };
        this.Z0 = new g0(slider, 15);
        Context context2 = getContext();
        this.f6571a1 = isShown();
        this.f6569a = new Paint();
        this.f6572b = new Paint();
        Paint paint = new Paint(1);
        this.f6574c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f6576d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f6578e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f6580f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f6586m = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.G = resources.getDimensionPixelSize(2131166185);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166184);
        this.f6609y = dimensionPixelOffset;
        this.K = dimensionPixelOffset;
        this.f6611z = resources.getDimensionPixelSize(2131166180);
        this.A = resources.getDimensionPixelSize(2131166183);
        this.B = resources.getDimensionPixelSize(2131166182);
        this.C = resources.getDimensionPixelSize(2131166182);
        this.D = resources.getDimensionPixelSize(2131166181);
        this.f6585k0 = resources.getDimensionPixelSize(2131166176);
        this.f6584j0 = resources.getDimensionPixelOffset(2131165898);
        q3.k.a(context2, attributeSet, 2130969754, 2132018429);
        int[] iArr = c3.a.B;
        q3.k.b(context2, attributeSet, iArr, 2130969754, 2132018429, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130969754, 2132018429);
        setOrientation(obtainStyledAttributes.getInt(2, 0));
        this.q = obtainStyledAttributes.getResourceId(10, 2132018463);
        this.f6594q0 = obtainStyledAttributes.getFloat(4, 0.0f);
        this.f6596r0 = obtainStyledAttributes.getFloat(5, 1.0f);
        setValues(Float.valueOf(this.f6594q0));
        setCentered(obtainStyledAttributes.getBoolean(6, false));
        this.f6604v0 = obtainStyledAttributes.getFloat(3, 0.0f);
        this.E = (int) Math.ceil(obtainStyledAttributes.getDimension(11, c4.b.V(context2)));
        boolean hasValue = obtainStyledAttributes.hasValue(27);
        int i = hasValue ? 27 : 29;
        int i9 = hasValue ? 27 : 28;
        ColorStateList v2 = t1.v(context2, obtainStyledAttributes, i);
        setTrackInactiveTintList(v2 == null ? e0.c.getColorStateList(context2, 2131100572) : v2);
        ColorStateList v6 = t1.v(context2, obtainStyledAttributes, i9);
        setTrackActiveTintList(v6 == null ? e0.c.getColorStateList(context2, 2131100569) : v6);
        kVar.o(t1.v(context2, obtainStyledAttributes, 12));
        if (obtainStyledAttributes.hasValue(16)) {
            setThumbStrokeColor(t1.v(context2, obtainStyledAttributes, 16));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(17, 0.0f));
        ColorStateList v9 = t1.v(context2, obtainStyledAttributes, 7);
        setHaloTintList(v9 == null ? e0.c.getColorStateList(context2, 2131100570) : v9);
        this.f6608x0 = obtainStyledAttributes.hasValue(25) ? obtainStyledAttributes.getInt(25, -1) : obtainStyledAttributes.getBoolean(26, true) ? 0 : 2;
        boolean hasValue2 = obtainStyledAttributes.hasValue(20);
        int i10 = hasValue2 ? 20 : 22;
        int i11 = hasValue2 ? 20 : 21;
        ColorStateList v10 = t1.v(context2, obtainStyledAttributes, i10);
        setTickInactiveTintList(v10 == null ? e0.c.getColorStateList(context2, 2131100571) : v10);
        ColorStateList v11 = t1.v(context2, obtainStyledAttributes, i11);
        setTickActiveTintList(v11 == null ? e0.c.getColorStateList(context2, 2131100568) : v11);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackCornerSize(obtainStyledAttributes.getDimensionPixelSize(30, -1));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(39, 0));
        setTrackIconActiveStart(t1.B(context2, obtainStyledAttributes, 34));
        setTrackIconActiveEnd(t1.B(context2, obtainStyledAttributes, 33));
        setTrackIconActiveColor(t1.v(context2, obtainStyledAttributes, 32));
        setTrackIconInactiveStart(t1.B(context2, obtainStyledAttributes, 37));
        setTrackIconInactiveEnd(t1.B(context2, obtainStyledAttributes, 36));
        setTrackIconInactiveColor(t1.v(context2, obtainStyledAttributes, 35));
        setTrackIconSize(obtainStyledAttributes.getDimensionPixelSize(38, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(13, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(31, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(23, this.R / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(24, this.R / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(9, 0));
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        kVar.p();
        this.f6607x = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(slider);
        this.f6588n = cVar;
        q0.n(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6590o = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.W0 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.W0 = 120000;
        }
    }

    public final void A() {
        double d9;
        float f9;
        int i;
        float f10 = this.U0;
        float f11 = this.f6604v0;
        if (f11 > 0.0f) {
            d9 = Math.round(f10 * i) / ((int) ((this.f6596r0 - this.f6594q0) / f11));
        } else {
            d9 = f10;
        }
        if (r() || s()) {
            d9 = 1.0d - d9;
        }
        float f12 = this.f6596r0;
        z(this.f6600t0, (float) ((d9 * (f12 - f9)) + this.f6594q0));
    }

    public final void B(int i, Rect rect) {
        int v2 = this.K + ((int) (v(getValues().get(i).floatValue()) * this.A0));
        int c9 = c();
        int max = Math.max(this.L / 2, this.E / 2);
        int max2 = Math.max(this.M / 2, this.E / 2);
        RectF rectF = new RectF(v2 - max, c9 - max2, v2 + max, c9 + max2);
        if (s()) {
            this.Q0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void C() {
        int i;
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float v2 = (v(((Float) this.f6598s0.get(this.f6602u0)).floatValue()) * this.A0) + this.K;
            int c9 = c();
            float f9 = this.N;
            float[] fArr = {v2 - f9, c9 - i, v2 + f9, c9 + i};
            if (s()) {
                this.Q0.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void D() {
        float f9;
        boolean s5 = s();
        boolean r8 = r();
        float f10 = 0.5f;
        if (s5 && r8) {
            f9 = 0.5f;
            f10 = -0.2f;
        } else {
            f9 = 1.2f;
            if (s5) {
                f10 = 1.2f;
                f9 = 0.5f;
            }
        }
        ArrayList arrayList = this.f6595r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b4.b bVar = (b4.b) obj;
            bVar.f714b0 = f10;
            bVar.f715c0 = f9;
            bVar.invalidateSelf();
        }
        int i9 = this.I;
        if (i9 == 0 || i9 == 1) {
            if (this.f6600t0 == -1 || !isEnabled()) {
                k();
            } else {
                j();
            }
        } else if (i9 == 2) {
            k();
        } else if (i9 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.I);
        } else {
            if (isEnabled()) {
                Rect rect = new Rect();
                q3.k.d(this).getHitRect(rect);
                if (getLocalVisibleRect(rect) && this.f6571a1) {
                    j();
                    return;
                }
            }
            k();
        }
    }

    public final void E() {
        int i = this.O;
        if (i > 0) {
            int i9 = this.L;
            this.P = i9;
            this.Q = i;
            int round = Math.round(i9 * 0.5f);
            int i10 = this.L - round;
            setThumbWidth(round);
            setThumbTrackGapSize(this.O - (i10 / 2));
        }
    }

    public final void F() {
        N();
        float f9 = this.f6604v0;
        int i = 0;
        if (f9 <= 0.0f) {
            G(0);
            return;
        }
        int i9 = this.f6608x0;
        if (i9 == 0) {
            i = Math.min((int) (((this.f6596r0 - this.f6594q0) / f9) + 1.0f), (this.A0 / this.D) + 1);
        } else if (i9 == 1) {
            int i10 = (int) (((this.f6596r0 - this.f6594q0) / f9) + 1.0f);
            if (i10 <= (this.A0 / this.D) + 1) {
                i = i10;
            }
        } else if (i9 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f6608x0);
        }
        G(i);
    }

    public final void G(int i) {
        if (i == 0) {
            this.f6606w0 = null;
            return;
        }
        float[] fArr = this.f6606w0;
        if (fArr == null || fArr.length != i * 2) {
            this.f6606w0 = new float[i * 2];
        }
        float f9 = this.A0 / (i - 1);
        float c9 = c();
        for (int i9 = 0; i9 < i * 2; i9 += 2) {
            float[] fArr2 = this.f6606w0;
            fArr2[i9] = ((i9 / 2.0f) * f9) + this.K;
            fArr2[i9 + 1] = c9;
        }
        if (s()) {
            this.Q0.mapPoints(this.f6606w0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.graphics.Canvas r18, android.graphics.Paint r19, android.graphics.RectF r20, float r21, int r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.H(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, int):void");
    }

    public final void I() {
        Drawable drawable = this.f6570a0;
        if (drawable != null) {
            if (!this.f6573b0 && this.f6575c0 != null) {
                this.f6570a0 = drawable.mutate();
                this.f6573b0 = true;
            }
            if (this.f6573b0) {
                this.f6570a0.setTintList(this.f6575c0);
            }
        }
    }

    public final void J() {
        Drawable drawable = this.V;
        if (drawable != null) {
            if (!this.W && this.f6575c0 != null) {
                this.V = drawable.mutate();
                this.W = true;
            }
            if (this.W) {
                this.V.setTintList(this.f6575c0);
            }
        }
    }

    public final void K() {
        Drawable drawable = this.f0;
        if (drawable != null) {
            if (!this.f6581g0 && this.f6582h0 != null) {
                this.f0 = drawable.mutate();
                this.f6581g0 = true;
            }
            if (this.f6581g0) {
                this.f0.setTintList(this.f6582h0);
            }
        }
    }

    public final void L() {
        Drawable drawable = this.f6577d0;
        if (drawable != null) {
            if (!this.f6579e0 && this.f6582h0 != null) {
                this.f6577d0 = drawable.mutate();
                this.f6579e0 = true;
            }
            if (this.f6579e0) {
                this.f6577d0.setTintList(this.f6582h0);
            }
        }
    }

    public final void M(boolean z9) {
        int paddingTop;
        int paddingBottom;
        boolean z10;
        if (s()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int max = Math.max(this.G, Math.max(this.J + i, this.M + i));
        boolean z11 = true;
        if (max == this.H) {
            z10 = false;
        } else {
            this.H = max;
            z10 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.L / 2) - this.f6611z, 0), Math.max((this.J - this.A) / 2, 0)), Math.max(Math.max(this.f6610y0 - this.B, 0), Math.max(this.z0 - this.C, 0))) + this.f6609y;
        if (this.K == max2) {
            z11 = false;
        } else {
            this.K = max2;
            if (isLaidOut()) {
                this.A0 = Math.max((s() ? getHeight() : getWidth()) - (this.K * 2), 0);
                F();
            }
        }
        if (s()) {
            float c9 = c();
            Matrix matrix = this.Q0;
            matrix.reset();
            matrix.setRotate(90.0f, c9, c9);
        }
        if (z10 || z9) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public final void N() {
        if (this.C0) {
            if (this.f6594q0 >= this.f6596r0) {
                throw new IllegalStateException("valueFrom(" + this.f6594q0 + ") must be smaller than valueTo(" + this.f6596r0 + ")");
            }
            ArrayList arrayList = this.f6598s0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Float f9 = (Float) obj;
                if (f9.floatValue() < this.f6594q0 || f9.floatValue() > this.f6596r0) {
                    throw new IllegalStateException("Slider value(" + f9 + ") must be greater or equal to valueFrom(" + this.f6594q0 + "), and lower or equal to valueTo(" + this.f6596r0 + ")");
                } else if (this.f6604v0 > 0.0f && !O(f9.floatValue())) {
                    float f10 = this.f6594q0;
                    float f11 = this.f6604v0;
                    throw new IllegalStateException("Value(" + f9 + ") must be equal to valueFrom(" + f10 + ") plus a multiple of stepSize(" + f11 + ") when using stepSize(" + f11 + ")");
                }
            }
            if (this.f6604v0 > 0.0f && !O(this.f6596r0)) {
                throw new IllegalStateException("The stepSize(" + this.f6604v0 + ") must be 0, or a factor of the valueFrom(" + this.f6594q0 + ")-valueTo(" + this.f6596r0 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f12 = this.f6604v0;
            if (f12 > 0.0f && minSeparation > 0.0f) {
                if (this.V0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f6604v0 + ")");
                } else if (minSeparation < f12 || !o(minSeparation)) {
                    float f13 = this.f6604v0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f13 + ") when using stepSize(" + f13 + ")");
                }
            }
            float f14 = this.f6604v0;
            if (f14 != 0.0f) {
                if (((int) f14) != f14) {
                    Log.w("e", "Floating point value used for stepSize(" + f14 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f15 = this.f6594q0;
                if (((int) f15) != f15) {
                    Log.w("e", "Floating point value used for valueFrom(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f16 = this.f6596r0;
                if (((int) f16) != f16) {
                    Log.w("e", "Floating point value used for valueTo(" + f16 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.C0 = false;
        }
    }

    public final boolean O(float f9) {
        return o(new BigDecimal(Float.toString(f9)).subtract(new BigDecimal(Float.toString(this.f6594q0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float P(float f9) {
        return (v(f9) * this.A0) + this.K;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.L, this.M);
            return;
        }
        float max = Math.max(this.L, this.M) / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z9) {
        if (drawable != null) {
            int i = this.f6583i0;
            float f9 = rectF.right - rectF.left;
            int i9 = this.f6584j0;
            int i10 = (f9 > ((i9 * 2) + i) ? 1 : (f9 == ((i9 * 2) + i) ? 0 : -1));
            RectF rectF2 = this.O0;
            if (i10 >= 0) {
                float f10 = z9 ^ (r() || s()) ? rectF.left + i9 : (rectF.right - i9) - i;
                float f11 = i;
                float c9 = c() - (f11 / 2.0f);
                rectF2.set(f10, c9, f10 + f11, f11 + c9);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (s()) {
                this.Q0.mapRect(rectF2);
            }
            Rect rect = this.P0;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c() {
        int i = this.H / 2;
        int i9 = this.I;
        int i10 = 0;
        if (i9 == 1 || i9 == 3) {
            i10 = ((b4.b) this.f6595r.get(0)).getIntrinsicHeight();
        }
        return i + i10;
    }

    public final ValueAnimator d(boolean z9) {
        int P;
        TimeInterpolator Q;
        float f9 = z9 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z9 ? this.f6605w : this.f6603v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, z9 ? 1.0f : 0.0f);
        if (z9) {
            P = t1.P(getContext(), 2130969529, 83);
            Q = t1.Q(getContext(), 2130969539, d3.a.f1077e);
        } else {
            P = t1.P(getContext(), 2130969532, 117);
            Q = t1.Q(getContext(), 2130969537, d3.a.f1075c);
        }
        ofFloat.setDuration(P);
        ofFloat.setInterpolator(Q);
        ofFloat.addUpdateListener(new j(this, 3));
        return ofFloat;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f6588n.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6569a.setColor(n(this.H0));
        this.f6572b.setColor(n(this.G0));
        this.f6578e.setColor(n(this.F0));
        this.f6580f.setColor(n(this.E0));
        this.f6586m.setColor(n(this.F0));
        ArrayList arrayList = this.f6595r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b4.b bVar = (b4.b) obj;
            if (bVar.isStateful()) {
                bVar.setState(getDrawableState());
            }
        }
        k kVar = this.R0;
        if (kVar.isStateful()) {
            kVar.setState(getDrawableState());
        }
        int n9 = n(this.D0);
        Paint paint = this.f6576d;
        paint.setColor(n9);
        paint.setAlpha(63);
    }

    public final void e(float f9, float f10, float f11, float f12, Canvas canvas, RectF rectF, int i) {
        if (f10 - f9 > getTrackCornerSize() - this.O) {
            rectF.set(f9, f11, f10, f12);
        } else {
            rectF.setEmpty();
        }
        H(canvas, this.f6569a, rectF, getTrackCornerSize(), i);
    }

    public final void f(Canvas canvas, float f9, float f10) {
        ArrayList arrayList = this.f6598s0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            float P = P(((Float) obj).floatValue());
            float f11 = (this.L / 2.0f) + this.O;
            if (f9 >= P - f11 && f9 <= P + f11) {
                return;
            }
        }
        boolean s5 = s();
        Paint paint = this.f6586m;
        if (s5) {
            canvas.drawPoint(f10, f9, paint);
        } else {
            canvas.drawPoint(f9, f10, paint);
        }
    }

    public final void g(Canvas canvas, int i, int i9, float f9, Drawable drawable) {
        canvas.save();
        if (s()) {
            canvas.concat(this.Q0);
        }
        canvas.translate((this.K + ((int) (v(f9) * i))) - (drawable.getBounds().width() / 2.0f), i9 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f6588n.f6706k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract int getTrackCornerSize();

    public List<Float> getValues() {
        return new ArrayList(this.f6598s0);
    }

    public final void h(int i, int i9, Canvas canvas, Paint paint) {
        while (i < i9) {
            float f9 = s() ? this.f6606w0[i + 1] : this.f6606w0[i];
            float f10 = (this.L / 2.0f) + this.O;
            Iterator it = this.f6598s0.iterator();
            if (it.hasNext()) {
                float P = P(((Float) it.next()).floatValue());
                if (f9 >= P - f10 && f9 <= P + f10) {
                    i += 2;
                }
            }
            if (this.U) {
                float f11 = (this.L / 2.0f) + this.O;
                float f12 = ((this.K * 2) + this.A0) / 2.0f;
                if (f9 >= f12 - f11 && f9 <= f12 + f11) {
                    i += 2;
                }
            }
            float[] fArr = this.f6606w0;
            canvas.drawPoint(fArr[i], fArr[i + 1], paint);
            i += 2;
        }
    }

    public final void i(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.V == null && this.f6570a0 == null && this.f6577d0 == null && this.f0 == null) {
            return;
        }
        if (this.f6598s0.size() > 1) {
            Log.w("e", "Track icons can only be used when only 1 thumb is present.");
        }
        b(canvas, rectF, this.V, true);
        b(canvas, rectF2, this.f6577d0, true);
        b(canvas, rectF, this.f6570a0, false);
        b(canvas, rectF2, this.f0, false);
    }

    public final void j() {
        if (!this.f6601u) {
            this.f6601u = true;
            ValueAnimator d9 = d(true);
            this.f6603v = d9;
            this.f6605w = null;
            d9.start();
        }
        ArrayList arrayList = this.f6595r;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.f6598s0.size() && it.hasNext(); i++) {
            if (i != this.f6602u0) {
                x((b4.b) it.next(), ((Float) this.f6598s0.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f6598s0.size())));
        }
        x((b4.b) it.next(), ((Float) this.f6598s0.get(this.f6602u0)).floatValue());
    }

    public final void k() {
        if (this.f6601u) {
            this.f6601u = false;
            ValueAnimator d9 = d(false);
            this.f6605w = d9;
            this.f6603v = null;
            d9.addListener(new o(this, 9));
            this.f6605w.start();
        }
    }

    public final String l(float f9) {
        f fVar = this.f6591o0;
        if (fVar == null) {
            return String.format(((float) ((int) f9)) == f9 ? "%.0f" : "%.2f", Float.valueOf(f9));
        }
        a0 a0Var = ((l2.f) fVar).f3682a;
        a0Var.getClass();
        int i = a0Var.J2[Math.round(f9)];
        if (i < 60) {
            return i + a0Var.getString(2131952082);
        } else if (i < 1440) {
            return (i / 60) + a0Var.getString(2131951886);
        } else {
            return a0Var.getString(2131951807);
        }
    }

    public final float[] m() {
        float floatValue = ((Float) this.f6598s0.get(0)).floatValue();
        ArrayList arrayList = this.f6598s0;
        float floatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f6598s0.size() == 1) {
            floatValue = this.f6594q0;
        }
        float v2 = v(floatValue);
        float v6 = v(floatValue2);
        if (this.U) {
            float min = Math.min(0.5f, v6);
            v6 = Math.max(0.5f, v6);
            v2 = min;
        }
        return (this.U || !(r() || s())) ? new float[]{v2, v6} : new float[]{v6, v2};
    }

    public final int n(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean o(double d9) {
        double doubleValue = new BigDecimal(Double.toString(d9)).divide(new BigDecimal(Float.toString(this.f6604v0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6571a1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.X0);
        getViewTreeObserver().addOnGlobalLayoutListener(this.Y0);
        ArrayList arrayList = this.f6595r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b4.b bVar = (b4.b) obj;
            ViewGroup d9 = q3.k.d(this);
            if (d9 == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                int[] iArr = new int[2];
                d9.getLocationOnScreen(iArr);
                bVar.Y = iArr[0];
                d9.getWindowVisibleDisplayFrame(bVar.R);
                d9.addOnLayoutChangeListener(bVar.Q);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        com.google.android.material.datepicker.g gVar = this.f6592p;
        if (gVar != null) {
            removeCallbacks(gVar);
        }
        int i = 0;
        this.f6601u = false;
        ArrayList arrayList = this.f6595r;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b4.b bVar = (b4.b) obj;
            ViewGroup d9 = q3.k.d(this);
            if (d9 != null) {
                d9.getOverlay().remove(bVar);
                d9.removeOnLayoutChangeListener(bVar.Q);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.X0);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.Y0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z9, int i, Rect rect) {
        super.onFocusChanged(z9, i, rect);
        c cVar = this.f6588n;
        if (!z9) {
            this.f6600t0 = -1;
            cVar.j(this.f6602u0);
            return;
        }
        if (i == 1) {
            t(Integer.MAX_VALUE);
        } else if (i == 2) {
            t(Integer.MIN_VALUE);
        } else if (i == 17) {
            u(Integer.MAX_VALUE);
        } else if (i == 66) {
            u(Integer.MIN_VALUE);
        }
        cVar.w(this.f6602u0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        float f9;
        float f10;
        if (isEnabled()) {
            if (this.f6598s0.size() == 1) {
                this.f6600t0 = 0;
            }
            Float f11 = null;
            Boolean valueOf = null;
            f11 = null;
            f11 = null;
            if (this.f6600t0 == -1) {
                if (i != 61) {
                    if (i != 66) {
                        if (i != 81) {
                            if (i == 69) {
                                t(-1);
                                valueOf = Boolean.TRUE;
                            } else if (i != 70) {
                                switch (i) {
                                    case 21:
                                        u(-1);
                                        valueOf = Boolean.TRUE;
                                        break;
                                    case 22:
                                        u(1);
                                        valueOf = Boolean.TRUE;
                                        break;
                                }
                            }
                        }
                        t(1);
                        valueOf = Boolean.TRUE;
                    }
                    this.f6600t0 = this.f6602u0;
                    postInvalidate();
                    valueOf = Boolean.TRUE;
                } else {
                    valueOf = keyEvent.hasNoModifiers() ? Boolean.valueOf(t(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(t(-1)) : Boolean.FALSE;
                }
                return valueOf != null ? valueOf.booleanValue() : super.onKeyDown(i, keyEvent);
            }
            boolean isLongPress = this.B0 | keyEvent.isLongPress();
            this.B0 = isLongPress;
            if (isLongPress) {
                float f12 = this.f6604v0;
                r10 = f12 != 0.0f ? f12 : 1.0f;
                if ((this.f6596r0 - this.f6594q0) / r10 > 20) {
                    r10 *= Math.round(f9 / f10);
                }
            } else {
                float f13 = this.f6604v0;
                if (f13 != 0.0f) {
                    r10 = f13;
                }
            }
            if (i == 69) {
                f11 = Float.valueOf(-r10);
            } else if (i != 70 && i != 81) {
                switch (i) {
                    case 19:
                        if (s()) {
                            f11 = Float.valueOf(r10);
                            break;
                        }
                        break;
                    case 20:
                        if (s()) {
                            f11 = Float.valueOf(-r10);
                            break;
                        }
                        break;
                    case 21:
                        if (!r()) {
                            r10 = -r10;
                        }
                        f11 = Float.valueOf(r10);
                        break;
                    case 22:
                        if (r()) {
                            r10 = -r10;
                        }
                        f11 = Float.valueOf(r10);
                        break;
                }
            } else {
                f11 = Float.valueOf(r10);
            }
            if (f11 != null) {
                if (z(this.f6600t0, f11.floatValue() + ((Float) this.f6598s0.get(this.f6600t0)).floatValue())) {
                    C();
                    postInvalidate();
                }
                return true;
            }
            if (i != 23) {
                if (i == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        return t(1);
                    }
                    if (keyEvent.isShiftPressed()) {
                        return t(-1);
                    }
                    return false;
                } else if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            }
            this.f6600t0 = -1;
            postInvalidate();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.B0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        int i10 = this.I;
        int i11 = 0;
        if (i10 == 1 || i10 == 3) {
            i11 = ((b4.b) this.f6595r.get(0)).getIntrinsicHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.H + i11, 1073741824);
        if (s()) {
            super.onMeasure(makeMeasureSpec, i9);
        } else {
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f6594q0 = dVar.f6564a;
        this.f6596r0 = dVar.f6565b;
        y(dVar.f6566c);
        this.f6604v0 = dVar.f6567d;
        if (dVar.f6568e) {
            requestFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, x3.d] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f6564a = this.f6594q0;
        baseSavedState.f6565b = this.f6596r0;
        baseSavedState.f6566c = new ArrayList(this.f6598s0);
        baseSavedState.f6567d = this.f6604v0;
        baseSavedState.f6568e = hasFocus();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        if (s()) {
            i = i9;
        }
        this.A0 = Math.max(i - (this.K * 2), 0);
        F();
        C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r3 != 3) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z9) {
        super.onVisibilityAggregated(z9);
        this.f6571a1 = z9;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup d9 = q3.k.d(this);
            ViewOverlay overlay = d9 == null ? null : d9.getOverlay();
            if (overlay == null) {
                return;
            }
            ArrayList arrayList = this.f6595r;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                overlay.remove((b4.b) obj);
            }
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r() {
        return getLayoutDirection() == 1;
    }

    public final boolean s() {
        return this.F == 1;
    }

    public void setActiveThumbIndex(int i) {
        this.f6600t0 = i;
    }

    public abstract void setCentered(boolean z9);

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        setLayerType(z9 ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public abstract void setOrientation(int i);

    public void setSeparationUnit(int i) {
        this.V0 = i;
        this.C0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f9);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f9);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        y(arrayList);
    }

    public final boolean t(int i) {
        int i9 = this.f6602u0;
        long j = i9 + i;
        long size = this.f6598s0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i10 = (int) j;
        this.f6602u0 = i10;
        if (i10 == i9) {
            return false;
        }
        if (this.f6600t0 != -1) {
            this.f6600t0 = i10;
        }
        C();
        postInvalidate();
        return true;
    }

    public final void u(int i) {
        if (r() || s()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        t(i);
    }

    public final float v(float f9) {
        float f10 = this.f6594q0;
        float f11 = (f9 - f10) / (this.f6596r0 - f10);
        return (r() || s()) ? 1.0f - f11 : f11;
    }

    public final void w() {
        Iterator it = this.f6599t.iterator();
        if (it.hasNext()) {
            throw v1.a.e(it);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(b4.b r5, float r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.l(r6)
            java.lang.CharSequence r1 = r5.M
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 != 0) goto L16
            r5.M = r0
            q3.i r0 = r5.P
            r1 = 1
            r0.f5363d = r1
            r5.invalidateSelf()
        L16:
            boolean r0 = r4.s()
            if (r0 == 0) goto L5f
            int r0 = r4.K
            float r6 = r4.v(r6)
            int r1 = r4.A0
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 / 2
            int r0 = r0 - r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 + r0
            boolean r1 = r4.r()
            if (r1 == 0) goto L4d
            int r1 = r4.c()
            int r2 = r4.M
            int r2 = r2 / 2
            int r3 = r4.f6585k0
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicWidth()
        L4a:
            int r2 = r1 - r2
            goto L88
        L4d:
            int r1 = r4.c()
            int r2 = r4.M
            int r2 = r2 / 2
            int r3 = r4.f6585k0
            int r2 = r2 + r3
            int r2 = r2 + r1
            int r1 = r5.getIntrinsicWidth()
            int r1 = r1 + r2
            goto L88
        L5f:
            int r0 = r4.K
            float r6 = r4.v(r6)
            int r1 = r4.A0
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 / 2
            int r0 = r0 - r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 + r0
            int r1 = r4.c()
            int r2 = r4.M
            int r2 = r2 / 2
            int r3 = r4.f6585k0
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicHeight()
            goto L4a
        L88:
            android.graphics.Rect r3 = r4.N0
            r3.set(r0, r2, r6, r1)
            boolean r6 = r4.s()
            if (r6 == 0) goto La0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r3)
            android.graphics.Matrix r0 = r4.Q0
            r0.mapRect(r6)
            r6.round(r3)
        La0:
            android.view.ViewGroup r6 = q3.k.d(r4)
            q3.c.b(r6, r4, r3)
            r5.setBounds(r3)
            android.view.ViewGroup r6 = q3.k.d(r4)
            if (r6 != 0) goto Lb2
            r6 = 0
            goto Lb6
        Lb2:
            android.view.ViewOverlay r6 = r6.getOverlay()
        Lb6:
            if (r6 != 0) goto Lb9
            return
        Lb9:
            r6.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.x(b4.b, float):void");
    }

    public final void y(ArrayList arrayList) {
        ViewGroup d9;
        int resourceId;
        ViewGroup d10;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f6598s0.size() == arrayList.size() && this.f6598s0.equals(arrayList)) {
            return;
        }
        this.f6598s0 = arrayList;
        this.C0 = true;
        this.f6602u0 = 0;
        C();
        ArrayList arrayList2 = this.f6595r;
        if (arrayList2.size() > this.f6598s0.size()) {
            List<b4.b> subList = arrayList2.subList(this.f6598s0.size(), arrayList2.size());
            for (b4.b bVar : subList) {
                if (isAttachedToWindow() && (d10 = q3.k.d(this)) != null) {
                    d10.getOverlay().remove(bVar);
                    d10.removeOnLayoutChangeListener(bVar.Q);
                }
            }
            subList.clear();
        }
        while (arrayList2.size() < this.f6598s0.size()) {
            Context context = getContext();
            int i = this.q;
            b4.b bVar2 = new b4.b(context, i);
            TypedArray f9 = q3.k.f(bVar2.N, null, c3.a.H, 0, i, new int[0]);
            Context context2 = bVar2.N;
            bVar2.X = context2.getResources().getDimensionPixelSize(2131166208);
            boolean z9 = f9.getBoolean(8, true);
            bVar2.W = z9;
            if (z9) {
                v3.o f10 = bVar2.f6213b.f6196a.f();
                f10.f6242k = bVar2.x();
                bVar2.setShapeAppearanceModel(f10.a());
            } else {
                bVar2.X = 0;
            }
            CharSequence text = f9.getText(6);
            boolean equals = TextUtils.equals(bVar2.M, text);
            i iVar = bVar2.P;
            if (!equals) {
                bVar2.M = text;
                iVar.f5363d = true;
                bVar2.invalidateSelf();
            }
            s3.d dVar = (!f9.hasValue(0) || (resourceId = f9.getResourceId(0, 0)) == 0) ? null : new s3.d(context2, resourceId);
            if (dVar != null && f9.hasValue(1)) {
                dVar.f5832k = t1.v(context2, f9, 1);
            }
            iVar.b(dVar, context2);
            TypedValue W = c4.b.W(context2, 2130968852, b4.b.class.getCanonicalName());
            int i9 = W.resourceId;
            int color = i9 != 0 ? e0.c.getColor(context2, i9) : W.data;
            TypedValue W2 = c4.b.W(context2, 16842801, b4.b.class.getCanonicalName());
            int i10 = W2.resourceId;
            bVar2.o(ColorStateList.valueOf(f9.getColor(7, h0.a.e(h0.a.h(color, 153), h0.a.h(i10 != 0 ? e0.c.getColor(context2, i10) : W2.data, 229)))));
            TypedValue W3 = c4.b.W(context2, 2130968890, b4.b.class.getCanonicalName());
            int i11 = W3.resourceId;
            bVar2.r(ColorStateList.valueOf(i11 != 0 ? e0.c.getColor(context2, i11) : W3.data));
            bVar2.S = f9.getDimensionPixelSize(2, 0);
            bVar2.T = f9.getDimensionPixelSize(4, 0);
            bVar2.U = f9.getDimensionPixelSize(5, 0);
            bVar2.V = f9.getDimensionPixelSize(3, 0);
            f9.recycle();
            arrayList2.add(bVar2);
            if (isAttachedToWindow() && (d9 = q3.k.d(this)) != null) {
                int[] iArr = new int[2];
                d9.getLocationOnScreen(iArr);
                bVar2.Y = iArr[0];
                d9.getWindowVisibleDisplayFrame(bVar2.R);
                d9.addOnLayoutChangeListener(bVar2.Q);
            }
        }
        int i12 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            b4.b bVar3 = (b4.b) obj;
            bVar3.f6213b.f6204k = i12;
            bVar3.invalidateSelf();
        }
        ArrayList arrayList3 = this.f6597s;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            g gVar = (g) obj2;
            ArrayList arrayList4 = this.f6598s0;
            int size3 = arrayList4.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList4.get(i15);
                i15++;
                float floatValue = ((Float) obj3).floatValue();
                gVar.getClass();
                Slider slider = (Slider) this;
                gVar.a(floatValue);
            }
        }
        postInvalidate();
    }

    public final boolean z(int i, float f9) {
        this.f6602u0 = i;
        int i9 = 0;
        if (Math.abs(f9 - ((Float) this.f6598s0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.V0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f10 = this.f6594q0;
                minSeparation = g2.g.b(f10, this.f6596r0, (minSeparation - this.K) / this.A0, f10);
            }
        }
        if (r() || s()) {
            minSeparation = -minSeparation;
        }
        int i10 = i + 1;
        int i11 = i - 1;
        this.f6598s0.set(i, Float.valueOf(c4.b.g(f9, i11 < 0 ? this.f6594q0 : minSeparation + ((Float) this.f6598s0.get(i11)).floatValue(), i10 >= this.f6598s0.size() ? this.f6596r0 : ((Float) this.f6598s0.get(i10)).floatValue() - minSeparation)));
        ArrayList arrayList = this.f6597s;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            g gVar = (g) obj;
            float floatValue = ((Float) this.f6598s0.get(i)).floatValue();
            gVar.getClass();
            Slider slider = (Slider) this;
            gVar.a(floatValue);
        }
        AccessibilityManager accessibilityManager = this.f6590o;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            com.google.android.material.datepicker.g gVar2 = this.f6592p;
            if (gVar2 == null) {
                this.f6592p = new com.google.android.material.datepicker.g(this);
            } else {
                removeCallbacks(gVar2);
            }
            com.google.android.material.datepicker.g gVar3 = this.f6592p;
            gVar3.b = i;
            postDelayed(gVar3, 200L);
        }
        return true;
    }

    public void setValues(List<Float> list) {
        y(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.S0 = null;
        this.T0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.T0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
