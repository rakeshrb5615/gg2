package g0;

import android.graphics.Color;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f1593a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1594b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1595c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1596d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1597e;

    /* renamed from: f  reason: collision with root package name */
    public final float f1598f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1593a = f9;
        this.f1594b = f10;
        this.f1595c = f11;
        this.f1596d = f12;
        this.f1597e = f13;
        this.f1598f = f14;
    }

    public static a a(int i) {
        float pow;
        n nVar = n.f1634k;
        float f9 = b.f(Color.red(i));
        float f10 = b.f(Color.green(i));
        float f11 = b.f(Color.blue(i));
        float[][] fArr = b.f1602d;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[2] * f11) + (fArr2[1] * f10) + (fArr2[0] * f9);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[2] * f11) + (fArr3[1] * f10) + (fArr3[0] * f9);
        float[] fArr4 = fArr[2];
        float f14 = (f11 * fArr4[2]) + (f10 * fArr4[1]) + (f9 * fArr4[0]);
        float[][] fArr5 = b.f1599a;
        float[] fArr6 = fArr5[0];
        float f15 = (fArr6[2] * f14) + (fArr6[1] * f13) + (fArr6[0] * f12);
        float[] fArr7 = fArr5[1];
        float f16 = fArr7[1] * f13;
        float f17 = fArr7[2] * f14;
        float[] fArr8 = fArr5[2];
        float f18 = (f14 * fArr8[2]) + (f13 * fArr8[1]) + (f12 * fArr8[0]);
        float[] fArr9 = nVar.f1641g;
        float f19 = nVar.i;
        float f20 = nVar.f1638d;
        float f21 = nVar.f1635a;
        float f22 = fArr9[0] * f15;
        float f23 = fArr9[1] * (f17 + f16 + (fArr7[0] * f12));
        float f24 = fArr9[2] * f18;
        float f25 = nVar.f1642h;
        float pow2 = (float) Math.pow((Math.abs(f22) * f25) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f23) * f25) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f24) * f25) / 100.0d, 0.42d);
        float signum = ((Math.signum(f22) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f23) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f24) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d9 = signum3;
        float f26 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d9)) / 11.0f;
        float f27 = ((float) ((signum + signum2) - (d9 * 2.0d))) / 9.0f;
        float f28 = signum2 * 20.0f;
        float f29 = ((21.0f * signum3) + ((signum * 20.0f) + f28)) / 20.0f;
        float f30 = (((signum * 40.0f) + f28) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f27, f26)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f31 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f30 * nVar.f1636b) / f21, nVar.j * f20)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f32 = f21 + 4.0f;
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f1640f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f1639e) * nVar.f1637c) * ((float) Math.sqrt((f27 * f27) + (f26 * f26)))) / (f29 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f20) / f32);
        float f33 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((f19 * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f31;
        return new a(atan2, pow6, pow5, f33, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f9, float f10, float f11) {
        n nVar;
        double d9;
        float f12 = n.f1634k.f1638d;
        Math.sqrt(f9 / 100.0d);
        Math.sqrt(((f10 / ((float) Math.sqrt(d9))) * nVar.f1638d) / (nVar.f1635a + 4.0f));
        float f13 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float log = ((float) Math.log((nVar.i * f10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, f13, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(n nVar) {
        float f9;
        float[] fArr;
        float f10 = this.f1594b;
        int i = (f10 > 0.0d ? 1 : (f10 == 0.0d ? 0 : -1));
        float f11 = this.f1595c;
        if (i != 0) {
            double d9 = f11;
            if (d9 != 0.0d) {
                f9 = f10 / ((float) Math.sqrt(d9 / 100.0d));
                float f12 = nVar.f1640f;
                float f13 = nVar.f1642h;
                float pow = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d10 = (this.f1593a * 3.1415927f) / 180.0f;
                float pow2 = nVar.f1635a * ((float) Math.pow(f11 / 100.0d, (1.0d / nVar.f1638d) / nVar.j));
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f * 3846.1538f * nVar.f1639e * nVar.f1637c;
                float f14 = pow2 / nVar.f1636b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f14 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float f22 = 100.0f / f13;
                float signum = Math.signum(f19) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float max = (float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21)));
                float[] fArr2 = nVar.f1641g;
                float f23 = signum / fArr2[0];
                float f24 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f21) * f22) * ((float) Math.pow(max, 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b.f1600b;
                float[] fArr4 = fArr3[0];
                float f25 = (fArr4[2] * signum3) + (fArr4[1] * f24) + (fArr4[0] * f23);
                float[] fArr5 = fArr3[1];
                float f26 = fArr5[1] * f24;
                float f27 = fArr5[2] * signum3;
                float f28 = f23 * fArr3[2][0];
                return h0.a.c(f25, f27 + f26 + (fArr5[0] * f23), (signum3 * fArr[2]) + (f24 * fArr[1]) + f28);
            }
        }
        f9 = 0.0f;
        float f122 = nVar.f1640f;
        float f132 = nVar.f1642h;
        float pow3 = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d102 = (this.f1593a * 3.1415927f) / 180.0f;
        float pow22 = nVar.f1635a * ((float) Math.pow(f11 / 100.0d, (1.0d / nVar.f1638d) / nVar.j));
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f * 3846.1538f * nVar.f1639e * nVar.f1637c;
        float f142 = pow22 / nVar.f1636b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f152 = (((0.305f + f142) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (cos3 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f142 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float f222 = 100.0f / f132;
        float signum4 = Math.signum(f192) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float max2 = (float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212)));
        float[] fArr22 = nVar.f1641g;
        float f232 = signum4 / fArr22[0];
        float f242 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f212) * f222) * ((float) Math.pow(max2, 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b.f1600b;
        float[] fArr42 = fArr32[0];
        float f252 = (fArr42[2] * signum32) + (fArr42[1] * f242) + (fArr42[0] * f232);
        float[] fArr52 = fArr32[1];
        float f262 = fArr52[1] * f242;
        float f272 = fArr52[2] * signum32;
        float f282 = f232 * fArr32[2][0];
        return h0.a.c(f252, f272 + f262 + (fArr52[0] * f232), (signum32 * fArr[2]) + (f242 * fArr[1]) + f282);
    }
}
