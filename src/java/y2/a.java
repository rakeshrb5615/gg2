package y2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f6758f = new a(200, 10000, 10485760, 604800000, 81920);

    /* renamed from: a  reason: collision with root package name */
    public final long f6759a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6760b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6761c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6762d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6763e;

    public a(int i, int i9, long j, long j8, int i10) {
        this.f6759a = j;
        this.f6760b = i;
        this.f6761c = i9;
        this.f6762d = j8;
        this.f6763e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6759a == aVar.f6759a && this.f6760b == aVar.f6760b && this.f6761c == aVar.f6761c && this.f6762d == aVar.f6762d && this.f6763e == aVar.f6763e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6759a;
        long j8 = this.f6762d;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f6760b) * 1000003) ^ this.f6761c) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f6763e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f6759a + ", loadBatchSize=" + this.f6760b + ", criticalSectionEnterTimeoutMs=" + this.f6761c + ", eventCleanUpAge=" + this.f6762d + ", maxBlobByteSizePerRow=" + this.f6763e + "}";
    }
}
