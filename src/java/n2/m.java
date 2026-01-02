package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLES20;
import i2.k0;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class m extends c4.b {
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public int f4617c;

    /* renamed from: d  reason: collision with root package name */
    public int f4618d;

    /* renamed from: e  reason: collision with root package name */
    public float f4619e;

    /* renamed from: f  reason: collision with root package name */
    public FloatBuffer f4620f;

    /* renamed from: g  reason: collision with root package name */
    public ShortBuffer f4621g;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f4623k;

    /* renamed from: l  reason: collision with root package name */
    public int f4624l;

    /* renamed from: m  reason: collision with root package name */
    public int f4625m;

    /* renamed from: n  reason: collision with root package name */
    public int f4626n;

    /* renamed from: o  reason: collision with root package name */
    public int f4627o;

    /* renamed from: p  reason: collision with root package name */
    public int f4628p;

    /* renamed from: v  reason: collision with root package name */
    public float f4633v;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4622h = new float[8000];
    public final float[] q = {1.0f, 1.0f, 1.0f};

    /* renamed from: r  reason: collision with root package name */
    public float f4629r = 0.0225f;

    /* renamed from: s  reason: collision with root package name */
    public float f4630s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f4631t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f4632u = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public float f4634w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    public long f4635x = System.nanoTime();

    /* renamed from: y  reason: collision with root package name */
    public final float[] f4636y = new float[16];

    /* renamed from: z  reason: collision with root package name */
    public final float[] f4637z = new float[16];
    public final float[] A = new float[16];
    public int C = 4;

    public m(Context context, SharedPreferences sharedPreferences) {
        this.B = sharedPreferences.getBoolean(context.getString(2131952246), true);
    }

    public final void k0() {
        float f9;
        float f10;
        float cos;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        boolean z9 = this.B;
        if (!z9 || this.C == 4) {
            return;
        }
        if (z9) {
            long nanoTime = System.nanoTime();
            float f24 = ((float) (nanoTime - this.f4635x)) * 1.0E-9f;
            this.f4635x = nanoTime;
            if (f24 > 0.05f) {
                f24 = 0.05f;
            }
            this.f4634w = (3.5f * f24 * 0.2f) + this.f4634w;
            float f25 = this.f4629r * 20.0f;
            float sqrt = (float) (1.0d / Math.sqrt((f25 * f25) + 1.0d));
            float f26 = f25 * sqrt;
            float f27 = sqrt * (-1.0f);
            float f28 = 1.0f;
            float abs = (Math.abs(this.f4629r) * 10.0f) + 1.0f;
            this.f4630s = Math.min(this.f4630s + 0.01f, 1.0f);
            this.f4631t = Math.min(this.f4631t + 0.015f, 1.0f);
            this.f4620f.clear();
            float f29 = f26 * 0.4f;
            float f30 = 0.4f * f27;
            float sqrt2 = (float) Math.sqrt((f29 * f29) + (f9 * f9));
            float f31 = (-f30) / sqrt2;
            float f32 = f29 / sqrt2;
            int i = 0;
            while (i < 600) {
                int i9 = i * 8;
                float[] fArr = this.f4622h;
                boolean z10 = fArr[i9 + 6] > 0.5f;
                if (i >= this.f4632u * 600.0f * (z10 ? 0.5f : f28)) {
                    for (int i10 = 0; i10 < 20; i10++) {
                        this.f4620f.put(0.0f);
                    }
                    f14 = f24;
                    f10 = f26;
                    f20 = f27;
                    f22 = abs;
                    f23 = f28;
                } else {
                    float f33 = fArr[i9];
                    int i11 = i9 + 1;
                    float f34 = fArr[i11];
                    float f35 = fArr[i9 + 2];
                    float f36 = fArr[i9 + 3];
                    float f37 = fArr[i9 + 4];
                    float f38 = fArr[i9 + 5];
                    if (z10) {
                        float f39 = 2.45f * f24 * abs * f36;
                        float f40 = f39 * f26;
                        float f41 = f39 * f27;
                        f10 = f26;
                        f11 = f41;
                        cos = f40;
                    } else {
                        float f42 = 0.21f * f24 * abs * f36;
                        float f43 = this.f4634w + f37;
                        f10 = f26;
                        cos = (((float) Math.cos(f43)) * 0.005f) + (f42 * f10);
                        f11 = f42 * f27;
                    }
                    float f44 = f33 + cos;
                    float f45 = f34 + f11;
                    if (f45 < -1.2f) {
                        f44 = (k0.f2392a.nextFloat() * 2.4f) - 1.2f;
                        f45 = 1.2f;
                    }
                    float f46 = this.f4619e;
                    if (f44 < (-1.2f) - f46) {
                        f44 += 2.4f;
                    }
                    if (f44 > 1.2f - f46) {
                        f44 -= 2.4f;
                    }
                    fArr[i9] = f44;
                    fArr[i11] = f45;
                    float f47 = (z10 ? this.f4630s : this.f4631t) * f35;
                    if (z10) {
                        float f48 = 0.036f * f38 * 0.5f;
                        float f49 = f29 * f38 * 0.5f;
                        float f50 = f38 * f30 * 0.5f;
                        float f51 = f31 * f48;
                        float f52 = f48 * f32;
                        float f53 = f44 - f49;
                        f12 = f53 - f51;
                        float f54 = f45 - f50;
                        float f55 = f54 - f52;
                        f13 = f53 + f51;
                        float f56 = f44 + f49;
                        f16 = f56 - f51;
                        float f57 = f45 + f50;
                        float f58 = f57 - f52;
                        f15 = f56 + f51;
                        float f59 = f57 + f52;
                        f17 = f54 + f52;
                        f18 = f55;
                        f14 = f24;
                        f20 = f27;
                        f19 = f59;
                        f21 = f58;
                    } else {
                        float f60 = f38 * 0.02f;
                        f12 = f44 - f60;
                        float f61 = (this.f4617c / this.f4618d) * f60;
                        f13 = f44 + f60;
                        float f62 = f45 + f61;
                        f14 = f24;
                        f15 = f13;
                        f16 = f12;
                        f17 = f45 - f61;
                        f18 = f17;
                        f19 = f62;
                        f20 = f27;
                        f21 = f19;
                    }
                    f22 = abs;
                    this.f4620f.put(f12).put(f18).put(0.0f).put(0.0f).put(f47);
                    f23 = 1.0f;
                    this.f4620f.put(f13).put(f17).put(1.0f).put(0.0f).put(f47);
                    this.f4620f.put(f16).put(f21).put(0.0f).put(1.0f).put(f47);
                    this.f4620f.put(f15).put(f19).put(1.0f).put(1.0f).put(f47);
                }
                i++;
                f28 = f23;
                f24 = f14;
                f27 = f20;
                abs = f22;
                f26 = f10;
            }
            this.f4620f.position(0);
        }
        GLES20.glUseProgram(this.i);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glBlendFunc(770, 771);
        c4.b.g0(this.i, this.f4636y, this.f4637z, this.A, this.f4633v);
        GLES20.glUniform1i(this.f4623k, 0);
        int i12 = this.j;
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i12);
        GLES20.glUniform1f(this.f4627o, this.q[0]);
        this.f4620f.position(0);
        GLES20.glVertexAttribPointer(this.f4624l, 2, 5126, false, 20, (Buffer) this.f4620f);
        GLES20.glEnableVertexAttribArray(this.f4624l);
        this.f4620f.position(2);
        GLES20.glVertexAttribPointer(this.f4625m, 2, 5126, false, 20, (Buffer) this.f4620f);
        GLES20.glEnableVertexAttribArray(this.f4625m);
        this.f4620f.position(4);
        GLES20.glVertexAttribPointer(this.f4626n, 1, 5126, false, 20, (Buffer) this.f4620f);
        GLES20.glEnableVertexAttribArray(this.f4626n);
        GLES20.glUniform1f(this.f4628p, this.f4619e);
        GLES20.glDrawElements(4, 3600, 5123, this.f4621g);
        GLES20.glDisable(3042);
    }

    public final void l0() {
        float nextFloat;
        float f9;
        float f10;
        float f11;
        if (this.B) {
            this.f4635x = System.nanoTime();
            for (int i = 0; i < 600; i++) {
                int i9 = i * 8;
                int i10 = this.C;
                boolean nextBoolean = i10 == 3 ? k0.f2392a.nextBoolean() : i10 == 1;
                Random random = k0.f2392a;
                float f12 = 1.0f;
                float nextFloat2 = ((random.nextFloat() * 2.0f) - 1.0f) - this.f4619e;
                float nextFloat3 = (random.nextFloat() * 2.0f) - 1.0f;
                float pow = (float) Math.pow(random.nextFloat(), nextBoolean ? 8.0d : 4.0d);
                if (nextBoolean) {
                    f9 = (1.1f * pow) + 0.4f;
                    f10 = (0.3f * pow) + 0.1f;
                    f11 = pow + 0.4f;
                    nextFloat = 0.0f;
                } else {
                    float f13 = (pow * 1.5f) + 0.5f;
                    nextFloat = random.nextFloat() * 6.2831855f;
                    f9 = (1.3f * pow) + 0.7f;
                    f10 = 0.4f + (0.6f * pow);
                    f11 = f13;
                }
                float[] fArr = this.f4622h;
                fArr[i9] = nextFloat2;
                fArr[i9 + 1] = nextFloat3;
                fArr[i9 + 2] = f10;
                fArr[i9 + 3] = f9;
                fArr[i9 + 4] = nextFloat;
                fArr[i9 + 5] = f11;
                int i11 = i9 + 6;
                if (!nextBoolean) {
                    f12 = 0.0f;
                }
                fArr[i11] = f12;
            }
        }
    }
}
