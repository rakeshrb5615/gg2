package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public f1 f2941a;

    /* renamed from: b  reason: collision with root package name */
    public String f2942b;

    /* renamed from: c  reason: collision with root package name */
    public String f2943c;

    /* renamed from: d  reason: collision with root package name */
    public long f2944d;

    /* renamed from: e  reason: collision with root package name */
    public byte f2945e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f2945e != 1 || (f1Var = this.f2941a) == null || (str = this.f2942b) == null || (str2 = this.f2943c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f2941a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f2942b == null) {
                sb.append(" parameterKey");
            }
            if (this.f2943c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f2945e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new e1(f1Var, str, str2, this.f2944d);
    }
}
