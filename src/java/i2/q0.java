package i2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import j5.t1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class q0 {
    public int[] A;
    public float[] B;
    public float[] C;
    public i D;
    public final Bitmap E;
    public int F;
    public float[] G;
    public float[] H;
    public float[] I;
    public float[] J;
    public float[] K;
    public float[] L;
    public float[] M;
    public float N;
    public final String O;
    public final SharedPreferences P;
    public Random S;
    public Drawable[] T;
    public Bitmap[] U;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2486a;

    /* renamed from: b  reason: collision with root package name */
    public int f2487b;

    /* renamed from: c  reason: collision with root package name */
    public int f2488c;

    /* renamed from: d  reason: collision with root package name */
    public float f2489d;

    /* renamed from: e  reason: collision with root package name */
    public float f2490e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2491f;

    /* renamed from: g  reason: collision with root package name */
    public final v0 f2492g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2493h;
    public boolean i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2494k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2495l;

    /* renamed from: m  reason: collision with root package name */
    public final int[][] f2496m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f2497n;

    /* renamed from: p  reason: collision with root package name */
    public Drawable[] f2499p;
    public Bitmap[] q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f2500r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f2501s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f2502t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f2503u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f2504v;

    /* renamed from: w  reason: collision with root package name */
    public float[] f2505w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f2506x;

    /* renamed from: y  reason: collision with root package name */
    public int f2507y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f2508z;

    /* renamed from: o  reason: collision with root package name */
    public final BitmapFactory.Options f2498o = new BitmapFactory.Options();
    public boolean Q = false;
    public boolean R = true;

    public q0(Context context, int i, v0 v0Var, float f9, float f10) {
        char c9;
        new m2.a();
        this.f2486a = context;
        this.f2492g = v0Var;
        this.f2489d = f9;
        this.f2490e = f10;
        if (f10 > f9) {
            this.f2491f = f10 / f9;
        } else {
            this.f2491f = f9 / f10;
        }
        this.S = v0Var.O0;
        this.f2488c = i == 6 ? 4 : i;
        l();
        if (this.f2494k) {
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 3, 4);
            this.f2496m = iArr;
            int[] iArr2 = {2131231187, 2131231188, 2131231186, 2131231191};
            iArr[0] = iArr2;
            int[] iArr3 = {2131231382, 2131231383, 2131231381, 2131231386};
            iArr[1] = iArr3;
            int[] iArr4 = {2131231241, 2131231242, 2131231240, 2131231245};
            iArr[2] = iArr4;
            int i9 = this.f2488c;
            if (i9 == 0) {
                this.f2508z = iArr2;
            } else if (i9 == 1) {
                this.f2508z = iArr3;
            } else if (i9 == 2) {
                this.f2508z = iArr4;
                c9 = 1;
                this.f2497n = r12;
                int[] iArr5 = {2131231302, 2131231239};
                this.A = r13;
                int[] iArr6 = {iArr5[c9], 2131231303, 2131231304, 2131231305};
            }
            c9 = 0;
            this.f2497n = iArr5;
            int[] iArr52 = {2131231302, 2131231239};
            this.A = iArr6;
            int[] iArr62 = {iArr52[c9], 2131231303, 2131231304, 2131231305};
        } else {
            int i10 = this.f2488c;
            if (i10 == 4) {
                k();
            } else if (i10 == 5) {
                this.A = new int[this.f2487b];
                int[] iArr7 = {2131231111, 2131231112, 2131231113, 2131231114, 2131231115};
                int i11 = 0;
                for (int i12 = 0; i12 < this.f2487b; i12++) {
                    if (i12 == 2) {
                        this.A[i12] = 2131231110;
                    } else {
                        this.A[i12] = iArr7[i11];
                        i11++;
                    }
                }
            } else if (i10 == 8) {
                this.A = r11;
                int[] iArr8 = {2131231118, 2131231119, 2131231120, 2131231121, 2131231122, 2131231123, 2131231124, 2131231125, 2131231126, 2131231122};
            } else if (i10 == 9) {
                this.A = r11;
                int[] iArr9 = {2131231347, 2131231348, 2131231347, 2131231346, 2131231345};
            }
        }
        Resources resources = this.f2486a.getResources();
        BitmapFactory.Options options = this.f2498o;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options.inPreferredConfig = config;
        options.inScaled = true;
        options.inMutable = true;
        options.inDensity = resources.getDisplayMetrics().densityDpi;
        if (this.j) {
            e();
        }
        d();
        this.E = Bitmap.createBitmap(1, (int) f10, config);
        this.O = context.getString(2131951735);
        this.P = t1.z(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f2508z = this.f2496m[0];
            this.A[0] = this.f2497n[0];
        } else if (i == 1) {
            this.f2508z = this.f2496m[1];
            this.A[0] = this.f2497n[0];
        } else if (i == 2) {
            this.f2508z = this.f2496m[2];
            this.A[0] = this.f2497n[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public final void b() {
        Canvas canvas = new Canvas();
        Bitmap[] bitmapArr = this.q;
        if (bitmapArr == null || bitmapArr.length < 5) {
            this.q = new Bitmap[5];
        }
        float f9 = this.f2488c == 8 ? 0.75f : 1.0f;
        for (?? r12 = this.f2494k; r12 < this.q.length; r12++) {
            float nextFloat = ((this.S.nextFloat() * 0.40000004f) + 0.8f) * f9;
            float f10 = this.C[r12];
            int i = (int) (this.f2500r[r12] * f10);
            int i9 = (int) (this.f2501s[r12] * f10 * nextFloat);
            if (i > 0 && i9 > 0) {
                this.q[r12] = Bitmap.createBitmap(i, i9, Bitmap.Config.ARGB_8888);
                canvas.setBitmap(this.q[r12]);
                canvas.save();
                float f11 = this.C[r12];
                canvas.scale(f11, nextFloat * f11);
                this.f2499p[this.f2504v[r12]].draw(canvas);
                canvas.restore();
            }
        }
    }

    public final void c(int i, int i9, boolean z9, float f9, float f10) {
        int[] iArr;
        Bitmap[] bitmapArr;
        int i10;
        Bitmap[] bitmapArr2;
        int i11;
        float f11;
        int i12;
        Bitmap[] bitmapArr3;
        int i13 = this.f2507y;
        this.f2507y = i9;
        this.f2489d = f9;
        this.f2490e = f10;
        int i14 = 0;
        this.Q = false;
        v0 v0Var = this.f2492g;
        this.S = v0Var.O0;
        int i15 = i;
        if (i15 == 6) {
            this.f2488c = 4;
            l();
            k();
            f();
            i15 = 4;
        }
        boolean z10 = true;
        if (this.f2494k) {
            boolean z11 = (this.f2507y == i13 && this.f2488c == i15 && (bitmapArr3 = this.q) != null && bitmapArr3[1] != null && this.f2495l == z9) ? false : true;
            Bitmap[] bitmapArr4 = this.q;
            if (bitmapArr4 != null) {
                Bitmap bitmap = bitmapArr4[1];
            }
            boolean z12 = (i15 == 0 || i15 == 1) && this.f2488c == 2;
            int i16 = this.f2488c;
            boolean z13 = (i16 == 0 || i16 == 1) && i15 == 2;
            if (!z12 && !z13) {
                z10 = false;
            }
            this.R = z10;
            this.f2488c = i15;
            this.f2495l = z9;
            if (z11 && this.j) {
                this.f2487b = 5;
                this.q = new Bitmap[5];
                e();
                n();
                this.U = new Bitmap[4];
                for (int i17 = 0; i17 < this.T.length; i17++) {
                    Bitmap[] bitmapArr5 = this.U;
                    float f12 = this.C[0];
                    bitmapArr5[i17] = Bitmap.createBitmap((int) (this.f2500r[0] * f12), (int) (this.f2501s[0] * f12), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(this.U[i17]);
                    float f13 = this.C[0];
                    canvas.scale(f13, f13);
                    this.T[i17].draw(canvas);
                }
                this.q[0] = this.U[this.f2507y];
            } else {
                n();
            }
            if (this.R) {
                d();
            }
            b();
        } else if (i15 == 4 || i15 == 8 || i15 == 9) {
            d();
            ArrayList arrayList = new ArrayList();
            int length = this.f2499p.length;
            for (int i18 = 0; i18 <= length - 1; i18++) {
                arrayList.add(Integer.valueOf(i18));
            }
            Collections.shuffle(arrayList, this.S);
            for (int i19 = 0; i19 < length; i19++) {
                if (this.f2488c != 9) {
                    this.f2504v[i19] = ((Integer) arrayList.get(i19 % arrayList.size())).intValue();
                } else {
                    this.f2504v[i19] = i19;
                }
                this.f2505w[i19] = (v0Var.s(60) * 0.01f) + 0.8f;
                this.f2500r[i19] = this.f2499p[this.f2504v[i19]].getBounds().right;
                if (this.f2490e > this.f2489d) {
                    this.f2501s[i19] = this.f2499p[this.f2504v[i19]].getBounds().bottom;
                    this.C[i19] = (this.f2489d * this.f2491f) / this.f2500r[this.f2504v[i19]];
                } else {
                    this.f2501s[i19] = this.f2499p[this.f2504v[i19]].getBounds().bottom;
                    this.C[i19] = this.f2489d / this.f2500r[i19];
                    this.f2501s[i19] = (int) (iArr[i19] * 0.6f);
                }
            }
            b();
        } else if (i15 == 3) {
            d();
            float f14 = this.f2490e;
            Bitmap[] bitmapArr6 = this.q;
            if (bitmapArr6 == null || bitmapArr6.length == 0) {
                this.q = new Bitmap[3];
            }
            int i20 = 0;
            while (true) {
                bitmapArr2 = this.q;
                if (i20 >= bitmapArr2.length) {
                    break;
                }
                bitmapArr2[i20] = Bitmap.createBitmap((int) (this.f2489d * this.f2491f), (int) f14, Bitmap.Config.ARGB_8888);
                i20++;
            }
            for (Bitmap bitmap2 : bitmapArr2) {
                bitmap2.eraseColor(0);
            }
            i iVar = this.D;
            Bitmap[] bitmapArr7 = this.q;
            v0 v0Var2 = iVar.i;
            int length2 = bitmapArr7.length;
            iVar.f2376r = new int[length2];
            iVar.f2365d = new int[length2];
            iVar.f2373n = new float[length2];
            iVar.f2374o = new float[length2];
            iVar.f2375p = new int[length2];
            iVar.q = new int[length2];
            iVar.f2377s = new int[length2];
            iVar.f2378t = new int[length2][];
            iVar.f2379u = new int[length2][];
            iVar.f2381w = new int[length2][][];
            iVar.f2382x = new int[length2][][];
            iVar.f2380v = new int[length2][];
            int i21 = 0;
            while (true) {
                i11 = 10;
                if (i21 >= length2) {
                    break;
                }
                iVar.f2365d[i21] = v0Var2.s(15) + 10;
                float[][] fArr = iVar.f2373n;
                int i22 = iVar.f2365d[i21];
                fArr[i21] = new float[i22];
                iVar.f2374o[i21] = new float[i22];
                iVar.q[i21] = new int[i22];
                iVar.f2377s[i21] = new int[i22];
                iVar.f2378t[i21] = new int[i22];
                iVar.f2379u[i21] = new int[i22];
                iVar.f2381w[i21] = new int[i22][];
                iVar.f2382x[i21] = new int[i22][];
                iVar.f2380v[i21] = new int[i22];
                iVar.f2375p[i21] = new int[i22];
                iVar.f2376r[i21] = new int[i22];
                for (int i23 = 0; i23 < iVar.f2365d[i21]; i23++) {
                    int[] iArr2 = iVar.f2376r[i21];
                    int length3 = iVar.f2371l.length;
                    int[] iArr3 = iVar.f2384z;
                    if (iArr3 == null || iArr3.length != length3 || iVar.A >= length3) {
                        iVar.f2384z = new int[length3];
                        for (int i24 = 0; i24 < length3; i24++) {
                            iVar.f2384z[i24] = i24;
                        }
                        for (int i25 = length3 - 1; i25 > 0; i25--) {
                            int nextFloat = (int) (iVar.f2383y.nextFloat() * (i25 + 1));
                            int[] iArr4 = iVar.f2384z;
                            int i26 = iArr4[i25];
                            iArr4[i25] = iArr4[nextFloat];
                            iArr4[nextFloat] = i26;
                        }
                        iVar.A = 0;
                    }
                    int[] iArr5 = iVar.f2384z;
                    int i27 = iVar.A;
                    iVar.A = i27 + 1;
                    iArr2[i23] = iArr5[i27];
                    int[] iArr6 = iVar.q[i21];
                    int[] iArr7 = iVar.f2366e;
                    int[] iArr8 = iVar.f2376r[i21];
                    iArr6[i23] = iArr7[iArr8[i23]];
                    iVar.f2375p[i21][i23] = iVar.f2372m[iArr8[i23]];
                    if (i23 > 0) {
                        float[] fArr2 = iVar.f2373n[i21];
                        float f15 = fArr2[i23 - 1];
                        fArr2[i23] = f15;
                        fArr2[i23] = f15 + iArr6[i12];
                    }
                    float[] fArr3 = iVar.f2373n[i21];
                    fArr3[i23] = fArr3[i23] + v0Var2.s((int) ((iVar.f2364c * iVar.f2368g) / iVar.f2365d[i21]));
                    iVar.f2374o[i21][i23] = -iVar.f2371l[iVar.f2376r[i21][i23]].getHeight();
                    float[] fArr4 = iVar.f2374o[i21];
                    fArr4[i23] = fArr4[i23] + bitmapArr7[i21].getHeight();
                }
                i21++;
            }
            int i28 = 0;
            while (i28 < this.f2487b) {
                i iVar2 = this.D;
                v0 v0Var3 = iVar2.i;
                int i29 = i14;
                while (i29 < iVar2.f2365d[i28]) {
                    int i30 = iVar2.f2376r[i28][i29];
                    Bitmap bitmap3 = iVar2.f2371l[i30];
                    int i31 = iVar2.q[i28][i29];
                    int i32 = iVar2.f2367f[i30];
                    float f16 = i32;
                    iVar2.f2377s[i28][i29] = (int) ((0.015f * f16) + v0Var3.s(i11));
                    int[][] iArr9 = iVar2.f2377s;
                    int i33 = iArr9[i28][i29];
                    int i34 = i14;
                    boolean z14 = z10;
                    iVar2.f2381w[i28][i29] = new int[i33];
                    iVar2.f2382x[i28][i29] = new int[iArr9[i28][i29]];
                    iVar2.f2379u[i28][i29] = new int[iArr9[i28][i29]];
                    int[][][] iArr10 = iVar2.f2378t;
                    iArr10[i28][i29] = new int[iArr9[i28][i29]];
                    iArr10[i28][i29][i34] = i34;
                    int i35 = i34;
                    while (i35 < i33) {
                        int i36 = iVar2.f2378t[i28][i29][i35];
                        int i37 = (int) (f16 * 0.075f);
                        float s5 = ((f16 / i33) + v0Var3.s(i37)) - v0Var3.s(i37);
                        if (i35 != 0) {
                            int i38 = iVar2.f2378t[i28][i29][i35 - 1];
                            i36 = i36 + i38 + ((int) s5);
                            if (i38 - Math.abs(i36) <= 8) {
                                i36 += 8;
                            }
                        }
                        if (i36 >= i32) {
                            i36 = i32 - 1;
                        } else if (i36 <= 0) {
                            i36 = z14;
                        }
                        iVar2.f2378t[i28][i29][i35] = i36;
                        iVar2.f2379u[i28][i29][i35] = v0Var3.s(4) + 1;
                        int[][] iArr11 = iVar2.f2381w[i28][i29];
                        int[][][] iArr12 = iVar2.f2379u;
                        iArr11[i35] = new int[iArr12[i28][i29][i35]];
                        iVar2.f2382x[i28][i29][i35] = new int[iArr12[i28][i29][i35]];
                        float f17 = (iVar2.f2363b - f16) + i36;
                        int i39 = i34;
                        int i40 = i39;
                        int i41 = i40;
                        int i42 = i28;
                        while (i39 < iVar2.f2379u[i42][i29][i35]) {
                            int i43 = iVar2.f2381w[i42][i29][i35][i39];
                            float f18 = i31;
                            iVar2.f2382x[i42][i29][i35][i39] = v0Var3.s((int) (f18 * 0.15f)) + 1;
                            int i44 = iVar2.f2382x[i42][i29][i35][i39];
                            float s9 = (0.02f * f18) + v0Var3.s((int) (f18 * 0.25f)) + i40 + i41;
                            int i45 = i43 + ((int) (s9 > f18 ? i31 - i44 : s9));
                            int i46 = i35;
                            int i47 = z14;
                            if (i45 < i47) {
                                z14 = i47;
                                i45 = z14;
                            } else {
                                if (i45 >= i31) {
                                    i45 = i31 - 1;
                                }
                                z14 = i47;
                            }
                            if (i45 + i44 >= i31) {
                                i45 = (i31 - i44) - 1;
                            }
                            int i48 = (int) f17;
                            v0 v0Var4 = v0Var3;
                            int pixel = bitmap3.getPixel(i45, i48);
                            if (Color.alpha(pixel) != 0) {
                                int i49 = i45;
                                f11 = f17;
                                if (Color.red(pixel) != 255) {
                                    int pixel2 = bitmap3.getPixel(i49 + i44, i48);
                                    if (Color.alpha(pixel2) == 0 || Color.red(pixel2) == 255) {
                                        iVar2.f2381w[i42][i29][i46][i39] = -1;
                                    } else if (pixel != pixel2) {
                                        iVar2.f2381w[i42][i29][i46][i39] = -1;
                                    } else {
                                        int i50 = iVar2.f2382x[i42][i29][i46][i39];
                                        iVar2.f2381w[i42][i29][i46][i39] = i49;
                                        i41 = i50;
                                        i40 = i49;
                                    }
                                    i39++;
                                    i35 = i46;
                                    v0Var3 = v0Var4;
                                    f17 = f11;
                                }
                            } else {
                                f11 = f17;
                            }
                            iVar2.f2381w[i42][i29][i46][i39] = -1;
                            i39++;
                            i35 = i46;
                            v0Var3 = v0Var4;
                            f17 = f11;
                        }
                        i35++;
                        i28 = i42;
                    }
                    i29++;
                    i14 = i34;
                    z10 = z14;
                    i11 = 10;
                }
                i28++;
                i11 = 10;
            }
        } else {
            int i51 = 0;
            if (i15 == 5) {
                d();
                ArrayList arrayList2 = new ArrayList();
                for (int i52 = 0; i52 < this.f2487b; i52++) {
                    if (i52 != 2) {
                        arrayList2.add(Integer.valueOf(i52));
                    }
                }
                Collections.shuffle(arrayList2, this.S);
                Bitmap[] bitmapArr8 = this.q;
                if (bitmapArr8 == null || bitmapArr8.length == 0) {
                    this.q = new Bitmap[6];
                }
                int i53 = 0;
                for (int i54 = 0; i54 < this.q.length; i54++) {
                    if (i54 != 2) {
                        this.f2504v[i54] = ((Integer) arrayList2.get(i53)).intValue();
                        i53++;
                        int[] iArr13 = this.f2504v;
                        int i55 = iArr13[i54];
                        if (i55 == 2) {
                            iArr13[i54] = i55 + 1;
                        }
                        this.f2505w[i54] = (v0Var.s(60) * 0.01f) + 0.8f;
                        float f19 = this.f2490e;
                        float f20 = this.f2489d;
                        if (f19 > f20) {
                            this.C[i54] = (f20 * this.f2491f) / this.f2500r[this.f2504v[i54]];
                        } else {
                            this.C[i54] = (f19 * this.f2491f) / this.f2500r[this.f2504v[i54]];
                        }
                    }
                }
                float f21 = this.f2490e;
                float f22 = this.f2489d;
                if (f21 > f22) {
                    this.C[2] = ((this.f2491f * f22) / this.f2500r[2]) * 0.3f;
                } else {
                    this.C[2] = ((f21 * this.f2491f) / this.f2500r[2]) * 0.1f;
                }
                v0Var.s((int) (f22 * 0.4f));
                Canvas canvas2 = new Canvas();
                float f23 = 1.0f;
                int i56 = 0;
                while (true) {
                    bitmapArr = this.q;
                    if (i56 >= bitmapArr.length) {
                        break;
                    }
                    if (i56 != 2) {
                        if (this.f2490e < this.f2489d) {
                            f23 = 0.5f;
                        }
                        float f24 = this.C[i56];
                        bitmapArr[i56] = Bitmap.createBitmap((int) (this.f2500r[i56] * f24 * f23), (int) (this.f2501s[this.f2504v[i56]] * this.f2505w[i56] * f24 * f23), Bitmap.Config.ARGB_8888);
                        Drawable drawable = this.f2499p[this.f2504v[i56]];
                        float f25 = this.C[i56];
                        int i57 = i51;
                        drawable.setBounds(i57, i57, (int) (this.f2500r[i56] * f25 * f23), (int) (this.f2501s[i10] * this.f2505w[i56] * f25 * f23));
                        canvas2.setBitmap(this.q[i56]);
                        canvas2.save();
                        this.f2499p[this.f2504v[i56]].draw(canvas2);
                        canvas2.restore();
                    }
                    i56++;
                    i51 = 0;
                }
                if (this.f2490e < this.f2489d) {
                    f23 = 3.0f;
                }
                float f26 = this.C[2];
                bitmapArr[2] = Bitmap.createBitmap((int) (this.f2500r[2] * f26 * f23), (int) (this.f2501s[2] * f26 * f23), Bitmap.Config.ARGB_8888);
                Drawable drawable2 = this.f2499p[2];
                float f27 = this.C[2];
                drawable2.setBounds(0, 0, (int) (this.f2500r[2] * f27 * f23), (int) (this.f2501s[2] * f27 * f23));
                canvas2.setBitmap(this.q[2]);
                this.f2499p[2].draw(canvas2);
            }
        }
        this.f2488c = i15;
    }

    public final void d() {
        int[] iArr;
        int[] iArr2;
        Drawable drawable;
        if (this.R) {
            int i = this.f2488c;
            float f9 = this.f2491f;
            Context context = this.f2486a;
            if (i == 0 || i == 1 || i == 2) {
                this.f2499p[0] = this.T[this.f2507y].mutate();
                int i9 = 0;
                while (true) {
                    int[] iArr3 = this.A;
                    if (i9 >= iArr3.length) {
                        break;
                    }
                    int i10 = i9 + 1;
                    this.f2499p[i10] = t1.A(context, iArr3[i9]);
                    Drawable drawable2 = this.f2499p[i10];
                    if (drawable2 != null) {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.f2499p[i10].getIntrinsicHeight();
                        float f10 = intrinsicWidth;
                        float f11 = (this.f2489d / f10) * f9;
                        this.f2499p[i10].setBounds(0, 0, (int) (f10 * f11), (int) (intrinsicHeight * f11));
                    }
                    i9 = i10;
                }
            } else if (i == 4 || i == 8 || i == 9) {
                f();
            } else if (i == 3) {
                float f12 = this.f2489d;
                float f13 = this.f2490e;
                i iVar = new i(context, this.f2491f, this.f2492g, f12, f13);
                this.D = iVar;
                int[] iArr4 = {2131231091, 2131231100, 2131231101, 2131231102, 2131231103, 2131231104, 2131231105, 2131231106, 2131231107, 2131231092, 2131231093, 2131231094, 2131231095, 2131231096, 2131231097, 2131231098};
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Canvas canvas = new Canvas();
                Drawable[] drawableArr = new Drawable[16];
                iVar.f2366e = new int[16];
                iVar.f2367f = new int[16];
                iVar.f2371l = new Bitmap[16];
                iVar.f2372m = new int[16];
                int i11 = 0;
                for (int i12 = 16; i11 < i12; i12 = 16) {
                    drawableArr[i11] = t1.A(iVar.f2362a, iArr4[i11]);
                    if (i11 == 0) {
                        iVar.f2369h = f13;
                        Objects.requireNonNull(drawableArr[0]);
                        iVar.f2369h = (f13 / drawable.getIntrinsicHeight()) * 0.55f;
                    }
                    int intrinsicWidth2 = drawableArr[i11].getIntrinsicWidth();
                    int intrinsicHeight2 = drawableArr[i11].getIntrinsicHeight();
                    Drawable drawable3 = drawableArr[i11];
                    float f14 = iVar.f2369h;
                    drawable3.setBounds(0, 0, (int) (intrinsicWidth2 * f14), (int) (intrinsicHeight2 * f14));
                    iVar.f2366e[i11] = drawableArr[i11].getBounds().right;
                    iVar.f2367f[i11] = drawableArr[i11].getBounds().bottom;
                    iVar.f2371l[i11] = Bitmap.createBitmap(iVar.f2366e[i11], (int) f13, config);
                    canvas.setBitmap(iVar.f2371l[i11]);
                    canvas.save();
                    canvas.translate(0.0f, f13 - drawableArr[i11].getBounds().bottom);
                    drawableArr[i11].draw(canvas);
                    canvas.restore();
                    if (i11 == 9) {
                        iVar.f2372m[i11] = 8;
                    } else {
                        iVar.f2372m[i11] = 0;
                    }
                    i11++;
                }
                this.f2487b = 3;
            } else if (i == 5) {
                this.f2499p = new Drawable[this.A.length];
                float f15 = this.f2495l ? 0.3f : 0.1f;
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.A;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    this.f2499p[i13] = t1.A(context, iArr5[i13]);
                    Drawable drawable4 = this.f2499p[i13];
                    if (drawable4 != null) {
                        int intrinsicWidth3 = drawable4.getIntrinsicWidth();
                        int intrinsicHeight3 = this.f2499p[i13].getIntrinsicHeight();
                        float f16 = intrinsicWidth3;
                        float f17 = (this.f2489d / f16) * f9;
                        this.f2499p[i13].setBounds(0, 0, (int) (f16 * f17), (int) (intrinsicHeight3 * f17));
                        this.f2500r[i13] = this.f2499p[i13].getBounds().right;
                        this.f2501s[i13] = this.f2499p[i13].getBounds().bottom;
                        this.f2506x[i13] = this.f2492g.s(1);
                        if (i13 == 2) {
                            this.f2501s[i13] = (int) (iArr[i13] * f15);
                            this.f2500r[i13] = (int) (iArr2[i13] * f15);
                        }
                    }
                    i13++;
                }
            }
            this.R = false;
        }
    }

    public final void e() {
        if (!this.f2494k) {
            return;
        }
        this.T = new Drawable[4];
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.T;
            if (i >= drawableArr.length) {
                return;
            }
            drawableArr[i] = t1.A(this.f2486a, this.f2508z[i]);
            Drawable drawable = this.T[i];
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = this.T[i].getIntrinsicHeight();
                float f9 = intrinsicWidth;
                float f10 = (this.f2489d / f9) * this.f2491f;
                this.T[i].setBounds(0, 0, (int) (f9 * f10), (int) (intrinsicHeight * f10));
            }
            i++;
        }
    }

    public final void f() {
        int i = 0;
        while (true) {
            int[] iArr = this.A;
            if (i >= iArr.length) {
                return;
            }
            this.f2499p[i] = t1.A(this.f2486a, iArr[i]);
            Drawable drawable = this.f2499p[i];
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = this.f2499p[i].getIntrinsicHeight();
                float f9 = intrinsicWidth;
                float f10 = (this.f2489d / f9) * this.f2491f;
                this.f2499p[i].setBounds(0, 0, (int) (f9 * f10), (int) (intrinsicHeight * f10));
                this.f2500r[i] = this.f2499p[i].getBounds().right;
                this.f2501s[i] = this.f2499p[i].getBounds().bottom;
            }
            i++;
        }
    }

    public final void finalize() {
        try {
            g();
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        Bitmap[] bitmapArr = this.q;
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        this.q = null;
    }

    public final int[] h(Bitmap[] bitmapArr) {
        if (bitmapArr == null || bitmapArr.length == 0) {
            return null;
        }
        int length = bitmapArr.length;
        int[] iArr = new int[length];
        int i = this.f2488c == 5 ? 170 : 30;
        int[] iArr2 = new int[i];
        for (int i9 = 1; i9 < length; i9++) {
            int width = bitmapArr[i9].getWidth();
            int height = bitmapArr[i9].getHeight();
            int i10 = width / i;
            for (int i11 = 0; i11 < i; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 >= height) {
                        break;
                    }
                    int i13 = i10 * i11;
                    if (i13 <= width && i13 >= 0 && Color.red(bitmapArr[i9].getPixel(i13, i12)) != 0) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12 += 5;
                }
            }
            int i14 = iArr2[0];
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = iArr2[i15];
                if (i16 > i14) {
                    i14 = i16;
                }
            }
            iArr[i9] = i14;
        }
        return iArr;
    }

    public final boolean i() {
        if (this.f2488c == 6) {
            return false;
        }
        return this.f2494k;
    }

    public final int j() {
        int i = this.f2488c;
        if (i == 0 || i == 1 || i == 2) {
            return 5;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 8) {
            return 10;
        }
        return i == 9 ? 5 : 0;
    }

    public final void k() {
        this.A = r0;
        int[] iArr = {2131231172, 2131231173, 2131231174, 2131231175, 2131231176};
    }

    public final void l() {
        i iVar;
        int i = this.f2488c;
        boolean z9 = true;
        boolean z10 = i == 0 || i == 1 || i == 2;
        this.f2494k = z10;
        this.j = z10;
        if (i != 0 && i != 1 && i != 2) {
            z9 = false;
        }
        this.i = z9;
        this.f2493h = !z10;
        if (z10 && (iVar = this.D) != null) {
            iVar.a();
            this.D = null;
        }
        if (this.f2494k) {
            this.f2487b = 5;
        } else {
            int i9 = this.f2488c;
            if (i9 == 4) {
                this.f2487b = 5;
            } else if (i9 == 5) {
                this.f2487b = 6;
            } else if (i9 == 6) {
                this.f2487b = 0;
            } else if (i9 == 8) {
                this.f2487b = 10;
            } else if (i9 == 9) {
                this.f2487b = 5;
            } else {
                this.f2487b = 3;
            }
        }
        int i10 = this.f2487b;
        this.f2500r = new int[i10];
        this.f2501s = new int[i10];
        this.f2502t = new int[i10];
        this.f2503u = new int[i10];
        this.C = new float[i10];
        this.f2499p = new Drawable[i10];
        this.q = new Bitmap[i10];
        this.f2504v = new int[i10];
        this.f2506x = new int[i10];
        this.f2505w = new float[i10];
    }

    public final void m(Bitmap[] bitmapArr) {
        int i;
        float f9;
        char c9;
        int i9;
        int i10;
        if (bitmapArr == null || bitmapArr.length == 0) {
            return;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < j(); i12++) {
            this.f2502t[i12] = bitmapArr[i12].getWidth();
            this.f2503u[i12] = bitmapArr[i12].getHeight();
        }
        int j = j();
        this.B = new float[j];
        float f10 = 0.025f;
        char c10 = 1;
        if (this.f2488c != 3) {
            int[] h9 = h(bitmapArr);
            if (h9 == null) {
                return;
            }
            int i13 = j - 1;
            this.B[i13] = bitmapArr[i13].getHeight() / this.f2490e;
            int i14 = this.f2488c;
            if (i14 == 5 || i14 == 4) {
                float[] fArr = this.B;
                fArr[i13] = fArr[i13] - 0.02f;
            }
            for (int i15 = j - 2; i15 >= 0; i15--) {
                if (this.f2488c == 5 && i15 == 2) {
                    int i16 = i15 + 1;
                    h9[2] = h9[i16];
                    float[] fArr2 = this.B;
                    fArr2[i15] = fArr2[i16];
                } else {
                    float[] fArr3 = this.B;
                    float f11 = this.f2490e;
                    fArr3[i15] = bitmapArr[i15].getHeight() / f11;
                    float[] fArr4 = this.B;
                    float f12 = fArr4[i15] + fArr4[i15 + 1];
                    fArr4[i15] = f12;
                    float f13 = f12 - (h9[i10] / f11);
                    fArr4[i15] = f13;
                    float f14 = f13 - 0.03f;
                    fArr4[i15] = f14;
                    int i17 = this.f2488c;
                    if (i17 == 2 && i15 == 1) {
                        fArr4[i15] = f14 - 0.025f;
                    } else if (i17 == 5) {
                        fArr4[2] = fArr4[2] - 0.075f;
                    }
                    if (i17 == 8 && !this.f2495l) {
                        fArr4[i15] = fArr4[i15] + 0.02f;
                    }
                    if (i17 == 0 && i15 == 0) {
                        fArr4[0] = fArr4[0] + 0.025f;
                    }
                }
            }
        }
        float[] fArr5 = this.B;
        float f15 = 0.95f;
        fArr5[0] = Math.min(fArr5[0], 0.95f);
        int i18 = this.f2488c;
        v0 v0Var = this.f2492g;
        if (i18 == 5) {
            int i19 = 20;
            if (this.f2490e > this.f2489d) {
                this.B[2] = (v0Var.s(20) * 0.01f) + 0.5f;
            } else {
                this.B[2] = (v0Var.s(20) * 0.01f) + 0.7f;
            }
            this.N = this.P.getBoolean(this.O, true) ? (float) ((this.f2489d - this.f2502t[2]) * 0.5d) : this.S.nextFloat() * this.f2489d * 0.5f;
            this.F = 200;
            this.G = new float[200];
            this.H = new float[200];
            this.I = new float[200];
            this.J = new float[200];
            this.K = new float[200];
            this.L = new float[200];
            this.M = new float[200];
            int i20 = this.f2502t[2];
            float f16 = (int) (this.f2503u[2] * 0.25f);
            float f17 = 1.0f;
            float f18 = ((1.0f - this.B[2]) * this.f2490e) + (0.1f * f16);
            int i21 = 7;
            float[] fArr6 = {0.17f, 0.16f, 0.13f, 0.15f, 0.05f, 0.1f, 0.05f};
            float[] fArr7 = {0.2f, 0.22f, 0.35f, 0.42f, 0.48f, 0.7f, 0.725f};
            int i22 = 0;
            int i23 = 0;
            while (i22 < i21) {
                int i24 = i11;
                float f19 = fArr6[i22];
                float f20 = f10;
                float f21 = i20;
                float f22 = f19 * f21;
                float f23 = (f17 - f19) * f21;
                float f24 = (fArr7[i22] * f16) + f18;
                ArrayList arrayList = new ArrayList();
                while (f22 + 10.0f < f23) {
                    arrayList.add(Float.valueOf(f22));
                    f22 = (this.S.nextFloat() * 30.0f) + 5.0f + f22;
                    c10 = c10;
                }
                char c11 = c10;
                Collections.shuffle(arrayList, this.S);
                float f25 = f15;
                int i25 = i23;
                int i26 = i24;
                for (int nextInt = this.S.nextInt(i19) + 10; i26 < nextInt && i25 < this.F && i26 < arrayList.size(); nextInt = nextInt) {
                    float f26 = f17;
                    this.I[i25] = (this.S.nextFloat() * 10.0f) + 2.0f;
                    this.J[i25] = this.S.nextFloat() + f26;
                    this.G[i25] = ((Float) arrayList.get(i26)).floatValue() + this.N;
                    this.H[i25] = f24;
                    this.K[i25] = f26;
                    this.L[i25] = f25;
                    this.M[i25] = 0.85f;
                    i26++;
                    i25++;
                    f17 = f26;
                }
                i22++;
                i23 = i25;
                i11 = i24;
                f15 = f25;
                f10 = f20;
                c10 = c11;
                f17 = f17;
                i21 = 7;
                i19 = 20;
            }
            i = i11;
            f9 = f10;
            c9 = c10;
            float f27 = (f16 * 0.58f) + f18;
            float[] fArr8 = this.I;
            fArr8[i23] = 4.0f;
            float[] fArr9 = this.J;
            fArr9[i23] = 4.0f;
            float[] fArr10 = this.G;
            float f28 = this.N;
            fArr10[i23] = f28;
            float[] fArr11 = this.H;
            fArr11[i23] = f27;
            float[] fArr12 = this.K;
            fArr12[i23] = 0.8f;
            float[] fArr13 = this.L;
            fArr13[i23] = 0.0f;
            float[] fArr14 = this.M;
            fArr14[i23] = 0.0f;
            int i27 = i23 + 1;
            fArr8[i27] = 4.0f;
            fArr9[i27] = 4.0f;
            fArr10[i27] = (f28 + i20) - 4.0f;
            fArr11[i27] = f27;
            fArr12[i27] = 0.8f;
            fArr13[i27] = 0.0f;
            fArr14[i27] = 0.0f;
        } else {
            i = 0;
            f9 = 0.025f;
            c9 = 1;
            if (i18 == 3) {
                for (int i28 = 0; i28 < bitmapArr.length; i28++) {
                    this.B[i28] = this.f2503u[i28] / this.f2490e;
                }
            }
        }
        if (v0Var.P1 || this.f2488c != 0) {
            return;
        }
        float f29 = this.f2503u[c9] / this.f2490e;
        if (this.f2495l) {
            float[] fArr15 = this.B;
            fArr15[c9] = f29 + 0.32f;
            fArr15[i] = (((i9 - h(bitmapArr)[c9]) + this.f2503u[i]) / this.f2490e) + 0.32f;
            float[] fArr16 = this.B;
            fArr16[i] = fArr16[i] - f9;
            return;
        }
        float[] fArr17 = this.B;
        fArr17[c9] = f29 + 0.32f;
        fArr17[i] = (((i9 - h(bitmapArr)[c9]) + this.f2503u[i]) / this.f2490e) + 0.32f;
        float[] fArr18 = this.B;
        fArr18[i] = fArr18[i] - 0.05f;
    }

    public final void n() {
        int[] iArr;
        Bitmap[] bitmapArr = this.q;
        if (bitmapArr == null || bitmapArr.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f2487b - 1;
        for (int i9 = this.f2488c == 2 ? 2 : 1; i9 <= i; i9++) {
            arrayList.add(Integer.valueOf(i9));
        }
        Collections.shuffle(arrayList, this.S);
        int i10 = 0;
        while (i10 < this.q.length) {
            this.f2504v[i10] = ((Integer) arrayList.get(i10 % arrayList.size())).intValue();
            int i11 = i10 + 1;
            float min = Math.min(i11 * 0.4f, 1.0f);
            if (i10 == 0) {
                this.f2504v[0] = 0;
                this.f2501s[0] = this.T[0].getBounds().bottom;
            } else if (i10 == 1 && this.f2488c == 2) {
                this.f2504v[1] = 1;
                this.f2501s[1] = this.f2499p[1].getBounds().bottom;
            } else {
                this.f2501s[i10] = (int) (this.f2499p[this.f2504v[i10]].getBounds().bottom * min);
            }
            this.f2500r[i10] = this.f2499p[this.f2504v[i10]].getBounds().right;
            if (this.f2495l) {
                this.C[i10] = (this.f2489d * this.f2491f) / this.f2500r[i10];
            } else {
                this.C[i10] = this.f2489d / this.f2500r[i10];
                if (i10 != 0) {
                    this.f2501s[i10] = (int) (iArr[i10] * 0.6d);
                }
            }
            i10 = i11;
        }
    }
}
