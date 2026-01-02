package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public String f2868a;

    /* renamed from: b  reason: collision with root package name */
    public String f2869b;

    /* renamed from: c  reason: collision with root package name */
    public int f2870c;

    /* renamed from: d  reason: collision with root package name */
    public String f2871d;

    /* renamed from: e  reason: collision with root package name */
    public String f2872e;

    /* renamed from: f  reason: collision with root package name */
    public String f2873f;

    /* renamed from: g  reason: collision with root package name */
    public String f2874g;

    /* renamed from: h  reason: collision with root package name */
    public String f2875h;
    public String i;
    public m2 j;

    /* renamed from: k  reason: collision with root package name */
    public s1 f2876k;

    /* renamed from: l  reason: collision with root package name */
    public p1 f2877l;

    /* renamed from: m  reason: collision with root package name */
    public byte f2878m;

    public final b0 a() {
        if (this.f2878m != 1 || this.f2868a == null || this.f2869b == null || this.f2871d == null || this.f2875h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f2868a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f2869b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f2878m) == 0) {
                sb.append(" platform");
            }
            if (this.f2871d == null) {
                sb.append(" installationUuid");
            }
            if (this.f2875h == null) {
                sb.append(" buildVersion");
            }
            if (this.i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new b0(this.f2868a, this.f2869b, this.f2870c, this.f2871d, this.f2872e, this.f2873f, this.f2874g, this.f2875h, this.i, this.j, this.f2876k, this.f2877l);
    }
}
