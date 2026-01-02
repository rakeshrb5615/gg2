package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import i2.v0;
import java.nio.FloatBuffer;
import java.time.ZonedDateTime;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class q extends c4.b {
    public final int A;
    public int A0;
    public final int B;
    public int B0;
    public final int C;
    public int C0;
    public final int D;
    public final f D0;
    public final int E;
    public final SharedPreferences E0;
    public final int F;
    public final String F0;
    public boolean G;
    public final String H;
    public int H0;
    public final String I;
    public int I0;
    public final String J;
    public final String K;
    public float K0;
    public final String L;
    public float L0;
    public final String M;
    public final String N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String X;
    public float Y;
    public int Z;

    /* renamed from: c  reason: collision with root package name */
    public FloatBuffer f4692c;

    /* renamed from: d  reason: collision with root package name */
    public FloatBuffer f4694d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f4696e;

    /* renamed from: f  reason: collision with root package name */
    public int f4698f;
    public float f0;

    /* renamed from: g  reason: collision with root package name */
    public int f4699g;

    /* renamed from: g0  reason: collision with root package name */
    public float f4700g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f4702h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f4703i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4704j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4706k0;
    public float l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f4709m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f4711n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f4713o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f4715p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f4716q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f4718r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f4720s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4722t0;

    /* renamed from: u  reason: collision with root package name */
    public float f4723u;

    /* renamed from: u0  reason: collision with root package name */
    public int f4724u0;

    /* renamed from: v  reason: collision with root package name */
    public float f4725v;

    /* renamed from: v0  reason: collision with root package name */
    public int f4726v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f4728w0;

    /* renamed from: x  reason: collision with root package name */
    public float f4729x;

    /* renamed from: x0  reason: collision with root package name */
    public int f4730x0;

    /* renamed from: y  reason: collision with root package name */
    public float f4731y;

    /* renamed from: y0  reason: collision with root package name */
    public int f4732y0;
    public int z0;

    /* renamed from: h  reason: collision with root package name */
    public float f4701h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f4705k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f4707l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f4708m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f4710n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f4712o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f4714p = 0.0f;
    public float q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f4717r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public float f4719s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f4721t = 1.0f;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f4733z = {1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: a0  reason: collision with root package name */
    public final float[] f4690a0 = new float[2];

    /* renamed from: b0  reason: collision with root package name */
    public final float[] f4691b0 = new float[2];

    /* renamed from: c0  reason: collision with root package name */
    public final float[] f4693c0 = new float[16];

    /* renamed from: d0  reason: collision with root package name */
    public final float[] f4695d0 = new float[16];

    /* renamed from: e0  reason: collision with root package name */
    public final float[] f4697e0 = new float[16];
    public float J0 = 0.5f;
    public final float[] M0 = new float[2];

    /* renamed from: w  reason: collision with root package name */
    public final float f4727w = i2.m.d().e("sun");
    public String G0 = n0();

    public q(f fVar, Context context, boolean z9, SharedPreferences sharedPreferences) {
        this.D0 = fVar;
        this.f4696e = context;
        this.f4703i0 = z9;
        this.E0 = sharedPreferences;
        this.F0 = context.getResources().getString(2131952104);
        this.A = context.getColor(2131100765);
        this.B = context.getColor(2131100767);
        this.C = context.getColor(2131100782);
        this.D = context.getColor(2131100764);
        this.E = context.getColor(2131100763);
        this.F = context.getColor(2131100766);
        this.H = context.getString(2131952361);
        this.R = context.getString(2131952187);
        this.W = context.getString(2131952474);
        this.X = context.getString(2131951852);
        this.U = context.getString(2131952475);
        this.S = context.getString(2131951865);
        this.T = context.getString(2131952473);
        this.V = context.getString(2131952454);
        this.Q = context.getResources().getString(2131952105);
        this.I = context.getResources().getString(2131952397);
        this.J = context.getResources().getString(2131952398);
        this.K = context.getResources().getString(2131952417);
        this.L = context.getResources().getString(2131952418);
        this.M = context.getResources().getString(2131952506);
        this.N = context.getResources().getString(2131952507);
        this.O = context.getResources().getString(2131951934);
        this.P = context.getResources().getString(2131951883);
    }

    public static float m0(float f9, float f10, float f11) {
        float f12 = ((f9 % 24.0f) + 24.0f) % 24.0f;
        float f13 = ((f10 % 24.0f) + 24.0f) % 24.0f;
        float f14 = ((f11 % 24.0f) + 24.0f) % 24.0f;
        float f15 = ((f14 - f13) + 24.0f) % 24.0f;
        float f16 = ((f12 - f13) + 24.0f) % 24.0f;
        return ((f16 <= f15 ? (f16 / f15) * 180.0f : (((((f12 - f14) + 24.0f) % 24.0f) / (24.0f - f15)) * 180.0f) + 180.0f) + 360.0f) % 360.0f;
    }

    public static float o0(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            return Float.NaN;
        }
        float minute = zonedDateTime.getMinute() / 60.0f;
        return (zonedDateTime.getSecond() / 3600.0f) + minute + zonedDateTime.getHour();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(i2.v0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.q.k0(i2.v0, boolean):void");
    }

    public final void l0(v0 v0Var) {
        i2.a aVar;
        char c9;
        boolean[] j = v0Var.j();
        float[] c10 = m2.a.c(this.f4696e, v0Var.f2531a1);
        int i = v0Var.f2531a1;
        boolean z9 = v0Var.f2555h.K;
        int max = (int) (Math.max(0.0f, Math.min(1.0f, (1.0f - ((aVar.f2295x * 2) * 0.01f)) + 0.5f)) * 255.0f);
        this.I0 = max;
        this.f4725v = 0.2f;
        if (z9) {
            max = 255;
        }
        float f9 = i == 3 ? 2.0f : 1.35f;
        float f10 = c10[3];
        boolean z10 = j[0];
        int i9 = this.A;
        int i10 = this.E;
        if (z10 || j[1]) {
            c9 = 0;
            if (f10 > 0.5f) {
                this.f4725v = (1.0f - f10) * 2.0f;
            } else {
                this.f4725v = 1.0f;
            }
            this.f4729x = (this.f4731y + f9) - (Math.max(f10, 0.5f) * f9);
            if (i != 3) {
                i9 = this.D;
            }
            i9 = i2.l.d(i9, i10, f10);
        } else if (j[2]) {
            this.f4729x = this.f4731y;
            i9 = i10;
            c9 = 0;
        } else {
            boolean z11 = j[3];
            c9 = 0;
            int i11 = this.F;
            int i12 = this.B;
            int i13 = this.C;
            if (z11 || j[4]) {
                if (i == 0) {
                    i11 = i13;
                } else if (i == 3) {
                    i11 = i12;
                }
                if (f10 < 0.25f) {
                    this.f4725v = 4.0f * f10;
                } else {
                    this.f4725v = 1.0f;
                }
                this.f4729x = (Math.min(f10, 0.5f) * f9) + this.f4731y;
                i9 = i2.l.d(i10, i11, f10);
            } else {
                this.f4725v = 1.0f;
                this.f4729x = (f9 * 0.5f) + this.f4731y;
                if (i == 0) {
                    i9 = i13;
                } else if (i != 3) {
                    i9 = i11;
                } else if (c10[0] > 12.0f) {
                    i9 = i12;
                }
            }
        }
        this.f4729x = Math.max(this.f4731y, this.f4729x);
        this.f4725v = Math.max(0.1f, this.f4725v);
        int i14 = (((i9 >> 16) & 255) << 16) | (max << 24) | (((i9 >> 8) & 255) << 8) | (255 & i9);
        float[] fArr = this.f4733z;
        fArr[c9] = Color.red(i14) / 255.0f;
        fArr[1] = Color.green(i14) / 255.0f;
        fArr[2] = Color.blue(i14) / 255.0f;
        fArr[3] = max / 255.0f;
        i iVar = this.D0.f4508x;
        if (iVar != null) {
            iVar.F = z9 ? 1.0f : this.I0 / 255.0f;
        }
    }

    public final String n0() {
        String string = this.E0.getString(this.Q, "0");
        String str = this.S;
        if (Objects.equals(str, string)) {
            return str;
        }
        String str2 = this.R;
        return str2.equals(string) ? str2 : (this.W.equals(string) || this.X.equals(string) || this.U.equals(string) || "0".equals(string)) ? this.T : this.V;
    }
}
