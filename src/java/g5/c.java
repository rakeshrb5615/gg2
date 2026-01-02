package g5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f1776a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1777b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1778c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f1776a = str;
        this.f1777b = str2;
        this.f1778c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str3 = cVar.f1778c;
            String str4 = cVar.f1777b;
            if (this.f1776a.equals(cVar.f1776a) && ((str = this.f1777b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f1778c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1776a.hashCode() ^ 1000003) * 1000003;
        String str = this.f1777b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1778c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f1776a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f1777b);
        sb.append(", firebaseAuthenticationToken=");
        return v1.a.n(sb, this.f1778c, "}");
    }
}
