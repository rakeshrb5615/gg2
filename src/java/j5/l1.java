package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3049a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3050b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3051c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3052d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3053e;

    /* renamed from: f  reason: collision with root package name */
    public final k2.c f3054f;

    public l1(String str, String str2, String str3, String str4, int i, k2.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f3049a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f3050b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f3051c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f3052d = str4;
        this.f3053e = i;
        this.f3054f = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            return this.f3049a.equals(l1Var.f3049a) && this.f3050b.equals(l1Var.f3050b) && this.f3051c.equals(l1Var.f3051c) && this.f3052d.equals(l1Var.f3052d) && this.f3053e == l1Var.f3053e && this.f3054f.equals(l1Var.f3054f);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f3049a.hashCode() ^ 1000003) * 1000003) ^ this.f3050b.hashCode()) * 1000003) ^ this.f3051c.hashCode()) * 1000003) ^ this.f3052d.hashCode()) * 1000003) ^ this.f3053e) * 1000003) ^ this.f3054f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f3049a + ", versionCode=" + this.f3050b + ", versionName=" + this.f3051c + ", installUuid=" + this.f3052d + ", deliveryMechanism=" + this.f3053e + ", developmentPlatformProvider=" + this.f3054f + "}";
    }
}
