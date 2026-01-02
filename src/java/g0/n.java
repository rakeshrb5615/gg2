package g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n {

    /* renamed from: k  reason: collision with root package name */
    public static final n f1634k;

    /* renamed from: a  reason: collision with root package name */
    public final float f1635a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1636b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1637c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1638d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1639e;

    /* renamed from: f  reason: collision with root package name */
    public final float f1640f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f1641g;

    /* renamed from: h  reason: collision with root package name */
    public final float f1642h;
    public final float i;
    public final float j;

    static {
        float[] fArr;
        float[] fArr2 = b.f1601c;
        float m9 = (float) ((b.m() * 63.66197723675813d) / 100.0d);
        float[][] fArr3 = b.f1599a;
        float f9 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f10 = fArr2[1];
        float f11 = fArr4[1] * f10;
        float f12 = fArr2[2];
        float f13 = (fArr4[2] * f12) + f11 + (fArr4[0] * f9);
        float[] fArr5 = fArr3[1];
        float f14 = (fArr5[2] * f12) + (fArr5[1] * f10) + (fArr5[0] * f9);
        float[] fArr6 = fArr3[2];
        float f15 = (f12 * fArr6[2]) + (f10 * fArr6[1]) + (f9 * fArr6[0]);
        float f16 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-m9) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d9 = exp;
        if (d9 > 1.0d) {
            exp = 1.0f;
        } else if (d9 < 0.0d) {
            exp = 0.0f;
        }
        float f17 = 1.0f / ((5.0f * m9) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(m9 * 5.0d))) + (f18 * m9);
        float m10 = b.m() / fArr2[1];
        double d10 = m10;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr[0] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr[1] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr[2] * cbrt) * f15) / 100.0d, 0.42d)};
        float f20 = fArr7[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[2];
        float[] fArr8 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        f1634k = new n(m10, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f16, 1.0f, new float[]{(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f9, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f1640f = f9;
        this.f1635a = f10;
        this.f1636b = f11;
        this.f1637c = f12;
        this.f1638d = f13;
        this.f1639e = f14;
        this.f1641g = fArr;
        this.f1642h = f15;
        this.i = f16;
        this.j = f17;
    }
}
