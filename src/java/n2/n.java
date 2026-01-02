package n2;

import android.content.Context;
import android.opengl.GLES20;
import i2.k0;
import j5.t1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n extends c4.b {

    /* renamed from: c  reason: collision with root package name */
    public FloatBuffer f4638c;

    /* renamed from: d  reason: collision with root package name */
    public int f4639d;

    /* renamed from: e  reason: collision with root package name */
    public int f4640e;

    /* renamed from: f  reason: collision with root package name */
    public int f4641f;

    /* renamed from: g  reason: collision with root package name */
    public int f4642g;

    /* renamed from: h  reason: collision with root package name */
    public int f4643h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f4644k;

    /* renamed from: r  reason: collision with root package name */
    public float[] f4650r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4651s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4652t;

    /* renamed from: u  reason: collision with root package name */
    public float f4653u;

    /* renamed from: v  reason: collision with root package name */
    public float f4654v;

    /* renamed from: l  reason: collision with root package name */
    public float f4645l = 0.35f;

    /* renamed from: m  reason: collision with root package name */
    public float f4646m = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f4649p = 3.0f;
    public float q = 0.015f;

    /* renamed from: w  reason: collision with root package name */
    public final float[] f4655w = new float[16];

    /* renamed from: x  reason: collision with root package name */
    public final float[] f4656x = new float[16];

    /* renamed from: y  reason: collision with root package name */
    public final float[] f4657y = new float[16];

    /* renamed from: n  reason: collision with root package name */
    public float f4647n = ((-1.0f) + 3.0f) - (3.0f * 0.05f);

    /* renamed from: o  reason: collision with root package name */
    public float f4648o = -0.5f;

    public n(Context context) {
        k0(true);
        this.f4651s = t1.z(context).getBoolean(context.getResources().getString(2131952262), true);
    }

    public final void k0(boolean z9) {
        double d9;
        c4.b.i(this.f4638c);
        if (z9) {
            Random random = k0.f2392a;
            this.f4649p = random.nextFloat() + 2.0f;
            this.q = (random.nextFloat() * 0.005f) + 0.01f;
            float f9 = this.f4649p;
            this.f4647n = ((random.nextFloat() - 2.0f) + f9) - (f9 * 0.05f);
        }
        this.f4648o = -2.2f;
        float f10 = this.f4647n;
        float f11 = this.f4649p;
        float[] fArr = new float[156];
        fArr[0] = f10;
        fArr[1] = -2.2f;
        fArr[2] = 0.0f;
        int i = 3;
        for (int i9 = 0; i9 <= 50; i9++) {
            fArr[i] = (((float) Math.cos((i9 * 3.1415927f) / 50.0f)) * f11) + f10;
            int i10 = i + 2;
            fArr[i + 1] = (((float) Math.sin(d9)) * f11) - 2.2f;
            i += 3;
            fArr[i10] = 0.0f;
        }
        this.f4650r = fArr;
        c4.b.i(this.f4638c);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f4650r.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f4638c = asFloatBuffer;
        asFloatBuffer.put(this.f4650r);
        this.f4638c.position(0);
        c4.b.j(this.f4639d);
        int M = c4.b.M(35633, q4.b.l("iNTFXzuz/36A/EciPxE9n3yeZtJq6OKnizaKeP/pP01crsZhY4zoPTaEYPgL66r7acEXT1BSEfWZC6s5Io9nkS+JXGbq4FAWWOLjanvqsezNHtYfqX9dxVef/bKuL/WYVD+VAZfrRwpHNgyBcQpxZWfPkUUqn6LjpCRplTVgWUNd6VrKdc2aMRM9KcbcAIy2dPYOeY9GMVMwOJWocB3e/jmVIk+rquFCSCHTQnP8YGU/KGTWyW3oXMJ3zDNIA5V24TRD4xLGbXgKsokuwoIalYPbHLR0CgnITOccxeWh/hQ7lrcjwzAOLKw8NJD90C4rU2jpBrBZZmy6hpaTkeNRImNZsIQHugr/Boka4kBVv/4Acb+7NwY3dVaiv4uocpWVyvVUb3e9jacI/0I4w3ornJCjkb1a8PhZpag2aFNpFEBDCYKxBLNoUM7zFPDGy36xdjKZ+3bEtf8cyzqIX+LuaKSBIl1FRrO86gX1Rit/ol3XSDzlOEOQXv4/MJLggRnn4L0/hMEL24KMlk6WECYeatz7ypQ3z6csnVuTtwMmpUbOgva+t+MikwzxAv3mwQSbvoPgPf/MFXkPBe4jp244qtIhHThK0MiUtOrh+YkwBGKSx44n35R/07dlujtRaOlXHaoP1zDUG3PIPNjQmO5LmDtoi+pOYstR4yPFhJVzMhg="));
        int M2 = c4.b.M(35632, q4.b.l("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"));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4639d = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4639d, M2);
        GLES20.glLinkProgram(this.f4639d);
        c4.b.a0(this.f4655w, this.f4656x, this.f4657y, -1.0f, 1.0f, -1.0f, 1.0f);
        this.f4640e = GLES20.glGetAttribLocation(this.f4639d, "vPosition");
        this.f4641f = GLES20.glGetUniformLocation(this.f4639d, "uAlpha");
        this.f4642g = GLES20.glGetUniformLocation(this.f4639d, "uAspectRatio");
        this.f4643h = GLES20.glGetUniformLocation(this.f4639d, "uCenter");
        this.i = GLES20.glGetUniformLocation(this.f4639d, "uRadius");
        this.j = GLES20.glGetUniformLocation(this.f4639d, "step");
        this.f4644k = GLES20.glGetUniformLocation(this.f4639d, "uOffsetX");
    }
}
