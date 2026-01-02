package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import i2.k0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class v extends c4.b {
    public float C;
    public boolean E;
    public final boolean F;

    /* renamed from: c  reason: collision with root package name */
    public final int f4816c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4817d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4818e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4819f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4820g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4821h;
    public final int i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4822k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4823l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4824m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4825n;

    /* renamed from: o  reason: collision with root package name */
    public final FloatBuffer f4826o;

    /* renamed from: p  reason: collision with root package name */
    public final ShortBuffer f4827p;

    /* renamed from: v  reason: collision with root package name */
    public float f4832v;
    public final float[] q = new float[16];

    /* renamed from: r  reason: collision with root package name */
    public final float[] f4828r = new float[16];

    /* renamed from: s  reason: collision with root package name */
    public final float[] f4829s = new float[16];

    /* renamed from: t  reason: collision with root package name */
    public final u[] f4830t = new u[7];

    /* renamed from: u  reason: collision with root package name */
    public final float[] f4831u = new float[3234];

    /* renamed from: w  reason: collision with root package name */
    public float f4833w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    public float f4834x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f4835y = 1.0f;

    /* renamed from: z  reason: collision with root package name */
    public float f4836z = 0.2f;
    public float A = 1.0f;
    public float B = 1.0f;
    public final float[] D = {1.0f, 1.0f, 1.0f, 1.0f};

    public v(Context context, SharedPreferences sharedPreferences) {
        this.F = false;
        this.E = sharedPreferences.getBoolean(context.getString(2131952499), true);
        int M = c4.b.M(35633, q4.b.l("31CvLSW49ZsWqEJmlVijDM42A9RdPcuWKDIEoaK7tZz0jLm4jZFZjlcJV+H4Sdteb/vbx6SL61fD2BPiAFlHq67D+UldJ3znPl45hpHV3pzpuyp0ZOncV/ZEPTfkUcXX6cMDBrM0fbQJzF4oqdDwDCD+Z2jZ0mYgHjFtc3mVGwJDqa9ScaODZmyYN0IPyKYMC2sYsIzKOi402WdOu1jozTXkDF/nECfftnZwQgmTZlfkApogORPlp9joNOh5XVk4KerHC6JPSgIY87rNpAuLNDoU/zDd2UoDsfMRjAAaAY0oIbFNsCWETf5wfmDbeQ1RCQFfcpVG2mY3PIsbXm9fEdo3RZxH3OMx5I4MJ11gqu05VH3Los7i6CtVEtSrN1aN3BBYa9gcT5QeuK1qrZndhXOk4oG+SwcezXrJWYWmJAu+RXh3HA9L2UBxsnVbq8673jjONmZsFn152UtjOGtVYvs7JGX7mBZDt9OW2P8Vpx7jYivaiHJKx2dG6EXGjGt9iSu63ZgJUM7ZrfGzckE0mBWQwbSdmvbONJHWWcUDVyiDzj48XnRqZoYBBu/55/4lCynP5tp0tyJdHoF4riANv++fPn3GtFv+gKctwt4aMYM18c4XKAOGzR0+ftzyDR0wqU35ZbeIrdlSjpW7BxWGGT8oFsGnvzJUFnlDx+k/5Lvb//kVY6zvLyEHVcalytmybv1TO1tQPa8rNMkUp2M6hF5BOtb13gr43RxNYGIMnlDCPhcJodeEd7QaXgluG6AlZoGfb3SFSNe+ChLSXViyzrrOSb5aKl61gr+2jFzojAdwF9T2Kz08Zb15qVyEt7UTcB0z47gNS8zaXep7yVt3t/iIRffExugHlfvFGT7GQMfqC5ajeWgXghMkruY+fRgJwd4LhzN4FvK/yBw2B5kpxyPXbEvRjuarFj7DrEfZKSbD576+Kksyf6hGzVNmeVPJPSwPeEpA0Wvm6ZRHSYsgX8yu5LZzjtEYevmOA6+HmCCd+Nz1eRSK25h+m+ar/KHDod4jmpLWfIJ8yQwl9IysslMlVxgz+WpwuJx57IL0RQch3CFBmeSLt5dKdzDeO5z2M1wa9R/JHXqGBCOKT/zncBP56IN4R/RpsYALUWc/vgCF2nL9J41xEGWr8bdLAsle+UNQK0w4J3qo/RUgfhaE15K4gRnd19ENR/NvL3lOxOY8ffmw+Tl9onCumfarScY2JXUF90LsIENt9cpOr4T6pMhrftjDpGXh8FQetTje5YTyWQoFcEMuYflucjViCXxXOZ0AF0y0By/PibJHjptCJWnB/5MMmma6cs6+42REjWTHz+Ywv6K1Ubhir5aIU4TjEVBHOa1VSaHgpgcAK7UotwZRYooTZBB4PZSQOs1E6fA="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzZbZjyW0Bd5gK5BH/9mIpyjo3dh5PmWDTKW/2nP6fUS1IYLTA+hsNCr1oFMYScS30DqZDBHGcQCCG87bgvsliJqNDPXcj4+dXcI5FSwvSqUsJhzuWRsxqnwYw+QxqzNrZ7RMFfQpEwNVtRHWrsIXdbzPB7f4OpbOLf7oJd0S/CK0g=="));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4816c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4816c, M2);
        GLES20.glLinkProgram(this.f4816c);
        this.f4817d = GLES20.glGetUniformLocation(this.f4816c, "u_MVPMatrix");
        this.f4818e = GLES20.glGetUniformLocation(this.f4816c, "u_Time");
        this.f4819f = GLES20.glGetUniformLocation(this.f4816c, "u_WindDir");
        this.f4820g = GLES20.glGetUniformLocation(this.f4816c, "u_SwayAmplitude");
        this.f4821h = GLES20.glGetUniformLocation(this.f4816c, "u_Color");
        this.i = GLES20.glGetUniformLocation(this.f4816c, "u_Alpha");
        this.j = GLES20.glGetUniformLocation(this.f4816c, "u_Offset");
        this.f4822k = GLES20.glGetAttribLocation(this.f4816c, "a_Corner");
        this.f4823l = GLES20.glGetAttribLocation(this.f4816c, "a_Center");
        this.f4824m = GLES20.glGetAttribLocation(this.f4816c, "a_Params");
        this.f4825n = GLES20.glGetAttribLocation(this.f4816c, "a_Styling");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(12936);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f4826o = allocateDirect.asFloatBuffer();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(588);
        allocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect2.asShortBuffer();
        this.f4827p = asShortBuffer;
        asShortBuffer.position(0);
        for (int i = 0; i < 294; i++) {
            this.f4827p.put((short) i);
        }
        this.f4827p.position(0);
        this.F = true;
    }

    public final void k0(float f9) {
        if (this.F && this.E) {
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindBuffer(34963, 0);
            GLES20.glUseProgram(this.f4816c);
            float min = Math.min(f9, 0.033f);
            float f10 = this.f4833w * 2.0f;
            float f11 = this.f4834x * 2.0f;
            u[] uVarArr = this.f4830t;
            for (u uVar : uVarArr) {
                float f12 = uVar.f4808a;
                float f13 = this.f4835y;
                float f14 = uVar.f4813f;
                float f15 = this.A + 0.5f;
                float f16 = (f13 * f14 * min * f15) + f12;
                uVar.f4808a = f16;
                float f17 = (this.f4836z * f14 * min * f15) + uVar.f4809b;
                uVar.f4809b = f17;
                float f18 = f16 + this.C;
                if (f18 > f10 || f18 < (-f10) || f17 > f11 || f17 < (-f11)) {
                    m0(uVar, false);
                }
            }
            float[] fArr = this.q;
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = this.f4829s;
            float[] fArr3 = this.f4828r;
            Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr, 0);
            this.f4826o.position(0);
            int i = 0;
            for (u uVar2 : uVarArr) {
                for (int i9 = 0; i9 <= 20; i9++) {
                    float f19 = (i9 / 20.0f) - 0.5f;
                    int i10 = i + 1;
                    l0(i, f19, -0.5f, uVar2);
                    i += 2;
                    l0(i10, f19, 0.5f, uVar2);
                }
            }
            this.f4826o.put(this.f4831u, 0, 3234);
            this.f4826o.position(0);
            this.f4827p.position(0);
            this.f4826o.position(0);
            GLES20.glVertexAttribPointer(this.f4822k, 2, 5126, false, 44, (Buffer) this.f4826o);
            GLES20.glEnableVertexAttribArray(this.f4822k);
            this.f4826o.position(2);
            GLES20.glVertexAttribPointer(this.f4823l, 3, 5126, false, 44, (Buffer) this.f4826o);
            GLES20.glEnableVertexAttribArray(this.f4823l);
            this.f4826o.position(5);
            GLES20.glVertexAttribPointer(this.f4824m, 4, 5126, false, 44, (Buffer) this.f4826o);
            GLES20.glEnableVertexAttribArray(this.f4824m);
            this.f4826o.position(9);
            GLES20.glVertexAttribPointer(this.f4825n, 2, 5126, false, 44, (Buffer) this.f4826o);
            GLES20.glEnableVertexAttribArray(this.f4825n);
            GLES20.glUniform1f(this.f4818e, ((float) (SystemClock.uptimeMillis() % 100000)) / 1000.0f);
            GLES20.glUniformMatrix4fv(this.f4817d, 1, false, fArr2, 0);
            GLES20.glUniform2f(this.f4819f, this.f4835y, this.f4836z);
            GLES20.glUniform1f(this.f4820g, (this.A * 0.2f) + 0.8f);
            GLES20.glUniform4fv(this.f4821h, 1, this.D, 0);
            GLES20.glUniform1f(this.i, this.B);
            GLES20.glUniform1f(this.j, this.C);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 1);
            for (int i11 = 0; i11 < 7; i11++) {
                c4.b.g0(this.f4816c, fArr, fArr3, fArr2, uVarArr[i11].f4810c);
                this.f4827p.position(i11 * 42);
                GLES20.glDrawElements(5, 42, 5123, this.f4827p);
            }
            GLES20.glDisable(3042);
            GLES20.glDisableVertexAttribArray(this.f4822k);
            GLES20.glDisableVertexAttribArray(this.f4823l);
            GLES20.glDisableVertexAttribArray(this.f4824m);
            GLES20.glDisableVertexAttribArray(this.f4825n);
        }
    }

    public final void l0(int i, float f9, float f10, u uVar) {
        int i9 = i * 11;
        float[] fArr = this.f4831u;
        fArr[i9] = f9;
        fArr[i9 + 1] = f10;
        fArr[i9 + 2] = uVar.f4808a;
        fArr[i9 + 3] = uVar.f4809b;
        fArr[i9 + 4] = uVar.f4810c;
        fArr[i9 + 5] = uVar.f4811d;
        fArr[i9 + 6] = uVar.f4812e;
        fArr[i9 + 7] = uVar.f4813f;
        fArr[i9 + 8] = uVar.f4814g;
        fArr[i9 + 9] = uVar.f4815h;
        fArr[i9 + 10] = uVar.i;
    }

    public final void m0(u uVar, boolean z9) {
        Random random = k0.f2392a;
        float nextFloat = (random.nextFloat() * 9.0f) - 1.0f;
        uVar.f4810c = nextFloat;
        float f9 = (nextFloat + 1.0f) / 9.0f;
        uVar.f4813f = ((0.79999995f * f9) + 0.6f) * 1.3f;
        uVar.f4811d = ((random.nextFloat() * 2.0f) + 1.0f) * uVar.f4813f;
        uVar.f4812e = random.nextFloat() * 10.0f;
        uVar.f4814g = ((0.4f * f9) + 0.6f) * ((random.nextFloat() * 2.0f) + 1.0f);
        uVar.i = ((random.nextFloat() * 0.035f) + 0.005f) * f9;
        uVar.f4815h = (((random.nextFloat() * 0.02f) + 0.01f) * f9) + 0.006f;
        float f10 = (this.f4833w / 2.0f) + 3.0f;
        if (z9) {
            uVar.f4808a = ((random.nextFloat() * 2.0f) - 1.0f) * this.f4833w;
        } else if (this.f4835y > 0.0f) {
            uVar.f4808a = (-f10) - this.C;
        } else {
            uVar.f4808a = f10 - this.C;
        }
        uVar.f4809b = ((random.nextFloat() * 2.0f) - 1.0f) * this.f4834x;
    }
}
