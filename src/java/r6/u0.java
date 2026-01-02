package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class u0 implements t6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5739a;

    /* renamed from: b  reason: collision with root package name */
    public final g7.a f5740b;

    /* renamed from: c  reason: collision with root package name */
    public final t6.c f5741c;

    public /* synthetic */ u0(t6.c cVar, t6.c cVar2, int i) {
        this.f5739a = i;
        this.f5740b = cVar;
        this.f5741c = cVar2;
    }

    @Override // g7.a
    public final Object get() {
        switch (this.f5739a) {
            case 0:
                return new t0((g1) this.f5740b.get(), (h1) this.f5741c.get());
            default:
                return new u6.k((u6.p) this.f5740b.get(), (u6.p) this.f5741c.get());
        }
    }
}
