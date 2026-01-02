package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class v0 extends a2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3173a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3174b;

    /* renamed from: c  reason: collision with root package name */
    public final List f3175c;

    public v0(String str, int i, List list) {
        this.f3173a = str;
        this.f3174b = i;
        this.f3175c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f3173a.equals(v0Var.f3173a) && this.f3174b == v0Var.f3174b && this.f3175c.equals(v0Var.f3175c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3173a.hashCode() ^ 1000003) * 1000003) ^ this.f3174b) * 1000003) ^ this.f3175c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f3173a + ", importance=" + this.f3174b + ", frames=" + this.f3175c + "}";
    }
}
