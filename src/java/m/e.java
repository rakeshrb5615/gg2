package m;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f3833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f3834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f3835c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j6.o f3836d;

    public e(j6.o oVar, f fVar, o oVar2, m mVar) {
        this.f3836d = oVar;
        this.f3833a = fVar;
        this.f3834b = oVar2;
        this.f3835c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = (g) this.f3836d.f3275b;
        f fVar = this.f3833a;
        if (fVar != null) {
            gVar.F = true;
            fVar.f3839b.c(false);
            gVar.F = false;
        }
        o oVar = this.f3834b;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f3835c.q(oVar, null, 4);
        }
    }
}
