package i8;

import d8.f0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class q extends d8.a implements n7.d {

    /* renamed from: d  reason: collision with root package name */
    public final l7.c f2797d;

    public q(l7.c cVar, l7.h hVar) {
        super(hVar, true);
        this.f2797d = cVar;
    }

    @Override // d8.r1
    public void f(Object obj) {
        a.h(f0.r(obj), q4.b.C(this.f2797d));
    }

    @Override // d8.r1
    public void g(Object obj) {
        this.f2797d.resumeWith(f0.r(obj));
    }

    @Override // n7.d
    public final n7.d getCallerFrame() {
        l7.c cVar = this.f2797d;
        if (cVar instanceof n7.d) {
            return (n7.d) cVar;
        }
        return null;
    }

    @Override // d8.r1
    public final boolean z() {
        return true;
    }
}
