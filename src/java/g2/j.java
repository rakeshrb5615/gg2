package g2;

import android.graphics.Paint;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j extends m {

    /* renamed from: d  reason: collision with root package name */
    public g0.d f1710d;

    /* renamed from: e  reason: collision with root package name */
    public float f1711e;

    /* renamed from: f  reason: collision with root package name */
    public g0.d f1712f;

    /* renamed from: g  reason: collision with root package name */
    public float f1713g;

    /* renamed from: h  reason: collision with root package name */
    public float f1714h;
    public float i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f1715k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f1716l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f1717m;

    /* renamed from: n  reason: collision with root package name */
    public float f1718n;

    @Override // g2.l
    public final boolean a() {
        return this.f1712f.e() || this.f1710d.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // g2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            g0.d r0 = r6.f1712f
            boolean r1 = r0.e()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1610d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1608b
            if (r1 == r4) goto L1e
            r0.f1608b = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            g0.d r1 = r6.f1710d
            boolean r4 = r1.e()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f1610d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1608b
            if (r7 == r4) goto L3a
            r1.f1608b = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f1714h;
    }

    public int getFillColor() {
        return this.f1712f.f1608b;
    }

    public float getStrokeAlpha() {
        return this.f1713g;
    }

    public int getStrokeColor() {
        return this.f1710d.f1608b;
    }

    public float getStrokeWidth() {
        return this.f1711e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f1715k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f9) {
        this.f1714h = f9;
    }

    public void setFillColor(int i) {
        this.f1712f.f1608b = i;
    }

    public void setStrokeAlpha(float f9) {
        this.f1713g = f9;
    }

    public void setStrokeColor(int i) {
        this.f1710d.f1608b = i;
    }

    public void setStrokeWidth(float f9) {
        this.f1711e = f9;
    }

    public void setTrimPathEnd(float f9) {
        this.j = f9;
    }

    public void setTrimPathOffset(float f9) {
        this.f1715k = f9;
    }

    public void setTrimPathStart(float f9) {
        this.i = f9;
    }
}
