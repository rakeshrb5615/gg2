package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final j f5689a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5690b;

    /* renamed from: c  reason: collision with root package name */
    public final double f5691c;

    public k(j jVar, j jVar2, double d9) {
        this.f5689a = jVar;
        this.f5690b = jVar2;
        this.f5691c = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f5689a == kVar.f5689a && this.f5690b == kVar.f5690b && Double.compare(this.f5691c, kVar.f5691c) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5690b.hashCode();
        return Double.hashCode(this.f5691c) + ((hashCode + (this.f5689a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f5689a + ", crashlytics=" + this.f5690b + ", sessionSamplingRate=" + this.f5691c + ')';
    }
}
