package q6;

import g2.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f5424a;

    /* renamed from: b  reason: collision with root package name */
    public String f5425b;

    /* renamed from: c  reason: collision with root package name */
    public String f5426c;

    /* renamed from: d  reason: collision with root package name */
    public String f5427d;

    /* renamed from: e  reason: collision with root package name */
    public long f5428e;

    /* renamed from: f  reason: collision with root package name */
    public byte f5429f;

    public final c a() {
        if (this.f5429f != 1 || this.f5424a == null || this.f5425b == null || this.f5426c == null || this.f5427d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f5424a == null) {
                sb.append(" rolloutId");
            }
            if (this.f5425b == null) {
                sb.append(" variantId");
            }
            if (this.f5426c == null) {
                sb.append(" parameterKey");
            }
            if (this.f5427d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f5429f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(g.g("Missing required properties:", sb));
        }
        return new c(this.f5424a, this.f5425b, this.f5426c, this.f5427d, this.f5428e);
    }
}
