package a2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class p extends q0 {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final l B;

    /* renamed from: a  reason: collision with root package name */
    public final int f415a;

    /* renamed from: b  reason: collision with root package name */
    public final int f416b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f417c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f418d;

    /* renamed from: e  reason: collision with root package name */
    public final int f419e;

    /* renamed from: f  reason: collision with root package name */
    public final int f420f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f421g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f422h;
    public final int i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public int f423k;

    /* renamed from: l  reason: collision with root package name */
    public int f424l;

    /* renamed from: m  reason: collision with root package name */
    public float f425m;

    /* renamed from: n  reason: collision with root package name */
    public int f426n;

    /* renamed from: o  reason: collision with root package name */
    public int f427o;

    /* renamed from: p  reason: collision with root package name */
    public float f428p;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f430s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f437z;
    public int q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f429r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f431t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f432u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f433v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f434w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f435x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f436y = new int[2];

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i9, int i10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f437z = ofFloat;
        this.A = 0;
        l lVar = new l(this, 0);
        this.B = lVar;
        m mVar = new m(this, 0);
        this.f417c = stateListDrawable;
        this.f418d = drawable;
        this.f421g = stateListDrawable2;
        this.f422h = drawable2;
        this.f419e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f420f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f415a = i9;
        this.f416b = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new n(this));
        ofFloat.addUpdateListener(new o(this, 0));
        RecyclerView recyclerView2 = this.f430s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.u;
            t0 t0Var = recyclerView2.s;
            if (t0Var != null) {
                t0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f430s;
            recyclerView3.v.remove(this);
            if (recyclerView3.w == this) {
                recyclerView3.w = null;
            }
            ArrayList arrayList2 = this.f430s.m0;
            if (arrayList2 != null) {
                arrayList2.remove(mVar);
            }
            this.f430s.removeCallbacks(lVar);
        }
        this.f430s = recyclerView;
        recyclerView.i(this);
        this.f430s.v.add(this);
        this.f430s.j(mVar);
    }

    public static int e(float f9, float f10, int[] iArr, int i, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 != 0) {
            int i12 = i - i10;
            int i13 = (int) (((f10 - f9) / i11) * i12);
            int i14 = i9 + i13;
            if (i14 < i12 && i14 >= 0) {
                return i13;
            }
        }
        return 0;
    }

    @Override // a2.q0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.q != this.f430s.getWidth() || this.f429r != this.f430s.getHeight()) {
            this.q = this.f430s.getWidth();
            this.f429r = this.f430s.getHeight();
            f(0);
        } else if (this.A != 0) {
            if (this.f431t) {
                int i = this.q;
                int i9 = this.f419e;
                int i10 = i - i9;
                int i11 = this.f424l;
                int i12 = this.f423k;
                int i13 = i11 - (i12 / 2);
                StateListDrawable stateListDrawable = this.f417c;
                stateListDrawable.setBounds(0, 0, i9, i12);
                int i14 = this.f420f;
                int i15 = this.f429r;
                Drawable drawable = this.f418d;
                drawable.setBounds(0, 0, i14, i15);
                if (this.f430s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i9, i13);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i9, -i13);
                } else {
                    canvas.translate(i10, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i13);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i10, -i13);
                }
            }
            if (this.f432u) {
                int i16 = this.f429r;
                int i17 = this.i;
                int i18 = i16 - i17;
                int i19 = this.f427o;
                int i20 = this.f426n;
                int i21 = i19 - (i20 / 2);
                StateListDrawable stateListDrawable2 = this.f421g;
                stateListDrawable2.setBounds(0, 0, i20, i17);
                int i22 = this.q;
                int i23 = this.j;
                Drawable drawable2 = this.f422h;
                drawable2.setBounds(0, 0, i22, i23);
                canvas.translate(0.0f, i18);
                drawable2.draw(canvas);
                canvas.translate(i21, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i21, -i18);
            }
        }
    }

    public final boolean c(float f9, float f10) {
        if (f10 >= this.f429r - this.i) {
            int i = this.f427o;
            int i9 = this.f426n;
            return f9 >= ((float) (i - (i9 / 2))) && f9 <= ((float) ((i9 / 2) + i));
        }
        return false;
    }

    public final boolean d(float f9, float f10) {
        int layoutDirection = this.f430s.getLayoutDirection();
        int i = this.f419e;
        if (layoutDirection == 1) {
            if (f9 > i) {
                return false;
            }
        } else if (f9 < this.q - i) {
            return false;
        }
        int i9 = this.f424l;
        int i10 = this.f423k / 2;
        return f10 >= ((float) (i9 - i10)) && f10 <= ((float) (i10 + i9));
    }

    public final void f(int i) {
        l lVar = this.B;
        StateListDrawable stateListDrawable = this.f417c;
        if (i == 2 && this.f433v != 2) {
            stateListDrawable.setState(C);
            this.f430s.removeCallbacks(lVar);
        }
        if (i == 0) {
            this.f430s.invalidate();
        } else {
            g();
        }
        if (this.f433v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.f430s.removeCallbacks(lVar);
            this.f430s.postDelayed(lVar, 1200);
        } else if (i == 1) {
            this.f430s.removeCallbacks(lVar);
            this.f430s.postDelayed(lVar, 1500);
        }
        this.f433v = i;
    }

    public final void g() {
        int i = this.A;
        ValueAnimator valueAnimator = this.f437z;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
