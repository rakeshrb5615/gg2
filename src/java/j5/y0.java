package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public String f3197a;

    /* renamed from: b  reason: collision with root package name */
    public int f3198b;

    /* renamed from: c  reason: collision with root package name */
    public int f3199c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3200d;

    /* renamed from: e  reason: collision with root package name */
    public byte f3201e;

    public final z0 a() {
        String str;
        if (this.f3201e != 7 || (str = this.f3197a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f3197a == null) {
                sb.append(" processName");
            }
            if ((this.f3201e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f3201e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f3201e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new z0(str, this.f3198b, this.f3199c, this.f3200d);
    }
}
