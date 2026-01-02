package b8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f783a;

    /* renamed from: b  reason: collision with root package name */
    public final y7.e f784b;

    public d(String str, y7.e eVar) {
        this.f783a = str;
        this.f784b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return kotlin.jvm.internal.j.a(this.f783a, dVar.f783a) && kotlin.jvm.internal.j.a(this.f784b, dVar.f784b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f784b.hashCode() + (this.f783a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f783a + ", range=" + this.f784b + ')';
    }
}
