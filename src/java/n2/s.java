package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import j5.t1;
import java.nio.FloatBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s extends c4.b {
    public final SharedPreferences A;
    public final int[][] B;
    public final float[][] C;
    public final float[][] D;
    public final float[][] E;
    public final int[][] F;
    public final int[] G;
    public final float[][] H;
    public float[] I;
    public float[] J;
    public float K;
    public float[][] L;
    public float[][] M;
    public Drawable[] O;
    public int P;
    public float Q;
    public float R;
    public float T;
    public int U;
    public final String V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f4755a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f4756b0;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4757c;

    /* renamed from: c0  reason: collision with root package name */
    public int f4758c0;

    /* renamed from: d  reason: collision with root package name */
    public float f4759d;

    /* renamed from: d0  reason: collision with root package name */
    public int f4760d0;

    /* renamed from: e  reason: collision with root package name */
    public float f4761e;

    /* renamed from: e0  reason: collision with root package name */
    public int f4762e0;

    /* renamed from: f  reason: collision with root package name */
    public float[] f4763f;
    public int f0;

    /* renamed from: g  reason: collision with root package name */
    public float[] f4764g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4765g0;

    /* renamed from: h  reason: collision with root package name */
    public float f4766h;
    public float i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f4770k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4771k0;

    /* renamed from: l  reason: collision with root package name */
    public FloatBuffer[] f4772l;

    /* renamed from: m  reason: collision with root package name */
    public FloatBuffer f4773m;

    /* renamed from: m0  reason: collision with root package name */
    public final Drawable f4774m0;

    /* renamed from: n  reason: collision with root package name */
    public int f4775n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f4776o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f4777p;
    public final String q;

    /* renamed from: r  reason: collision with root package name */
    public float[][][] f4778r;

    /* renamed from: s  reason: collision with root package name */
    public float[][] f4779s;

    /* renamed from: t  reason: collision with root package name */
    public float[][] f4780t;

    /* renamed from: x  reason: collision with root package name */
    public float[] f4784x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4785y;

    /* renamed from: z  reason: collision with root package name */
    public final int f4786z;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f4781u = new float[16];

    /* renamed from: v  reason: collision with root package name */
    public final float[] f4782v = new float[16];

    /* renamed from: w  reason: collision with root package name */
    public final float[] f4783w = new float[16];
    public final float[] N = {1.0f, 1.0f, 1.0f, 0.0f};
    public final long S = System.nanoTime();

    /* renamed from: h0  reason: collision with root package name */
    public float f4767h0 = 1.0f;

    /* renamed from: i0  reason: collision with root package name */
    public final float[] f4768i0 = new float[2];

    /* renamed from: j0  reason: collision with root package name */
    public final int[] f4769j0 = new int[4];
    public final ArrayList l0 = new ArrayList();

    public s(Context context) {
        this.f4757c = context;
        this.f4785y = context.getString(2131952500);
        this.A = t1.z(context);
        if (this.f4786z == 0) {
            this.f4786z = 5;
        }
        int i = this.f4786z;
        this.B = new int[i];
        this.C = new float[i];
        this.D = new float[i];
        this.E = new float[i];
        this.f4779s = new float[i];
        this.F = new int[i];
        this.f4780t = new float[i];
        this.G = new int[i];
        this.H = new float[i];
        this.V = context.getString(2131952431);
        this.q = context.getString(2131951939);
        this.f4774m0 = t1.A(context, 2131231509);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(float r19, float r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.s.k0(float, float, int, int):void");
    }

    public final void l0(boolean z9) {
        SimpleDateFormat[] simpleDateFormatArr = m2.a.f3954a;
        int i = Calendar.getInstance().get(2) + 1;
        Drawable drawable = this.f4774m0;
        ArrayList arrayList = this.l0;
        if (i == 12 && z9) {
            arrayList.add(drawable);
        } else {
            arrayList.remove(drawable);
        }
        this.O = (Drawable[]) arrayList.toArray(new Drawable[0]);
    }
}
