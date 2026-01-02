package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public int f3061a;

    /* renamed from: b  reason: collision with root package name */
    public String f3062b;

    /* renamed from: c  reason: collision with root package name */
    public int f3063c;

    /* renamed from: d  reason: collision with root package name */
    public long f3064d;

    /* renamed from: e  reason: collision with root package name */
    public long f3065e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3066f;

    /* renamed from: g  reason: collision with root package name */
    public int f3067g;

    /* renamed from: h  reason: collision with root package name */
    public String f3068h;
    public String i;
    public byte j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.j != 63 || (str = this.f3062b) == null || (str2 = this.f3068h) == null || (str3 = this.i) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f3062b == null) {
                sb.append(" model");
            }
            if ((this.j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f3068h == null) {
                sb.append(" manufacturer");
            }
            if (this.i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new n0(this.f3061a, str, this.f3063c, this.f3064d, this.f3065e, this.f3066f, this.f3067g, str2, str3);
    }
}
