package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class u0 extends y1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3165a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3166b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3167c;

    public u0(String str, String str2, long j) {
        this.f3165a = str;
        this.f3166b = str2;
        this.f3167c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f3165a.equals(u0Var.f3165a) && this.f3166b.equals(u0Var.f3166b) && this.f3167c == u0Var.f3167c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3167c;
        return ((((this.f3165a.hashCode() ^ 1000003) * 1000003) ^ this.f3166b.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "Signal{name=" + this.f3165a + ", code=" + this.f3166b + ", address=" + this.f3167c + "}";
    }
}
