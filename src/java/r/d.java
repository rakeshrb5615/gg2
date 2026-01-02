package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d implements Collection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f5456a;

    public d(e eVar) {
        this.f5456a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5456a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5456a.b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5456a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f5456a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f5456a;
        int b10 = eVar.b(obj);
        if (b10 >= 0) {
            eVar.h(b10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f5456a;
        int i = eVar.f5471c;
        int i9 = 0;
        boolean z9 = false;
        while (i9 < i) {
            if (collection.contains(eVar.j(i9))) {
                eVar.h(i9);
                i9--;
                i--;
                z9 = true;
            }
            i9++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f5456a;
        int i = eVar.f5471c;
        int i9 = 0;
        boolean z9 = false;
        while (i9 < i) {
            if (!collection.contains(eVar.j(i9))) {
                eVar.h(i9);
                i9--;
                i--;
                z9 = true;
            }
            i9++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5456a.f5471c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f5456a;
        int i = eVar.f5471c;
        Object[] objArr = new Object[i];
        for (int i9 = 0; i9 < i; i9++) {
            objArr[i9] = eVar.j(i9);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f5456a;
        int i = eVar.f5471c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i9 = 0; i9 < i; i9++) {
            objArr[i9] = eVar.j(i9);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
