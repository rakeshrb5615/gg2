package i2;

import android.app.WallpaperColors;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.hardware.SensorEvent;
import android.os.Build;
import android.view.MotionEvent;
import j5.t1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class v0 {
    public final String A;
    public float[] A1;
    public final String B;
    public float[] B1;
    public final String C;
    public float C1;
    public final String D;
    public boolean D0;
    public float D1;
    public final String E;
    public boolean E0;
    public float[][] E1;
    public final String F;
    public boolean F0;
    public final float[] F1;
    public final String G;
    public boolean G0;
    public final float[] G1;
    public final String H;
    public boolean H0;
    public int H1;
    public final String I;
    public boolean I0;
    public volatile boolean I1;
    public final String J;
    public Bitmap[] J0;
    public volatile boolean J1;
    public final String K;
    public volatile boolean K1;
    public final String L;
    public float[] L0;
    public volatile boolean L1;
    public final String M;
    public float[] M0;
    public volatile boolean M1;
    public final String N;
    public long N0;
    public volatile boolean N1;
    public final String O;
    public Random O0;
    public volatile boolean O1;
    public String P;
    public boolean P1;
    public final l Q1;
    public final int[][] R;
    public boolean R0;
    public final Bitmap R1;
    public final int[][] S;
    public final int[] S1;
    public final int[][] T;
    public final int[] T1;
    public float U0;
    public final float[] U1;
    public final int[][] V;
    public long V0;
    public final float[] V1;
    public final int[][] W;
    public float W0;
    public final int[] W1;
    public final int[][] X;
    public float X0;
    public final int[] X1;
    public final int[][] Y;
    public float Y0;
    public final float[] Y1;
    public final int[][] Z;
    public float Z1;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2529a;

    /* renamed from: a0  reason: collision with root package name */
    public final int[][] f2530a0;

    /* renamed from: a1  reason: collision with root package name */
    public int f2531a1;

    /* renamed from: a2  reason: collision with root package name */
    public float f2532a2;

    /* renamed from: b  reason: collision with root package name */
    public final n2.f f2533b;

    /* renamed from: b0  reason: collision with root package name */
    public final int[][] f2534b0;
    public int b1;

    /* renamed from: b2  reason: collision with root package name */
    public float f2535b2;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f2536c;

    /* renamed from: c0  reason: collision with root package name */
    public final int[][] f2537c0;

    /* renamed from: c1  reason: collision with root package name */
    public final int[][] f2538c1;

    /* renamed from: c2  reason: collision with root package name */
    public final float[] f2539c2;

    /* renamed from: d  reason: collision with root package name */
    public final String f2540d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f2541d0;

    /* renamed from: d1  reason: collision with root package name */
    public final int[][] f2542d1;

    /* renamed from: d2  reason: collision with root package name */
    public final int[] f2543d2;

    /* renamed from: e  reason: collision with root package name */
    public float f2544e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f2545e0;

    /* renamed from: e1  reason: collision with root package name */
    public final int[] f2546e1;

    /* renamed from: e2  reason: collision with root package name */
    public final float[] f2547e2;

    /* renamed from: f  reason: collision with root package name */
    public float f2548f;
    public final int f0;

    /* renamed from: f1  reason: collision with root package name */
    public final int[] f2549f1;

    /* renamed from: f2  reason: collision with root package name */
    public final int[] f2550f2;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2551g;

    /* renamed from: g0  reason: collision with root package name */
    public final int f2552g0;

    /* renamed from: g1  reason: collision with root package name */
    public final int[] f2553g1;

    /* renamed from: g2  reason: collision with root package name */
    public final float[] f2554g2;

    /* renamed from: h  reason: collision with root package name */
    public final a f2555h;

    /* renamed from: h0  reason: collision with root package name */
    public final int f2556h0;

    /* renamed from: h1  reason: collision with root package name */
    public final int[] f2557h1;

    /* renamed from: h2  reason: collision with root package name */
    public final float[] f2558h2;
    public final w0 i;

    /* renamed from: i0  reason: collision with root package name */
    public final int f2559i0;

    /* renamed from: i1  reason: collision with root package name */
    public int f2560i1;

    /* renamed from: i2  reason: collision with root package name */
    public long f2561i2;
    public final String j;

    /* renamed from: j0  reason: collision with root package name */
    public final int f2562j0;

    /* renamed from: j1  reason: collision with root package name */
    public int f2563j1;

    /* renamed from: j2  reason: collision with root package name */
    public volatile float f2564j2;

    /* renamed from: k  reason: collision with root package name */
    public final String f2565k;

    /* renamed from: k0  reason: collision with root package name */
    public final int f2566k0;

    /* renamed from: k1  reason: collision with root package name */
    public i f2567k1;

    /* renamed from: k2  reason: collision with root package name */
    public boolean f2568k2;

    /* renamed from: l  reason: collision with root package name */
    public final String f2569l;
    public final int l0;

    /* renamed from: l1  reason: collision with root package name */
    public q0 f2570l1;

    /* renamed from: l2  reason: collision with root package name */
    public boolean f2571l2;

    /* renamed from: m  reason: collision with root package name */
    public final String f2572m;

    /* renamed from: m0  reason: collision with root package name */
    public final int f2573m0;

    /* renamed from: m1  reason: collision with root package name */
    public final Paint f2574m1;

    /* renamed from: m2  reason: collision with root package name */
    public final boolean[] f2575m2;

    /* renamed from: n  reason: collision with root package name */
    public final String f2576n;

    /* renamed from: n0  reason: collision with root package name */
    public final int f2577n0;
    public final float[] n1;

    /* renamed from: n2  reason: collision with root package name */
    public final float[] f2578n2;

    /* renamed from: o  reason: collision with root package name */
    public final String f2579o;

    /* renamed from: o0  reason: collision with root package name */
    public final int f2580o0;

    /* renamed from: o1  reason: collision with root package name */
    public final boolean[] f2581o1;

    /* renamed from: o2  reason: collision with root package name */
    public final float[] f2582o2;

    /* renamed from: p  reason: collision with root package name */
    public final String f2583p;

    /* renamed from: p0  reason: collision with root package name */
    public final int f2584p0;

    /* renamed from: p1  reason: collision with root package name */
    public final float[] f2585p1;

    /* renamed from: p2  reason: collision with root package name */
    public final int[] f2586p2;
    public final String q;

    /* renamed from: q0  reason: collision with root package name */
    public final int f2587q0;

    /* renamed from: q1  reason: collision with root package name */
    public final float[] f2588q1;

    /* renamed from: r  reason: collision with root package name */
    public final String f2589r;

    /* renamed from: r0  reason: collision with root package name */
    public final int f2590r0;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f2591r1;

    /* renamed from: s  reason: collision with root package name */
    public final String f2592s;

    /* renamed from: s0  reason: collision with root package name */
    public final int f2593s0;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f2594s1;

    /* renamed from: t  reason: collision with root package name */
    public final String f2595t;

    /* renamed from: t0  reason: collision with root package name */
    public final int f2596t0;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f2597t1;

    /* renamed from: u  reason: collision with root package name */
    public final String f2598u;

    /* renamed from: u0  reason: collision with root package name */
    public final int f2599u0;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f2600u1;

    /* renamed from: v  reason: collision with root package name */
    public final String f2601v;

    /* renamed from: v0  reason: collision with root package name */
    public final int f2602v0;

    /* renamed from: v1  reason: collision with root package name */
    public int f2603v1;

    /* renamed from: w  reason: collision with root package name */
    public final String f2604w;

    /* renamed from: w0  reason: collision with root package name */
    public Bitmap f2605w0;

    /* renamed from: w1  reason: collision with root package name */
    public final boolean[] f2606w1;

    /* renamed from: x  reason: collision with root package name */
    public final String f2607x;

    /* renamed from: x0  reason: collision with root package name */
    public float f2608x0;

    /* renamed from: x1  reason: collision with root package name */
    public final o0 f2609x1;

    /* renamed from: y  reason: collision with root package name */
    public final String f2610y;

    /* renamed from: y0  reason: collision with root package name */
    public float f2611y0;

    /* renamed from: y1  reason: collision with root package name */
    public final int f2612y1;

    /* renamed from: z  reason: collision with root package name */
    public final String f2613z;
    public float z0;

    /* renamed from: z1  reason: collision with root package name */
    public float[] f2614z1;
    public final int[] Q = new int[3];
    public final float[][] U = {new float[]{1.0f, 1.5f, 2.0f}, new float[]{1.0f, 1.5f, 2.0f}, new float[]{1.0f, 1.0f, 1.0f}, new float[]{1.1f, 2.0f, 1.5f}, new float[]{1.3f, 1.0f, 1.0f}, new float[]{1.0f, 1.5f, 2.0f}};
    public float A0 = 1.0f;
    public final float[] B0 = new float[6];
    public final float[] C0 = new float[6];
    public final Canvas K0 = new Canvas();
    public float P0 = 0.0f;
    public float Q0 = 0.0f;
    public boolean S0 = true;
    public boolean T0 = true;
    public final boolean Z0 = true;

    public v0(Context context, n2.f fVar, float f9, float f10, boolean z9) {
        String string;
        int i;
        Class cls = Integer.TYPE;
        this.f2538c1 = (int[][]) Array.newInstance(cls, 13, 2);
        this.f2542d1 = (int[][]) Array.newInstance(cls, 13, 2);
        this.f2546e1 = new int[13];
        this.f2549f1 = new int[13];
        this.f2553g1 = new int[13];
        this.f2557h1 = new int[13];
        this.f2560i1 = 1;
        this.f2563j1 = 1;
        new m2.a();
        this.f2574m1 = new Paint();
        this.n1 = new float[]{0.0f, 1.0f};
        this.f2581o1 = new boolean[6];
        this.f2585p1 = new float[]{1.0f, 0.5f, 0.0f};
        this.f2588q1 = new float[]{1.0f, 0.5f, 0.0f};
        this.f2594s1 = true;
        this.f2603v1 = 0;
        this.f2606w1 = new boolean[6];
        new Paint();
        this.F1 = new float[15];
        this.G1 = new float[15];
        this.I1 = true;
        this.J1 = true;
        this.K1 = true;
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.P1 = true;
        this.S1 = new int[15];
        this.T1 = new int[15];
        this.U1 = new float[15];
        this.V1 = new float[15];
        this.W1 = new int[4];
        this.X1 = new int[4];
        this.Y1 = new float[3];
        this.Z1 = 1.0f;
        this.f2532a2 = 24.0f;
        this.f2535b2 = 1.1999999f;
        this.f2539c2 = new float[3];
        this.f2543d2 = new int[3];
        this.f2547e2 = new float[12];
        this.f2550f2 = new int[4];
        this.f2554g2 = new float[3];
        this.f2558h2 = new float[3];
        this.f2564j2 = -1.0f;
        this.f2575m2 = new boolean[6];
        this.f2578n2 = new float[3];
        this.f2582o2 = new float[3];
        this.f2586p2 = new int[2];
        this.f2529a = context.getApplicationContext();
        this.f2544e = f9;
        this.f2548f = f10;
        this.f2551g = z9;
        SharedPreferences z10 = t1.z(context);
        this.f2536c = z10;
        this.f2551g = z9;
        this.f2544e = f9;
        this.f2548f = f10;
        this.I1 = true;
        C();
        if (fVar == null) {
            this.f2533b = new n2.f(context, this, z10);
        } else {
            this.f2533b = fVar;
        }
        Resources resources = context.getResources();
        this.R1 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
        this.f2541d0 = context.getColor(2131100606);
        this.f2545e0 = context.getColor(2131100607);
        this.f0 = context.getColor(2131100605);
        this.f2552g0 = context.getColor(2131100608);
        this.f2559i0 = context.getColor(2131100611);
        this.f2556h0 = context.getColor(2131100612);
        this.f2562j0 = context.getColor(2131100610);
        this.f2566k0 = context.getColor(2131100613);
        this.l0 = context.getColor(2131099792);
        context.getColor(2131100604);
        this.f2573m0 = context.getColor(2131100603);
        this.f2577n0 = context.getColor(2131099785);
        this.f2580o0 = context.getColor(2131099706);
        this.f2584p0 = context.getColor(2131099707);
        this.f2587q0 = context.getColor(2131099705);
        this.f2590r0 = context.getColor(2131099708);
        this.f2593s0 = context.getColor(2131099710);
        this.f2596t0 = context.getColor(2131099711);
        this.f2599u0 = context.getColor(2131099709);
        this.f2602v0 = context.getColor(2131099712);
        this.R = l.k(context, 2130903074, 2130903049, 2130903079, 2130903061);
        this.S = l.k(context, 2130903074, 2130903049, 2130903081, 2130903061);
        this.T = l.k(context, 2130903076, 2130903054, 2130903082, 2130903061);
        this.Z = l.k(context, 2130903075, 2130903051, 2130903080, 2130903062);
        this.f2530a0 = l.k(context, 2130903075, 2130903052, 2130903080, 2130903062);
        this.f2534b0 = l.k(context, 2130903075, 2130903050, 2130903080, 2130903062);
        this.f2537c0 = l.k(context, 2130903075, 2130903053, 2130903080, 2130903062);
        this.V = l.k(context, 2130903072, 2130903047, 2130903072, 2130903059);
        this.W = l.k(context, 2130903073, 2130903048, 2130903073, 2130903060);
        this.X = l.k(context, 2130903070, 2130903046, 2130903077, 2130903058);
        this.Y = l.k(context, 2130903071, 2130903046, 2130903078, 2130903062);
        System.getProperties().setProperty("sun.java2d.opengl", "true");
        this.j = resources.getString(2131951952);
        this.f2565k = resources.getString(2131952270);
        this.f2569l = resources.getString(2131952269);
        this.f2572m = resources.getString(2131952057);
        this.f2576n = resources.getString(2131952366);
        this.f2579o = resources.getString(2131952372);
        this.f2583p = resources.getString(2131952322);
        this.q = resources.getString(2131952321);
        String string2 = resources.getString(2131952326);
        this.f2540d = string2;
        String string3 = context.getString(2131951657);
        String string4 = context.getString(2131951656);
        this.f2595t = context.getString(2131951903);
        this.f2598u = context.getString(2131951749);
        this.f2601v = context.getString(2131952500);
        this.f2604w = context.getString(2131952383);
        this.f2607x = context.getString(2131952248);
        this.f2610y = context.getString(2131952249);
        this.f2613z = context.getString(2131951806);
        this.A = context.getString(2131952188);
        this.B = context.getString(2131951892);
        this.C = context.getString(2131952359);
        String string5 = context.getString(2131951799);
        this.D = string5;
        this.E = context.getString(2131952244);
        resources.getString(2131952361);
        this.F = resources.getString(2131952103);
        this.G = resources.getString(2131952366);
        this.H = resources.getString(2131952372);
        this.I = resources.getString(2131952301);
        this.J = resources.getString(2131952478);
        this.K = resources.getString(2131951809);
        this.L = resources.getString(2131952299);
        this.M = resources.getString(2131951735);
        this.f2589r = resources.getString(2131952433);
        this.f2592s = resources.getString(2131952320);
        this.N = resources.getString(2131951785);
        this.O = resources.getString(2131951803);
        this.N0 = Integer.parseInt(string);
        this.O0 = new Random(this.N0);
        this.f2563j1 = z10.getInt(string5, 1);
        z10.getBoolean(string3, false);
        int i9 = (int) (z10.getInt(string4, 0) * 0.9f);
        this.f2612y1 = i9;
        if (i9 <= 0) {
            i = 0;
        } else {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            new LinearGradient(0.0f, 0.0f, 0.0f, i9, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
            i = 0;
            new LinearGradient(0.0f, 0.0f, 0.0f, this.f2612y1, new int[]{-3355444, 0}, new float[]{0.0f, 1.0f}, tileMode);
        }
        this.f2531a1 = z10.getInt(string2, i);
        w0 w0Var = new w0(context, z10);
        this.i = w0Var;
        this.f2609x1 = o0.c(context);
        this.Q1 = l.l(context);
        if (this.f2531a1 == 7) {
            this.f2568k2 = true;
        }
        w();
        d();
        o(f9, f10, z9);
        this.f2555h = new a(this, w0Var, context);
        n(false, true);
        y();
        h();
    }

    public static int[][] e(int[][] iArr) {
        if (iArr == null) {
            return null;
        }
        int[][] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int[] iArr3 = new int[iArr[i].length];
            iArr2[i] = iArr3;
            int[] iArr4 = iArr[i];
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
        }
        return iArr2;
    }

    public final void A() {
        SharedPreferences sharedPreferences = this.f2536c;
        boolean z9 = sharedPreferences.getBoolean(this.j, false);
        boolean z10 = sharedPreferences.getBoolean(this.f2565k, false);
        String str = this.f2569l;
        boolean z11 = sharedPreferences.getBoolean(str, false);
        m2.a.a();
        this.f2611y0 = sharedPreferences.getFloat(this.G, 6.0f);
        this.z0 = sharedPreferences.getFloat(this.H, 18.0f);
        n2.f fVar = this.f2533b;
        if (z9 && fVar.A) {
            fVar.T = false;
            this.f2608x0 = m2.a.a();
        } else if (z10 && z11) {
            fVar.T = true;
            float nextFloat = this.O0.nextFloat() * 24.0f;
            if (fVar.T) {
                float f9 = fVar.f4491d.f2608x0;
                fVar.U = f9;
                fVar.R = f9;
                float f10 = nextFloat - f9;
                if (f10 < 0.0f) {
                    f10 += 24.0f;
                }
                fVar.W = f10;
                fVar.S = Float.valueOf(nextFloat);
                fVar.V = 0.0f;
            } else {
                fVar.S = null;
            }
            sharedPreferences.edit().putBoolean(str, false).apply();
        } else {
            fVar.T = false;
            this.f2608x0 = i();
        }
        float f11 = this.f2611y0;
        float f12 = this.A0;
        if (f11 + f12 >= this.z0 - f12) {
            this.A0 = f12 / 2.0f;
        }
        n2.e eVar = fVar.f4497l;
        if (eVar != null) {
            eVar.f4474k0 = this.f2608x0;
        }
    }

    public final void B() {
        float f9 = this.f2611y0;
        if (f9 == 0.0f && this.z0 == 0.0f) {
            this.f2611y0 = 6.0f;
            this.z0 = 18.0f;
        } else if (f9 == this.z0) {
            this.A0 = 0.0f;
        } else if (this.f2531a1 == 9) {
            this.A0 = 2.0f;
        } else {
            this.A0 = 1.0f;
        }
        float f10 = this.f2611y0;
        float f11 = this.A0;
        float[] fArr = this.B0;
        fArr[0] = f10 - f11;
        float[] fArr2 = this.C0;
        fArr2[0] = f10;
        fArr[1] = f10;
        float f12 = f10 + f11;
        fArr2[1] = f12;
        fArr[2] = f12;
        float f13 = this.z0;
        float f14 = f13 - f11;
        fArr2[2] = f14;
        fArr[3] = f14;
        fArr2[3] = f13;
        fArr[4] = f13;
        float f15 = f13 + f11;
        fArr2[4] = f15;
        fArr[5] = f15;
        fArr2[5] = f10 - f11;
        for (int i = 0; i < fArr.length; i++) {
            float f16 = fArr[i];
            if (f16 < 0.0f) {
                fArr[i] = f16 + 24.0f;
            }
        }
        SharedPreferences.Editor edit = this.f2536c.edit();
        edit.putFloat(this.f2604w, this.f2608x0);
        edit.apply();
    }

    public final void C() {
        if (this.f2531a1 == 5) {
            for (int i = 0; i < this.b1; i++) {
                float nextFloat = ((this.O0.nextFloat() * 2.0f) - 1.0f) * 0.07f;
                if (nextFloat >= 0.0f && nextFloat < 0.01f) {
                    nextFloat = 0.01f;
                } else if (nextFloat < 0.0f && nextFloat > -0.01f) {
                    nextFloat = -0.01f;
                }
                this.G1[i] = (nextFloat * this.f2544e) / 60.0f;
            }
        }
    }

    public final void a() {
        if (this.I1) {
            boolean z9 = this.f2536c.getBoolean(this.f2529a.getString(2131951838), true);
            this.P1 = z9;
            this.f2533b.H = z9;
            if (this.f2531a1 != 0 || z9) {
                this.f2536c.edit().putBoolean(this.f2529a.getString(2131951838), true).apply();
                this.P1 = true;
                this.f2533b.H = true;
            }
        }
    }

    public final void b() {
        float f9 = this.f2608x0;
        float f10 = this.f2611y0;
        float f11 = this.A0;
        boolean z9 = true;
        if (f9 >= f10 - f11 && f9 < f10) {
            this.E0 = true;
            this.G0 = true;
            this.D0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
        } else if (f9 >= f10 && f9 < f10 + f11) {
            this.E0 = false;
            this.G0 = true;
            this.D0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
        } else if (f9 < f10 + f11 || f9 >= this.z0 - f11) {
            float f12 = this.z0;
            if (f9 >= f12 - f11 && f9 < f12) {
                this.E0 = false;
                this.G0 = false;
                this.D0 = false;
                this.F0 = false;
                this.H0 = true;
                this.I0 = false;
            } else if (f9 < f12 || f9 > f12 + f11) {
                this.E0 = false;
                this.G0 = false;
                this.D0 = false;
                this.F0 = false;
                this.H0 = false;
                this.I0 = true;
            } else {
                this.E0 = false;
                this.G0 = false;
                this.D0 = false;
                this.F0 = true;
                this.H0 = true;
                this.I0 = false;
            }
        } else {
            this.E0 = false;
            this.G0 = false;
            this.D0 = true;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
        }
        SharedPreferences sharedPreferences = this.f2536c;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean[] zArr = this.f2606w1;
        int length = zArr.length;
        boolean[] zArr2 = this.f2581o1;
        System.arraycopy(zArr, 0, zArr2, 0, length);
        edit.putBoolean(this.f2607x, zArr2[2]);
        edit.putBoolean(this.f2610y, zArr2[5]);
        zArr[0] = this.E0;
        zArr[1] = this.G0;
        boolean z10 = this.D0;
        zArr[2] = z10;
        zArr[3] = this.F0;
        zArr[4] = this.H0;
        zArr[5] = this.I0;
        edit.putBoolean(this.f2613z, z10);
        edit.putBoolean(this.A, this.I0);
        String string = sharedPreferences.getString(this.J, this.K);
        this.P = string;
        float f13 = (this.f2591r1 || string.contains(this.C)) ? -1.0f : 0.1f;
        float f14 = this.f2608x0;
        if (f14 <= this.f2611y0 - f13 || f14 >= this.z0 + f13) {
            z9 = false;
        }
        edit.putBoolean(this.B, z9);
        edit.apply();
    }

    public final void c(String str) {
        boolean equals = str.equals(this.I);
        SharedPreferences sharedPreferences = this.f2536c;
        if (equals) {
            this.S0 = sharedPreferences.getBoolean(str, true);
            return;
        }
        Context context = this.f2529a;
        if (str.equalsIgnoreCase(context.getString(2131951874))) {
            this.T0 = sharedPreferences.getBoolean(str, true);
        } else if (str.equalsIgnoreCase(context.getString(2131952379))) {
            this.f2535b2 = sharedPreferences.getInt(str, 40) * 0.03f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0043, code lost:
        r4.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r8 = this;
            n2.f r0 = r8.f2533b
            java.util.ArrayList r1 = r0.f4496k
            monitor-enter(r1)
            i2.q0 r0 = r8.f2570l1     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r0 == 0) goto L12
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r0 = move-exception
            r5 = r8
            goto L68
        L12:
            r0 = r2
        L13:
            int r3 = r8.f2531a1     // Catch: java.lang.Throwable -> Lf
            r4 = 1
            if (r3 == 0) goto L1d
            if (r3 == r4) goto L1d
            r5 = 2
            if (r3 != r5) goto L1e
        L1d:
            r2 = r4
        L1e:
            i2.q0 r4 = r8.f2570l1     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L41
            if (r2 == 0) goto L26
            if (r0 == 0) goto L41
        L26:
            r5 = 3
            if (r3 == r5) goto L41
            r5 = 4
            if (r3 == r5) goto L41
            r5 = 5
            if (r3 == r5) goto L41
            r5 = 8
            if (r3 == r5) goto L41
            r5 = 9
            if (r3 != r5) goto L38
            goto L41
        L38:
            if (r0 == 0) goto L3f
            if (r2 == 0) goto L3f
            r4.a(r3)     // Catch: java.lang.Throwable -> Lf
        L3f:
            r5 = r8
            goto L56
        L41:
            if (r4 == 0) goto L46
            r4.g()     // Catch: java.lang.Throwable -> Lf
        L46:
            i2.q0 r2 = new i2.q0     // Catch: java.lang.Throwable -> Lf
            android.content.Context r3 = r8.f2529a     // Catch: java.lang.Throwable -> Lf
            int r4 = r8.f2531a1     // Catch: java.lang.Throwable -> Lf
            float r6 = r8.f2544e     // Catch: java.lang.Throwable -> Lf
            float r7 = r8.f2548f     // Catch: java.lang.Throwable -> Lf
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
            r5.f2570l1 = r2     // Catch: java.lang.Throwable -> L67
        L56:
            i2.q0 r0 = r5.f2570l1     // Catch: java.lang.Throwable -> L67
            android.graphics.Bitmap r2 = r0.E     // Catch: java.lang.Throwable -> L67
            r5.f2605w0 = r2     // Catch: java.lang.Throwable -> L67
            int r0 = r0.f2487b     // Catch: java.lang.Throwable -> L67
            r5.b1 = r0     // Catch: java.lang.Throwable -> L67
            android.graphics.Canvas r0 = r5.K0     // Catch: java.lang.Throwable -> L67
            r0.setBitmap(r2)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r0 = move-exception
        L68:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0126, code lost:
        if (r24.D0 != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] f() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.f():int[]");
    }

    public final void g() {
        synchronized (this.f2533b.f4496k) {
            try {
                Bitmap bitmap = this.R1;
                Bitmap[] bitmapArr = this.J0;
                if (bitmapArr != null) {
                    for (Bitmap bitmap2 : bitmapArr) {
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                    }
                    this.J0 = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                q0 q0Var = this.f2570l1;
                if (q0Var != null) {
                    q0Var.g();
                }
                i iVar = this.f2567k1;
                if (iVar != null) {
                    iVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x052b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.h():void");
    }

    public final float i() {
        float a10 = m2.a.a() / 0.016666668f;
        if (this.f2533b.A) {
            float f9 = this.f2536c.getInt(this.f2572m, (int) a10) * 0.016666668f;
            this.f2608x0 = f9;
            return f9;
        }
        return this.f2564j2;
    }

    public final boolean[] j() {
        boolean z9 = this.E0;
        boolean[] zArr = this.f2575m2;
        zArr[0] = z9;
        zArr[1] = this.G0;
        zArr[2] = this.D0;
        zArr[3] = this.H0;
        zArr[4] = this.F0;
        zArr[5] = this.I0;
        return zArr;
    }

    public final float[] k() {
        float[] fArr = this.n1;
        float f9 = fArr[0];
        float[] fArr2 = this.Y1;
        fArr2[0] = f9;
        fArr2[1] = fArr[0];
        fArr2[2] = fArr[1];
        return fArr2;
    }

    public final float[] l() {
        float f9 = this.f2611y0;
        float[] fArr = this.f2578n2;
        fArr[0] = f9;
        fArr[1] = this.f2608x0;
        fArr[2] = this.z0;
        return fArr;
    }

    public final WallpaperColors m() {
        int i = Build.VERSION.SDK_INT;
        if (i < 27) {
            return null;
        }
        int i9 = f()[0];
        float red = Color.red(i9) * 0.003921569f;
        float green = Color.green(i9) * 0.003921569f;
        float blue = Color.blue(i9) * 0.003921569f;
        Color valueOf = Color.valueOf(red, green, blue, 1.0f);
        boolean o9 = this.Q1.o();
        if (i >= 31) {
            return u0.a(valueOf, o9 ? 1 : 2);
        }
        int i10 = (int) (blue * 255.0f);
        float[] fArr = this.f2582o2;
        h0.a.b((int) (red * 255.0f), (int) (green * 255.0f), i10, fArr);
        fArr[2] = 0.7f;
        int a10 = h0.a.a(fArr);
        Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(a10);
        return WallpaperColors.fromBitmap(createBitmap);
    }

    public final void n(boolean z9, boolean z10) {
        w0 w0Var = this.i;
        String[] a10 = w0Var.a();
        boolean z11 = false;
        boolean[] b10 = w0Var.b(false);
        this.f2591r1 = b10[0];
        boolean z12 = b10[2];
        this.f2597t1 = z12;
        this.f2594s1 = !z12;
        boolean z13 = b10[3];
        this.f2600u1 = z13;
        if (this.f2531a1 != 3) {
            this.f2600u1 = z13 || b10[4];
        }
        if (b10[4]) {
            this.f2600u1 = true;
        }
        String str = this.f2595t;
        SharedPreferences sharedPreferences = this.f2536c;
        if (sharedPreferences.getBoolean(str, false)) {
            this.f2603v1 = Integer.parseInt(a10[1]);
        } else {
            String str2 = a10[0];
            String str3 = this.f2598u;
            this.f2603v1 = sharedPreferences.getInt(str3, 50);
            String str4 = this.E;
            this.H1 = sharedPreferences.getInt(str4, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (z9) {
                if (str2.equals("Sunny") || str2.equals("Clear")) {
                    this.f2603v1 = 0;
                    this.H1 = 0;
                } else if (str2.equals("Partly Cloudy")) {
                    this.f2603v1 = 30;
                    this.H1 = 0;
                } else if (str2.equals("Cloudy")) {
                    this.f2603v1 = 70;
                    this.H1 = 0;
                } else if (str2.equals("Overcast")) {
                    this.f2603v1 = 100;
                    this.H1 = 0;
                } else if (str2.equals("Rain") || str2.equals("Snow")) {
                    this.f2603v1 = 100;
                    this.H1 = 25;
                } else if (str2.equals("Thunderstorm")) {
                    this.f2603v1 = 100;
                    this.H1 = 0;
                } else if (str2.equals("Thunderstorm with rain")) {
                    this.f2603v1 = 100;
                    this.H1 = 25;
                } else if (str2.equals("Mist")) {
                    this.f2603v1 = 100;
                    this.H1 = 0;
                }
            }
            edit.putInt(str3, this.f2603v1);
            edit.putInt(str4, this.H1);
            edit.apply();
        }
        if (!z10) {
            v();
        }
        a aVar = this.f2555h;
        Context context = aVar.f2276b;
        String str5 = aVar.f2284l;
        String str6 = aVar.f2287o;
        aVar.I = a10[0];
        aVar.A = aVar.f2275a.f2531a1;
        SharedPreferences sharedPreferences2 = aVar.f2282h;
        boolean z14 = sharedPreferences2.getBoolean(aVar.j, false);
        aVar.J = aVar.I.toLowerCase();
        if (z14) {
            aVar.f2295x = Integer.parseInt(a10[1]);
        } else {
            aVar.f2295x = sharedPreferences2.getInt(aVar.f2283k, 50);
        }
        boolean z15 = aVar.i.b(true)[2];
        aVar.f2296y = !z15;
        aVar.f2297z = z15;
        aVar.F = aVar.J.contains(aVar.f2291t.toLowerCase());
        aVar.J.contains(aVar.f2292u.toLowerCase());
        if (!aVar.J.equals(str6.toLowerCase()) && !aVar.J.equals(str5.toLowerCase()) && !aVar.J.contains(aVar.q.toLowerCase()) && !aVar.J.contains(aVar.f2289r.toLowerCase()) && !aVar.J.contains(aVar.f2290s.toLowerCase())) {
            aVar.J.equals(aVar.f2288p.toLowerCase());
        }
        if (aVar.J.equalsIgnoreCase(aVar.f2285m) || aVar.J.equalsIgnoreCase(aVar.f2286n) || aVar.J.equalsIgnoreCase(str6) || aVar.J.equalsIgnoreCase(str5) || aVar.J.equalsIgnoreCase(context.getString(2131952087)) || aVar.J.equalsIgnoreCase(context.getString(2131951856))) {
            z11 = true;
        }
        aVar.K = z11;
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.putBoolean("isSnowing", aVar.f2297z);
        edit2.putBoolean("isRaining", aVar.f2296y);
        edit2.apply();
    }

    public final void o(float f9, float f10, boolean z9) {
        synchronized (this.f2533b.f4496k) {
            try {
                this.f2544e = f9;
                this.f2548f = f10;
                this.f2551g = z9;
                int i = this.b1;
                this.J0 = new Bitmap[i];
                this.f2570l1.c(this.f2531a1, this.f2560i1, z9, f9, f10);
                q0 q0Var = this.f2570l1;
                if (q0Var.f2493h) {
                    this.f2567k1 = q0Var.D;
                }
                C();
                q0 q0Var2 = this.f2570l1;
                Bitmap[] bitmapArr = q0Var2.q;
                this.J0 = bitmapArr;
                q0Var2.m(bitmapArr);
                this.L0 = this.f2570l1.B;
                this.M0 = new float[i];
                for (int i9 = 0; i9 < i; i9++) {
                    float[] fArr = this.M0;
                    if (i9 < fArr.length) {
                        float[] fArr2 = this.L0;
                        if (i9 < fArr2.length) {
                            fArr[i9] = (1.0f - fArr2[i9]) * f10;
                        }
                    }
                }
                n2.n nVar = this.f2533b.f4498m;
                if (nVar != null) {
                    nVar.k0(true);
                }
                this.E1 = (float[][]) Array.newInstance(Float.TYPE, 10, 8);
                this.f2570l1.Q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x084b  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, n2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 2662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.p():void");
    }

    public final void q(SensorEvent sensorEvent) {
        if (!this.T0) {
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            return;
        }
        float[] fArr = sensorEvent.values;
        boolean z9 = this.f2551g;
        float f9 = this.f2535b2;
        this.X0 = (fArr[z9 ? 1 : 0] * 0.6f * f9 * 0.25f) + (this.X0 * 0.75f);
        this.Y0 = (0.25f * fArr[!z9 ? 1 : 0] * 3.0f * f9) + (this.Y0 * 0.75f);
    }

    public final void r(MotionEvent motionEvent) {
        if (this.Z0 && this.S0) {
            float x9 = motionEvent.getX();
            motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f2532a2 = 60.0f;
                if (Float.isNaN(this.P0)) {
                    this.P0 = 0.0f;
                }
                this.R0 = true;
                this.U0 = x9;
                this.V0 = motionEvent.getEventTime();
                this.W0 = 0.0f;
            } else if (action == 1) {
                this.R0 = false;
            } else if (action != 2) {
            } else {
                long nanoTime = System.nanoTime();
                long j = nanoTime - this.V0;
                if (j == 0) {
                    j = 1;
                }
                float f9 = (x9 - this.U0) * this.f2535b2;
                this.V0 = nanoTime;
                this.U0 = x9;
                this.P0 = (0.1f * f9) + this.P0;
                float f10 = f9 / (((float) j) / 1000000.0f);
                this.W0 = f10;
                this.W0 = f10 * (this.f2531a1 == 3 ? 2.0f : 1.0f);
            }
        }
    }

    public final int s(int i) {
        if (i < 0) {
            return 0;
        }
        return this.O0.nextInt(i);
    }

    public final void t(int i) {
        o0 o0Var = this.f2609x1;
        int b10 = o0Var.b();
        int d9 = o0Var.d();
        ArrayList arrayList = new ArrayList();
        boolean z9 = true;
        boolean z10 = ((b10 & 1) == 0 && (b10 & 32) == 0 && (b10 & 64) == 0) ? false : true;
        if ((b10 & 32) == 0 && (b10 & 64) == 0 && (b10 & 128) == 0 && (b10 & 256) == 0) {
            z9 = false;
        }
        if (z10 || z9) {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
            arrayList.add(8);
        } else {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(6);
            if ((d9 & 1) != 0) {
                arrayList.add(2);
            }
            if ((d9 & 2) != 0) {
                arrayList.add(3);
            }
            if ((d9 & 4) != 0) {
                arrayList.add(4);
            }
            if ((d9 & 8) != 0) {
                arrayList.add(5);
            }
            if ((d9 & 16) != 0) {
                arrayList.add(16);
            }
        }
        arrayList.remove(Integer.valueOf(i));
        this.f2531a1 = ((Integer) arrayList.get(k0.f2392a.nextInt(arrayList.size()))).intValue();
        if ((d9 & 16) != 0) {
            g();
        }
        this.f2568k2 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0591, code lost:
        if (r2 != (-1.0f)) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0593, code lost:
        r4.D[r23][r20] = -50000.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x059c, code lost:
        r2 = r22 + 1;
        r5 = r21;
        r6 = r23;
        r0 = r24;
        r34 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 2779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.u():void");
    }

    public final void v() {
        SharedPreferences sharedPreferences;
        float f9;
        float f10;
        float f11;
        n2.f fVar = this.f2533b;
        if (fVar == null || fVar.f4499n == null || fVar.f4503s == null || fVar.f4497l == null || (sharedPreferences = this.f2536c) == null || !fVar.f4510z || !this.f2570l1.Q) {
            return;
        }
        float f12 = 0.5f;
        float f13 = 50.0f;
        int round = Math.round((Math.min(Float.parseFloat(sharedPreferences.getBoolean(this.f2595t, false) ? sharedPreferences.getString(this.f2529a.getString(2131952243), "0") : String.valueOf(sharedPreferences.getInt(this.E, 50) * 0.5f)) * 5.0f, 50.0f) / 50.0f) * 100.0f);
        this.H1 = round;
        this.f2533b.f4499n.f4632u = round * 0.01f;
        int i = this.f2536c.getInt(this.f2601v, 15);
        n2.l lVar = this.f2533b.f4503s;
        if (!this.f2594s1 && !this.f2597t1) {
            round = 0;
        }
        float f14 = round * 0.01f;
        float f15 = 0.2f;
        lVar.W = (lVar.f4605n * f14 * 0.2f) + lVar.D;
        lVar.f0 = 2.0f - (1.5f * f14);
        lVar.f4598g0 = 1.3f - (1.2f * f14);
        lVar.f4610t = 5.0f - (f14 * 5.0f);
        lVar.f4611u = 10.0f - (f14 * 9.5f);
        float f16 = i;
        float f17 = f16 / 65.0f;
        float abs = Math.abs(1.3f * f17) * 400.0f;
        lVar.S = abs;
        float f18 = 0.0f;
        int i9 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        float f19 = i9 >= 0 ? 0.0f : 3.1415927f;
        lVar.R = f19;
        if (abs == lVar.T && f19 == lVar.U && lVar.W == lVar.X) {
            f9 = 0.5f;
            f10 = 50.0f;
            f11 = 0.2f;
        } else {
            ArrayList arrayList = lVar.f4603l;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                float f20 = f12;
                n2.k kVar = (n2.k) obj;
                float f21 = f13;
                float f22 = f15;
                float f23 = (kVar.f4583l + f20) * lVar.S;
                kVar.f4577d = ((float) Math.cos(lVar.R)) * f23;
                float sin = ((float) Math.sin(lVar.R)) * f23;
                float l0 = n2.l.l0(-10.0f, 10.0f);
                float f24 = kVar.f4583l;
                kVar.f4578e = ((l0 * f24) + sin) - ((f24 + f20) * lVar.W);
                f13 = f21;
                f12 = f20;
                f15 = f22;
            }
            f9 = f12;
            f10 = f13;
            f11 = f15;
            lVar.T = lVar.S;
            lVar.U = lVar.R;
            lVar.X = lVar.W;
        }
        int i11 = (int) ((((lVar.S / 400.0f) * 0.52500004f) + 0.075f) * 80.0f);
        lVar.f4606o = Math.min(i11, 80);
        int min = Math.min(i11, 80);
        if (min < lVar.A) {
            synchronized (lVar.B) {
                for (int i12 = min; i12 < lVar.A; i12++) {
                    try {
                        n2.k kVar2 = (n2.k) lVar.f4603l.get(i12);
                        if (kVar2 != null) {
                            kVar2.j = 0.0f;
                            kVar2.f4582k = (kVar2.f4583l * f9) + f9;
                            lVar.B.add(kVar2);
                        }
                    } finally {
                    }
                }
            }
        }
        lVar.f4606o = min;
        lVar.A = min;
        n2.f fVar2 = this.f2533b;
        n2.m mVar = fVar2.f4499n;
        float f25 = 0.0015f * f16;
        if (mVar.f4629r != f25) {
            mVar.f4629r = f25;
        }
        n2.t tVar = fVar2.f4506v;
        if (tVar != null) {
            tVar.m0(this, i);
            tVar.U = (int) (this.H1 * f11);
        }
        n2.v vVar = this.f2533b.f4507w;
        if (vVar != null) {
            vVar.A = Math.min(Math.abs(f16) / f10, 2.0f);
            vVar.f4835y = Math.signum(f16);
            vVar.f4836z = 0.05f;
            vVar.B = (float) Math.pow(Math.min(vVar.A, 1.0f), 0.30000001192092896d);
        }
        n2.e eVar = this.f2533b.f4497l;
        eVar.getClass();
        if (i9 >= 0) {
            f18 = -1.0f;
        } else if (f17 < 0.0f) {
            f18 = 1.0f;
        }
        eVar.f0 = ((1.0f - Math.abs(f17)) * f18 * f9) + (-f17);
    }

    public final void w() {
        q0 q0Var;
        synchronized (this.f2533b.f4496k) {
            try {
                int i = this.f2531a1;
                int i9 = this.f2536c.getInt(this.f2540d, 0);
                this.f2531a1 = i9;
                boolean z9 = true;
                if (i9 != i || i9 == 7) {
                    if (i9 == 7 && this.f2568k2) {
                        t(i);
                        if (this.f2531a1 != 0) {
                            this.P1 = true;
                            this.f2533b.H = true;
                            this.f2536c.edit().putBoolean(this.f2529a.getString(2131951838), true).apply();
                        }
                    } else if (i9 == 7) {
                        this.f2531a1 = i;
                    }
                    if (this.f2531a1 != i) {
                        this.O0 = new Random(s((int) System.nanoTime()));
                        if (this.f2544e > 0.0f && this.f2548f > 0.0f) {
                            d();
                            o(this.f2544e, this.f2548f, this.f2551g);
                            n2.p pVar = this.f2533b.f4495h;
                            if (pVar != null) {
                                pVar.k0(this.N0);
                            }
                        }
                        this.N1 = true;
                    }
                }
                String[] strArr = p0.f2470a;
                if (!q4.b.l("TjDOnnINYlVAsmYolC+bV29g6SCDyb3iRtpbl3M2Y7XRggTkNcdhjKwxWbRcGKyB").equals(this.f2529a.getApplicationContext().getPackageName())) {
                    this.f2531a1 = 0;
                }
                n2.f fVar = this.f2533b;
                int i10 = this.f2531a1;
                fVar.f4509y = i10;
                v0 v0Var = fVar.f4491d;
                if (v0Var != null && (q0Var = v0Var.f2570l1) != null && fVar.f4500o != null) {
                    boolean z10 = i10 == 3;
                    if (i10 != 6) {
                        z9 = false;
                    }
                    fVar.B = z10;
                    fVar.F = 4;
                    if (z10) {
                        fVar.F = 2;
                    } else if (z9) {
                        fVar.F = 0;
                    }
                    fVar.G = q0Var.i;
                }
                this.f2536c.edit().putInt(this.L, this.f2531a1).apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.x():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (r1 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r1 == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r1 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r1 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        r1 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.y():void");
    }

    public final void z() {
        a();
        if (this.f2531a1 == 6) {
            return;
        }
        String string = this.f2536c.getString(this.f2583p, this.q);
        if (string.isEmpty() || Integer.parseInt(string) == this.N0) {
            return;
        }
        this.N0 = (int) Long.parseLong(string);
        this.O0 = new Random(this.N0);
        this.f2570l1.Q = false;
        o(this.f2544e, this.f2548f, this.f2551g);
        n2.p pVar = this.f2533b.f4495h;
        if (pVar != null) {
            pVar.k0(this.N0);
        }
    }
}
