package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class k0 extends u1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3036b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3037c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3038d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3039e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3040f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f3035a = str;
        this.f3036b = str2;
        this.f3037c = str3;
        this.f3038d = str4;
        this.f3039e = str5;
        this.f3040f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            String str5 = k0Var.f3040f;
            String str6 = k0Var.f3039e;
            String str7 = k0Var.f3038d;
            String str8 = k0Var.f3037c;
            if (this.f3035a.equals(k0Var.f3035a) && this.f3036b.equals(k0Var.f3036b) && ((str = this.f3037c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f3038d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f3039e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f3040f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f3035a.hashCode() ^ 1000003) * 1000003) ^ this.f3036b.hashCode()) * 1000003;
        String str = this.f3037c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f3038d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3039e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3040f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f3035a);
        sb.append(", version=");
        sb.append(this.f3036b);
        sb.append(", displayVersion=");
        sb.append(this.f3037c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f3038d);
        sb.append(", developmentPlatform=");
        sb.append(this.f3039e);
        sb.append(", developmentPlatformVersion=");
        return v1.a.n(sb, this.f3040f, "}");
    }
}
