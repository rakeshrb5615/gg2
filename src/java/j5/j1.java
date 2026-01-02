package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j1 extends l2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3026a;

    public j1(String str) {
        this.f3026a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return this.f3026a.equals(((j1) ((l2) obj)).f3026a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3026a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v1.a.n(new StringBuilder("User{identifier="), this.f3026a, "}");
    }
}
