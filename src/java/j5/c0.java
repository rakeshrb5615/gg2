package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public int f2913a;

    /* renamed from: b  reason: collision with root package name */
    public String f2914b;

    /* renamed from: c  reason: collision with root package name */
    public int f2915c;

    /* renamed from: d  reason: collision with root package name */
    public int f2916d;

    /* renamed from: e  reason: collision with root package name */
    public long f2917e;

    /* renamed from: f  reason: collision with root package name */
    public long f2918f;

    /* renamed from: g  reason: collision with root package name */
    public long f2919g;

    /* renamed from: h  reason: collision with root package name */
    public String f2920h;
    public List i;
    public byte j;

    public final d0 a() {
        String str;
        if (this.j != 63 || (str = this.f2914b) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f2914b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new d0(this.f2913a, str, this.f2915c, this.f2916d, this.f2917e, this.f2918f, this.f2919g, this.f2920h, this.i);
    }
}
