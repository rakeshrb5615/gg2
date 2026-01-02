package t0;

import a2.l;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import n.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: x  reason: collision with root package name */
    public static final int f5933x = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final a f5934a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f5935b;

    /* renamed from: c  reason: collision with root package name */
    public final t1 f5936c;

    /* renamed from: d  reason: collision with root package name */
    public l f5937d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f5938e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f5939f;

    /* renamed from: m  reason: collision with root package name */
    public final int f5940m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5941n;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f5942o;

    /* renamed from: p  reason: collision with root package name */
    public final float[] f5943p;
    public final float[] q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5944r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5945s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5946t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5947u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5948v;

    /* renamed from: w  reason: collision with root package name */
    public final t1 f5949w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t0.a] */
    public d(t1 t1Var) {
        ?? obj = new Object();
        obj.f5929e = Long.MIN_VALUE;
        obj.f5931g = -1L;
        obj.f5930f = 0L;
        this.f5934a = obj;
        this.f5935b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5938e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5939f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5942o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5943p = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.q = fArr5;
        this.f5936c = t1Var;
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f9) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f9 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f5940m = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5941n = f5933x;
        obj.f5925a = 500;
        obj.f5926b = 500;
        this.f5949w = t1Var;
    }

    public static float b(float f9, float f10, float f11) {
        return f9 > f11 ? f11 : f9 < f10 ? f10 : f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f5938e
            r0 = r0[r4]
            float[] r1 = r3.f5939f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f5935b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f5942o
            r0 = r0[r4]
            float[] r1 = r3.f5943p
            r1 = r1[r4]
            float[] r2 = r3.q
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.d.a(int, float, float, float):float");
    }

    public final float c(float f9, float f10) {
        if (f10 != 0.0f) {
            int i = this.f5940m;
            if (i == 0 || i == 1) {
                if (f9 < f10) {
                    if (f9 >= 0.0f) {
                        return 1.0f - (f9 / f10);
                    }
                    if (this.f5947u && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f9 < 0.0f) {
                return f9 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f5945s) {
            this.f5947u = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f5934a;
        int i9 = (int) (currentAnimationTimeMillis - aVar.f5929e);
        int i10 = aVar.f5926b;
        if (i9 > i10) {
            i = i10;
        } else if (i9 >= 0) {
            i = i9;
        }
        aVar.i = i;
        aVar.f5932h = aVar.a(currentAnimationTimeMillis);
        aVar.f5931g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        t1 t1Var;
        int count;
        a aVar = this.f5934a;
        float f9 = aVar.f5928d;
        int abs = (int) (f9 / Math.abs(f9));
        Math.abs(aVar.f5927c);
        if (abs != 0 && (count = (t1Var = this.f5949w).getCount()) != 0) {
            int childCount = t1Var.getChildCount();
            int firstVisiblePosition = t1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && t1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && t1Var.getChildAt(childCount - 1).getBottom() <= t1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f5948v
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f5946t = r2
            r7.f5944r = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            n.t1 r4 = r7.f5936c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            t0.a r9 = r7.f5934a
            r9.f5927c = r0
            r9.f5928d = r8
            boolean r8 = r7.f5947u
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            a2.l r8 = r7.f5937d
            if (r8 != 0) goto L62
            a2.l r8 = new a2.l
            r9 = 8
            r8.<init>(r7, r9)
            r7.f5937d = r8
        L62:
            r7.f5947u = r2
            r7.f5945s = r2
            boolean r8 = r7.f5944r
            if (r8 != 0) goto L77
            int r8 = r7.f5941n
            if (r8 <= 0) goto L77
            a2.l r9 = r7.f5937d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = q0.q0.f5172a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            a2.l r8 = r7.f5937d
            r8.run()
        L7c:
            r7.f5944r = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
