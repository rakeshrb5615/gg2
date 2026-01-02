package o2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5001a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5002b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5003c;

    public a(Object obj, d dVar, b bVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f5001a = obj;
        this.f5002b = dVar;
        this.f5003c = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f5003c;
            if (this.f5001a.equals(aVar.f5001a) && this.f5002b.equals(aVar.f5002b) && ((bVar = this.f5003c) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f5001a.hashCode()) * 1000003) ^ this.f5002b.hashCode()) * 1000003;
        b bVar = this.f5003c;
        return (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f5001a + ", priority=" + this.f5002b + ", productData=" + this.f5003c + ", eventContext=null}";
    }
}
