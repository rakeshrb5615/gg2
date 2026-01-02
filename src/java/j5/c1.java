package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c1 extends f2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2921a;

    public c1(String str) {
        this.f2921a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            return this.f2921a.equals(((c1) ((f2) obj)).f2921a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2921a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v1.a.n(new StringBuilder("Log{content="), this.f2921a, "}");
    }
}
