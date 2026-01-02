package j7;

import j5.t1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends i7.e implements RandomAccess, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f3319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3320b;

    /* renamed from: c  reason: collision with root package name */
    public int f3321c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3322d;

    /* renamed from: e  reason: collision with root package name */
    public final c f3323e;

    public b(Object[] objArr, int i, int i9, b bVar, c cVar) {
        int i10;
        j.e(objArr, "backing");
        j.e(cVar, "root");
        this.f3319a = objArr;
        this.f3320b = i;
        this.f3321c = i9;
        this.f3322d = bVar;
        this.f3323e = cVar;
        i10 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f3320b + this.f3321c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        int size = collection.size();
        e(this.f3320b + this.f3321c, collection, size);
        return size > 0;
    }

    @Override // i7.e
    public final int b() {
        g();
        return this.f3321c;
    }

    @Override // i7.e
    public final Object c(int i) {
        h();
        g();
        int i9 = this.f3321c;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        return i(this.f3320b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f3320b, this.f3321c);
    }

    public final void e(int i, Collection collection, int i9) {
        ((AbstractList) this).modCount++;
        c cVar = this.f3323e;
        b bVar = this.f3322d;
        if (bVar != null) {
            bVar.e(i, collection, i9);
        } else {
            c cVar2 = c.f3324d;
            cVar.e(i, collection, i9);
        }
        this.f3319a = cVar.f3325a;
        this.f3321c += i9;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f3319a;
                int i = this.f3321c;
                if (i == list.size()) {
                    for (int i9 = 0; i9 < i; i9++) {
                        if (j.a(objArr[this.f3320b + i9], list.get(i9))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f3323e;
        b bVar = this.f3322d;
        if (bVar != null) {
            bVar.f(i, obj);
        } else {
            c cVar2 = c.f3324d;
            cVar.f(i, obj);
        }
        this.f3319a = cVar.f3325a;
        this.f3321c++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.f3323e).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i9 = this.f3321c;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        return this.f3319a[this.f3320b + i];
    }

    public final void h() {
        if (this.f3323e.f3327c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f3319a;
        int i = this.f3321c;
        int i9 = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[this.f3320b + i10];
            i9 = (i9 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i9;
    }

    public final Object i(int i) {
        Object i9;
        ((AbstractList) this).modCount++;
        b bVar = this.f3322d;
        if (bVar != null) {
            i9 = bVar.i(i);
        } else {
            c cVar = c.f3324d;
            i9 = this.f3323e.i(i);
        }
        this.f3321c--;
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.f3321c; i++) {
            if (j.a(this.f3319a[this.f3320b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f3321c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i9) {
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f3322d;
        if (bVar != null) {
            bVar.j(i, i9);
        } else {
            c cVar = c.f3324d;
            this.f3323e.j(i, i9);
        }
        this.f3321c -= i9;
    }

    public final int k(int i, int i9, Collection collection, boolean z9) {
        int k9;
        b bVar = this.f3322d;
        if (bVar != null) {
            k9 = bVar.k(i, i9, collection, z9);
        } else {
            c cVar = c.f3324d;
            k9 = this.f3323e.k(i, i9, collection, z9);
        }
        if (k9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3321c -= k9;
        return k9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.f3321c - 1; i >= 0; i--) {
            if (j.a(this.f3319a[this.f3320b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        return k(this.f3320b, this.f3321c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        return k(this.f3320b, this.f3321c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i9 = this.f3321c;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        Object[] objArr = this.f3319a;
        int i10 = this.f3320b;
        Object obj2 = objArr[i10 + i];
        objArr[i10 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i9) {
        t1.e(i, i9, this.f3321c);
        return new b(this.f3319a, this.f3320b + i, i9 - i, this, this.f3323e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        g();
        int length = objArr.length;
        int i = this.f3321c;
        int i9 = this.f3320b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f3319a, i9, i + i9, objArr.getClass());
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        i7.h.Z(this.f3319a, 0, objArr, i9, i + i9);
        int i10 = this.f3321c;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return t1.a(this.f3319a, this.f3320b, this.f3321c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i9 = this.f3321c;
        if (i >= 0 && i <= i9) {
            return new a(this, i);
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i9 = this.f3321c;
        if (i >= 0 && i <= i9) {
            f(this.f3320b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        int i9 = this.f3321c;
        if (i >= 0 && i <= i9) {
            int size = collection.size();
            e(this.f3320b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f3319a;
        int i = this.f3321c;
        int i9 = this.f3320b;
        return i7.h.c0(objArr, i9, i + i9);
    }
}
