package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b1 extends e2 {

    /* renamed from: a  reason: collision with root package name */
    public final Double f2904a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2905b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2906c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2907d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2908e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2909f;

    public b1(Double d9, int i, boolean z9, int i9, long j, long j8) {
        this.f2904a = d9;
        this.f2905b = i;
        this.f2906c = z9;
        this.f2907d = i9;
        this.f2908e = j;
        this.f2909f = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d9 = this.f2904a;
            if (d9 != null ? d9.equals(((b1) e2Var).f2904a) : ((b1) e2Var).f2904a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f2905b == b1Var.f2905b && this.f2906c == b1Var.f2906c && this.f2907d == b1Var.f2907d && this.f2908e == b1Var.f2908e && this.f2909f == b1Var.f2909f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d9 = this.f2904a;
        int hashCode = ((((d9 == null ? 0 : d9.hashCode()) ^ 1000003) * 1000003) ^ this.f2905b) * 1000003;
        int i = this.f2906c ? 1231 : 1237;
        long j = this.f2908e;
        long j8 = this.f2909f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f2907d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f2904a + ", batteryVelocity=" + this.f2905b + ", proximityOn=" + this.f2906c + ", orientation=" + this.f2907d + ", ramUsed=" + this.f2908e + ", diskUsed=" + this.f2909f + "}";
    }
}
