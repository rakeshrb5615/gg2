package t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f5925a;

    /* renamed from: b  reason: collision with root package name */
    public int f5926b;

    /* renamed from: c  reason: collision with root package name */
    public float f5927c;

    /* renamed from: d  reason: collision with root package name */
    public float f5928d;

    /* renamed from: e  reason: collision with root package name */
    public long f5929e;

    /* renamed from: f  reason: collision with root package name */
    public long f5930f;

    /* renamed from: g  reason: collision with root package name */
    public long f5931g;

    /* renamed from: h  reason: collision with root package name */
    public float f5932h;
    public int i;

    public final float a(long j) {
        long j8 = this.f5929e;
        if (j < j8) {
            return 0.0f;
        }
        long j9 = this.f5931g;
        if (j9 < 0 || j < j9) {
            return d.b(((float) (j - j8)) / this.f5925a, 0.0f, 1.0f) * 0.5f;
        }
        float f9 = this.f5932h;
        return (d.b(((float) (j - j9)) / this.i, 0.0f, 1.0f) * f9) + (1.0f - f9);
    }
}
