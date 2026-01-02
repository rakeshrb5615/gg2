package n2;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import j5.t1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h extends c4.b {
    public static final float[] L = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f};
    public int A;
    public int B;
    public int C;
    public int D;
    public float F;
    public float G;
    public final float H;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4513c;

    /* renamed from: d  reason: collision with root package name */
    public FloatBuffer f4514d;

    /* renamed from: e  reason: collision with root package name */
    public FloatBuffer f4515e;

    /* renamed from: f  reason: collision with root package name */
    public int f4516f;

    /* renamed from: g  reason: collision with root package name */
    public float f4517g;

    /* renamed from: h  reason: collision with root package name */
    public float f4518h;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public int f4519k;

    /* renamed from: l  reason: collision with root package name */
    public float f4520l;

    /* renamed from: m  reason: collision with root package name */
    public float f4521m;

    /* renamed from: n  reason: collision with root package name */
    public float f4522n;

    /* renamed from: o  reason: collision with root package name */
    public float f4523o;

    /* renamed from: p  reason: collision with root package name */
    public float f4524p;

    /* renamed from: w  reason: collision with root package name */
    public int f4530w;

    /* renamed from: x  reason: collision with root package name */
    public int f4531x;

    /* renamed from: y  reason: collision with root package name */
    public int f4532y;

    /* renamed from: z  reason: collision with root package name */
    public int f4533z;
    public float[] i = null;
    public float q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f4525r = 0.5f;

    /* renamed from: s  reason: collision with root package name */
    public float f4526s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f4527t = new float[16];

    /* renamed from: u  reason: collision with root package name */
    public final float[] f4528u = new float[16];

    /* renamed from: v  reason: collision with root package name */
    public final float[] f4529v = new float[16];
    public float E = 1.0f;
    public float[] I = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public boolean J = true;
    public boolean K = true;

    public h(Context context, boolean z9) {
        this.f4513c = z9;
        float f9 = t1.z(context).getFloat(context.getString(2131951715), 1.0f);
        this.H = f9;
        if (((f9 * f9) - f9) + 2.5699997f < 6.728012f) {
            GLES20.glUniform1f(GLES20.glGetUniformLocation(this.f4516f, "vPosition"), 0.0f);
        } else {
            this.H = 0.0f;
        }
    }

    public static float[] m0(float[] fArr, float[] fArr2, float f9) {
        float f10 = fArr[0];
        float b10 = g2.g.b(fArr2[0], f10, f9, f10);
        float f11 = fArr[1];
        float b11 = g2.g.b(fArr2[1], f11, f9, f11);
        float f12 = fArr[2];
        float b12 = g2.g.b(fArr2[2], f12, f9, f12);
        float f13 = fArr[3];
        return new float[]{b10, b11, b12, g2.g.b(fArr2[3], f13, f9, f13)};
    }

    public final void k0() {
        char c9;
        if (this.K || this.f4519k == 0) {
            int i = this.f4519k;
            if (i != 0) {
                c4.b.k(i);
                this.f4519k = 0;
            }
            char c10 = 1;
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i9 = iArr[0];
            this.f4519k = i9;
            GLES20.glBindTexture(3553, i9);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            ByteBuffer order = ByteBuffer.allocateDirect(1024).order(ByteOrder.nativeOrder());
            int i10 = 0;
            while (i10 < 256) {
                float f9 = i10 / 255.0f;
                float[] fArr = new float[4];
                float[] fArr2 = new float[4];
                float[] fArr3 = new float[4];
                boolean z9 = this.j;
                if (z9) {
                    c9 = c10;
                    float[] fArr4 = this.i;
                    fArr[0] = fArr4[0];
                    fArr[c9] = fArr4[c9];
                    fArr[2] = fArr4[2];
                    fArr[3] = fArr4[3];
                    fArr2[0] = fArr4[4];
                    fArr2[c9] = fArr4[5];
                    fArr2[2] = fArr4[6];
                    fArr2[3] = fArr4[7];
                    fArr3[0] = fArr4[8];
                    fArr3[c9] = fArr4[9];
                    fArr3[2] = fArr4[10];
                    fArr3[3] = fArr4[11];
                } else {
                    c9 = c10;
                    float[] fArr5 = this.i;
                    fArr[0] = fArr5[0];
                    fArr[c9] = fArr5[c9];
                    fArr[2] = fArr5[2];
                    fArr[3] = fArr5[3];
                    fArr3[0] = fArr5[4];
                    fArr3[c9] = fArr5[5];
                    fArr3[2] = fArr5[6];
                    fArr3[3] = fArr5[7];
                    fArr2 = fArr;
                }
                float f10 = this.f4526s;
                if (f9 > f10) {
                    if (z9) {
                        float f11 = this.f4525r;
                        if (f9 <= f11) {
                            float f12 = (f9 - f10) / (f11 - f10);
                            fArr = m0(fArr, fArr2, f12 >= 0.0f ? Math.min(f12, 1.0f) : 0.0f);
                        } else {
                            float f13 = this.q;
                            if (f9 <= f13) {
                                float f14 = (f9 - f11) / (f13 - f11);
                                fArr = m0(fArr2, fArr3, f14 >= 0.0f ? Math.min(f14, 1.0f) : 0.0f);
                            }
                            fArr = fArr3;
                        }
                    } else {
                        float f15 = this.q;
                        if (f9 <= f15) {
                            float f16 = (f9 - f10) / (f15 - f10);
                            fArr = m0(fArr, fArr3, f16 >= 0.0f ? Math.min(f16, 1.0f) : 0.0f);
                        }
                        fArr = fArr3;
                    }
                }
                order.put((byte) (fArr[0] * 255.0f));
                order.put((byte) (fArr[c9] * 255.0f));
                order.put((byte) (fArr[2] * 255.0f));
                order.put((byte) (fArr[3] * 255.0f));
                i10++;
                c10 = c9;
            }
            order.position(0);
            GLES20.glTexImage2D(3553, 0, 6408, 1, 256, 0, 6408, 5121, order);
            this.K = false;
        }
    }

    public final void l0(boolean z9) {
        if (this.f4519k == 0) {
            return;
        }
        GLES20.glUseProgram(this.f4516f);
        GLES20.glEnableVertexAttribArray(this.f4530w);
        GLES20.glVertexAttribPointer(this.f4530w, ((int) this.H) + 3, 5126, false, 0, (Buffer) this.f4514d);
        GLES20.glEnableVertexAttribArray(this.f4531x);
        GLES20.glVertexAttribPointer(this.f4531x, 2, 5126, false, 0, (Buffer) this.f4515e);
        GLES20.glUniformMatrix4fv(this.f4532y, 1, false, this.f4529v, 0);
        GLES20.glUniform1i(this.f4533z, this.f4513c ? 1 : 0);
        GLES20.glUniform1i(this.D, 1);
        GLES20.glUniform1f(this.A, this.E);
        if (z9) {
            GLES20.glTexParameteri(3553, 10242, 10497);
        } else {
            GLES20.glTexParameteri(3553, 10242, 33071);
        }
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f4519k);
        float f9 = this.F % 1.0f;
        float f10 = this.G;
        if (f9 < 0.0f) {
            f9 += 1.0f;
        }
        if (z9) {
            GLES20.glUniform1f(this.B, f9);
            GLES20.glUniform1f(this.C, f10);
        } else {
            GLES20.glUniform1f(this.B, 0.0f);
            GLES20.glUniform1f(this.C, 0.0f);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f4530w);
        GLES20.glDisableVertexAttribArray(this.f4531x);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
    }

    public final void n0(float f9, float f10, float f11, float f12, float f13) {
        this.f4520l = f9;
        this.f4521m = f10;
        this.f4524p = f11;
        if (!this.J) {
            f12 = this.f4517g;
        }
        this.f4522n = f12;
        this.f4523o = f13;
        float[] fArr = this.f4527t;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, (this.f4522n / 2.0f) + this.f4520l, (this.f4523o / 2.0f) + this.f4521m, this.f4524p);
        Matrix.scaleM(fArr, 0, (this.f4522n / 2.0f) * 1.0f, (this.f4523o / 2.0f) * 1.0f, 1.0f);
        Matrix.multiplyMM(this.f4529v, 0, this.f4528u, 0, this.f4527t, 0);
    }

    public final void o0(float f9, float f10, float f11) {
        if (this.j) {
            float max = Math.max(0.0f, Math.min(1.0f, f11 / 1.0f));
            this.f4526s = max;
            float max2 = Math.max(max, Math.min(1.0f, f10 / 1.0f));
            this.f4525r = max2;
            this.q = Math.max(max2, Math.min(1.0f, f9 / 1.0f));
        } else {
            float max3 = Math.max(0.0f, Math.min(1.0f, f11 / 1.0f));
            this.f4526s = max3;
            this.f4525r = max3;
            this.q = Math.max(max3, Math.min(1.0f, f9 / 1.0f));
        }
        this.K = true;
    }

    public final void p0(float[] fArr) {
        if (fArr == null) {
            return;
        }
        if (fArr.length == 8) {
            this.j = false;
        } else if (fArr.length != 12) {
            throw new IllegalArgumentException("Gradient colors must be 8 or 12 floats.");
        } else {
            this.j = true;
        }
        this.i = (float[]) fArr.clone();
        this.K = true;
    }

    public final void q0(float f9, float f10) {
        this.f4517g = f9;
        this.f4518h = f10;
        c4.b.j(this.f4516f);
        c4.b.i(this.f4515e);
        c4.b.i(this.f4514d);
        this.f4515e = null;
        this.f4514d = null;
        float f11 = this.J ? 1.0f : 2.0f;
        this.I = new float[]{0.0f, 0.0f, 0.0f, 1.0f, f11, 0.0f, f11, 1.0f};
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4515e = asFloatBuffer;
        asFloatBuffer.put(this.I).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4514d = asFloatBuffer2;
        asFloatBuffer2.put(L).position(0);
        int M = c4.b.M(35633, q4.b.l("KOd+G86ICKS0CZskYfaItHosVcZjihJuIqyhZLbGbkRQjSXzTbIRFNXqeXo4XxzPZk6P+8EN3tSZO4h4qFx/IoZu5ua4SIb9hmWCnXS6QY0qXB/ozBrxZUWWL5mFgLWm38pPbgKbXqtCz7xLdRiwnpqIDQ2pfRm0HTwXEOYInv2vPsyDpip7A0IkUbtg/kKbiaCYaanSZSUx5f8XOHcLqaG67rGd7P5iBLNoqzut2wcWVe1SylVqBvNChbDsDCV4axrtGtmhFS5Vemx7kvoSBG2UavkCMz14osqjccb0fr18EePS4DNZxIQRxyL6LMQFBxMHPig81X+LhgM4mrx2minc1bAAM0TWRMvji27Aw+IG58nxcdyv0CQRxu0L/mHDS+tVJ2AXRTF3XSIe4kbZABYFb8EEsWKKhOa9E3U35QL1nfN5axLkawV+pEhWTUgekNZQZ1fENkAiabR4Bruk9bihWYRTuV2aDurozWZvY2GqcgTp5vYglI9n0P9PmEgu+TWG2aMEW6bPRCQWNSmo6GHWj1dOngZzqAzhaOOr2Xs="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItHosVcZjihJuIqyhZLbGbkRQjSXzTbIRFNXqeXo4XxzPUXsjFQQOtpo6kA4ewkz8W3C0pYWCavng/77/BAqFdrAUXOwRMjdnQR+ukg2LKRopMjnyK3iHsJgpYJFGQ5WlTjQrJqMc7F7oTVXe1SlqPiuW4Vl9CBkOZqbFiDrNqPBgt43L7T9lBC7MNG4B6D4Pn6WVYc4SdTj8KQ451ZyOuc99JjoBY9UhjmMhJ28vKlB6KGSkiGhbwOowj0uHTy6D1ggVPC6EEpZpNL8JMxXgUPjRs/fmbdfoUhKJyk9IvZT+uM+vO2nSijgCDL7in4OStp+Q0bfJfhxGDd+vJYrdgylBSPKS8JYkrZCjKiwnf/hLoRRaDYVhLm8EVLJhb4r0Fe8/4QBweVo4B1z3sCN62iEsdFQN27Cdx4OSYENSiltIBLsQ4+Q71AkTxBnElU4nj2cc0DqT5tZb3TdApi5MUk0FABTfh8OMR/ZqlexTfEi4hryknD2u3O5/wBUF3DRDomOi5roIq4MrbUYfzn3911P+vfg35rbqlvzUgpJUa0nrIFsmy1Y5V0B9GdCdNwZa/HSiCLwmNojFXg6G+s8R2TVYGS5cY1OhU5GMPhqz3O7IAk9X1xRFNqPoZl8wp2LfCNrPDBu8RzxzQxAFQi1pivSKtXFilyraeZ1NZKulLOAeibgo9t4OX2C0uQIccKqS1JjATyUaGYEbVtsxW2dJ2eiLKIaD61WMZVgCXGHubnWSNoCu9Hh9HAuuyX/YDRyLxbtaEbug/LrLZKQ5oKoss7MHwJ78234eS78gOm7d0BjVOa3pEDUZB+7uyjDXg9copxmA+QytPl6q6fsDF2w+7MsIejD05bOrt/d2pw1KfE/3Gcp12olRKUMj2puPcHnEbI+hu1p7CieHsvtVcin8s5tqESJleKCAlHpl7EFzv3OBIYqn41zHoMzZlXG/kuP94CPnMom3Azh2X3oJDYW2wow="));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4516f = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4516f, M2);
        GLES20.glLinkProgram(this.f4516f);
        this.f4530w = GLES20.glGetAttribLocation(this.f4516f, "vPosition");
        this.f4531x = GLES20.glGetAttribLocation(this.f4516f, "aTexCoord");
        this.f4532y = GLES20.glGetUniformLocation(this.f4516f, "uMVPMatrix");
        this.f4533z = GLES20.glGetUniformLocation(this.f4516f, "u_alpha");
        this.B = GLES20.glGetUniformLocation(this.f4516f, "u_xScroll");
        this.C = GLES20.glGetUniformLocation(this.f4516f, "u_yScroll");
        this.D = GLES20.glGetUniformLocation(this.f4516f, "uGradient");
        this.A = GLES20.glGetUniformLocation(this.f4516f, "u_HDR");
        c4.b.a0(this.f4527t, this.f4528u, this.f4529v, 0.0f, this.f4517g, this.f4518h, 0.0f);
    }
}
