package k4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f3398a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3399b;

    public m(int i, long j) {
        this.f3398a = i;
        this.f3399b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f3398a == mVar.f3398a && this.f3399b == mVar.f3399b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3399b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.f3398a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f3398a + ", eventTimestamp=" + this.f3399b + "}";
    }
}
