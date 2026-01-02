package m8;

import d8.f2;
import d8.l;
import d8.m;
import d8.n;
import i8.r;
import u7.q;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b implements l, f2 {

    /* renamed from: a  reason: collision with root package name */
    public final n f4057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f4058b;

    public b(c cVar, n nVar) {
        this.f4058b = cVar;
        this.f4057a = nVar;
    }

    @Override // d8.f2
    public final void a(r rVar, int i) {
        this.f4057a.a(rVar, i);
    }

    @Override // d8.l
    public final d4.l c(Object obj, q qVar) {
        c cVar = this.f4058b;
        m mVar = new m(cVar, this);
        d4.l D = this.f4057a.D((h7.l) obj, mVar);
        if (D != null) {
            c.f4059g.set(cVar, null);
        }
        return D;
    }

    @Override // d8.l
    public final void e(Object obj) {
        this.f4057a.e(obj);
    }

    @Override // l7.c
    public final l7.h getContext() {
        return this.f4057a.f1223e;
    }

    @Override // l7.c
    public final void resumeWith(Object obj) {
        this.f4057a.resumeWith(obj);
    }
}
