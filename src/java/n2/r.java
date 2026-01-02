package n2;

import android.content.Context;
import i2.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class r extends c4.b {
    public float D;
    public float G;
    public float H;
    public float I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: c  reason: collision with root package name */
    public final f f4734c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f4735d;

    /* renamed from: e  reason: collision with root package name */
    public int f4736e;

    /* renamed from: f  reason: collision with root package name */
    public int f4737f;

    /* renamed from: g  reason: collision with root package name */
    public FloatBuffer f4738g;

    /* renamed from: h  reason: collision with root package name */
    public FloatBuffer f4739h;
    public FloatBuffer i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f4740k;

    /* renamed from: o  reason: collision with root package name */
    public float f4744o;

    /* renamed from: t  reason: collision with root package name */
    public int f4748t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4750v;

    /* renamed from: w  reason: collision with root package name */
    public float f4751w;

    /* renamed from: x  reason: collision with root package name */
    public float f4752x;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4741l = false;

    /* renamed from: m  reason: collision with root package name */
    public float[] f4742m = new float[0];

    /* renamed from: n  reason: collision with root package name */
    public float[] f4743n = new float[0];

    /* renamed from: p  reason: collision with root package name */
    public float f4745p = 0.0f;
    public int q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f4746r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f4747s = 2;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4749u = false;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f4753y = new float[16];

    /* renamed from: z  reason: collision with root package name */
    public final float[] f4754z = new float[16];
    public final float[] A = new float[16];
    public final float[] B = new float[16];
    public final float[] C = new float[16];
    public final float[] E = {0.9f, 0.9f, 1.0f};
    public final float[] F = {0.75f, 0.9f, 1.0f};

    public r(Context context, f fVar) {
        this.f4735d = context;
        this.f4734c = fVar;
    }

    public static boolean m0(float f9, float f10, float f11, float f12) {
        if (Math.abs(f9) >= 0.01f || Math.abs(f10) >= 0.01f) {
            if (Math.abs(f11) >= 0.01f || Math.abs(f12) >= 0.01f) {
                return Math.abs(f9 - f11) < 0.01f && Math.abs(f10 - f12) < 0.01f;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.k0():void");
    }

    public final void l0(float f9, float f10, ArrayList arrayList, int i) {
        Float valueOf = Float.valueOf(0.0f);
        if (i > 2) {
            return;
        }
        boolean z9 = this.f4737f > this.f4736e;
        Random random = k0.f2392a;
        int nextInt = random.nextInt(50) + 15;
        boolean nextBoolean = random.nextBoolean();
        float f11 = z9 ? 0.04f : 0.01f;
        float f12 = f10;
        int i9 = 0;
        float f13 = f9;
        while (i9 < nextInt) {
            float f14 = (nextBoolean ? -f11 : f11) + f13;
            Random random2 = k0.f2392a;
            float nextFloat = f14 + ((random2.nextFloat() - 0.5f) * (z9 ? 0.1f : 0.03f));
            float nextFloat2 = f12 - ((random2.nextFloat() * 0.02f) + 0.001f);
            if (!m0(f13, f12, nextFloat, nextFloat2)) {
                arrayList.add(Float.valueOf(f13));
                arrayList.add(Float.valueOf(f12));
                arrayList.add(valueOf);
                arrayList.add(Float.valueOf(nextFloat));
                arrayList.add(Float.valueOf(nextFloat2));
                arrayList.add(valueOf);
            }
            if (random2.nextFloat() < 0.1f) {
                l0(nextFloat, nextFloat2, arrayList, i + 1);
            }
            i9++;
            f13 = nextFloat;
            f12 = nextFloat2;
        }
    }

    public final void n0() {
        float f9 = this.f4745p + 0.02f;
        this.f4745p = f9;
        if (this.f4741l || f9 < this.f4744o) {
            return;
        }
        this.f4749u = false;
        this.q = 0;
        this.D = 0.0f;
        this.f4744o = (new Random().nextFloat() * 8.5f) + 0.5f;
        Float valueOf = Float.valueOf(0.0f);
        Random random = k0.f2392a;
        float nextFloat = (random.nextFloat() * 2.0f) - 1.0f;
        float nextFloat2 = random.nextFloat();
        boolean z9 = this.f4737f > this.f4736e;
        this.J = random.nextInt(15) + 10;
        this.K = random.nextInt(15) + 10;
        float f10 = nextFloat - 5.3999996f;
        float f11 = nextFloat2 - 2.4f;
        float f12 = 5.3999996f + nextFloat;
        float f13 = 2.4f + nextFloat2;
        int i = 3;
        float[] fArr = {f10, f11, 0.0f, 0.0f, 0.0f, f12, f11, 0.0f, 1.0f, 0.0f, f10, f13, 0.0f, 0.0f, 1.0f, f12, f13, 0.0f, 1.0f, 1.0f};
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4738g = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        int nextInt = random.nextInt(100) + 20;
        int nextInt2 = random.nextInt(10) + 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        while (i9 < nextInt) {
            Random random2 = k0.f2392a;
            int i10 = i;
            float nextFloat3 = ((random2.nextFloat() - 0.5f) * (z9 ? 0.1f : 0.03f)) + nextFloat;
            float nextFloat4 = nextFloat2 - ((random2.nextFloat() * 0.03f) + 0.002f);
            if (!m0(nextFloat, nextFloat2, nextFloat3, nextFloat4)) {
                arrayList.add(Float.valueOf(nextFloat));
                arrayList.add(Float.valueOf(nextFloat2));
                arrayList.add(valueOf);
                arrayList.add(Float.valueOf(nextFloat3));
                arrayList.add(Float.valueOf(nextFloat4));
                arrayList.add(valueOf);
            }
            if (random2.nextFloat() < 0.3f && nextInt2 > 0) {
                nextInt2--;
                l0(nextFloat3, nextFloat4, arrayList2, 0);
            }
            i9++;
            nextFloat = nextFloat3;
            nextFloat2 = nextFloat4;
            i = i10;
        }
        int i11 = i;
        float[] fArr2 = new float[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            fArr2[i12] = ((Float) arrayList.get(i12)).floatValue();
        }
        this.f4742m = fArr2;
        float[] fArr3 = new float[arrayList2.size()];
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            fArr3[i13] = ((Float) arrayList2.get(i13)).floatValue();
        }
        this.f4743n = fArr3;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(this.f4742m.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4739h = asFloatBuffer2;
        asFloatBuffer2.put(this.f4742m).position(0);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(this.f4743n.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.i = asFloatBuffer3;
        asFloatBuffer3.put(this.f4743n).position(0);
        this.f4741l = true;
        this.f4745p = 0.0f;
        Random random3 = k0.f2392a;
        this.f4747s = random3.nextInt(7) + 3;
        this.f4748t = random3.nextInt(i11);
        this.f4734c.f4499n.f4630s = Math.max(this.D, 0.23529412f);
        this.f4749u = true;
    }
}
