package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class n0 extends v1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3081a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3082b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3083c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3084d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3085e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3086f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3087g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3088h;
    public final String i;

    public n0(int i, String str, int i9, long j, long j8, boolean z9, int i10, String str2, String str3) {
        this.f3081a = i;
        this.f3082b = str;
        this.f3083c = i9;
        this.f3084d = j;
        this.f3085e = j8;
        this.f3086f = z9;
        this.f3087g = i10;
        this.f3088h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f3081a == n0Var.f3081a && this.f3082b.equals(n0Var.f3082b) && this.f3083c == n0Var.f3083c && this.f3084d == n0Var.f3084d && this.f3085e == n0Var.f3085e && this.f3086f == n0Var.f3086f && this.f3087g == n0Var.f3087g && this.f3088h.equals(n0Var.f3088h) && this.i.equals(n0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3084d;
        long j8 = this.f3085e;
        return ((((((((((((((((this.f3081a ^ 1000003) * 1000003) ^ this.f3082b.hashCode()) * 1000003) ^ this.f3083c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f3086f ? 1231 : 1237)) * 1000003) ^ this.f3087g) * 1000003) ^ this.f3088h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f3081a);
        sb.append(", model=");
        sb.append(this.f3082b);
        sb.append(", cores=");
        sb.append(this.f3083c);
        sb.append(", ram=");
        sb.append(this.f3084d);
        sb.append(", diskSpace=");
        sb.append(this.f3085e);
        sb.append(", simulator=");
        sb.append(this.f3086f);
        sb.append(", state=");
        sb.append(this.f3087g);
        sb.append(", manufacturer=");
        sb.append(this.f3088h);
        sb.append(", modelClass=");
        return v1.a.n(sb, this.i, "}");
    }
}
