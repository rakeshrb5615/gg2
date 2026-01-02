package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.Matrix;
import i2.v0;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class t extends c4.b {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int[] K;
    public final int L;
    public boolean M;
    public final Context N;
    public float O;
    public float P;
    public float R;
    public float S;
    public float T;
    public int U;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: c  reason: collision with root package name */
    public int f4787c;

    /* renamed from: g  reason: collision with root package name */
    public final int f4791g;

    /* renamed from: h  reason: collision with root package name */
    public final FloatBuffer f4792h;
    public final FloatBuffer i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4793k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4794l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4795m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4796n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4797o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4798p;
    public final int q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4799r;

    /* renamed from: s  reason: collision with root package name */
    public final int f4800s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4801t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4802u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4803v;

    /* renamed from: w  reason: collision with root package name */
    public final int f4804w;

    /* renamed from: x  reason: collision with root package name */
    public final int f4805x;

    /* renamed from: y  reason: collision with root package name */
    public final int f4806y;

    /* renamed from: z  reason: collision with root package name */
    public final int f4807z;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f4788d = new float[16];

    /* renamed from: e  reason: collision with root package name */
    public final float[] f4789e = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public final float[] f4790f = new float[16];
    public final float[] Q = new float[2];
    public final float[] V = new float[2];

    public t(Context context, SharedPreferences sharedPreferences) {
        int[] iArr = new int[2];
        this.K = iArr;
        this.N = context;
        this.M = sharedPreferences.getBoolean(context.getString(2131952246), true);
        int M = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaAjfFhpZKl58FEUhxiDdKe8FRm/FBfm6CRUxPV3BvKt/lOlWVYtSHzwA6IBt2aDdyxbnnw6WnLCsWs2Ah6JcJ/PL4Kv0GySSoRkXMrBz5J0aeXXrbOZxdrlBVKAO6m4Fekaa/xaXVjorUr8O3UV43U+JH/mnJKG5KTl1tiz75FZsCJvhFb79iFxm0gjc7pWIj2Io2bS+FUjgwC0Q54rhXWjeVmQvpfApzO4OfnmIqM87"));
        int M2 = c4.b.M(35632, q4.b.l("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") + q4.b.l("U1Espsk1yWfYcmNR8Xd0eKH1rO3tIAFPEegr4FYYfID7qj6Ym9ekrq9TWFbgXRFSjIJbky+ViEEAl6oPgiHk0Pz2Yfnd3lF/LBcjTaJbEGIwAT+Dq+ePQxAeppWryVqys4hEF+fjWSinSBkbcKhaU1Of5ScsYPdTIH0y30VagmDeNQdE9hRAkJFb4kRw2jotLLeqmv5jefdee7mo1lbJWrVasdYTxgXRfuqPCvNtQ6VofctdNQnj6/Ts+C9krSQSjx0NpwbjgSdQz8zcyR8vJKuoOulJ2IYKxwmg1Hijpdare/U6aGKbs5u6km8ty5bwgtUIXx62VTSmK7FM0lErOtYRi3TRYw4u2wBUrVIGjXDkXMgA4vwACrFSCoiH/IA9th7VkboUv5tEfo9rQlCcLzxCgzQTAzWhXy54CXLSfcRaCSvUXj6vYNx9BTECb5pnUTA66nnmjwdtl6WrYErh92PVkK9UDHtD3v/49Z1t9ANPj/exXrMMmYOcrgHW2da7m65Z/88FPMskrSyp6v0ZEqMrgqwhG61nLc1m3XiOAo0NSoRDV7CPhXxhXAKOYdY1PhI67FMf22GoKsNDleJUMZdQyhF62jmI+0/PmQvwO2Sq3Grqtqn/UEgCa4Qe/bNBdJbky13eYq1n8HZHXRCnJXLhuS/P1DsCr7GTU8zAVsN5gIY4+Y+++tmysQNkltb24thIfehL5ljLIryzF3fzbtL6ZE48a53syUA/zgo6h0edz7PNwHrZyDwdLjIeadscyfYSOI78rvjy0xvuxeuxjEYnIEfOf+4M6e40+Ot8UW5jXdUaF7m5mkbQvI1Zzzvka21IdsoFQVhV5lHlhQwpikNGjll+6Jr/Y6LjERVoxSS1/HDbBNKuPn8NSKQyqkTq/y6U3/VGfytBuoHjoW1VbqUZQsHa7R4iIEyJ1epOcmqnXfy/oNnXF8DrtQvSDqorRlMscn1NGf76YdEHBmQ4WbjpZx8O36M9F6PF9kEE51bwt79/wGZFz13CJ4D83LAEuT8CAbi3890q3V6nFzk7MBvs0nGOVk7KZOCw/7DA9QyiT4tJeN+9All/EN7mEE9vx25JH9Sc4VBXFc/3/PQ7skOyAvZhH1Mn/ZCxrmbN9jr1CnmtUI3FSc0jZyOxZcXH3x9/Q6wVpoFa1NS9BK5qRpLem5BDoyA51j72PjXAWM1xEGEiOIqnq76s9I2WHgSOwYWHenVxJiKgvqjHCBEUO1/f13tuaArWmXA0zU5RhRW3/ozX7iVndu4ZtYzgZeNb7ctUmX2GGTVvL6Qx5f7c5sQj1mZkGiKv9I9u4uY+M5VGsByzamJR0rDH/0DPSR9XioXZd9YjsEoqhVF7eFkWe1IML0q8Z8rgLSHMsQ4PKUKNBdjR9Ted7Txm+pGPX3Q8GODrvbVpbdsQydR20zeV4EL20IuG04dCABsGsyt4e6xa4Itkk0yp/qQD7Xr1XPtkY9XA2YbsUPvZe+LFZovoKXvnXSiTQxbks8A3yy0sbu3we23q1DzU1QauTaWKIdGGE1kvwM8LRNqBOPbS72cJxHkuT3HHPi3XZ0qiAorb2kAeT5Fw7AK6/4CUpSAEbU9YXTv0J/2f2vHsCwq07UCNiX+Aep8wlumTqH2HBDeX6SlMLU9pn5KRWcoRFTQGUkHVIppevnZfm1VWehpMMagxRKDRdoOTDcQ54XpXp9jDmRQ/vehgBAazrWh20G81vyZIdglNTRBhsEGBBpSEhbjnRNq+luZpzw02FY4liaKIZE/zcrnb3SqefC7frLqSPChLktrTaUn2wNqPBOoMmMgHbcLi1z0V4y8DM4tnxF63MMhTVMCcDF28GqxV3e+4bU1Ek7gjJnfoKfYmo0kOLApcgkNv6BnhwZeW5e/dbZPPZEwuKXuCE8tyfm1BrfU4yK9YcKTY6nfeDIsru4Za7Qxc/q27LnsC/xRj0d7qN8ExQ6N0FO1o15qagDhhEC7J7Giq") + q4.b.l("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"));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4791g = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(glCreateProgram, M2);
        GLES20.glLinkProgram(glCreateProgram);
        this.j = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.f4793k = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoord");
        this.f4794l = GLES20.glGetUniformLocation(glCreateProgram, "u_MVPMatrix");
        this.f4795m = GLES20.glGetUniformLocation(glCreateProgram, "u_ReflectionTexture");
        this.f4796n = GLES20.glGetUniformLocation(glCreateProgram, "u_DistortionMap");
        this.f4797o = GLES20.glGetUniformLocation(glCreateProgram, "u_DistortionMapIce");
        this.f4798p = GLES20.glGetUniformLocation(glCreateProgram, "u_Time");
        this.q = GLES20.glGetUniformLocation(glCreateProgram, "u_SunScreenPos");
        this.f4799r = GLES20.glGetUniformLocation(glCreateProgram, "u_SunColor");
        this.f4800s = GLES20.glGetUniformLocation(glCreateProgram, "u_deepWaterColor");
        this.f4801t = GLES20.glGetUniformLocation(glCreateProgram, "u_shallowWaterColor");
        this.f4802u = GLES20.glGetUniformLocation(glCreateProgram, "u_WaterHeightRatio");
        this.f4803v = GLES20.glGetUniformLocation(glCreateProgram, "u_HorizonY");
        this.f4804w = GLES20.glGetUniformLocation(glCreateProgram, "u_WindStrength");
        GLES20.glGetUniformLocation(glCreateProgram, "u_WindDirection");
        this.f4805x = GLES20.glGetUniformLocation(glCreateProgram, "u_xOffset");
        this.f4806y = GLES20.glGetUniformLocation(glCreateProgram, "u_waveStrength");
        this.f4807z = GLES20.glGetUniformLocation(glCreateProgram, "u_waveScaleFar");
        this.A = GLES20.glGetUniformLocation(glCreateProgram, "u_waveScaleClose");
        this.B = GLES20.glGetUniformLocation(glCreateProgram, "u_clarity");
        this.C = GLES20.glGetUniformLocation(glCreateProgram, "u_rainAmount");
        this.D = GLES20.glGetUniformLocation(glCreateProgram, "u_rainStrength");
        GLES20.glGetUniformLocation(glCreateProgram, "u_FishTexture");
        this.E = GLES20.glGetUniformLocation(glCreateProgram, "u_FishCenter");
        this.F = GLES20.glGetUniformLocation(glCreateProgram, "u_FishSize");
        this.G = GLES20.glGetUniformLocation(glCreateProgram, "u_FishVisibility");
        GLES20.glGetUniformLocation(glCreateProgram, "u_rippleCount");
        GLES20.glGetUniformLocation(glCreateProgram, "u_RippleCenters");
        GLES20.glGetUniformLocation(glCreateProgram, "u_RippleStrengths");
        this.H = GLES20.glGetUniformLocation(glCreateProgram, "u_motion1");
        this.I = GLES20.glGetUniformLocation(glCreateProgram, "u_motion2");
        this.J = GLES20.glGetUniformLocation(glCreateProgram, "u_motion3");
        this.f4792h = c4.b.q(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f});
        this.i = c4.b.q(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmap = new Bitmap[]{BitmapFactory.decodeResource(context.getResources(), 2131231515, options)}[0];
        if (bitmap != null) {
            int N = c4.b.N(bitmap);
            iArr[0] = N;
            GLES20.glBindTexture(3553, N);
            GLES20.glTexParameteri(3553, 10242, 10497);
            GLES20.glTexParameteri(3553, 10243, 10497);
            GLES20.glBindTexture(3553, 0);
        }
        this.L = c4.b.O(context, 2131231516);
    }

    public final void k0(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float f9, float f10, float f11) {
        int i9 = this.f4791g;
        if (i9 == 0 || i == 0) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glUseProgram(i9);
        float f12 = this.P + f11;
        this.P = f12;
        GLES20.glUniform1f(this.f4798p, f12);
        float f13 = f10 * 0.33f;
        GLES20.glUniform1f(this.f4802u, f13 / f10);
        GLES20.glUniform1f(this.f4803v, 0.33f);
        GLES20.glUniform1f(this.f4804w, 0.33f);
        GLES20.glUniform2f(this.q, fArr[0] / f9, Math.min(fArr[1] / 0.33f, 1.0f));
        GLES20.glUniform3fv(this.f4799r, 1, fArr2, 0);
        GLES20.glUniform3fv(this.f4800s, 1, fArr3, 0);
        GLES20.glUniform3fv(this.f4801t, 1, fArr4, 0);
        GLES20.glUniform1f(this.f4805x, this.Z);
        GLES20.glUniform1f(this.f4806y, this.Y);
        GLES20.glUniform1f(this.f4807z, this.X);
        GLES20.glUniform1f(this.A, this.W);
        GLES20.glUniform1f(this.B, this.S);
        GLES20.glUniform1i(this.C, this.U);
        GLES20.glUniform1f(this.D, this.T);
        double d9 = (float) (this.P % 200.0d);
        double d10 = 0.04d * d9;
        double d11 = d9 * 0.02d;
        double d12 = 6.2831d * d11;
        GLES20.glUniform2f(this.H, (float) (Math.sin(d10 * 6.2831d) * 0.20000000298023224d), (float) (Math.cos(d10 * 3.1415d) * 0.20000000298023224d));
        GLES20.glUniform2f(this.I, (float) (Math.cos(d12) * 0.30000001192092896d), (float) (Math.sin(d11 * 3.1415d) * 0.30000001192092896d));
        GLES20.glUniform2f(this.J, (float) (Math.sin(d12) * 0.4000000059604645d), (float) (Math.cos(d12) * 0.4000000059604645d));
        float f14 = this.O + 0.0032f;
        this.O = f14;
        if (f14 > 1.25f) {
            this.O = -0.5f;
        } else if (f14 < -0.5f) {
            this.O = 1.5f;
        }
        float f15 = this.O;
        float[] fArr5 = this.Q;
        fArr5[0] = f15;
        GLES20.glUniform2f(this.E, -0.5f, 0.15f);
        GLES20.glUniform1f(this.F, 0.25f);
        GLES20.glUniform1f(this.G, fArr5[0] < 0.5f ? this.O : -this.O);
        float[] fArr6 = this.f4789e;
        Matrix.orthoM(fArr6, 0, 0.0f, f9, 0.0f, f10, -1.0f, 1.0f);
        float[] fArr7 = this.f4788d;
        Matrix.setIdentityM(fArr7, 0);
        float f16 = f9 / 2.0f;
        float f17 = f13 / 2.0f;
        Matrix.translateM(fArr7, 0, f16, f17, 0.0f);
        Matrix.scaleM(fArr7, 0, f16, f17, 1.0f);
        float[] fArr8 = this.f4790f;
        Matrix.multiplyMM(fArr8, 0, fArr6, 0, fArr7, 0);
        GLES20.glUniformMatrix4fv(this.f4794l, 1, false, fArr8, 0);
        int i10 = this.j;
        GLES20.glEnableVertexAttribArray(i10);
        GLES20.glVertexAttribPointer(this.j, 3, 5126, false, 12, (Buffer) this.f4792h);
        int i11 = this.f4793k;
        GLES20.glEnableVertexAttribArray(i11);
        GLES20.glVertexAttribPointer(this.f4793k, 2, 5126, false, 8, (Buffer) this.i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.f4795m, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.K[0]);
        GLES20.glUniform1i(this.f4796n, 1);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.L);
        GLES20.glUniform1i(this.f4797o, 2);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(i10);
        GLES20.glDisableVertexAttribArray(i11);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glUseProgram(0);
        GLES20.glDepthMask(true);
        GLES20.glDisable(3042);
    }

    public final void l0(v0 v0Var) {
        float f9 = m2.a.c(this.N, 9)[3];
        boolean[] j = v0Var.j();
        float f10 = this.R;
        this.W = (0.3f * f10) + 0.2f;
        this.X = (f10 * 0.2f) + 0.1f;
        this.Y = (f10 * 0.04f) + 0.002f;
        if (j[0] || j[1]) {
            float f11 = 1.0f - f9;
            float f12 = (f9 * 0.2f) + 0.0f;
            this.S = g2.g.b(0.5f, f12, f11 * f9 * 1.0f, f12);
        } else if (j[2]) {
            this.S = 0.2f;
        } else if (!j[3] && !j[4]) {
            this.S = 0.0f;
        } else {
            float f13 = 1.0f - f9;
            float f14 = (f9 * (-0.2f)) + 0.2f;
            this.S = g2.g.b(0.5f, f14, f13 * f9 * 1.0f, f14);
        }
    }

    public final void m0(v0 v0Var, int i) {
        float abs = Math.abs(i) / 65.0f;
        this.R = abs;
        if (this.M) {
            this.T = (18.0f - (abs * 12.0f)) * 2.0f;
        } else {
            this.T = 0.0f;
        }
        float[] fArr = this.V;
        fArr[0] = -(i / 65.0f);
        fArr[1] = 0.1f;
        if (v0Var != null) {
            l0(v0Var);
        }
    }
}
