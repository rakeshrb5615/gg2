package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e0 extends o1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2949a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2950b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2951c;

    public e0(String str, String str2, String str3) {
        this.f2949a = str;
        this.f2950b = str2;
        this.f2951c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f2949a.equals(e0Var.f2949a) && this.f2950b.equals(e0Var.f2950b) && this.f2951c.equals(e0Var.f2951c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2949a.hashCode() ^ 1000003) * 1000003) ^ this.f2950b.hashCode()) * 1000003) ^ this.f2951c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f2949a);
        sb.append(", libraryName=");
        sb.append(this.f2950b);
        sb.append(", buildId=");
        return v1.a.n(sb, this.f2951c, "}");
    }
}
