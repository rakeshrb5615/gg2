package l6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3785a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3786b;

    public a(String str, String str2) {
        this.f3785a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f3786b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3785a.equals(aVar.f3785a) && this.f3786b.equals(aVar.f3786b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3785a.hashCode() ^ 1000003) * 1000003) ^ this.f3786b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f3785a);
        sb.append(", version=");
        return v1.a.n(sb, this.f3786b, "}");
    }
}
