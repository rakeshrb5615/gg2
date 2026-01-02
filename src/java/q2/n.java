package q2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n extends y {

    /* renamed from: a  reason: collision with root package name */
    public final l f5281a;

    public n(l lVar) {
        this.f5281a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            Object obj2 = x.f5304a;
            if (obj2.equals(obj2)) {
                return this.f5281a.equals(((n) yVar).f5281a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((x.f5304a.hashCode() ^ 1000003) * 1000003) ^ this.f5281a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f5304a + ", androidClientInfo=" + this.f5281a + "}";
    }
}
