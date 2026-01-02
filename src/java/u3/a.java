package u3;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f6061k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f6062l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f6063a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f6064b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f6065c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6066d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6067e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6068f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f6069g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f6070h;

    public a() {
        Paint paint = new Paint();
        this.f6070h = paint;
        Paint paint2 = new Paint();
        this.f6063a = paint2;
        this.f6066d = h0.a.h(-16777216, 68);
        this.f6067e = h0.a.h(-16777216, 20);
        this.f6068f = h0.a.h(-16777216, 0);
        paint2.setColor(this.f6066d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f6064b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f6065c = new Paint(paint3);
    }
}
