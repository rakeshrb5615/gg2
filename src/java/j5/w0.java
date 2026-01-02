package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public long f3179a;

    /* renamed from: b  reason: collision with root package name */
    public String f3180b;

    /* renamed from: c  reason: collision with root package name */
    public String f3181c;

    /* renamed from: d  reason: collision with root package name */
    public long f3182d;

    /* renamed from: e  reason: collision with root package name */
    public int f3183e;

    /* renamed from: f  reason: collision with root package name */
    public byte f3184f;

    public final x0 a() {
        String str;
        if (this.f3184f != 7 || (str = this.f3180b) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f3184f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f3180b == null) {
                sb.append(" symbol");
            }
            if ((this.f3184f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f3184f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new x0(this.f3179a, str, this.f3181c, this.f3182d, this.f3183e);
    }
}
