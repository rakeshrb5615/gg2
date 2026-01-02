package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLES20;
import android.util.TypedValue;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class l extends c4.b {

    /* renamed from: j0  reason: collision with root package name */
    public static final float[] f4587j0 = {-0.5f, -0.5f, 0.0f, 0.0f, 0.5f, -0.5f, 1.0f, 0.0f, -0.5f, 0.5f, 0.0f, 1.0f, 0.5f, -0.5f, 1.0f, 0.0f, 0.5f, 0.5f, 1.0f, 1.0f, -0.5f, 0.5f, 0.0f, 1.0f};
    public float D;
    public boolean E;
    public int F;
    public float G;
    public float H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public final float f4588a0;

    /* renamed from: b0  reason: collision with root package name */
    public final float f4589b0;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4590c;

    /* renamed from: d  reason: collision with root package name */
    public final SharedPreferences f4592d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4594e;

    /* renamed from: f  reason: collision with root package name */
    public int f4596f;
    public float f0;

    /* renamed from: g  reason: collision with root package name */
    public final int f4597g;

    /* renamed from: g0  reason: collision with root package name */
    public float f4598g0;

    /* renamed from: h  reason: collision with root package name */
    public final int f4599h;

    /* renamed from: h0  reason: collision with root package name */
    public float f4600h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean[] f4601i0;

    /* renamed from: m  reason: collision with root package name */
    public int f4604m;

    /* renamed from: n  reason: collision with root package name */
    public int f4605n;

    /* renamed from: p  reason: collision with root package name */
    public float f4607p;
    public float q;

    /* renamed from: r  reason: collision with root package name */
    public float f4608r;

    /* renamed from: s  reason: collision with root package name */
    public float f4609s;

    /* renamed from: t  reason: collision with root package name */
    public float f4610t;

    /* renamed from: u  reason: collision with root package name */
    public float f4611u;

    /* renamed from: v  reason: collision with root package name */
    public float f4612v;

    /* renamed from: w  reason: collision with root package name */
    public float f4613w;

    /* renamed from: x  reason: collision with root package name */
    public final FloatBuffer f4614x;

    /* renamed from: y  reason: collision with root package name */
    public int f4615y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f4616z;
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    /* renamed from: k  reason: collision with root package name */
    public final float[] f4602k = new float[16];

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4603l = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public int f4606o = 80;
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public float R = 50.0f;
    public float S = 400.0f;
    public float T = 400.0f;
    public float U = 50.0f;

    /* renamed from: c0  reason: collision with root package name */
    public final int[] f4591c0 = new int[4];

    /* renamed from: d0  reason: collision with root package name */
    public float f4593d0 = 0.0f;

    /* renamed from: e0  reason: collision with root package name */
    public float f4595e0 = 0.0f;

    /* JADX WARN: Type inference failed for: r13v2, types: [n2.k, java.lang.Object] */
    public l(Context context, SharedPreferences sharedPreferences) {
        this.f4590c = context;
        this.f4592d = sharedPreferences;
        int M = c4.b.M(35633, q4.b.l("31CvLSW49ZsWqEJmlVijDCEYYXL3XTpCWVrf5ZiaTpzpU5iHOZmuDWCatSLTvRFxN4PaM7dE4B4/rrExDcqXIVEtaqtslsth55cazQompot7dmH1a7qwrIxXOVTzpFULVTds/O/26Zp15AOEfB8U7JrMkc1HVKQrOZ8i3KiXBSJqKy4xKMfpHDAtMNDYyXIjliM+XTlrgSVp0KFckoo13z2RKx51m14d0qwd7Cq4YKntGpdcpsRgtrvawApk/RcU/kaRyhbLN7CB87K3zDsU98KkmPe0NNutbkflJ1C+wZO116ftDbtQ18EERUKAlzNB9PAulgIHvmr40aENcN030drtII7vZqUwxkxVJRS4SZkEXMBRzjg23wUHInMjvpKFQUmB+ikLgoZqMoVGJQE+U62v+41EWcQOlfLY3kSALb6cCNYFw5fJktPefYK8xacR7HjskHSKUk2zuYX0vKpkVKqV1Cqcg+zwZN82bV+3Gy5+pKNv8FnrJr5UvcFg81S71YmIjFn8t27buwdqGm23GpYrb1OF5jGnkJCHl0mpZB0vKLfTZXyUH6NIeXa+MIDQCPtU8gSop4TI8ryn/kIShbTam1gruEZaAGtBJvA2NTKUJxGYAHUiWQtwYeW+g76+HrjDZ1IlOTlcC/RbmyGCEEmjA9Qck40+Tk/GrSxBohET5ztubnV7Saumu7BvtHJShEMAF1RbT5N7x/4+pmGNdRnZ1zwwcJW30mysTKv9qntE07dF+EaQFMhR90VI3xINdPL0FxgTw0gkzCE0q9sZgjMxeq8UfHbu8DvH+OUVq5EmyO79MUX3RUF8FLvF0jvl"));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItEzE4YLlflhTcRtN/7tyM6DEvFHWpTlXEp9HerHhRVzJNK8YkGiwi3P+DYsSUFh9UQDtm6gW+Jok0A+hhNVqeVjZdERqov+YIhnStgqjz+xvIF93T4oVXQqqKlaW0K8XGGDzxjXz6hbJRVgVIwNNa/9oCPkPNmW445l1ZnUtRN+UzJ5SftWAyEmHuWjVHB9Th3EqABm4jL43ys+EZJtIda2lJNfELWYX2cEW/Zdpzm9EVHqod8nEtd+2Z/0TkPF7EVNWdPQwqi3BsGKbHmW7ItOZGZusbsvnamhPSkXK8yZ+IKJpWIZ+yVi79Ca0Nefe6xQm/UVUr9HwfEx71APSjfpkUU+cAfhwQo4uTHhudrO09DPS+a4e5PhppUnajfhc1g=="));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4594e = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4594e, M2);
        GLES20.glLinkProgram(this.f4594e);
        this.I = GLES20.glGetUniformLocation(this.f4594e, "u_MVPMatrix");
        this.J = GLES20.glGetUniformLocation(this.f4594e, "uZ");
        this.K = GLES20.glGetAttribLocation(this.f4594e, "a_Position");
        this.L = GLES20.glGetAttribLocation(this.f4594e, "a_TexCoord");
        this.M = GLES20.glGetUniformLocation(this.f4594e, "u_Translation");
        this.N = GLES20.glGetUniformLocation(this.f4594e, "u_Scale");
        this.O = GLES20.glGetUniformLocation(this.f4594e, "u_Rotation");
        this.P = GLES20.glGetUniformLocation(this.f4594e, "u_Alpha");
        this.Q = GLES20.glGetUniformLocation(this.f4594e, "uColor");
        int i = 0;
        for (int i9 = 80; i < i9; i9 = 80) {
            float l0 = l0(0.0f, 6.2831855f);
            float l02 = l0(this.f4607p, this.q);
            double d9 = l0;
            float cos = ((float) Math.cos(d9)) * l02;
            float sin = ((float) Math.sin(d9)) * l02;
            float l03 = l0(2.0f, this.F == 8 ? 9.0f : 6.0f);
            float f9 = this.f4593d0;
            float l04 = l0(0.0f + f9, this.G + f9);
            float l05 = l0(0.0f, this.H);
            float l06 = l0(this.f4608r, this.f4609s);
            float l07 = l0(this.f4612v, this.f4613w);
            float l08 = l0(this.f4610t, this.f4611u);
            ?? obj = new Object();
            obj.f4574a = l04;
            obj.f4575b = l05;
            obj.f4576c = l03;
            obj.f4577d = cos;
            obj.f4578e = sin;
            obj.f4579f = l06;
            obj.f4580g = 0.0f;
            obj.f4581h = l07;
            obj.i = l08;
            obj.j = 0.0f;
            obj.f4582k = 1.0f;
            obj.f4584m = 0.0f;
            obj.f4585n = 0.0f;
            obj.f4586o = 0.0f;
            obj.f4580g = l0(0.0f, 6.2831855f);
            obj.j = 0.0f;
            obj.f4582k = 0.001f;
            obj.f4584m = ((obj.f4583l * 0.5f) + 0.5f) * l0(this.f4588a0, this.f4589b0);
            this.f4603l.add(obj);
            i++;
        }
        this.F = sharedPreferences.getInt("sceneIndexKey", 0);
        this.E = sharedPreferences.getBoolean(context.getString(2131952214), true);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(96).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4614x = asFloatBuffer;
        asFloatBuffer.put(f4587j0);
        asFloatBuffer.position(0);
        i2.l.g(this.f4591c0, this.f4615y);
        int[] iArr = this.f4591c0;
        this.f4616z = new float[]{iArr[1] / 255.0f, iArr[2] / 255.0f, iArr[3] / 255.0f, 1.0f};
        this.f4588a0 = TypedValue.applyDimension(1, 0.35f, context.getResources().getDisplayMetrics());
        this.f4589b0 = TypedValue.applyDimension(1, 0.75f, context.getResources().getDisplayMetrics());
        Context context2 = this.f4590c;
        this.f4597g = c4.b.O(context2, 2131231256);
        this.f4599h = c4.b.O(context2, 2131231138);
        this.f4596f = this.f4597g;
    }

    public static float l0(float f9, float f10) {
        return ((float) (Math.random() * (f10 - f9))) + f9;
    }

    public final void k0(float f9) {
        float f10;
        int i;
        float l0;
        float f11;
        if (this.E) {
            float min = Math.min(f9, 0.033f);
            ArrayList arrayList = this.f4603l;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                float f12 = 0.5f;
                if (i9 >= size) {
                    break;
                }
                Object obj = arrayList.get(i9);
                int i10 = i9 + 1;
                k kVar = (k) obj;
                float f13 = kVar.j + min;
                kVar.j = f13;
                float f14 = (kVar.f4583l * 0.5f) + 0.5f;
                float f15 = this.f0;
                if (f13 < f15) {
                    float max = Math.max(0.0f, Math.min(f13 / f15, 1.0f));
                    kVar.f4582k = ((max * max * 0.85f) + 0.15f) * f14;
                } else {
                    float f16 = kVar.i;
                    float f17 = this.f4598g0;
                    if (f13 > f16 - f17) {
                        float f18 = (f16 - f13) / f17;
                        kVar.f4582k = Math.max(0.0f, f18 * f18) * f14;
                    } else {
                        kVar.f4582k = f14;
                    }
                }
                if (kVar.j >= kVar.i) {
                    while (true) {
                        l0 = l0(2.0f, 8.0f);
                        f11 = f12;
                        if (Math.abs(l0 - Math.round(l0)) >= 0.05f) {
                            break;
                        }
                        f12 = f11;
                    }
                    kVar.f4576c = l0;
                    kVar.f4583l = 1.0f - ((8.0f - l0) / 6.0f);
                    float f19 = this.f4593d0;
                    kVar.f4574a = l0(0.0f + f19, this.G + f19);
                    if (this.S < 50.0f) {
                        float f20 = this.f4605n;
                        this.Y = 0.65f * f20;
                        this.Z = f20;
                    } else {
                        this.Y = 0.0f;
                        this.Z = this.f4605n;
                    }
                    kVar.f4575b = l0(this.Y, this.Z);
                    float f21 = (kVar.f4583l + f11) * this.S;
                    i = i10;
                    kVar.f4577d = ((float) Math.cos(this.R)) * f21;
                    float l02 = l0(-10.0f, 10.0f);
                    float f22 = kVar.f4583l;
                    kVar.f4578e = ((l02 * f22) + (((float) Math.sin(this.R)) * f21)) - ((f22 + f11) * this.W);
                    kVar.f4579f = (kVar.f4583l + f11) * l0(this.f4608r, this.f4609s);
                    kVar.f4580g = l0(0.0f, 6.2831855f);
                    kVar.f4581h = ((kVar.f4583l * 0.7f) + 0.3f) * l0(this.f4612v, this.f4613w);
                    float max2 = Math.max(l0(this.f4610t, this.f4611u), this.f4598g0 * 2.0f);
                    kVar.i = max2;
                    if (max2 < 2.0f) {
                        kVar.i = 2.0f;
                    }
                    kVar.j = 0.0f;
                    kVar.f4582k = 0.001f;
                    kVar.f4584m = ((kVar.f4583l * f11) + f11) * l0(this.f4588a0, this.f4589b0);
                    kVar.f4585n = l0(1.0f, 2.0f);
                    kVar.f4586o = l0(0.0f, 6.2831855f);
                } else {
                    i = i10;
                    float sin = kVar.f4584m * ((float) Math.sin((kVar.f4585n * f10) + kVar.f4586o));
                    double d9 = this.S < 10.0f ? 0.0f : this.R + 1.5707964f;
                    float cos = ((float) Math.cos(d9)) * sin;
                    float sin2 = sin * ((float) Math.sin(d9));
                    float f23 = this.f4604m * 0.3f;
                    float f24 = -f23;
                    float max3 = Math.max(f24, Math.min(f23, kVar.f4577d * min));
                    float max4 = Math.max(f24, Math.min(f23, kVar.f4578e * min));
                    float f25 = max3 + cos + kVar.f4574a;
                    kVar.f4574a = f25;
                    kVar.f4575b = max4 + sin2 + kVar.f4575b;
                    kVar.f4580g = (kVar.f4581h * min) + kVar.f4580g;
                    float f26 = this.f4604m * 0.5f;
                    float f27 = this.f4593d0;
                    if (f25 > this.G + f26 + f27) {
                        kVar.f4574a = (0.0f - f26) + f27;
                        kVar.f4575b = l0(this.Y, this.Z);
                        kVar.j = 0.0f;
                        kVar.f4582k = 0.001f;
                    }
                    float f28 = kVar.f4574a;
                    float f29 = 0.0f - f26;
                    float f30 = this.f4593d0;
                    if (f28 < f29 + f30) {
                        kVar.f4574a = this.G + f26 + f30;
                        kVar.f4575b = l0(this.Y, this.Z);
                        kVar.j = 0.0f;
                        kVar.f4582k = 0.001f;
                    }
                    if (kVar.f4575b > this.H + f26) {
                        kVar.f4575b = l0(this.Y, this.Z);
                        float f31 = this.f4593d0;
                        kVar.f4574a = l0(0.0f + f31, this.G + f31);
                        kVar.j = 0.0f;
                        kVar.f4582k = 0.001f;
                    }
                    if (kVar.f4575b < f29) {
                        kVar.f4575b = l0(this.Y, this.Z);
                        float f32 = this.f4593d0;
                        kVar.f4574a = l0(0.0f + f32, this.G + f32);
                        kVar.j = 0.0f;
                        kVar.f4582k = 0.001f;
                    }
                }
                i9 = i;
            }
            synchronized (this.B) {
                try {
                    ArrayList arrayList2 = this.B;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        k kVar2 = (k) obj2;
                        float f33 = kVar2.j + min;
                        kVar2.j = f33;
                        float min2 = 1.0f - Math.min(f33 / this.f4598g0, 1.0f);
                        kVar2.f4582k = min2 * min2 * ((kVar2.f4583l * 0.5f) + 0.5f);
                        if (kVar2.j >= this.f4598g0) {
                            this.C.add(kVar2);
                        }
                    }
                } finally {
                }
            }
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glUseProgram(this.f4594e);
            GLES20.glBindTexture(3553, this.f4596f);
            c4.b.a0(this.i, this.j, this.f4602k, 0.0f, this.G, 0.0f, this.H);
            GLES20.glUniformMatrix4fv(this.I, 1, false, this.f4602k, 0);
            for (int i12 = 0; i12 < this.f4606o; i12++) {
                k kVar3 = (k) this.f4603l.get(i12);
                if (kVar3.f4582k >= 1.0E-5f) {
                    GLES20.glUniform1f(this.J, kVar3.f4576c);
                    this.f4614x.position(0);
                    GLES20.glEnableVertexAttribArray(this.K);
                    GLES20.glVertexAttribPointer(this.K, 2, 5126, false, 16, (Buffer) this.f4614x);
                    this.f4614x.position(2);
                    GLES20.glEnableVertexAttribArray(this.L);
                    GLES20.glVertexAttribPointer(this.L, 2, 5126, false, 16, (Buffer) this.f4614x);
                    GLES20.glUniform2f(this.M, kVar3.f4574a - this.f4593d0, kVar3.f4575b - this.f4595e0);
                    GLES20.glUniform1f(this.N, kVar3.f4579f);
                    GLES20.glUniform1f(this.O, kVar3.f4580g);
                    GLES20.glUniform1f(this.P, kVar3.f4582k);
                    GLES20.glUniform4fv(this.Q, 1, this.f4616z, 0);
                    GLES20.glDrawArrays(4, 0, 6);
                }
            }
            synchronized (this.B) {
                try {
                    ArrayList arrayList3 = this.B;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        k kVar4 = (k) obj3;
                        GLES20.glUniform1f(this.J, kVar4.f4576c);
                        this.f4614x.position(0);
                        GLES20.glEnableVertexAttribArray(this.K);
                        GLES20.glVertexAttribPointer(this.K, 2, 5126, false, 16, (Buffer) this.f4614x);
                        this.f4614x.position(2);
                        GLES20.glEnableVertexAttribArray(this.L);
                        GLES20.glVertexAttribPointer(this.L, 2, 5126, false, 16, (Buffer) this.f4614x);
                        GLES20.glUniform2f(this.M, kVar4.f4574a - this.f4593d0, kVar4.f4575b - this.f4595e0);
                        GLES20.glUniform1f(this.N, kVar4.f4579f);
                        GLES20.glUniform1f(this.O, kVar4.f4580g);
                        GLES20.glUniform1f(this.P, kVar4.f4582k);
                        GLES20.glUniform4fv(this.Q, 1, this.f4616z, 0);
                        GLES20.glDrawArrays(4, 0, 6);
                    }
                    if (!this.C.isEmpty()) {
                        this.B.removeAll(this.C);
                        this.C.clear();
                    }
                } finally {
                }
            }
            GLES20.glDisableVertexAttribArray(this.K);
            GLES20.glDisableVertexAttribArray(this.L);
            GLES20.glBindTexture(3553, 0);
            GLES20.glUseProgram(0);
            GLES20.glDisable(3042);
        }
    }

    public final void m0(float f9, float f10) {
        int i = this.f4604m;
        int i9 = this.f4605n;
        boolean z9 = i < i9;
        this.f4608r = (z9 ? i : i9) * f9;
        this.f4609s = (z9 ? i : i9) * f10;
    }

    public final void n0(int i) {
        this.F = i;
        this.D = this.f4605n * 0.05f;
        if (i == 0 || i == 1 || i == 2) {
            this.f4596f = this.f4597g;
            m0(0.005f, 0.015f);
        } else if (i == 3) {
            this.f4596f = this.f4599h;
            m0(0.0025f, 0.012f);
            int i9 = this.f4604m;
            this.f4607p = i9 * 0.008f;
            this.q = i9 * 0.016f;
        } else if (i == 4) {
            this.f4596f = this.f4599h;
            m0(0.0025f, 0.012f);
            int i10 = this.f4604m;
            this.f4607p = i10 * 0.008f;
            this.q = i10 * 0.016f;
        } else if (i == 5) {
            this.f4596f = this.f4599h;
            m0(0.003f, 0.012f);
            this.D = this.f4605n * 0.05f * 0.3f;
        } else if (i == 8) {
            m0(0.0015f, 0.0055f);
        }
    }
}
