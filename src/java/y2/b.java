package y2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f6764a;

    /* renamed from: b  reason: collision with root package name */
    public final r2.j f6765b;

    /* renamed from: c  reason: collision with root package name */
    public final r2.i f6766c;

    public b(long j, r2.j jVar, r2.i iVar) {
        this.f6764a = j;
        this.f6765b = jVar;
        this.f6766c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f6764a == bVar.f6764a && this.f6765b.equals(bVar.f6765b) && this.f6766c.equals(bVar.f6766c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6764a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f6765b.hashCode()) * 1000003) ^ this.f6766c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f6764a + ", transportContext=" + this.f6765b + ", event=" + this.f6766c + "}";
    }
}
