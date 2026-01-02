package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e1 extends h2 {

    /* renamed from: a  reason: collision with root package name */
    public final g2 f2952a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2953b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2954c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2955d;

    public e1(f1 f1Var, String str, String str2, long j) {
        this.f2952a = f1Var;
        this.f2953b = str;
        this.f2954c = str2;
        this.f2955d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f2952a.equals(e1Var.f2952a) && this.f2953b.equals(e1Var.f2953b) && this.f2954c.equals(e1Var.f2954c) && this.f2955d == e1Var.f2955d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2955d;
        return ((((((this.f2952a.hashCode() ^ 1000003) * 1000003) ^ this.f2953b.hashCode()) * 1000003) ^ this.f2954c.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f2952a + ", parameterKey=" + this.f2953b + ", parameterValue=" + this.f2954c + ", templateVersion=" + this.f2955d + "}";
    }
}
