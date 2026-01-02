package a5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final x f596a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f597b;

    public l(x xVar, boolean z9) {
        this.f596a = xVar;
        this.f597b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f596a.equals(this.f596a) && lVar.f597b == this.f597b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f596a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f597b).hashCode();
    }
}
