package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public long f3095a;

    /* renamed from: b  reason: collision with root package name */
    public String f3096b;

    /* renamed from: c  reason: collision with root package name */
    public d2 f3097c;

    /* renamed from: d  reason: collision with root package name */
    public e2 f3098d;

    /* renamed from: e  reason: collision with root package name */
    public f2 f3099e;

    /* renamed from: f  reason: collision with root package name */
    public i2 f3100f;

    /* renamed from: g  reason: collision with root package name */
    public byte f3101g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.f3101g != 1 || (str = this.f3096b) == null || (d2Var = this.f3097c) == null || (e2Var = this.f3098d) == null) {
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f3101g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f3096b == null) {
                sb.append(" type");
            }
            if (this.f3097c == null) {
                sb.append(" app");
            }
            if (this.f3098d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new p0(this.f3095a, str, d2Var, e2Var, this.f3099e, this.f3100f);
    }
}
