package z8;

import okhttp3.Call;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class r extends s {

    /* renamed from: d  reason: collision with root package name */
    public final f f7559d;

    public r(p0 p0Var, Call.Factory factory, m mVar, f fVar) {
        super(p0Var, factory, mVar);
        this.f7559d = fVar;
    }

    @Override // z8.s
    public final Object b(z zVar, Object[] objArr) {
        d dVar = (d) this.f7559d.a(zVar);
        l7.c cVar = (l7.c) objArr[objArr.length - 1];
        try {
            d8.n nVar = new d8.n(1, q4.b.C(cVar));
            nVar.r();
            nVar.t(new u(dVar, 2));
            dVar.f(new n8.b(nVar, 3));
            Object q = nVar.q();
            m7.a aVar = m7.a.f4049a;
            return q;
        } catch (Exception e9) {
            z0.q(e9, cVar);
            return m7.a.f4049a;
        }
    }
}
