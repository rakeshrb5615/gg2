package a5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class v implements c6.b {

    /* renamed from: c  reason: collision with root package name */
    public static final t f613c = new t(0);

    /* renamed from: d  reason: collision with root package name */
    public static final g f614d = new g(1);

    /* renamed from: a  reason: collision with root package name */
    public c6.a f615a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c6.b f616b;

    public v(t tVar, c6.b bVar) {
        this.f615a = tVar;
        this.f616b = bVar;
    }

    public final void a(c6.a aVar) {
        c6.b bVar;
        c6.b bVar2;
        c6.b bVar3 = this.f616b;
        g gVar = f614d;
        if (bVar3 != gVar) {
            aVar.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f616b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f615a = new u(0, this.f615a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.a(bVar);
        }
    }

    @Override // c6.b
    public final Object get() {
        return this.f616b.get();
    }
}
