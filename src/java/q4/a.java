package q4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f5372a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5373b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5374c;

    public a(long j, long j8, long j9) {
        this.f5372a = j;
        this.f5373b = j8;
        this.f5374c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5372a == aVar.f5372a && this.f5373b == aVar.f5373b && this.f5374c == aVar.f5374c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5372a;
        long j8 = this.f5373b;
        long j9 = this.f5374c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f5372a + ", elapsedRealtime=" + this.f5373b + ", uptimeMillis=" + this.f5374c + "}";
    }
}
