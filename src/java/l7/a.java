package l7;

import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final g f3792a;

    public a(g gVar) {
        this.f3792a = gVar;
    }

    @Override // l7.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // l7.h
    public /* bridge */ f get(g gVar) {
        return q4.b.r(this, gVar);
    }

    @Override // l7.f
    public final g getKey() {
        return this.f3792a;
    }

    @Override // l7.h
    public /* bridge */ h minusKey(g gVar) {
        return q4.b.G(this, gVar);
    }

    @Override // l7.h
    public final /* bridge */ h plus(h hVar) {
        return q4.b.L(this, hVar);
    }
}
