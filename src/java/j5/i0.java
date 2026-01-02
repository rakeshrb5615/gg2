package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public String f2990a;

    /* renamed from: b  reason: collision with root package name */
    public String f2991b;

    /* renamed from: c  reason: collision with root package name */
    public String f2992c;

    /* renamed from: d  reason: collision with root package name */
    public long f2993d;

    /* renamed from: e  reason: collision with root package name */
    public Long f2994e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2995f;

    /* renamed from: g  reason: collision with root package name */
    public u1 f2996g;

    /* renamed from: h  reason: collision with root package name */
    public l2 f2997h;
    public k2 i;
    public v1 j;

    /* renamed from: k  reason: collision with root package name */
    public List f2998k;

    /* renamed from: l  reason: collision with root package name */
    public int f2999l;

    /* renamed from: m  reason: collision with root package name */
    public byte f3000m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.f3000m != 7 || (str = this.f2990a) == null || (str2 = this.f2991b) == null || (u1Var = this.f2996g) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f2990a == null) {
                sb.append(" generator");
            }
            if (this.f2991b == null) {
                sb.append(" identifier");
            }
            if ((this.f3000m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f3000m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f2996g == null) {
                sb.append(" app");
            }
            if ((this.f3000m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new j0(str, str2, this.f2992c, this.f2993d, this.f2994e, this.f2995f, u1Var, this.f2997h, this.i, this.j, this.f2998k, this.f2999l);
    }
}
