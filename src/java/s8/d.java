package s8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final long[] f5861e = new long[0];

    /* renamed from: a  reason: collision with root package name */
    public final q8.d f5862a;

    /* renamed from: b  reason: collision with root package name */
    public final u8.e f5863b;

    /* renamed from: c  reason: collision with root package name */
    public long f5864c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f5865d;

    public d(q8.d dVar, u8.e eVar) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        this.f5862a = dVar;
        this.f5863b = eVar;
        int d9 = dVar.d();
        if (d9 <= 64) {
            this.f5864c = d9 != 64 ? (-1) << d9 : 0L;
            this.f5865d = f5861e;
            return;
        }
        this.f5864c = 0L;
        int i = (d9 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((d9 & 63) != 0) {
            jArr[i - 1] = (-1) << d9;
        }
        this.f5865d = jArr;
    }
}
