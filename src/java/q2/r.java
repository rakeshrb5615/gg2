package q2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class r extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f5286a;

    public r(q qVar) {
        this.f5286a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f5286a.equals(((r) ((d0) obj)).f5286a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5286a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f5286a + "}";
    }
}
