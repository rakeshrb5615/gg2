package c4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g implements d4.c {

    /* renamed from: a  reason: collision with root package name */
    public final d4.c f912a;

    public g(d4.c cVar) {
        this.f912a = cVar;
    }

    @Override // d4.c
    public Object zza() {
        e eVar = (e) this.f912a.zza();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ g(f fVar) {
        l6.c cVar = new l6.c(fVar, 9);
        this.f912a = d4.b.a(new g(d4.b.a(new b8.g(d4.b.a(new k2.c(5, cVar, d4.b.a(new d(cVar, 1)))), d4.b.a(new d(cVar, 0)), cVar, 1))));
    }
}
