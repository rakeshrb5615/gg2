package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class z0 extends c2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3204a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3205b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3206c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3207d;

    public z0(String str, int i, int i9, boolean z9) {
        this.f3204a = str;
        this.f3205b = i;
        this.f3206c = i9;
        this.f3207d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f3204a.equals(z0Var.f3204a) && this.f3205b == z0Var.f3205b && this.f3206c == z0Var.f3206c && this.f3207d == z0Var.f3207d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3204a.hashCode() ^ 1000003) * 1000003) ^ this.f3205b) * 1000003) ^ this.f3206c) * 1000003) ^ (this.f3207d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f3204a + ", pid=" + this.f3205b + ", importance=" + this.f3206c + ", defaultProcess=" + this.f3207d + "}";
    }
}
