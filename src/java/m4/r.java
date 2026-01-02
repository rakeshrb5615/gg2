package m4;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class r extends g {

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f4008d;

    public r(Object obj) {
        this.f4008d = obj;
    }

    @Override // m4.a
    public final int a(Object[] objArr) {
        objArr[0] = this.f4008d;
        return 1;
    }

    @Override // m4.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4008d.equals(obj);
    }

    @Override // m4.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4008d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this.f4008d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f4008d.toString() + ']';
    }
}
