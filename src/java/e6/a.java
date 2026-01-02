package e6;

import g2.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f1311a;

    /* renamed from: b  reason: collision with root package name */
    public int f1312b;

    /* renamed from: c  reason: collision with root package name */
    public String f1313c;

    /* renamed from: d  reason: collision with root package name */
    public String f1314d;

    /* renamed from: e  reason: collision with root package name */
    public long f1315e;

    /* renamed from: f  reason: collision with root package name */
    public long f1316f;

    /* renamed from: g  reason: collision with root package name */
    public String f1317g;

    /* renamed from: h  reason: collision with root package name */
    public byte f1318h;

    public final b a() {
        if (this.f1318h != 3 || this.f1312b == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f1312b == 0) {
                sb.append(" registrationStatus");
            }
            if ((this.f1318h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.f1318h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(g.g("Missing required properties:", sb));
        }
        return new b(this.f1311a, this.f1312b, this.f1313c, this.f1314d, this.f1315e, this.f1316f, this.f1317g);
    }
}
