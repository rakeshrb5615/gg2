package l2;

import a2.k0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class v extends k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0.k f3734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3735b;

    public v(a0 a0Var, g0.k kVar) {
        this.f3735b = a0Var;
        this.f3734a = kVar;
    }

    @Override // a2.k0
    public final void a() {
        g0.k kVar = this.f3734a;
        kVar.run();
        kVar.run();
        this.f3735b.f3564g2.f350a.unregisterObserver(this);
    }
}
