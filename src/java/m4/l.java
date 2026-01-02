package m4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class l extends g {

    /* renamed from: d  reason: collision with root package name */
    public final transient f f3985d;

    /* renamed from: e  reason: collision with root package name */
    public final transient m f3986e;

    public l(f fVar, m mVar) {
        this.f3985d = fVar;
        this.f3986e = mVar;
    }

    @Override // m4.a
    public final int a(Object[] objArr) {
        return this.f3986e.a(objArr);
    }

    @Override // m4.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3985d.get(obj) != null;
    }

    @Override // m4.g
    public final d e() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final s iterator() {
        return this.f3986e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((n) this.f3985d).f3993f;
    }
}
