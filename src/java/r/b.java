package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b implements Set {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f5451a;

    public b(e eVar) {
        this.f5451a = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5451a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5451a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f5451a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f5451a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (eVar.f5471c == set.size()) {
                    return eVar.k(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f5451a;
        int i = 0;
        for (int i9 = eVar.f5471c - 1; i9 >= 0; i9--) {
            Object g3 = eVar.g(i9);
            i += g3 == null ? 0 : g3.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5451a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f5451a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f5451a;
        int e9 = eVar.e(obj);
        if (e9 >= 0) {
            eVar.h(e9);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f5451a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f5451a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5451a.f5471c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f5451a;
        int i = eVar.f5471c;
        Object[] objArr = new Object[i];
        for (int i9 = 0; i9 < i; i9++) {
            objArr[i9] = eVar.g(i9);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f5451a;
        int i = eVar.f5471c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i9 = 0; i9 < i; i9++) {
            objArr[i9] = eVar.g(i9);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
