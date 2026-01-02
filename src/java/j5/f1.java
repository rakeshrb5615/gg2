package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f1 extends g2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2961a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2962b;

    public f1(String str, String str2) {
        this.f2961a = str;
        this.f2962b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f2961a.equals(f1Var.f2961a) && this.f2962b.equals(f1Var.f2962b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2961a.hashCode() ^ 1000003) * 1000003) ^ this.f2962b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f2961a);
        sb.append(", variantId=");
        return v1.a.n(sb, this.f2962b, "}");
    }
}
