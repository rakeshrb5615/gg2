package z8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7494a;

    /* renamed from: b  reason: collision with root package name */
    public final j f7495b;

    public /* synthetic */ h(j jVar, int i) {
        this.f7494a = i;
        this.f7495b = jVar;
    }

    @Override // z8.g
    public final void b(d dVar, Throwable th) {
        switch (this.f7494a) {
            case 0:
                this.f7495b.completeExceptionally(th);
                return;
            default:
                this.f7495b.completeExceptionally(th);
                return;
        }
    }

    @Override // z8.g
    public final void d(d dVar, q0 q0Var) {
        switch (this.f7494a) {
            case 0:
                boolean z9 = q0Var.f7556a.v;
                j jVar = this.f7495b;
                if (z9) {
                    jVar.complete(q0Var.f7557b);
                    return;
                } else {
                    jVar.completeExceptionally(new a5.o(q0Var));
                    return;
                }
            default:
                this.f7495b.complete(q0Var);
                return;
        }
    }
}
