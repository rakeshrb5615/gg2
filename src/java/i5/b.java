package i5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends m {

    /* renamed from: b  reason: collision with root package name */
    public final String f2700b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2701c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2702d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2703e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2704f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f2700b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f2701c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f2702d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f2703e = str4;
        this.f2704f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            b bVar = (b) ((m) obj);
            if (this.f2700b.equals(bVar.f2700b) && this.f2701c.equals(bVar.f2701c) && this.f2702d.equals(bVar.f2702d) && this.f2703e.equals(bVar.f2703e) && this.f2704f == bVar.f2704f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2704f;
        return ((((((((this.f2700b.hashCode() ^ 1000003) * 1000003) ^ this.f2701c.hashCode()) * 1000003) ^ this.f2702d.hashCode()) * 1000003) ^ this.f2703e.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f2700b + ", parameterKey=" + this.f2701c + ", parameterValue=" + this.f2702d + ", variantId=" + this.f2703e + ", templateVersion=" + this.f2704f + "}";
    }
}
