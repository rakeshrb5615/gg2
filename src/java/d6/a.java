package d6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1128a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1129b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1130c;

    public a(String str, long j, long j8) {
        this.f1128a = str;
        this.f1129b = j;
        this.f1130c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1128a.equals(aVar.f1128a) && this.f1129b == aVar.f1129b && this.f1130c == aVar.f1130c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1129b;
        long j8 = this.f1130c;
        return ((((this.f1128a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f1128a + ", tokenExpirationTimestamp=" + this.f1129b + ", tokenCreationTimestamp=" + this.f1130c + "}";
    }
}
