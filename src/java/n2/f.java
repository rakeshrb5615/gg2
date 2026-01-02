package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.TypedValue;
import i2.v0;
import j5.t1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f extends c4.b implements GLSurfaceView.Renderer {
    public boolean B;
    public float[] C;
    public float[] D;
    public int E;
    public int F;
    public boolean G;
    public final float I;
    public final SharedPreferences J;
    public float P;
    public float R;
    public boolean T;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4490c;

    /* renamed from: d  reason: collision with root package name */
    public v0 f4491d;

    /* renamed from: e  reason: collision with root package name */
    public int f4492e;

    /* renamed from: f  reason: collision with root package name */
    public int f4493f;

    /* renamed from: g  reason: collision with root package name */
    public h f4494g;

    /* renamed from: h  reason: collision with root package name */
    public p f4495h;
    public final String i;
    public final String j;

    /* renamed from: l  reason: collision with root package name */
    public e f4497l;

    /* renamed from: m  reason: collision with root package name */
    public n f4498m;

    /* renamed from: n  reason: collision with root package name */
    public m f4499n;

    /* renamed from: o  reason: collision with root package name */
    public r f4500o;

    /* renamed from: p  reason: collision with root package name */
    public s f4501p;
    public o q;

    /* renamed from: r  reason: collision with root package name */
    public q f4502r;

    /* renamed from: s  reason: collision with root package name */
    public l f4503s;

    /* renamed from: t  reason: collision with root package name */
    public b f4504t;

    /* renamed from: u  reason: collision with root package name */
    public j f4505u;

    /* renamed from: v  reason: collision with root package name */
    public t f4506v;

    /* renamed from: w  reason: collision with root package name */
    public v f4507w;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4496k = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public i f4508x = new i();

    /* renamed from: y  reason: collision with root package name */
    public int f4509y = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4510z = false;
    public boolean A = false;
    public boolean H = true;
    public final int[] L = {0, 1};
    public long M = -1;
    public float N = 16.67f;
    public float O = 0.016f;
    public float Q = 0.0f;
    public Float S = null;
    public float U = 0.0f;
    public float V = 0.0f;
    public float W = 0.0f;
    public ArrayList X = new ArrayList();
    public final long K = System.nanoTime();

    public f(Context context, v0 v0Var, SharedPreferences sharedPreferences) {
        this.f4490c = context.getApplicationContext();
        this.f4491d = v0Var;
        this.J = sharedPreferences;
        this.i = context.getString(2131952057);
        this.j = context.getString(2131951706);
        this.f4501p = new s(context);
        try {
            i2.m.d().f(context);
        } catch (IOException unused) {
        }
        this.I = i2.m.d().e("sky");
    }

    public static void q0(g gVar, Bitmap[] bitmapArr, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6, float[] fArr7) {
        a aVar = gVar.f4511a;
        aVar.f4422t = fArr3;
        aVar.f4423u = fArr4;
        aVar.f4424v = fArr5;
        aVar.f4425w = fArr6;
        aVar.f4426x = fArr7;
        aVar.f4420r = 0.0f;
        aVar.f4421s = 0.0f;
        aVar.k0();
        aVar.l0(bitmapArr);
        aVar.k0();
        h hVar = gVar.f4512b;
        hVar.p0(fArr);
        hVar.o0(fArr2[0], fArr2[1], fArr2[2]);
    }

    public static void t0(g gVar, Bitmap bitmap, float[] fArr, float[] fArr2, float f9, float f10, float f11, float f12, float f13) {
        h hVar = gVar.f4512b;
        a aVar = gVar.f4511a;
        aVar.l0(new Bitmap[]{bitmap});
        float f14 = f9 / 1.0f;
        float f15 = f10 / 1.0f;
        aVar.f4420r = f14;
        aVar.f4421s = f15;
        aVar.k0();
        aVar.k0();
        hVar.n0(f14, f15, f11, f12 / 1.0f, f13 / 1.0f);
        hVar.p0(fArr);
        hVar.o0(fArr2[0], fArr2[1], fArr2[2]);
    }

    public final void k0() {
        if (this.f4494g != null) {
            l0(false);
        }
        this.f4496k.clear();
        Context context = this.f4490c;
        this.f4494g = new h(context, false);
        this.f4497l = new e(this.f4490c, this, this.f4491d, this.J, this.K);
        this.f4498m = new n(context);
        SharedPreferences sharedPreferences = this.J;
        this.f4499n = new m(context, sharedPreferences);
        this.f4500o = new r(context, this);
        this.q = new o(context);
        q qVar = new q(this, context, this.A, sharedPreferences);
        this.f4502r = qVar;
        if (this.f4495h == null) {
            this.f4495h = new p(context, qVar, sharedPreferences);
        }
        this.f4503s = new l(context, sharedPreferences);
        this.f4504t = new b(context);
        this.f4506v = new t(context, sharedPreferences);
        if (m2.a.d()) {
            this.f4505u = new j(context, sharedPreferences);
        } else {
            this.f4505u = null;
        }
        this.f4507w = new v(context, sharedPreferences);
        if (this.f4508x == null) {
            i iVar = new i();
            this.f4508x = iVar;
            iVar.k0(context, sharedPreferences);
        }
    }

    public final void l0(boolean z9) {
        int i = 0;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f4496k;
            if (i9 >= arrayList.size()) {
                break;
            }
            g gVar = (g) arrayList.get(i9);
            h hVar = gVar.f4512b;
            c4.b.k(0);
            c4.b.k(hVar.f4519k);
            hVar.f4519k = 0;
            c4.b.i(hVar.f4514d);
            hVar.f4514d = null;
            c4.b.i(hVar.f4515e);
            hVar.f4515e = null;
            c4.b.j(hVar.f4516f);
            hVar.f4516f = 0;
            a aVar = gVar.f4511a;
            int[] iArr = aVar.f4409d;
            if (iArr != null) {
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
            }
            aVar.f4409d = null;
            c4.b.i(aVar.f4414k);
            aVar.f4414k = null;
            c4.b.i(aVar.f4415l);
            aVar.f4414k = null;
            c4.b.j(aVar.f4408c);
            aVar.f4408c = 0;
            w wVar = aVar.D;
            if (wVar != null) {
                c4.b.i(wVar.f4842g);
                wVar.f4842g = null;
                c4.b.j(wVar.f4838c);
                wVar.f4838c = 0;
                ArrayList arrayList2 = wVar.f4843h;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = wVar.i;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                wVar.f4843h = null;
                wVar.i = null;
            }
            aVar.D = null;
            i9++;
        }
        n nVar = this.f4498m;
        if (nVar != null) {
            c4.b.i(nVar.f4638c);
            c4.b.j(nVar.f4639d);
            nVar.f4650r = null;
        }
        m mVar = this.f4499n;
        if (mVar != null) {
            c4.b.j(mVar.i);
            c4.b.k(mVar.j);
        }
        r rVar = this.f4500o;
        if (rVar != null) {
            c4.b.i(rVar.f4739h);
            rVar.f4739h = null;
            c4.b.i(rVar.i);
            rVar.i = null;
            c4.b.i(rVar.f4738g);
            rVar.f4738g = null;
            c4.b.j(rVar.j);
            c4.b.j(rVar.f4740k);
            rVar.j = 0;
            rVar.f4740k = 0;
            rVar.f4742m = null;
            rVar.f4743n = null;
        }
        o oVar = this.q;
        if (oVar != null) {
            FloatBuffer floatBuffer = oVar.f4661f;
            if (floatBuffer != null) {
                floatBuffer.clear();
                oVar.f4661f = null;
            }
            int i10 = oVar.f4658c;
            if (i10 != 0) {
                GLES20.glDeleteProgram(i10);
                oVar.f4658c = 0;
            }
            oVar.f4663h = null;
        }
        q qVar = this.f4502r;
        if (qVar != null) {
            c4.b.k(qVar.f4699g);
            c4.b.i(qVar.f4692c);
            c4.b.i(qVar.f4694d);
            c4.b.j(qVar.f4698f);
        }
        e eVar = this.f4497l;
        if (eVar != null) {
            f fVar = eVar.G;
            ArrayList arrayList4 = eVar.f4486w;
            fVar.getClass();
            fVar.X = new ArrayList(arrayList4);
            c4.b.j(eVar.f4460c);
            int[] iArr2 = eVar.f4482s;
            if (iArr2 != null) {
                GLES20.glDeleteTextures(iArr2.length, iArr2, 0);
            }
            c4.b.i(eVar.q);
            c4.b.i(eVar.f4481r);
            arrayList4.clear();
        }
        l lVar = this.f4503s;
        if (lVar != null) {
            c4.b.j(lVar.f4594e);
            c4.b.k(lVar.f4596f);
        }
        b bVar = this.f4504t;
        if (bVar != null) {
            GLES20.glDeleteProgram(bVar.f4432e);
        }
        j jVar = this.f4505u;
        if (jVar != null) {
            c4.b.j(jVar.f4557d);
            c4.b.k(jVar.f4558e);
            c4.b.i(jVar.f4559f);
            c4.b.i(jVar.f4560g);
        }
        t tVar = this.f4506v;
        if (tVar != null) {
            c4.b.j(tVar.f4791g);
            c4.b.k(0);
            c4.b.i(tVar.f4792h);
            c4.b.i(tVar.i);
        }
        v vVar = this.f4507w;
        if (vVar != null) {
            c4.b.j(vVar.f4816c);
            c4.b.i(vVar.f4826o);
            ShortBuffer shortBuffer = vVar.f4827p;
            if (shortBuffer != null) {
                shortBuffer.clear();
            }
        }
        i iVar = this.f4508x;
        if (iVar != null) {
            c4.b.i(iVar.f4540k);
            c4.b.j(iVar.f4541l);
        }
        this.f4498m = null;
        this.f4499n = null;
        this.f4500o = null;
        this.q = null;
        this.f4502r = null;
        this.f4497l = null;
        this.f4503s = null;
        this.f4504t = null;
        this.f4506v = null;
        this.f4508x = null;
        if (z9) {
            s sVar = this.f4501p;
            if (sVar != null) {
                int[] iArr3 = sVar.f4776o;
                if (iArr3 != null) {
                    GLES20.glDeleteTextures(iArr3.length, iArr3, 0);
                }
                int[] iArr4 = sVar.f4777p;
                if (iArr4 != null) {
                    GLES20.glDeleteTextures(iArr4.length, iArr4, 0);
                }
                if (sVar.f4772l != null) {
                    while (true) {
                        FloatBuffer[] floatBufferArr = sVar.f4772l;
                        if (i >= floatBufferArr.length) {
                            break;
                        }
                        c4.b.i(floatBufferArr[i]);
                        sVar.f4772l[i] = null;
                        i++;
                    }
                }
                c4.b.i(sVar.f4773m);
                sVar.f4773m = null;
                c4.b.j(sVar.f4775n);
                sVar.f4778r = null;
                sVar.f4779s = null;
                sVar.f4780t = null;
            }
            this.f4501p = null;
            p pVar = this.f4495h;
            if (pVar != null) {
                c4.b.i(pVar.f4673g);
                pVar.f4673g = null;
                c4.b.i(pVar.f4672f);
                pVar.f4672f = null;
                c4.b.j(pVar.f4674h);
            }
            this.f4495h = null;
        }
    }

    public final void m0(int i) {
        ArrayList arrayList = this.f4496k;
        if (arrayList.size() > i) {
            int size = arrayList.size() - i;
            for (int i9 = 1; i9 < size; i9++) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x0a8e, code lost:
        if (r0 == 1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0aa5, code lost:
        if (r0 != 1) goto L224;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0() {
        /*
            Method dump skipped, instructions count: 3138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.f.n0():void");
    }

    public final void o0(int i, float[] fArr, float[] fArr2) {
        synchronized (this.f4496k) {
            try {
                if (i < this.f4496k.size()) {
                    a aVar = ((g) this.f4496k.get(i)).f4511a;
                    aVar.B = fArr;
                    aVar.C = fArr2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        long nanoTime = System.nanoTime();
        long j = this.M;
        if (j != -1) {
            float f9 = (float) (nanoTime - j);
            this.O = f9 / 1.0E9f;
            this.N = ((f9 / 1000000.0f) * 0.1f) + (this.N * 0.9f);
        }
        this.M = nanoTime;
        this.P = this.N / 1000.0f;
        this.f4491d.getClass();
        float f10 = this.P;
        Float f11 = this.S;
        if (f11 != null) {
            float f12 = this.V + f10;
            this.V = f12;
            float f13 = f12 / 3.0f;
            if (f13 >= 1.0f) {
                this.R = f11.floatValue();
                this.S = null;
            } else {
                float pow = (this.W * (f13 < 0.5f ? 4.0f * f13 * f13 * f13 : 1.0f - (((float) Math.pow((f13 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f))) + this.U;
                this.R = pow;
                if (pow >= 24.0f) {
                    this.R = pow - 24.0f;
                }
            }
            v0 v0Var = this.f4491d;
            v0Var.f2608x0 = this.R;
            v0Var.J1 = true;
            this.J.edit().putInt(this.i, (int) (this.R / 0.016666668f)).apply();
        }
        if (this.f4510z) {
            v0 v0Var2 = this.f4491d;
            if (v0Var2.i() != v0Var2.f2608x0) {
                v0Var2.J1 = true;
            }
            synchronized (this.f4496k) {
                try {
                    b bVar = this.f4504t;
                    GLES20.glBindFramebuffer(36160, bVar.f4438m);
                    GLES20.glViewport(0, 0, bVar.j, bVar.f4436k);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    n0();
                    b bVar2 = this.f4504t;
                    GLES20.glBindFramebuffer(36160, bVar2.f4439n);
                    GLES20.glViewport(0, 0, bVar2.j, bVar2.f4436k);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    b bVar3 = this.f4504t;
                    bVar3.f4437l = 0.0f;
                    bVar3.m0(bVar3.f4440o, false);
                    if (this.H) {
                        if (this.f4509y == 9) {
                        }
                        this.f4503s.k0(this.P);
                        this.f4507w.k0(this.P);
                        GLES20.glDisable(2929);
                        this.f4499n.k0();
                        b bVar4 = this.f4504t;
                        bVar4.getClass();
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glFlush();
                        GLES20.glViewport(0, 0, bVar4.j, bVar4.f4436k);
                        bVar4.k0();
                        this.f4504t.l0(this.Q);
                        this.q.k0();
                    }
                    t tVar = this.f4506v;
                    int i = this.f4504t.f4440o;
                    q qVar = this.f4502r;
                    float[] fArr = qVar.M0;
                    fArr[0] = qVar.f4707l;
                    fArr[1] = qVar.f4708m;
                    float[] fArr2 = qVar.f4733z;
                    v0 v0Var3 = this.f4491d;
                    tVar.k0(i, fArr, fArr2, v0Var3.f2554g2, v0Var3.f2558h2, this.f4492e, this.f4493f, this.O);
                    this.f4503s.k0(this.P);
                    this.f4507w.k0(this.P);
                    GLES20.glDisable(2929);
                    this.f4499n.k0();
                    b bVar42 = this.f4504t;
                    bVar42.getClass();
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glFlush();
                    GLES20.glViewport(0, 0, bVar42.j, bVar42.f4436k);
                    bVar42.k0();
                    this.f4504t.l0(this.Q);
                    this.q.k0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v96, types: [n2.u, java.lang.Object] */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i9) {
        float f9;
        int i10;
        float f10;
        int i11;
        int[] iArr;
        if (i == 0 || i9 == 0) {
            this.f4510z = false;
            return;
        }
        GLES20.glViewport(0, 0, i, i9);
        this.f4492e = i;
        this.f4493f = i9;
        k0();
        if (this.f4494g == null) {
            k0();
        }
        b bVar = this.f4504t;
        bVar.j = i;
        bVar.f4436k = i9;
        int M = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaOp4gT1gzV92jhwaKXBAYIgnbgv6ycr+UmTEm/ZEUr3w/b82MelkrwRmPhM5NCa0F3IRzoSttUJtBLiGc3raJTzBOFschXeWRdvY/9C3Bn2/7XvP5t+QHD/4JSklKsZ8p1xpW0UW02otikc2FqaKBQMw1W3hTrJFMKYB5CfsW7bYghqEeCboh84RWpjWdr67fg=="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItEzE4YLlflhTcRtN/7tyM6DEvFHWpTlXEp9HerHhRVzJNK8YkGiwi3P+DYsSUFh9UaOOO/8eQMqEKUWwiKZUO47u7BbER3oiqz1m9Ftglg2CdUpIiZypxEls1P48Kgw4J3pXiwo0hQs2ZHiB26koP11rRkMDYng1ToSpD8jlu0Ivk6B2ZSoPchm3cUAMdPCRBMHs8IbasGmZpQejImWPwTwMVNqHqL+B2KhuQinkfzxqYLdRkOpVp9G2SzG6piFDHWaAgoTdl4ueEk61gPWlnHuFMwEenHLjlFpdf7zbuxzYUti2l3tLi+nieRDAZ/4dWvl95N/dUG7yAsxVvva37tLPAwf5CGsvgpBsumK96GWdA7sRLRXpVSa8LonFhmGl7kxFLoXrR9+dqBwFv4VljLq9LtQizIMmDId+zJJzE8Fd5oC6lVO9QTw1UTfRCBEZ/EJSN77GBfGMJ+8KWvG5KxbP9BJ4jDG+ZmUe95BUjrxrXArB0duHk/n6E+j1w/mdQtirvDYYVG3mHtPV2VNiOQPAd/5v+KB3f4kazvIEpB9E2NZN4onB3EzLA4XnTgpKnPkIAzR845506UysptZiR5swZv76cO9isuLzT4rXAFi7jwyUd/oPantmpmJOnqzZsX/J8IvZR7iUKt2GtQT8CU5G2zs4GTgxveJjXgpgG0y3Pasvmjr939iJhwOIVWkTS4Fvn3LoNRmZO412IzJThSLVQZlhm0/ho0AMx3bfjEiidw8Q1+KgkbK2vupJw0Wc2MzAgWo24ADCe10hjRG//KU8fyCwQfVS5cm7Uu0T1yK9CnXfnsKGKjS1PnJIi73kOu/C/GPDB4HDMgNuMCwljzGdJpro3Yvi8AJyDK+omocWnS50+afiVTemJFbFiskYGuQz/s6r+T2davHUjiAVKTGtlPbzf5wU4J1euVf5S9kswwuO+/XXEBbJO20wppiY2e/HloRKvM0gcEvIba4M5obCFmk+c/pObWmuktseyz3OjUZXN9eugxaqc50Ty355Tw=="));
        int glCreateProgram = GLES20.glCreateProgram();
        bVar.f4432e = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(bVar.f4432e, M2);
        GLES20.glLinkProgram(bVar.f4432e);
        bVar.f4433f = GLES20.glGetAttribLocation(bVar.f4432e, "aPosition");
        bVar.f4434g = GLES20.glGetAttribLocation(bVar.f4432e, "aTexCoord");
        bVar.f4435h = GLES20.glGetUniformLocation(bVar.f4432e, "uTexture");
        bVar.i = GLES20.glGetUniformLocation(bVar.f4432e, "uTexOffset");
        float[] fArr = b.f4429w;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        bVar.f4430c = asFloatBuffer;
        asFloatBuffer.put(fArr);
        bVar.f4430c.position(0);
        float f11 = i;
        float f12 = i9;
        this.f4494g.q0(f11, f12);
        e eVar = this.f4497l;
        eVar.B = i;
        eVar.C = i9;
        float f13 = f11 / f12;
        eVar.D = f13;
        eVar.q = c4.b.q(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        eVar.f4481r = c4.b.q(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        float[] fArr2 = eVar.E;
        float f14 = eVar.D;
        Matrix.orthoM(fArr2, 0, -f14, f14, -1.0f, 1.0f, -10.0f, 10.0f);
        m mVar = this.f4499n;
        mVar.getClass();
        GLES20.glViewport(0, 0, i, i9);
        mVar.f4617c = i;
        mVar.f4618d = i9;
        c4.b.k(mVar.j);
        c4.b.j(mVar.i);
        String l5 = q4.b.l("ch7DYGGJXo0oFQmp/ccnQGlJtP3OForzSm9yC+k6OjgN+2QxMmR54e8N8YQKHWhYQETy6qDKSGpM0ZpKx3dSpXMAWQf3KThutV8K2/JnZm5OXzXaIOgclHKYSvWGRq+SZoczDV6Z3cLhsCAfReBKBndm3MYzMqX58QTOohPrHNOD4davDQAEfs/J/ClQ1QxYRoUheDoKXETAdp/fYaHnoZrDbZJA1gZF89JTrEyiQ4q2c+iz99TpisiviByTt+LWaLloUHCnJ983aa/D+gkRdfQEpQ4zM42MnmaYfiX4L5S4oFsdv8hBatPFuLcuwSKf4AtRQmEVrYVhnkqx0O5QYuc3Stbk4TMFvumSXD2ZQmIYVfcXFP6uShCOdO8J2Fid4Sh3yDAn58TCGFT5z/l9RKa8zC2+aRk8RL7C1C4MDxE=");
        String l9 = q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzYxfWIvnOvaJW+Vz8RjvGBU36j+kOzS2+uhP2xJUBIbGGv9DdGmh3z+MsKfvMn8ICoPTjN60cEZOHpgsPC0QBgBqCdj7mDnMAHxMWLMlkS/8spfq0gaIBwB59ldFlJD2wtsYZhXtOrtIjz6yzOcTcwiRpL3AB3PzhrtdHn8jzji2RwYqYpmgg7ZgAdka+tviw8Qtzf9PGY2V/p+JADFujW672y4BfQtPBATqn6uDkHN9likAhnTmFpSEBEKg4guNPB9PjpSfZq1FbmYZmG27f4HKgcH1cANsWFUBoqMlAraoEOOLvobpI96tcGBEU1zbo8kxuCsMUxG55+Pd2Hk+RH4moG15HYoH02mryDPQSOA7A==");
        int glCreateProgram2 = GLES20.glCreateProgram();
        int M3 = c4.b.M(35633, l5);
        int M4 = c4.b.M(35632, l9);
        GLES20.glAttachShader(glCreateProgram2, M3);
        GLES20.glAttachShader(glCreateProgram2, M4);
        GLES20.glLinkProgram(glCreateProgram2);
        GLES20.glGetUniformLocation(glCreateProgram2, "u_MVPMatrix");
        mVar.f4623k = GLES20.glGetUniformLocation(glCreateProgram2, "u_Texture");
        GLES20.glGetUniformLocation(glCreateProgram2, "uZ");
        mVar.f4624l = GLES20.glGetAttribLocation(glCreateProgram2, "a_Position");
        mVar.f4625m = GLES20.glGetAttribLocation(glCreateProgram2, "a_TexCoord");
        mVar.f4626n = GLES20.glGetAttribLocation(glCreateProgram2, "a_Alpha");
        mVar.f4627o = GLES20.glGetUniformLocation(glCreateProgram2, "u_snowColor");
        mVar.f4628p = GLES20.glGetUniformLocation(glCreateProgram2, "uX");
        mVar.i = glCreateProgram2;
        Bitmap createBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f15 = 64 / 2.0f;
        paint.setShader(new RadialGradient(f15, f15, f15, -1, 0, Shader.TileMode.CLAMP));
        canvas.drawCircle(f15, f15, f15, paint);
        mVar.j = c4.b.N(createBitmap);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(80000);
        allocateDirect.order(ByteOrder.nativeOrder());
        mVar.f4620f = allocateDirect.asFloatBuffer();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(12000);
        allocateDirect2.order(ByteOrder.nativeOrder());
        mVar.f4621g = allocateDirect2.asShortBuffer();
        short[] sArr = new short[6000];
        int i12 = 0;
        while (i12 < 1000) {
            int i13 = i12 * 4;
            int i14 = i12 * 6;
            int i15 = i12;
            sArr[i14] = (short) i13;
            short s5 = (short) (i13 + 1);
            sArr[i14 + 1] = s5;
            short s9 = (short) (i13 + 2);
            sArr[i14 + 2] = s9;
            sArr[i14 + 3] = s9;
            sArr[i14 + 4] = s5;
            sArr[i14 + 5] = (short) (i13 + 3);
            i12 = i15 + 1;
        }
        mVar.f4621g.put(sArr);
        mVar.f4621g.position(0);
        mVar.l0();
        c4.b.a0(mVar.f4636y, mVar.f4637z, mVar.A, -1.0f, 1.0f, -1.0f, 1.0f);
        mVar.f4633v = i2.m.d().e("rain");
        r rVar = this.f4500o;
        rVar.f4736e = i;
        rVar.f4737f = i9;
        String l10 = q4.b.l("iNTFXzuz/36A/EciPxE9nxmBuVOdJr+0bBPLt6M4vZdb84nbfsYK7yyG8nPXKJNc2DZTwNWSDZ1QQzaSWDw4vE5/49cRuLDcEphJ6zaKXQeUnHKzpoViJ1vwnkXUQOPcwwtgdUOMgkvfOde4YA9/W7CCJt/St2/qSx7jJxCrP1pYHV+0timCbiVbM0X3xA/diKyQK5r378hx1MkRQrkAXY4stC/kBFNDnhPLWBMQMOsWNqprK5SHgL/Ba4Ec4nthlWRoigqeO4TzHzeb8eSmEVcfOWb2TZaBn2vYwOLAlfiQTmrCaJmgxXh524UrZiD5T5iHGIPUO0iGTcOhUDhuJg==");
        String l11 = q4.b.l("KOd+G86ICKS0CZskYfaItChDyj7X1xDlt3w9NqcSKLENXJCVQigic85A/smgfmejJNhXZLjqx4+AMzvwNBs+sICYt8tvrfao3SbvtGEbU2msXAZZoFQEIOx9WEsoKK4zjOBGvgHCQZflW84I2gOuySgBpttrF4+vyquF5Kk4B/csiLHoB2jf5ckxvekc270UMllzVTVGR94EeZQn5Sq2e7yu0CrJnk/KtcfQTV+sN3RBvSmiAUUsJgRXMY3nexw/VniwbKIDgzrQpUINuehq9eA1tGAYKYhEZRDHUqprC/URYMRPq0b4B6iRsjptW2910FI5V05cBjWxdfeftAMHL5xqXzKJzMRrRP9itA5nTc01w2Hu6+hrwNMChzNHM7VXGaKbo+w1D5q4W89k4RbE92nGJIO9gsdDzTqxVUVvAHUl2SJtTQaGUwxcYKGJu7rktOIDq1OvNZugumIKl7orDk/y29GKL1/cttumskHJ0vyyUzrPBDPkQQN5ywN32vsG");
        int M5 = c4.b.M(35633, l10);
        int M6 = c4.b.M(35632, l11);
        int glCreateProgram3 = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram3, M5);
        GLES20.glAttachShader(glCreateProgram3, M6);
        GLES20.glLinkProgram(glCreateProgram3);
        rVar.j = glCreateProgram3;
        String l12 = q4.b.l("iNTFXzuz/36A/EciPxE9nxmBuVOdJr+0bBPLt6M4vZdb84nbfsYK7yyG8nPXKJNc2DZTwNWSDZ1QQzaSWDw4vE5/49cRuLDcEphJ6zaKXQeUnHKzpoViJ1vwnkXUQOPcwwtgdUOMgkvfOde4YA9/W7CCJt/St2/qSx7jJxCrP1pYHV+0timCbiVbM0X3xA/diKyQK5r378hx1MkRQrkAXY4stC/kBFNDnhPLWBMQMOsWNqprK5SHgL/Ba4Ec4nthlWRoigqeO4TzHzeb8eSmEVcfOWb2TZaBn2vYwOLAlfiQTmrCaJmgxXh524UrZiD5T5iHGIPUO0iGTcOhUDhuJg==");
        String l13 = q4.b.l("KOd+G86ICKS0CZskYfaItChDyj7X1xDlt3w9NqcSKLG93w01kTZYkSoK7s/NTyNaEqS6dtF3ZwopvmOs8t9NEl/Y1diZST/wvKanYyvcYIoXYlALnGDcDgl/PXMppwaciMnK9Mme/39Gj59TsrP2+w==");
        int M7 = c4.b.M(35633, l12);
        int M8 = c4.b.M(35632, l13);
        int glCreateProgram4 = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram4, M7);
        GLES20.glAttachShader(glCreateProgram4, M8);
        GLES20.glLinkProgram(glCreateProgram4);
        rVar.f4740k = glCreateProgram4;
        c4.b.a0(rVar.f4753y, rVar.f4754z, rVar.A, -1.0f, 1.0f, -1.0f, 1.0f);
        Context context = rVar.f4735d;
        rVar.W = t1.z(context).getBoolean(context.getString(2131952391), true);
        float applyDimension = TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
        float[] fArr3 = new float[2];
        GLES20.glGetFloatv(33902, fArr3, 0);
        rVar.L = Math.min(fArr3[1], Math.max(fArr3[0], applyDimension));
        rVar.M = GLES20.glGetAttribLocation(rVar.j, "vPosition");
        rVar.N = GLES20.glGetAttribLocation(rVar.j, "a_TexCoord");
        rVar.O = GLES20.glGetUniformLocation(rVar.j, "u_MVPMatrix");
        rVar.P = GLES20.glGetUniformLocation(rVar.j, "u_red");
        rVar.Q = GLES20.glGetUniformLocation(rVar.j, "u_green");
        rVar.R = GLES20.glGetUniformLocation(rVar.j, "u_blue");
        rVar.S = GLES20.glGetUniformLocation(rVar.j, "u_alpha");
        rVar.T = GLES20.glGetAttribLocation(rVar.f4740k, "vPosition");
        rVar.U = GLES20.glGetAttribLocation(rVar.f4740k, "a_Alpha");
        rVar.V = GLES20.glGetUniformLocation(rVar.f4740k, "u_MVPMatrix");
        n nVar = this.f4498m;
        nVar.f4654v = f11;
        nVar.f4646m = f13;
        Matrix.setIdentityM(nVar.f4655w, 0);
        Matrix.setIdentityM(nVar.f4656x, 0);
        Matrix.setIdentityM(nVar.f4657y, 0);
        Matrix.orthoM(nVar.f4656x, 0, 0.0f, f11, f12, 0.0f, -10.0f, 10.0f);
        float f16 = f12;
        s sVar = this.f4501p;
        sVar.f4759d = f11;
        sVar.f4761e = f16;
        c4.b.j(sVar.f4775n);
        sVar.f4775n = 0;
        int M9 = c4.b.M(35633, q4.b.l("43XE9/ssbp/rM5RbQZ+B94Fkf99XYURv7W93MrIerilrg0M9JYxP6RoVtXcZ0lEPTOP35kSx2MyHiEBmZLrMVloJMnI2sLBNRWbuonwgoBA28CxrODwvAAcN+VFf+uTxVDhEp9WfH9rdOtAwXMxxTnL8CufwwXEIIIUBGeqa7Xv2RqQzADgICMOyburVbeoiTIdYq23zVl6rvEgIT5Fghq28lVlYgyv0vVpfJC5IWywQPuR771s3A4Ua6DXVc9Lk/1AOAwZRr39K0VlGP+22gmAlISnIwYUfKmOhWloPuVI="));
        int M10 = c4.b.M(35632, q4.b.l("43XE9/ssbp/rM5RbQZ+B9770YSmwDXUFdrqYRL1wVLgL6CKtbZqKQv5NvdPVny8OvwOD4v0hnte/vG3S9MrwaluQxVfVDQqleODwrUqOckXaFTBn8apIevYiL7R9ZI4gfXZ+9qfm5lbDjWL63+rzidvlAWgo3jC1ejk6UeD7oyMIhvJuqRALd0wdpUnex970lbd04jrpsWlxSzTGvrwToezlx5l9v7KQp/ZdbEKIWwQiqV+YdR0++5ISBHWGrMVZb3t3lXo/nwUnt9z7jgG/zoWoUdMt4Nai1PnB9tOZcixKsTX00hs8HS+D3f5EBK3Uhm6KzhiRH5+UPD2XuPfoCkAug9ujz/jT4ISdwcU31b4Y0jCACXtmdrERtTkQt7fYDyRjl66mwaqf8bYDSZ9Khcx4QNGNucuU3isrJk2Qf/4s+BhtWVgNQHK9XcWkANxVRdy91BMw8wERwi0DLcxugY+S0Qnn6AY40o4NANqs565dYC5kT95g/QheSKLCQU+cRYMBn9AWblFqckGhrVo/6Cl8EhsU52L98lbzd4bxLgZXRc2g62qdLPkkwkjY5DG3vhKjZ2cZZFWmy+AUuU6v6Dh3VMkAe9GiaTxFyA9FSI21Onecs/VcX/gO28VJoYMX2O86NIHYlirH3MUFxJT07yzAIz4b+j6UqRzAI63Tgd25TjJL5F3DmdqSPdVHkEXXUtk+ntuOqN7pICXb2KCkNedjqsTqIDFN2/xRr2g6qdL9buELuGO57WfOjuqyeC65CpJvEKiLwV3jl2N4XIBB5r1KcrmGOTIhFhVBtS3/i7+X10cejbQX76CbcqQ08u6w7yu/2UPw4WIFJD49yvufb3M+wJLTLNb7eQI49tzANHBOHdDoWwwWhdX7eYybJqkgsGFyK+AB5UgxtoNmGLqlWbPu1c7r/P+NRwemvY3rSJyRIWMRSGxd6kN2CFM0ll0GOYbDq50PmUlz3pAHffEmcSm3wxspsNRbMyCDnozovFEauSXI7OP00PnZPbVc/WUvUuTlPVal3qMjcKH0yCS091cajwJJwzzVYeRwgOi27cktV+LcSPYWrjDOt/ukrA2lQcwz3+zen9oiJ7bpURIfV1h6Lurcq8j+ltSkibQ8Eoo="));
        int glCreateProgram5 = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram5, M9);
        GLES20.glAttachShader(glCreateProgram5, M10);
        GLES20.glLinkProgram(glCreateProgram5);
        sVar.f4775n = glCreateProgram5;
        sVar.W = GLES20.glGetAttribLocation(glCreateProgram5, "vPosition");
        sVar.X = GLES20.glGetAttribLocation(sVar.f4775n, "aTexCoord");
        sVar.Y = GLES20.glGetUniformLocation(sVar.f4775n, "uTexture");
        sVar.Z = GLES20.glGetUniformLocation(sVar.f4775n, "uGradientTexture");
        sVar.f4755a0 = GLES20.glGetUniformLocation(sVar.f4775n, "screenSize");
        sVar.f4756b0 = GLES20.glGetUniformLocation(sVar.f4775n, "uMVPMatrix");
        sVar.f4758c0 = GLES20.glGetUniformLocation(sVar.f4775n, "invBoxH");
        sVar.f4760d0 = GLES20.glGetUniformLocation(sVar.f4775n, "boxY");
        sVar.f4762e0 = GLES20.glGetUniformLocation(sVar.f4775n, "uColor");
        sVar.f0 = GLES20.glGetUniformLocation(sVar.f4775n, "u_HDR");
        SharedPreferences sharedPreferences = sVar.A;
        sVar.U = sharedPreferences.getInt(sVar.V, 100);
        ArrayList arrayList = sVar.l0;
        Context context2 = sVar.f4757c;
        arrayList.add(t1.A(context2, 2131231391));
        arrayList.add(t1.A(context2, 2131231387));
        arrayList.add(t1.A(context2, 2131231388));
        arrayList.add(t1.A(context2, 2131231389));
        arrayList.add(t1.A(context2, 2131231390));
        if (!sharedPreferences.getBoolean(sVar.q, false)) {
            arrayList.add(t1.A(context2, 2131231503));
            arrayList.add(t1.A(context2, 2131231506));
        }
        sVar.f4777p = new int[]{c4.b.O(context2, 2131231505), c4.b.O(context2, 2131231507)};
        sVar.f4771k0 = sharedPreferences.getBoolean(context2.getString(2131951819), true);
        sVar.l0(Calendar.getInstance().get(2) + 1 == 12 && sVar.f4771k0);
        sVar.f4772l = new FloatBuffer[sVar.O.length];
        sVar.f4773m = c4.b.q(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        int length = sVar.O.length;
        int[] iArr2 = new int[length];
        sVar.f4776o = iArr2;
        GLES20.glGenTextures(length, iArr2, 0);
        Drawable[] drawableArr = sVar.O;
        sVar.f4763f = new float[drawableArr.length];
        sVar.f4764g = new float[drawableArr.length];
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr2 = sVar.O;
            if (i16 >= drawableArr2.length) {
                break;
            }
            Drawable drawable = drawableArr2[i16];
            Bitmap createBitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            int i17 = i16;
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            float width = createBitmap2.getWidth() / createBitmap2.getHeight();
            float f17 = sVar.f4759d / sVar.f4761e;
            if (f17 > width) {
                sVar.f4763f[i17] = width / f17;
                sVar.f4764g[i17] = 1.0f;
            } else {
                sVar.f4763f[i17] = 1.0f;
                sVar.f4764g[i17] = f17 / width;
            }
            sVar.f4772l[i17] = c4.b.q(c4.b.A());
            GLES20.glBindTexture(3553, sVar.f4776o[i17]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, createBitmap2, 0);
            createBitmap2.recycle();
            i16 = i17 + 1;
        }
        c4.b.a0(sVar.f4781u, sVar.f4782v, sVar.f4783w, -1.0f, 1.0f, -1.0f, 1.0f);
        float f18 = sVar.f4759d / sVar.f4761e;
        if (f18 > 1.0f) {
            sVar.f4766h = -f18;
            sVar.i = f18;
            sVar.j = -1.0f;
            sVar.f4770k = 1.0f;
        } else {
            sVar.f4766h = -1.0f;
            sVar.i = 1.0f;
            sVar.j = (-1.0f) / f18;
            sVar.f4770k = 1.0f / f18;
        }
        q qVar = this.f4502r;
        qVar.f4717r = f11;
        qVar.f4719s = f16;
        qVar.f4721t = f13;
        Context context3 = qVar.f4696e;
        qVar.G = t1.z(context3).getBoolean(qVar.H, true);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        qVar.f4692c = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{-0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f, -0.5f}).position(0);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        qVar.f4694d = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        int M11 = c4.b.M(35633, q4.b.l("ch7DYGGJXo0oFQmp/ccnQDZ+phPWIgMUaCT3wTQ9iJq6cBam5Dgh613rVzNs8qHwAUL8faqoQRbnqpoITbE8oq6PARRN4PNZJXdo/8P1PC2Od+cZAY3vIFRUPQrtVozQgz5eR6YVoHZaQMpZUoIOMhKKLP/1txXMHKc8+Hy3E2nVlu+C7MLBTIOpzcxSRrLoKeOn1QYZCViUDtk7KvMBAl7+vgU6AkG8hml3Pbm4jLt49xM57uZpQV0mSJNUqF0KOK8w61SPuqDLfmzjbHviL3WLX8js7/ge/cjliBtNwSUkf56QZlaTpF+qVqMIRj7lHBnfBIBN/dm/bM9RAq21Dh4KxFTe3OC9sjk27cw5M5JkOWcMPZcXQskZ4mBotvVPNjT14YVHswfGJ5uywIdwNDUwg/Q/lKxaXsu+7hLb9ABp9L0m8V0cIe3SGgzDlf66ESvA60hdwWT6hKS6/vE4GUTCZAzseXB2l0TeE1UVmYCsIkY0NAN1fOhqqserhpYwVlDVagryQmu7OHF1IUSSdo5uI0brT6LbGR2x2BfuAs92hFBHJ5j8ZClCWApALMx0YH343UkwVReswvAIH26bCMjtyTAIMu3Klog5kdkbmfo="));
        int M12 = c4.b.M(35632, q4.b.l("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"));
        int glCreateProgram6 = GLES20.glCreateProgram();
        qVar.f4698f = glCreateProgram6;
        GLES20.glAttachShader(glCreateProgram6, M11);
        GLES20.glAttachShader(qVar.f4698f, M12);
        GLES20.glLinkProgram(qVar.f4698f);
        float f19 = qVar.f4719s;
        float f20 = qVar.f4717r;
        int i18 = f19 > f20 ? (int) (0.1f * f19) : (int) (f20 * 0.1f);
        float f21 = i18;
        qVar.f4731y = (f19 / f21) * 0.12f;
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        qVar.f4699g = iArr3[0];
        float f22 = f21 / 2.0f;
        float f23 = f22 * f22;
        float f24 = 0.6f * f22;
        float f25 = f24 * f24;
        Bitmap createBitmap3 = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
        int[] iArr4 = new int[i18 * i18];
        int i19 = 0;
        while (i19 < i18) {
            int i20 = 0;
            while (i20 < i18) {
                float f26 = f25;
                float f27 = (i20 - f22) + 0.5f;
                float f28 = (i19 - f22) + 0.5f;
                float f29 = (f28 * f28) + (f27 * f27);
                if (f29 <= f26) {
                    iArr4[(i19 * i18) + i20] = -1;
                    i10 = i18;
                    f10 = f16;
                    i11 = i20;
                    iArr = iArr4;
                } else if (f29 <= f23) {
                    i10 = i18;
                    f10 = f16;
                    double min = 1.0f - Math.min(Math.max((float) Math.sqrt((f29 - f26) / (f23 - f26)), 0.0f), 1.0f);
                    i11 = i20;
                    iArr = iArr4;
                    iArr[(i19 * i10) + i11] = (((int) (((float) Math.pow(min, 2.5d)) * 255.0f)) << 24) | 16777215;
                } else {
                    i10 = i18;
                    f10 = f16;
                    i11 = i20;
                    iArr = iArr4;
                    iArr[(i19 * i10) + i11] = 0;
                }
                i20 = i11 + 1;
                iArr4 = iArr;
                f25 = f26;
                i18 = i10;
                f16 = f10;
            }
            i19++;
            f25 = f25;
        }
        int i21 = i18;
        float f30 = f16;
        createBitmap3.setPixels(iArr4, 0, i21, 0, 0, i21, i21);
        GLES20.glBindTexture(3553, qVar.f4699g);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, createBitmap3, 0);
        createBitmap3.recycle();
        qVar.f4709m0 = GLES20.glGetAttribLocation(qVar.f4698f, "aPosition");
        qVar.f4713o0 = GLES20.glGetAttribLocation(qVar.f4698f, "aTexCoord");
        qVar.f4715p0 = GLES20.glGetUniformLocation(qVar.f4698f, "uPosition");
        qVar.f4716q0 = GLES20.glGetUniformLocation(qVar.f4698f, "uScale");
        qVar.f4718r0 = GLES20.glGetUniformLocation(qVar.f4698f, "uTexture");
        qVar.f4720s0 = GLES20.glGetUniformLocation(qVar.f4698f, "uInnerRadius");
        qVar.f4722t0 = GLES20.glGetUniformLocation(qVar.f4698f, "uGlowPower");
        qVar.f4724u0 = GLES20.glGetUniformLocation(qVar.f4698f, "uSunCenterY");
        qVar.f4726v0 = GLES20.glGetUniformLocation(qVar.f4698f, "uSunSize");
        qVar.f4728w0 = GLES20.glGetUniformLocation(qVar.f4698f, "uHorizonY");
        qVar.f4730x0 = GLES20.glGetUniformLocation(qVar.f4698f, "uColor");
        qVar.f4711n0 = GLES20.glGetUniformLocation(qVar.f4698f, "uRot");
        qVar.B0 = GLES20.glGetUniformLocation(qVar.f4698f, "uPumpkinTex");
        qVar.C0 = GLES20.glGetUniformLocation(qVar.f4698f, "uAspect_Ratio");
        qVar.f4706k0 = qVar.E0.getBoolean(context3.getString(2131951819), true);
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.get(1), 9, 26);
        qVar.f4704j0 = calendar.equals(gregorianCalendar) || (calendar.after(gregorianCalendar) && calendar.before(new GregorianCalendar(calendar.get(1), 10, 1)));
        qVar.f4732y0 = t1.M(context3, 2131231397);
        int M13 = t1.M(context3, 2131231398);
        qVar.z0 = M13;
        if (qVar.f4704j0 && qVar.f4706k0) {
            M13 = qVar.f4732y0;
        }
        qVar.A0 = M13;
        c4.b.a0(qVar.f4693c0, qVar.f4695d0, qVar.f4697e0, -1.0f, 1.0f, -1.0f, 1.0f);
        p pVar = this.f4495h;
        pVar.getClass();
        GLES20.glViewport(0, 0, i, i9);
        pVar.f4670d = i;
        pVar.f4671e = i9;
        c4.b.j(pVar.f4674h);
        int M14 = c4.b.M(35633, q4.b.l("KOd+G86ICKS0CZskYfaItAqhEKncxfasEyPvT4HKllw8IuxBI8UYNCxcz17HYcJsD28fsZ8se4Hybg23XL0eEo26+3ZZRIIp2vPUfPtIpU6K9z3d6OxiuqgBWXlRzfd28kllXtxryEaDYQtwsqP0K8hYQv0K4ZSZXEELAn6q2wZB7S17WLvWq7SdC1vh7i9ABK/eogxLcbAp6drytk91UYv3Hsa7J75k8RsS5wHAkZXaNM2GRs5u9APCFf5vc3DiOXQKtIhExXLZAEckCdgLXUGJy4kwSMxwSLYEyeIeShgPeEewlpg/VSdWvidgwzIoJ3OsPZYwITs5/8kr4jAMhIe8wduFeEl8YzdX2Jq60LgRNOpTnroCXLc7oKZltJXfs/tHaaWD1rYYD2dtHc+LFoxwkB+XiWA58jS1IzfeDeg2D6L6oE9/s7WyraK+HIAD9b5Dv2+hzwXBBFv1gPmEjrLm9A//O3r4HSgTrCjZRVHOPfidwDN/razHFTHOtnaq9EvHRs0zTtUZLW6vAo0pbNtKYyHwFeL3YSzQwPG4un560Q4OBXPjjm1G1HcOxLGtZoHjUx0Xgax6ek10RuvlGTIO9/e4ZQBDz7N0RX04ddf520PzQoVuWfI7PTz5LqAzu2eOZuzI2EKgf7v/oHHnPIJJESNhmy1MV7AHZlriVKo="));
        int M15 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItAqhEKncxfasEyPvT4HKllw8IuxBI8UYNCxcz17HYcJsJUeBNlvlPBF16LBRqUfTYLQW5d1slIJl5inqvvKH3vf9qS1g2UjJURVDaJfH5q0dG6vlmWBM7hw3/AYjfkcAZ02UodRO3Ef1giFdyee6kN7LJcVtj0aPIGCzDDKYyKMUAS8/2uvFVI9IZ5+9MQmEn1putS9QC2rAm5gHkVaYDQANk6epYsjBbyMGEt6y8kckiA1/OsUzKLGcvva6H95HgrcXViK6GYMcl5Be5Ff95yxYBe6mkbxIF0WLT+ZocAv2fyAm4OMdWUnAVAqFFeoeSEnn7P0TMIPOLm3QX8gF9oGWZ4Ga/5mWR05n9Am5aOoN4nAlojT+iC59SBHPuETtdKXf1sqRxSTZHyV6AVGo01Hn7YxFhAoCcstF/IakF3xg"));
        int glCreateProgram7 = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram7, M14);
        GLES20.glAttachShader(glCreateProgram7, M15);
        GLES20.glLinkProgram(glCreateProgram7);
        int[] iArr5 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram7, 35714, iArr5, 0);
        if (iArr5[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram7);
        }
        pVar.i = GLES20.glGetAttribLocation(glCreateProgram7, "a_Position");
        pVar.j = GLES20.glGetAttribLocation(glCreateProgram7, "a_Alpha");
        pVar.f4675k = GLES20.glGetAttribLocation(glCreateProgram7, "a_Size");
        pVar.f4676l = GLES20.glGetUniformLocation(glCreateProgram7, "u_Color");
        pVar.f4674h = glCreateProgram7;
        Context context4 = pVar.f4668c;
        pVar.F = t1.z(context4).getBoolean("night", false);
        pVar.G = t1.z(context4).getBoolean("isDay", false);
        c4.b.a0(pVar.W, pVar.X, pVar.Y, -1.0f, 1.0f, -1.0f, 1.0f);
        pVar.q = GLES20.glGetUniformLocation(pVar.f4674h, "u_starType");
        pVar.O = pVar.T.getInt("hemisphere", 1);
        l lVar = this.f4503s;
        lVar.f4604m = i;
        lVar.f4605n = i9;
        lVar.f4615y = lVar.f4592d.getInt("secondaryHintColor", 0);
        float f31 = lVar.f4605n * 0.05f;
        lVar.D = f31;
        lVar.W = f31;
        lVar.X = f31;
        lVar.m0(0.005f, 0.015f);
        float f32 = lVar.f4604m;
        lVar.f4607p = 0.008f * f32;
        lVar.q = f32 * 0.016f;
        lVar.f4610t = 5.0f;
        lVar.f4611u = 10.0f;
        lVar.f4612v = -5.0f;
        lVar.f4613w = 5.0f;
        lVar.n0(0);
        Matrix.setIdentityM(lVar.i, 0);
        Matrix.setIdentityM(lVar.j, 0);
        Matrix.setIdentityM(lVar.f4602k, 0);
        Matrix.orthoM(lVar.j, 0, 0.0f, f11, f30, 0.0f, -10.0f, 10.0f);
        lVar.G = f11;
        lVar.H = f30;
        if (m2.a.d()) {
            j jVar = this.f4505u;
            jVar.f4568r = f11;
            jVar.f4569s = f30;
            int M16 = c4.b.M(35633, q4.b.l("31CvLSW49ZsWqEJmlVijDDdAoq6h4MhYrB3Gp+jaLYn6qcQaX5fc2ysd4A/rIOM6NiS5iAdVx/SKYcvjL0CM/ACRZ/awXabKMJZrzUK96ERfReDeVKzEgd62RIEhmYSP8LJ5EBVf1o7AoBqgh446W6MCj4924oidVR0qx6KDEVlwRbLGF3itIouFf/PwEOWNtbr4cmxFrhnkL+dOl7Yq8HXJ39umWK/bLymreeiIitzYQXR9nDz+iPFtzdo/iei5dyHRsQwdcCv/2X4m39AMzA=="));
            int M17 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzYxfWIvnOvaJW+Vz8RjvGBU2DDl9761DwP0H3WO2jeI//JCSTnVRxpXwAEtKU92nQ5wOyzvggfeeSoG7h21FCll0MRZBmtgO8vFfRfGgm7S+jGEyKfiIOl3ERMcNk4xB/93hc1uN8jZI5nGekGGYmO0kl7GROWRa2Y9t/duqTx2cgTpWui2qquhLVaUN6ck1UBXnuC3f16iZ0o3+YV8IrTlMQD7TKoMDo1vlc10FTIZb2gTqyVb5V/i32VmeWsPb6lzpFJpVrYddrH3b3+X8PPJRl/PwKYZDGcKY2KejDiyde4WxBaw9MLh7KvJ+MHrv/e7+e9fD9dpv+16Et+nXGEFHCKaKQ8D77RbJf7y3kFB67upIyITpmCC7uT1cWYUVRADOPbzG2jYOYM+HrPOD9qt"));
            f9 = 0.05f;
            c4.b.g0(jVar.f4557d, jVar.f4564m, jVar.f4565n, jVar.f4566o, 0.0f);
            int glCreateProgram8 = GLES20.glCreateProgram();
            jVar.f4557d = glCreateProgram8;
            GLES20.glAttachShader(glCreateProgram8, M16);
            GLES20.glAttachShader(jVar.f4557d, M17);
            GLES20.glLinkProgram(jVar.f4557d);
            jVar.f4561h = GLES20.glGetAttribLocation(jVar.f4557d, "a_Position");
            jVar.i = GLES20.glGetAttribLocation(jVar.f4557d, "a_TexCoordinate");
            jVar.j = GLES20.glGetUniformLocation(jVar.f4557d, "u_MVPMatrix");
            jVar.f4562k = GLES20.glGetUniformLocation(jVar.f4557d, "u_TextureSampler");
            jVar.f4563l = GLES20.glGetUniformLocation(jVar.f4557d, "uAlpha");
            Context context5 = jVar.f4556c;
            jVar.f4558e = c4.b.O(context5, 2131231356);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            jVar.f4559f = c4.b.q(c4.b.A());
            jVar.f4560g = c4.b.q(j.f4555x);
            Matrix.setIdentityM(jVar.f4564m, 0);
            jVar.f4570t = f13;
            c4.b.a0(jVar.f4564m, jVar.f4565n, jVar.f4566o, -f13, f13, -1.0f, 1.0f);
            jVar.f4572v = jVar.f4571u.getBoolean(context5.getString(2131951819), true);
        } else {
            f9 = 0.05f;
        }
        this.f4506v.f4787c = i;
        v vVar = this.f4507w;
        vVar.f4832v = f11;
        vVar.f4834x = 10.0f;
        float f33 = f13 * 10.0f;
        vVar.f4833w = f33;
        Matrix.orthoM(vVar.f4828r, 0, (-f33) / 2.0f, f33 / 2.0f, -5.0f, 5.0f, -10.0f, 10.0f);
        for (int i22 = 0; i22 < 7; i22++) {
            u[] uVarArr = vVar.f4830t;
            ?? obj = new Object();
            uVarArr[i22] = obj;
            vVar.m0(obj, true);
        }
        i iVar = this.f4508x;
        int i23 = this.f4492e;
        float f34 = this.f4493f;
        float f35 = i23 / f34;
        iVar.j = f34;
        iVar.f4539h = -1.0f;
        iVar.i = 1.0f;
        iVar.f4537f = -f35;
        iVar.f4538g = f35;
        Matrix.setIdentityM(iVar.f4535d, 0);
        Matrix.orthoM(iVar.f4535d, 0, iVar.f4537f, iVar.f4538g, iVar.f4539h, iVar.i, -10.0f, 10.0f);
        v0 v0Var = this.f4491d;
        v0Var.f2533b.f4508x.G = v0Var.f2536c.getBoolean(v0Var.F, true);
        this.f4491d.I1 = true;
        this.f4491d.K1 = true;
        this.f4491d.L1 = true;
        this.f4491d.J1 = true;
        this.H = this.f4491d.P1;
        this.f4510z = true;
        this.S = null;
        m2.a.e(this.f4490c);
        float f36 = this.J.getInt(this.j, 0) * f9;
        this.Q = f36;
        b bVar2 = this.f4504t;
        bVar2.f4437l = f36;
        int[] iArr6 = new int[1];
        GLES20.glGenFramebuffers(1, iArr6, 0);
        bVar2.f4438m = iArr6[0];
        int[] iArr7 = new int[1];
        GLES20.glGenTextures(1, iArr7, 0);
        int i24 = iArr7[0];
        bVar2.f4440o = i24;
        GLES20.glBindTexture(3553, i24);
        GLES20.glTexImage2D(3553, 0, 6408, bVar2.j, bVar2.f4436k, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindFramebuffer(36160, bVar2.f4438m);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, bVar2.f4440o, 0);
        int[] iArr8 = new int[1];
        GLES20.glGenRenderbuffers(1, iArr8, 0);
        int i25 = iArr8[0];
        GLES20.glBindRenderbuffer(36161, i25);
        GLES20.glRenderbufferStorage(36161, 33189, bVar2.j, bVar2.f4436k);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, i25);
        GLES20.glBindFramebuffer(36160, 0);
        int[] iArr9 = new int[1];
        GLES20.glGenFramebuffers(1, iArr9, 0);
        bVar2.f4439n = iArr9[0];
        int[] iArr10 = new int[1];
        GLES20.glGenTextures(1, iArr10, 0);
        int i26 = iArr10[0];
        bVar2.f4441p = i26;
        GLES20.glBindTexture(3553, i26);
        GLES20.glTexImage2D(3553, 0, 6408, bVar2.j, bVar2.f4436k, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindFramebuffer(36160, bVar2.f4439n);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, bVar2.f4441p, 0);
        GLES20.glBindFramebuffer(36160, 0);
        bVar2.f4445u = Math.max(1, bVar2.j / 4);
        bVar2.f4446v = Math.max(1, bVar2.f4436k / 4);
        int[] iArr11 = new int[1];
        GLES20.glGenFramebuffers(1, iArr11, 0);
        bVar2.q = iArr11[0];
        int[] iArr12 = new int[1];
        GLES20.glGenTextures(1, iArr12, 0);
        int i27 = iArr12[0];
        bVar2.f4442r = i27;
        GLES20.glBindTexture(3553, i27);
        GLES20.glTexImage2D(3553, 0, 6408, bVar2.f4445u, bVar2.f4446v, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindFramebuffer(36160, bVar2.q);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, bVar2.f4442r, 0);
        GLES20.glBindFramebuffer(36160, 0);
        int[] iArr13 = new int[1];
        GLES20.glGenFramebuffers(1, iArr13, 0);
        bVar2.f4443s = iArr13[0];
        int[] iArr14 = new int[1];
        GLES20.glGenTextures(1, iArr14, 0);
        int i28 = iArr14[0];
        bVar2.f4444t = i28;
        GLES20.glBindTexture(3553, i28);
        GLES20.glTexImage2D(3553, 0, 6408, bVar2.f4445u, bVar2.f4446v, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindFramebuffer(36160, bVar2.f4443s);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, bVar2.f4444t, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        Objects.requireNonNull(this.f4491d.f2570l1);
        this.E = 2;
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        i iVar = this.f4508x;
        if (iVar != null) {
            iVar.k0(this.f4490c, this.J);
        }
    }

    public final void p0(float f9) {
        o oVar = this.q;
        if (oVar != null) {
            oVar.f4665l = f9 != 0.0f;
            if (oVar.f4662g != f9) {
                oVar.f4662g = Math.max(0.0f, Math.min(1.0f, f9));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(boolean r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f4496k
            monitor-enter(r0)
            r1 = 0
            r2 = r1
        L5:
            java.util.ArrayList r3 = r9.f4496k     // Catch: java.lang.Throwable -> L27
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            if (r2 >= r3) goto L44
            java.util.ArrayList r3 = r9.f4496k     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L27
            n2.g r3 = (n2.g) r3     // Catch: java.lang.Throwable -> L27
            int r4 = r9.f4509y     // Catch: java.lang.Throwable -> L27
            r5 = 4
            r6 = 1
            if (r4 == r5) goto L29
            r5 = 8
            if (r4 == r5) goto L29
            r5 = 5
            if (r4 != r5) goto L2b
            int r4 = r9.E     // Catch: java.lang.Throwable -> L27
            if (r2 == r4) goto L2b
            goto L29
        L27:
            r10 = move-exception
            goto L46
        L29:
            if (r10 == 0) goto L2d
        L2b:
            r4 = r6
            goto L2e
        L2d:
            r4 = r1
        L2e:
            n2.h r3 = r3.f4512b     // Catch: java.lang.Throwable -> L27
            float r5 = r3.f4517g     // Catch: java.lang.Throwable -> L27
            float r7 = r3.f4518h     // Catch: java.lang.Throwable -> L27
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 < 0) goto L3c
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r6 = r1
        L3c:
            r3.J = r6     // Catch: java.lang.Throwable -> L27
            r3.q0(r5, r7)     // Catch: java.lang.Throwable -> L27
            int r2 = r2 + 1
            goto L5
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.f.r0(boolean):void");
    }

    public final void s0(int i, int i9, Bitmap bitmap, float[] fArr, float[] fArr2, float f9, float f10, float f11, float f12, float f13) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        m0(i);
        synchronized (this.f4496k) {
            try {
                if (i9 < this.f4496k.size()) {
                    g gVar = (g) this.f4496k.get(i9);
                    w wVar = gVar.f4511a.D;
                    if (wVar != null) {
                        wVar.f4843h.clear();
                        wVar.i.clear();
                    }
                    t0(gVar, bitmap, fArr, fArr2, f9, f10, f11, f12, f13);
                } else {
                    Context context = this.f4490c;
                    if (this.f4509y != 3) {
                    }
                    g gVar2 = new g(new a(), new h(context, true));
                    this.f4496k.add(gVar2);
                    t0(gVar2, bitmap, fArr, fArr2, f9, f10, f11, f12, f13);
                    gVar2.a(this.f4492e, this.f4493f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u0(float[] fArr, int i) {
        if (fArr.length < 8) {
            return;
        }
        synchronized (this.f4496k) {
            try {
                if (i < this.f4496k.size()) {
                    ((g) this.f4496k.get(i)).f4512b.p0(fArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v0(float f9, float f10, int i) {
        w wVar;
        synchronized (this.f4496k) {
            try {
                if (i < this.f4496k.size() && (wVar = ((g) this.f4496k.get(i)).f4511a.D) != null) {
                    wVar.f4848o = f9;
                    wVar.f4849p = f10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
