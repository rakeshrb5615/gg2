package a2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f256a;

    /* renamed from: b  reason: collision with root package name */
    public int f257b;

    /* renamed from: c  reason: collision with root package name */
    public int f258c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.f256a;
            if (i != aVar.f256a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f258c - this.f257b) != 1 || this.f258c != aVar.f257b || this.f257b != aVar.f258c) {
                return this.f258c == aVar.f258c && this.f257b == aVar.f257b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f256a * 31) + this.f257b) * 31) + this.f258c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f256a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f257b);
        sb.append("c:");
        sb.append(this.f258c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
