package o2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f5005a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f5005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f5005a.equals(((c) obj).f5005a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5005a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v1.a.n(new StringBuilder("Encoding{name=\""), this.f5005a, "\"}");
    }
}
