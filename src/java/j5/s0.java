package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class s0 extends w1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f3142a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3143b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3144c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3145d;

    public s0(long j, long j8, String str, String str2) {
        this.f3142a = j;
        this.f3143b = j8;
        this.f3144c = str;
        this.f3145d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            String str2 = s0Var.f3145d;
            if (this.f3142a == s0Var.f3142a && this.f3143b == s0Var.f3143b && this.f3144c.equals(s0Var.f3144c) && ((str = this.f3145d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3142a;
        long j8 = this.f3143b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f3144c.hashCode()) * 1000003;
        String str = this.f3145d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f3142a);
        sb.append(", size=");
        sb.append(this.f3143b);
        sb.append(", name=");
        sb.append(this.f3144c);
        sb.append(", uuid=");
        return v1.a.n(sb, this.f3145d, "}");
    }
}
