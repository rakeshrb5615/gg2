package n2;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends c4.b {
    public int A;
    public w D;

    /* renamed from: c  reason: collision with root package name */
    public int f4408c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f4409d;

    /* renamed from: f  reason: collision with root package name */
    public final int f4411f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4412g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4413h;
    public final int i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public FloatBuffer f4414k;

    /* renamed from: l  reason: collision with root package name */
    public FloatBuffer f4415l;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f4416m;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f4417n;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f4418o;

    /* renamed from: t  reason: collision with root package name */
    public float[] f4422t;

    /* renamed from: u  reason: collision with root package name */
    public float[] f4423u;

    /* renamed from: v  reason: collision with root package name */
    public float[] f4424v;

    /* renamed from: w  reason: collision with root package name */
    public float[] f4425w;

    /* renamed from: x  reason: collision with root package name */
    public float[] f4426x;

    /* renamed from: y  reason: collision with root package name */
    public h f4427y;

    /* renamed from: z  reason: collision with root package name */
    public int f4428z;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4410e = false;

    /* renamed from: p  reason: collision with root package name */
    public float f4419p = 0.0f;
    public float q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f4420r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    public float f4421s = 0.0f;
    public float[] B = new float[16];
    public float[] C = new float[16];
    public final int[] E = new int[4];

    public a() {
        float[] fArr = new float[16];
        this.f4416m = fArr;
        float[] fArr2 = new float[16];
        this.f4417n = fArr2;
        float[] fArr3 = new float[16];
        this.f4418o = fArr3;
        int M = c4.b.M(35633, q4.b.l("JLiQtee+D2pQw9xnrv4TzlSsPoDmeLlpCixMGkO34mHfRXV7I1kGANMRZV6uN/WVcnAb+mNFWbMytdgco+Gby8VrynjnDoVBYf7SeXb2DPFfYa7BE9997OAk+Z+UQs1mOR0BNxhPTU5rObCtruKHAXHHOQwD/BdSAnMeLx2rmOJRZ+wrDYGZmk9xXvNIGbhB"));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItLlE5c2kAoa/Qje3c+IQAfAxZAl9cD+rooMA9nz2ihxgTJe7YtxNH+D4BBXiyYiQCGVlx5nPtYs0CtnuijxqFY4uV4EShcreZ4c+xanjqvn+kDL3y9LqDJBTUXoYkJQ0+V0cci3GlliYxSry6hwpoSpJcKpW1rdVKs4zjv2ZRwStyoDlLZR05yWzQK+8fbSllhwoVzkgu494r0hXycquFT/wvAKyyzzPTB/1Nurt6XFyfWGjVC/CLS5l175lC1FcMkNM3FK0O22Lj2eSjmYEmtVggnQwZkkijXOou6xLsFRIl1r2x1swAZI6+pTyBTd+k+KA9JV0/oNHafCXyjO9Ui4="));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4408c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4408c, M2);
        GLES20.glLinkProgram(this.f4408c);
        this.f4411f = GLES20.glGetUniformLocation(this.f4408c, "uMVP");
        this.f4412g = GLES20.glGetAttribLocation(this.f4408c, "aPos");
        this.f4413h = GLES20.glGetAttribLocation(this.f4408c, "aTex");
        this.i = GLES20.glGetUniformLocation(this.f4408c, "uTexture");
        this.j = GLES20.glGetUniformLocation(this.f4408c, "uAlpha");
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.D = new w();
    }

    public final void k0() {
        float[] fArr = this.f4417n;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, (this.f4419p / 2.0f) + this.f4420r, (this.q / 2.0f) + this.f4421s, 0.0f);
        Matrix.rotateM(fArr, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, (-this.f4419p) / 2.0f, (-this.q) / 2.0f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
        Matrix.multiplyMM(this.f4418o, 0, this.f4416m, 0, fArr, 0);
    }

    public final void l0(Bitmap[] bitmapArr) {
        if (bitmapArr.length == 0) {
            return;
        }
        this.f4410e = true;
        int[] iArr = this.f4409d;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
        }
        int[] iArr2 = new int[bitmapArr.length];
        this.f4409d = iArr2;
        GLES20.glGenTextures(bitmapArr.length, iArr2, 0);
        this.f4419p = bitmapArr[0].getWidth();
        float height = bitmapArr[0].getHeight();
        this.q = height;
        if (bitmapArr.length == 1) {
            this.f4422t = r3;
            this.f4423u = r4;
            this.f4424v = new float[1];
            this.f4425w = r5;
            this.f4426x = r0;
            float[] fArr = {0.0f};
            float[] fArr2 = {0.0f};
            float[] fArr3 = {this.f4419p};
            float[] fArr4 = {height};
        }
        for (int i = 0; i < bitmapArr.length; i++) {
            Bitmap bitmap = bitmapArr[i];
            if (bitmap != null && !bitmap.isRecycled()) {
                GLES20.glBindTexture(3553, this.f4409d[i]);
                GLES20.glTexParameteri(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10240, 9728);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLUtils.texImage2D(3553, 0, bitmapArr[i], 0);
            }
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4415l = asFloatBuffer;
        asFloatBuffer.put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        k0();
    }

    public final void m0(int i, int i9, int[][] iArr, int[][][] iArr2, int[][][][] iArr3, int[][][] iArr4, int[][][][] iArr5, int[][][] iArr6, int[] iArr7, int[][] iArr8, float[][] fArr) {
        int[] iArr9;
        w wVar;
        if (i == 0 && (wVar = this.D) != null) {
            wVar.f4843h.clear();
            wVar.i.clear();
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = iArr8[i][i10];
            float f9 = fArr[i][i10];
            float f10 = this.A - iArr7[i11];
            for (int i12 = 2; i12 < iArr[i][i10]; i12++) {
                float f11 = f10 + iArr4[i][i10][i12];
                int i13 = iArr6[i][i10][i12];
                i2.l.g(this.E, i13);
                float f12 = iArr9[1] / 255.0f;
                float f13 = iArr9[2] / 255.0f;
                float f14 = iArr9[3] / 255.0f;
                for (int i14 = 0; i14 < iArr2[i][i10][i12]; i14++) {
                    int i15 = iArr3[i][i10][i12][i14];
                    if (i15 != -1) {
                        float f15 = f9 + i15;
                        float f16 = iArr5[i][i10][i12][i14];
                        w wVar2 = this.D;
                        if (wVar2 != null) {
                            wVar2.k0(f15, f11, f16, 1.0f, f12, f13, f14);
                        }
                    }
                }
            }
        }
    }

    public final void n0(int i, int i9, int[][] iArr, int[][][] iArr2, int[][][] iArr3, int[][][][] iArr4) {
        int[] iArr5;
        if (this.D == null || iArr == null || iArr2 == null || iArr3 == null) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = 2;
            while (i12 < iArr[i][i11]) {
                int i13 = iArr3[i][i11][i12];
                i2.l.g(this.E, i13);
                float f9 = iArr5[1] / 255.0f;
                float f10 = iArr5[2] / 255.0f;
                float f11 = iArr5[3] / 255.0f;
                int i14 = i10;
                for (int i15 = 0; i15 < iArr2[i][i11][i12]; i15++) {
                    if (iArr4[i][i11][i12][i15] != -1) {
                        this.D.l0(i14, f9, f10, f11, 1.0f);
                        i14++;
                    }
                }
                i12++;
                i10 = i14;
            }
        }
    }
}
