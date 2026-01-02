package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i1 extends k2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3001a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3002b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3003c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3004d;

    public i1(String str, String str2, int i, boolean z9) {
        this.f3001a = i;
        this.f3002b = str;
        this.f3003c = str2;
        this.f3004d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f3001a == i1Var.f3001a && this.f3002b.equals(i1Var.f3002b) && this.f3003c.equals(i1Var.f3003c) && this.f3004d == i1Var.f3004d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3001a ^ 1000003) * 1000003) ^ this.f3002b.hashCode()) * 1000003) ^ this.f3003c.hashCode()) * 1000003) ^ (this.f3004d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f3001a + ", version=" + this.f3002b + ", buildVersion=" + this.f3003c + ", jailbroken=" + this.f3004d + "}";
    }
}
