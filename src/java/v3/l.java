package v3;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class l extends f {

    /* renamed from: e  reason: collision with root package name */
    public final g f6231e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6232f;

    public l(g gVar, float f9) {
        this.f6231e = gVar;
        this.f6232f = f9;
    }

    @Override // v3.f
    public final boolean j() {
        return true;
    }

    @Override // v3.f
    public final void k(float f9, float f10, float f11, z zVar) {
        this.f6231e.k(f9, f10 - this.f6232f, f11, zVar);
    }
}
