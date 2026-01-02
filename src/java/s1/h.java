package s1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f5802b;

    public h(b bVar) {
        kotlin.jvm.internal.j.e(bVar, "latestEvent");
        this.f5802b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h.class == obj.getClass() && kotlin.jvm.internal.j.a(this.f5802b, ((h) obj).f5802b);
    }

    public final int hashCode() {
        return this.f5802b.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f5802b + ", direction=-1)";
    }
}
