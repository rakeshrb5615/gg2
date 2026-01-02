package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import i2.v0;
import i2.w0;
import j5.t1;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e extends c4.b {
    public final Context A;
    public int B;
    public int C;
    public float D;
    public final v0 F;
    public final f G;
    public final w0 H;
    public final SharedPreferences I;
    public float J;
    public final String K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public int V;
    public int W;
    public float X;
    public final d Y;
    public final int[] Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f4458a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f4459b0;

    /* renamed from: c  reason: collision with root package name */
    public final int f4460c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4461c0;

    /* renamed from: d  reason: collision with root package name */
    public final int f4462d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4463d0;

    /* renamed from: e  reason: collision with root package name */
    public final int f4464e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f4465e0;

    /* renamed from: f  reason: collision with root package name */
    public final int f4466f;
    public float f0;

    /* renamed from: g  reason: collision with root package name */
    public final int f4467g;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f4468g0;

    /* renamed from: h  reason: collision with root package name */
    public final int f4469h;

    /* renamed from: h0  reason: collision with root package name */
    public int[] f4470h0;
    public final int i;

    /* renamed from: i0  reason: collision with root package name */
    public float f4471i0;
    public final int j;

    /* renamed from: j0  reason: collision with root package name */
    public float f4472j0;

    /* renamed from: k  reason: collision with root package name */
    public final int f4473k;

    /* renamed from: k0  reason: collision with root package name */
    public float f4474k0;

    /* renamed from: l  reason: collision with root package name */
    public final int f4475l;
    public int l0;

    /* renamed from: m  reason: collision with root package name */
    public final int f4476m;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4477m0;

    /* renamed from: n  reason: collision with root package name */
    public final int f4478n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4479o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4480p;
    public FloatBuffer q;

    /* renamed from: r  reason: collision with root package name */
    public FloatBuffer f4481r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f4482s;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f4483t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f4484u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f4485v;

    /* renamed from: x  reason: collision with root package name */
    public final Random f4487x;

    /* renamed from: z  reason: collision with root package name */
    public float f4489z;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f4486w = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final float[][] f4488y = {new float[]{1.0f, 1.0f, 1.0f, 1.0f}};
    public final float[] E = new float[16];

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractMap, n2.d, java.util.HashMap] */
    public e(Context context, f fVar, v0 v0Var, SharedPreferences sharedPreferences, long j) {
        ?? hashMap = new HashMap();
        hashMap.put(0, 1);
        hashMap.put(1, 2);
        hashMap.put(4, 0);
        hashMap.put(5, 0);
        hashMap.put(6, 4);
        this.Y = hashMap;
        this.Z = new int[3];
        this.f4463d0 = true;
        this.f0 = -1.0f;
        this.f4468g0 = new int[4];
        this.f4470h0 = new int[4];
        this.f4471i0 = -1.0f;
        this.l0 = -1;
        this.f4477m0 = true;
        this.A = context;
        this.G = fVar;
        this.F = v0Var;
        this.I = sharedPreferences;
        this.f4487x = new Random(j);
        this.H = v0Var.i;
        this.K = context.getString(2131952216);
        this.L = context.getString(2131952087);
        this.M = context.getString(2131951749);
        context.getString(2131952500);
        this.N = context.getString(2131952299);
        this.O = context.getString(2131952363);
        int[] iArr = {2131231279, 2131231427, 2131231443, 2131231445, 2131231211, 2131231171, 2131231446};
        this.R = context.getColor(2131099719);
        this.P = context.getColor(2131099714);
        this.S = context.getColor(2131099718);
        this.U = context.getColor(2131099717);
        this.T = context.getColor(2131099722);
        this.Q = context.getColor(2131099720);
        context.getColor(2131099723);
        context.getColor(2131099716);
        context.getColor(2131099724);
        context.getColor(2131099721);
        context.getColor(2131099715);
        this.f4477m0 = sharedPreferences.getBoolean(context.getString(2131951753), true);
        this.X = Math.max(1.0f, (sharedPreferences.getInt(context.getString(2131951876), 100) * 0.001f) + 1.0f);
        int M = c4.b.M(35633, q4.b.l("KOd+G86ICKS0CZskYfaItNM/flQcTqrdUvGUwjWAZI1/cj95E2xiHgCZsQ9HhM+GsXEEgi9s3pwRgavBg0L2P/QQNa7Uw8tZo5bjvEh8a2adexS0DpdmCU38rPzF7XDDTrIzRfqiv5QGlj9OnZq5CVUypK2on2b5AP0B90XrOcpaUFq7QXltTbb+CG9RcvRADMy2di4ZzcKz4eXCcXxQiWO/ik3Watd4hfDbKM9zNOe3nZo2ZoHBoeZ1HoDvAw4TmGiQXk6i1Jtm8cQVZNSUiEx11mZKOXdwMfxQQSqQmNlaIGQYgXq+5FS3miUjDn/fHKLumv2MNp9WoYJ7ZcveJVx9Szx4d6Gszi1US7io4jBLZkXIlQjYjepGQ7kBROP+69lZrrO2P+xOq1eWSMbjjiI41+XcQzMiXmR8empcqyyCB+htBDLsaeRWkWvIe2Tm1Q7yUIpcsWNtQ24PYV982+EhEObHNpAQSzu053UWSLL9P5qhdWF7h2NQObfjp0LpTp9ogMxYrOUiTrtWBnKDFsibJlpoQMjhXVGIXDOR1/nxIsV2ExLIWC9TLAfR+7eV6d2pMlC1RTiqZIQf0qv90T4a7bw4qbIFK+D8SvcZLrNCDWyjUt+vAXA4/OuMJ/a8WpHHasG8SPBJsjgWh4xRoCi7tIz7xPTykdtVsGwn/IhhcuNkRKG0OBR9SpJ/IkraGtvQi/Nq50pYy/utd8FiadGWQleSNFiXAdvofXHYMDWkreOSwLHtCBbMkQs+i+TwGhvNXyWx5QdQcaqb2dBSRA=="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItEzE4YLlflhTcRtN/7tyM6B1ROdtglAUxbwxPDMw65g8gomKW1XOg1KjYRRpQKYI1/3inZ2ySetjg2DyGJ5OkCWt0IYnMkvEpffJVnxG7HJVJZJojokCHe9boNSageeVUERJHhZwK1ptN6OuQq8E/ciQhtp6sBdvVx3Rx4UwCqeuO1PPrmmZUMuBKi6ndfdNIZYvFyKVCm0yfrkJtMuicWecZ0PKjl0ZHHKv2lZ0tNKGYjgSaTTuOMi9Ar2QNwGTpOI6Pz2M6EWzDBtSOOw38lAL00ilVk/eGbThHpclyB79+0AoAj5XuJNL2Jk2VN/+gtxmOTU2mGZXQmKos0Yq6ej4IsuPsU0QJPg1sCKHXzpCEZRatnfC3BRaCoCPi20EMsJvJQ2PWBgN+wgpFK2x4upDv1oWBr3YigPtsFUaq5J7w1Vj51+S4xY1ln1DJQcTF7z0F8Pfef0eJXDY2T5hChbLFkkxMOufqc+pXeJMak4eHNJ0SiScOFh7Su3YY/QYzCWzWl4yIw0fCNo7UavyfvIv4/VqOIdW/5Od8ME66emN4NBhcMm20J5kjI1jKrLAYYws6iqfFkYTe4KLFem3LAFLh76xHgcGuEe8HzY3W/m8XgUjqfRHWENQlfbYF19N8EGPTnWPFs+a85iys7xsn7VMaDMtkyC88eWJXdx55NgK9D68QT6KWlaOm8pqT8OV6VJa+lly0daqQ5aixvJE4zFApuh7h5q7/eWjvKe38kaHbw090cGUWvefgjyExp5radMavRJxxBerCchuu7q2ARdty12nVOI3hPCrjL05+GmsrqtuIzVwCQIP+OWvhhSd6VSYE9fKzs56t8iGkyukJldct5TqfE4yGC784CrAVRjRQLUB8jR/aQvrcsu0NpykhYnNsStqasnya28e1ZpO2iriv0mIIRvQsu23QyNEAhPWIzuJIQXPjwZwj8UdQWDhtDJiS9fdzb5FmVQgMmBraMb0l7xZFDm4hhKsb5RWpYIOQEjZuCJnk4raeCRe2OW4fYYQc+LpE9j1le7urAvA7BGCxUPB/FkpvLG5Vp+dN0+cHbhctLRk9ryqqyJnsTSvJ0aJngLiILZXezTfejuy7oUE1bw2KS+M+2H4lE3FFd5jhbqXhh7K2407k/SEqge8gDvONuvvi450giRlM5V0X8sJc5XFw22gDfzDeVxWSvkzVw57xdaveei36XLg56jAjt7tNrn0rlFJeBWvoDXG2xuXlE2jHZYkOgC3TbA+wxZFUiQLY3y0yIN8BMwcGKON5hxaXX34GLawex9dgwdjxCIJd0yljSsNMYYkTqGYOpJJ"));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4460c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4460c, M2);
        GLES20.glLinkProgram(this.f4460c);
        this.f4462d = GLES20.glGetAttribLocation(this.f4460c, "a_Position");
        this.f4464e = GLES20.glGetAttribLocation(this.f4460c, "a_TexCoordinate");
        this.f4466f = GLES20.glGetUniformLocation(this.f4460c, "u_MVPMatrix");
        this.f4467g = GLES20.glGetUniformLocation(this.f4460c, "u_Texture");
        this.f4469h = GLES20.glGetUniformLocation(this.f4460c, "u_GradientTexture");
        this.i = GLES20.glGetUniformLocation(this.f4460c, "u_AspectRatio");
        this.j = GLES20.glGetUniformLocation(this.f4460c, "u_CloudInstanceData");
        this.f4473k = GLES20.glGetUniformLocation(this.f4460c, "u_CloudZ");
        this.f4475l = GLES20.glGetUniformLocation(this.f4460c, "u_CloudTopColor");
        this.f4476m = GLES20.glGetUniformLocation(this.f4460c, "u_CloudBotColor");
        this.f4478n = GLES20.glGetUniformLocation(this.f4460c, "u_WindOffset");
        this.f4479o = GLES20.glGetUniformLocation(this.f4460c, "u_CloudOpacity");
        this.f4480p = GLES20.glGetUniformLocation(this.f4460c, "u_HDR");
        this.f4482s = new int[7];
        this.f4483t = new float[7];
        this.f4484u = new int[7];
        this.f4485v = new int[7];
        for (int i = 0; i < 7; i++) {
            try {
                Drawable A = t1.A(context, iArr[i]);
                if (A != null) {
                    int intrinsicWidth = A.getIntrinsicWidth();
                    int intrinsicHeight = A.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        intrinsicWidth = 128;
                        intrinsicHeight = 128;
                    }
                    this.f4484u[i] = intrinsicWidth;
                    this.f4485v[i] = intrinsicHeight;
                    this.f4483t[i] = intrinsicWidth / intrinsicHeight;
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    A.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    A.draw(canvas);
                    this.f4482s[i] = c4.b.N(createBitmap);
                }
            } catch (Exception unused) {
                this.f4482s[i] = 0;
                this.f4483t[i] = 1.0f;
                this.f4484u[i] = 0;
                this.f4485v[i] = 0;
            }
        }
        String string = context.getString(2131951809);
        String str = this.f4459b0;
        if (str == null || str.isEmpty()) {
            this.f4459b0 = sharedPreferences.getString(string, string);
        }
        this.l0 = -1;
    }

    public final void k0(c cVar) {
        int[] iArr = this.f4468g0;
        cVar.f4451e = new float[]{iArr[1] / 255.0f, iArr[2] / 255.0f, iArr[3] / 255.0f, 1.0f};
        int[] iArr2 = this.f4470h0;
        cVar.f4452f = new float[]{iArr2[1] / 255.0f, iArr2[2] / 255.0f, iArr2[3] / 255.0f, 1.0f};
    }

    public final void l0(float f9) {
        float f10;
        float f11;
        float f12;
        int i;
        int i9;
        float min = Math.min(f9, 0.016f);
        float f13 = this.f4471i0;
        if (f13 < 0.0f) {
            this.f4471i0 = this.f4474k0;
            this.f4472j0 = 0.0f;
            f10 = 0.0f;
        } else {
            float f14 = this.f4474k0 - f13;
            this.f4472j0 = f14;
            if (Math.abs(f14) < 1.0E-4f) {
                this.f4472j0 = 0.0f;
            }
            float f15 = this.f4474k0 - this.f4471i0;
            this.f4472j0 = f15;
            if (f15 < -12.0f) {
                this.f4472j0 = f15 + 24.0f;
            } else if (f15 > 12.0f) {
                this.f4472j0 = f15 - 24.0f;
            }
            if (Math.abs(this.f4472j0) < 5.0E-4f) {
                this.f4472j0 = 0.0f;
            }
            f10 = 0.03f * min;
            float f16 = this.f4472j0 * 0.425f;
            if (this.f4477m0) {
                f10 += f16;
            }
        }
        this.f4471i0 = this.f4474k0;
        int i10 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f4460c);
        GLES20.glEnableVertexAttribArray(this.f4462d);
        GLES20.glVertexAttribPointer(this.f4462d, 2, 5126, false, 0, (Buffer) this.q);
        GLES20.glEnableVertexAttribArray(this.f4464e);
        GLES20.glVertexAttribPointer(this.f4464e, 2, 5126, false, 0, (Buffer) this.f4481r);
        GLES20.glActiveTexture(33985);
        int i11 = 1;
        GLES20.glUniform1i(this.f4469h, 1);
        GLES20.glUniformMatrix4fv(this.f4466f, 1, false, this.E, 0);
        float f17 = this.F.D1 / this.B;
        this.f4489z = f17;
        float f18 = 0.001f;
        if (Math.abs(f17) < 0.001f) {
            this.f4489z = 0.0f;
        }
        g5.i iVar = new g5.i(5);
        ArrayList arrayList = this.f4486w;
        arrayList.sort(iVar);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            c cVar = (c) arrayList.get(i12);
            int i13 = this.f4482s[cVar.f4453g];
            if (i13 != this.l0) {
                GLES20.glBindTexture(3553, i13);
                GLES20.glUniform1i(this.f4467g, 0);
                this.l0 = i13;
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f4482s[cVar.f4453g]);
            GLES20.glUniform1i(this.f4467g, 0);
            cVar.j += min;
            int i14 = ((float) i12) < ((float) size) * this.J ? i11 : 0;
            if ((this.f4463d0 || this.f4461c0 || this.f4465e0) && (i12 == 0 || i12 == i11 || i12 == 2)) {
                i14 = 0;
            }
            float f19 = (cVar.f4449c + 10.0f) / 20.0f;
            cVar.f4457m = i14 != 0 ? Math.max(0.25f, f19) : 0.0f;
            int i15 = i10;
            float f20 = f18;
            if (i14 != 0 && cVar.f4453g == 0) {
                cVar.f4457m = 1.0f;
            } else if (i14 != 0 && f19 >= 0.5f) {
                cVar.f4457m = 1.0f;
            }
            float f21 = cVar.f4457m - cVar.f4455k;
            float f22 = cVar.f4456l * min;
            if (Math.abs(f21) > f20) {
                f11 = 1.0f;
                f12 = 0.5f;
                cVar.f4455k = Math.max(-f22, Math.min(f22, f21)) + cVar.f4455k;
            } else {
                f11 = 1.0f;
                f12 = 0.5f;
                cVar.f4455k = cVar.f4457m;
            }
            if (cVar.f4455k <= 0.0f) {
                i = i11;
            } else {
                if (cVar.j > cVar.i) {
                    m0(cVar, false);
                }
                float f23 = (f19 * f19 * f19 * 3.8f) + 0.2f;
                float f24 = f10 * f23 * this.f0;
                if (cVar.f4453g == 4) {
                    cVar.f4447a += f24;
                } else {
                    cVar.f4447a -= f24;
                }
                this.f4471i0 = this.f4474k0;
                float f25 = (this.f4489z * f23) + cVar.f4447a;
                float f26 = this.D;
                float f27 = f26 > f11 ? 0.35f * f26 : 0.35f;
                float f28 = f26 + f27;
                float f29 = (f28 * f12) + f27;
                boolean z9 = cVar.f4454h;
                if (z9 || (f25 >= (-f28) && f25 <= f28)) {
                    GLES20.glTexParameteri(3553, 10242, z9 ? 10497 : 33071);
                    boolean z10 = cVar.f4454h;
                    float f30 = z10 ? 0.0f : f25;
                    GLES20.glUniform2f(this.f4478n, z10 ? -f25 : 0.0f, 0.0f);
                    GLES20.glUniform1f(this.i, this.f4483t[cVar.f4453g]);
                    GLES20.glUniform3f(this.j, f30, cVar.f4448b, cVar.f4450d);
                    GLES20.glUniform1f(this.f4473k, cVar.f4449c);
                    i = 1;
                    GLES20.glUniform4fv(this.f4475l, 1, cVar.f4451e, 0);
                    GLES20.glUniform4fv(this.f4476m, 1, cVar.f4452f, 0);
                    GLES20.glUniform1f(this.f4479o, cVar.f4455k);
                    GLES20.glUniform1f(this.f4480p, this.X);
                    GLES20.glDrawArrays(5, 0, 4);
                } else {
                    boolean z11 = i9 < 0;
                    m0(cVar, false);
                    float f31 = this.f4489z;
                    if (f31 < -0.01f || f31 > 0.01f) {
                        float f32 = (-f31) * f23;
                        Random random = this.f4487x;
                        cVar.f4447a = f32 + (z11 ? (random.nextFloat() * f29) + f29 : (random.nextFloat() * (-f29)) - f29);
                    }
                    i = 1;
                }
            }
            i12++;
            i10 = i15;
            i11 = i;
            f18 = f20;
        }
        GLES20.glDisableVertexAttribArray(this.f4462d);
        GLES20.glDisableVertexAttribArray(this.f4464e);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisable(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0(n2.c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.e.m0(n2.c, boolean):void");
    }
}
