package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b0 extends n2 {

    /* renamed from: b  reason: collision with root package name */
    public final String f2894b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2895c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2896d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2897e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2898f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2899g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2900h;
    public final String i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final m2 f2901k;

    /* renamed from: l  reason: collision with root package name */
    public final s1 f2902l;

    /* renamed from: m  reason: collision with root package name */
    public final p1 f2903m;

    public b0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f2894b = str;
        this.f2895c = str2;
        this.f2896d = i;
        this.f2897e = str3;
        this.f2898f = str4;
        this.f2899g = str5;
        this.f2900h = str6;
        this.i = str7;
        this.j = str8;
        this.f2901k = m2Var;
        this.f2902l = s1Var;
        this.f2903m = p1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j5.a0] */
    public final a0 a() {
        ?? obj = new Object();
        obj.f2868a = this.f2894b;
        obj.f2869b = this.f2895c;
        obj.f2870c = this.f2896d;
        obj.f2871d = this.f2897e;
        obj.f2872e = this.f2898f;
        obj.f2873f = this.f2899g;
        obj.f2874g = this.f2900h;
        obj.f2875h = this.i;
        obj.i = this.j;
        obj.j = this.f2901k;
        obj.f2876k = this.f2902l;
        obj.f2877l = this.f2903m;
        obj.f2878m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        m2 m2Var;
        s1 s1Var;
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            p1 p1Var2 = b0Var.f2903m;
            s1 s1Var2 = b0Var.f2902l;
            m2 m2Var2 = b0Var.f2901k;
            String str4 = b0Var.f2900h;
            String str5 = b0Var.f2899g;
            String str6 = b0Var.f2898f;
            if (this.f2894b.equals(b0Var.f2894b) && this.f2895c.equals(b0Var.f2895c) && this.f2896d == b0Var.f2896d && this.f2897e.equals(b0Var.f2897e) && ((str = this.f2898f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f2899g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f2900h) != null ? str3.equals(str4) : str4 == null) && this.i.equals(b0Var.i) && this.j.equals(b0Var.j) && ((m2Var = this.f2901k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.f2902l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.f2903m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f2894b.hashCode() ^ 1000003) * 1000003) ^ this.f2895c.hashCode()) * 1000003) ^ this.f2896d) * 1000003) ^ this.f2897e.hashCode()) * 1000003;
        String str = this.f2898f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2899g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2900h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        m2 m2Var = this.f2901k;
        int hashCode5 = (hashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.f2902l;
        int hashCode6 = (hashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.f2903m;
        return hashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f2894b + ", gmpAppId=" + this.f2895c + ", platform=" + this.f2896d + ", installationUuid=" + this.f2897e + ", firebaseInstallationId=" + this.f2898f + ", firebaseAuthenticationToken=" + this.f2899g + ", appQualitySessionId=" + this.f2900h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.f2901k + ", ndkPayload=" + this.f2902l + ", appExitInfo=" + this.f2903m + "}";
    }
}
