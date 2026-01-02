package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class x0 extends z1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f3187a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3188b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3189c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3190d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3191e;

    public x0(long j, String str, String str2, long j8, int i) {
        this.f3187a = j;
        this.f3188b = str;
        this.f3189c = str2;
        this.f3190d = j8;
        this.f3191e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.f3189c;
            if (this.f3187a == x0Var.f3187a && this.f3188b.equals(x0Var.f3188b) && ((str = this.f3189c) != null ? str.equals(str2) : str2 == null) && this.f3190d == x0Var.f3190d && this.f3191e == x0Var.f3191e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3187a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3188b.hashCode()) * 1000003;
        String str = this.f3189c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j8 = this.f3190d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f3191e;
    }

    public final String toString() {
        return "Frame{pc=" + this.f3187a + ", symbol=" + this.f3188b + ", file=" + this.f3189c + ", offset=" + this.f3190d + ", importance=" + this.f3191e + "}";
    }
}
