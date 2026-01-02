package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f3041a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f3042b;

    /* renamed from: c  reason: collision with root package name */
    public final m1 f3043c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f3041a = l1Var;
        this.f3042b = n1Var;
        this.f3043c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f3041a.equals(k1Var.f3041a) && this.f3042b.equals(k1Var.f3042b) && this.f3043c.equals(k1Var.f3043c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3041a.hashCode() ^ 1000003) * 1000003) ^ this.f3042b.hashCode()) * 1000003) ^ this.f3043c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f3041a + ", osData=" + this.f3042b + ", deviceData=" + this.f3043c + "}";
    }
}
