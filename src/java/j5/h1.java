package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public int f2977a;

    /* renamed from: b  reason: collision with root package name */
    public String f2978b;

    /* renamed from: c  reason: collision with root package name */
    public String f2979c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2980d;

    /* renamed from: e  reason: collision with root package name */
    public byte f2981e;

    public final i1 a() {
        String str;
        String str2;
        if (this.f2981e != 3 || (str = this.f2978b) == null || (str2 = this.f2979c) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f2981e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f2978b == null) {
                sb.append(" version");
            }
            if (this.f2979c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f2981e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new i1(str, str2, this.f2977a, this.f2980d);
    }
}
