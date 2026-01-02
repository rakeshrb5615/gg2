package q2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class o extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final r f5282a;

    public o(r rVar) {
        z zVar = z.f5306a;
        this.f5282a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            if (this.f5282a.equals(((o) ((a0) obj)).f5282a)) {
                Object obj2 = z.f5306a;
                return obj2.equals(obj2);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5282a.hashCode() ^ 1000003) * 1000003) ^ z.f5306a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f5282a + ", productIdOrigin=" + z.f5306a + "}";
    }
}
