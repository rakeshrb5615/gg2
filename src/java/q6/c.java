package q6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c extends e {

    /* renamed from: b  reason: collision with root package name */
    public final String f5430b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5431c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5432d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5433e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5434f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f5430b = str;
        this.f5431c = str2;
        this.f5432d = str3;
        this.f5433e = str4;
        this.f5434f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f5430b.equals(cVar.f5430b) && this.f5431c.equals(cVar.f5431c) && this.f5432d.equals(cVar.f5432d) && this.f5433e.equals(cVar.f5433e) && this.f5434f == cVar.f5434f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5434f;
        return ((((((((this.f5430b.hashCode() ^ 1000003) * 1000003) ^ this.f5431c.hashCode()) * 1000003) ^ this.f5432d.hashCode()) * 1000003) ^ this.f5433e.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f5430b + ", variantId=" + this.f5431c + ", parameterKey=" + this.f5432d + ", parameterValue=" + this.f5433e + ", templateVersion=" + this.f5434f + "}";
    }
}
