package s8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j implements o8.a {

    /* renamed from: a  reason: collision with root package name */
    public final o8.a f5874a;

    /* renamed from: b  reason: collision with root package name */
    public final o f5875b;

    public j(o8.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "serializer");
        this.f5874a = aVar;
        this.f5875b = new o(aVar.d());
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        if (obj != null) {
            iVar.i(this.f5874a, obj);
        } else {
            iVar.f();
        }
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        if (pVar.h()) {
            return pVar.k(this.f5874a);
        }
        return null;
    }

    @Override // o8.a
    public final q8.d d() {
        return this.f5875b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && kotlin.jvm.internal.j.a(this.f5874a, ((j) obj).f5874a);
    }

    public final int hashCode() {
        return this.f5874a.hashCode();
    }
}
