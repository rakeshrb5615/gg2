package h8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k implements l7.c, n7.d {

    /* renamed from: a  reason: collision with root package name */
    public final l7.c f2253a;

    /* renamed from: b  reason: collision with root package name */
    public final l7.h f2254b;

    public k(l7.c cVar, l7.h hVar) {
        this.f2253a = cVar;
        this.f2254b = hVar;
    }

    @Override // n7.d
    public final n7.d getCallerFrame() {
        l7.c cVar = this.f2253a;
        if (cVar instanceof n7.d) {
            return (n7.d) cVar;
        }
        return null;
    }

    @Override // l7.c
    public final l7.h getContext() {
        return this.f2254b;
    }

    @Override // l7.c
    public final void resumeWith(Object obj) {
        this.f2253a.resumeWith(obj);
    }
}
