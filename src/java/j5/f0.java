package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f0 extends q1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2959a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2960b;

    public f0(String str, String str2) {
        this.f2959a = str;
        this.f2960b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.f2959a.equals(f0Var.f2959a) && this.f2960b.equals(f0Var.f2960b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2959a.hashCode() ^ 1000003) * 1000003) ^ this.f2960b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f2959a);
        sb.append(", value=");
        return v1.a.n(sb, this.f2960b, "}");
    }
}
