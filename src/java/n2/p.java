package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p extends c4.b {
    public final float[][] E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public float I;
    public final int[] J;
    public final int[] K;
    public final int[] L;
    public final float[][] M;
    public final float[][] N;
    public int O;
    public float P;
    public float Q;
    public final float R;
    public Random S;
    public final SharedPreferences T;
    public long U;
    public final q V;
    public final float[] W;
    public final float[] X;
    public final float[] Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f4666a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4667b0;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4668c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4669c0;

    /* renamed from: d  reason: collision with root package name */
    public int f4670d;

    /* renamed from: e  reason: collision with root package name */
    public int f4671e;

    /* renamed from: f  reason: collision with root package name */
    public FloatBuffer f4672f;

    /* renamed from: g  reason: collision with root package name */
    public FloatBuffer f4673g;

    /* renamed from: h  reason: collision with root package name */
    public int f4674h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f4675k;

    /* renamed from: l  reason: collision with root package name */
    public int f4676l;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f4679o;

    /* renamed from: p  reason: collision with root package name */
    public final float[] f4680p;
    public int q;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f4677m = new float[30000];

    /* renamed from: n  reason: collision with root package name */
    public final float[] f4678n = new float[16];

    /* renamed from: r  reason: collision with root package name */
    public final float[] f4681r = new float[2];

    /* renamed from: s  reason: collision with root package name */
    public final float[] f4682s = new float[2];

    /* renamed from: t  reason: collision with root package name */
    public final boolean[] f4683t = new boolean[2];

    /* renamed from: u  reason: collision with root package name */
    public final float[] f4684u = new float[2];

    /* renamed from: v  reason: collision with root package name */
    public final float[] f4685v = new float[2];

    /* renamed from: w  reason: collision with root package name */
    public final float[] f4686w = new float[2];

    /* renamed from: x  reason: collision with root package name */
    public final float[] f4687x = new float[2];

    /* renamed from: y  reason: collision with root package name */
    public final float[] f4688y = new float[2];

    /* renamed from: z  reason: collision with root package name */
    public final float[] f4689z = new float[2];
    public final float[] A = new float[2];
    public final float[] B = new float[2];
    public final float[] C = new float[2];
    public final float[] D = new float[2];

    public p(Context context, q qVar, SharedPreferences sharedPreferences) {
        Class cls = Float.TYPE;
        this.E = (float[][]) Array.newInstance(cls, 2, 4);
        this.H = true;
        this.S = new Random();
        this.U = System.nanoTime();
        this.W = new float[16];
        this.X = new float[16];
        this.Y = new float[16];
        this.f4668c = context;
        this.V = qVar;
        this.T = sharedPreferences;
        for (int i = 0; i < 2; i++) {
            this.f4681r[i] = (this.S.nextFloat() * 2.0f) + 0.5f;
        }
        this.E[0] = new float[]{0.75f, 0.75f, 0.75f, 0.75f};
        this.R = i2.m.d().e("stars");
        this.f4667b0 = sharedPreferences.getBoolean(context.getString(2131952342), true);
        this.f4669c0 = sharedPreferences.getBoolean(context.getString(2131951784), true);
        this.f4679o = new float[7500];
        this.f4680p = new float[7500];
        this.L = new int[7500];
        this.M = (float[][]) Array.newInstance(cls, 7500, 2);
        this.N = (float[][]) Array.newInstance(cls, 7500, 2);
        this.J = new int[7500];
        this.K = new int[7500];
        c4.b.i(this.f4672f);
        c4.b.i(this.f4673g);
        this.f4672f = ByteBuffer.allocateDirect(120000).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4673g = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public final void k0(long j) {
        int[] iArr;
        q qVar = this.V;
        this.P = qVar.f0;
        this.Q = qVar.f4700g0;
        this.S = new Random(j);
        float hypot = (float) Math.hypot(this.f4670d * 3.0f, this.f4671e * 3.0f);
        float[][] fArr = this.M;
        if (fArr == null || fArr.length == 0 || fArr[0].length == 0 || (iArr = this.J) == null || iArr.length == 0) {
            return;
        }
        for (int i = 0; i < this.M.length; i++) {
            this.f4679o[i] = this.S.nextInt(2) + 2;
            float sqrt = ((float) Math.sqrt(this.S.nextFloat())) * hypot;
            double nextFloat = (float) (this.S.nextFloat() * 2.0d * 3.141592653589793d);
            this.M[i][0] = (((float) Math.cos(nextFloat)) * sqrt) + this.P;
            this.M[i][1] = (sqrt * ((float) Math.sin(nextFloat))) + this.Q;
            int nextInt = 230 - this.S.nextInt(80);
            this.L[i] = Color.rgb(nextInt, nextInt, nextInt);
            this.J[i] = 5 - this.S.nextInt(10);
        }
    }
}
