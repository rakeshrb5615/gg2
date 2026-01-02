package i2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2362a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2363b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2364c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f2365d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2366e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f2367f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2368g;

    /* renamed from: h  reason: collision with root package name */
    public float f2369h;
    public final v0 i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2370k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap[] f2371l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f2372m;

    /* renamed from: n  reason: collision with root package name */
    public float[][] f2373n;

    /* renamed from: o  reason: collision with root package name */
    public float[][] f2374o;

    /* renamed from: p  reason: collision with root package name */
    public int[][] f2375p;
    public int[][] q;

    /* renamed from: r  reason: collision with root package name */
    public int[][] f2376r;

    /* renamed from: s  reason: collision with root package name */
    public int[][] f2377s;

    /* renamed from: t  reason: collision with root package name */
    public int[][][] f2378t;

    /* renamed from: u  reason: collision with root package name */
    public int[][][] f2379u;

    /* renamed from: v  reason: collision with root package name */
    public int[][][] f2380v;

    /* renamed from: w  reason: collision with root package name */
    public int[][][][] f2381w;

    /* renamed from: x  reason: collision with root package name */
    public int[][][][] f2382x;

    /* renamed from: y  reason: collision with root package name */
    public final Random f2383y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f2384z = null;
    public int A = 0;

    public i(Context context, float f9, v0 v0Var, float f10, float f11) {
        this.f2362a = context;
        this.f2368g = f9;
        this.i = v0Var;
        this.f2364c = f10;
        this.f2363b = f11;
        this.f2383y = v0Var.O0;
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.j = e0.c.getColor(context, 2131100675);
        this.f2370k = e0.c.getColor(context, 2131100676);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f2371l;
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            this.f2371l = null;
        }
    }
}
