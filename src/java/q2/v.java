package q2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class v extends i0 {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f5302a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f5303b;

    public v(h0 h0Var, g0 g0Var) {
        this.f5302a = h0Var;
        this.f5303b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f5302a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f5302a) : ((v) i0Var).f5302a == null) {
                g0 g0Var = this.f5303b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f5303b) : ((v) i0Var).f5303b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f5302a;
        int hashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f5303b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5302a + ", mobileSubtype=" + this.f5303b + "}";
    }
}
