package w6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class l extends z6.w {

    /* renamed from: a  reason: collision with root package name */
    public z f6467a = null;

    @Override // w6.z
    public final Object b(e7.a aVar) {
        z zVar = this.f6467a;
        if (zVar != null) {
            return zVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        z zVar = this.f6467a;
        if (zVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        zVar.c(bVar, obj);
    }

    @Override // z6.w
    public final z d() {
        z zVar = this.f6467a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
