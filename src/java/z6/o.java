package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class o extends w6.z {

    /* renamed from: b  reason: collision with root package name */
    public static final n f7426b = new n(new o(w6.x.f6485b), 0);

    /* renamed from: a  reason: collision with root package name */
    public final w6.x f7427a;

    public o(w6.x xVar) {
        this.f7427a = xVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        int O = aVar.O();
        int c9 = u.e.c(O);
        if (c9 == 5 || c9 == 6) {
            return this.f7427a.a(aVar);
        }
        if (c9 == 8) {
            aVar.K();
            return null;
        }
        throw new RuntimeException("Expecting number, got: " + v1.a.z(O) + "; at path " + aVar.A(false));
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        bVar.H((Number) obj);
    }
}
