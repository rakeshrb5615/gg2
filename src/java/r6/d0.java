package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5631a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5632b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5633c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5634d;

    public d0(String str, int i, int i9, boolean z9) {
        this.f5631a = str;
        this.f5632b = i;
        this.f5633c = i9;
        this.f5634d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return kotlin.jvm.internal.j.a(this.f5631a, d0Var.f5631a) && this.f5632b == d0Var.f5632b && this.f5633c == d0Var.f5633c && this.f5634d == d0Var.f5634d;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f5632b);
        int hashCode2 = Integer.hashCode(this.f5633c);
        return Boolean.hashCode(this.f5634d) + ((hashCode2 + ((hashCode + (this.f5631a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f5631a + ", pid=" + this.f5632b + ", importance=" + this.f5633c + ", isDefaultProcess=" + this.f5634d + ')';
    }
}
