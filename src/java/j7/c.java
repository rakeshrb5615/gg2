package j7;

import j5.t1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends i7.e implements RandomAccess, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final c f3324d;

    /* renamed from: a  reason: collision with root package name */
    public Object[] f3325a;

    /* renamed from: b  reason: collision with root package name */
    public int f3326b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3327c;

    static {
        c cVar = new c(0);
        cVar.f3327c = true;
        f3324d = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f3325a = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.f3326b;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f3325a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        g();
        int size = collection.size();
        e(this.f3326b, collection, size);
        return size > 0;
    }

    @Override // i7.e
    public final int b() {
        return this.f3326b;
    }

    @Override // i7.e
    public final Object c(int i) {
        g();
        int i9 = this.f3326b;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        return i(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f3326b);
    }

    public final void e(int i, Collection collection, int i9) {
        ((AbstractList) this).modCount++;
        h(i, i9);
        Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            this.f3325a[i + i10] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f3325a;
                int i = this.f3326b;
                if (i == list.size()) {
                    for (int i9 = 0; i9 < i; i9++) {
                        if (j.a(objArr[i9], list.get(i9))) {
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
        h(i, 1);
        this.f3325a[i] = obj;
    }

    public final void g() {
        if (this.f3327c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i9 = this.f3326b;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        return this.f3325a[i];
    }

    public final void h(int i, int i9) {
        int i10 = this.f3326b + i9;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f3325a;
        if (i10 > objArr.length) {
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i11);
            j.d(copyOf, "copyOf(...)");
            this.f3325a = copyOf;
        }
        Object[] objArr2 = this.f3325a;
        i7.h.Z(objArr2, i + i9, objArr2, i, this.f3326b);
        this.f3326b += i9;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f3325a;
        int i = this.f3326b;
        int i9 = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[i10];
            i9 = (i9 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i9;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f3325a;
        Object obj = objArr[i];
        i7.h.Z(objArr, i, objArr, i + 1, this.f3326b);
        Object[] objArr2 = this.f3325a;
        j.e(objArr2, "<this>");
        objArr2[this.f3326b - 1] = null;
        this.f3326b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f3326b; i++) {
            if (j.a(this.f3325a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3326b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i9) {
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f3325a;
        i7.h.Z(objArr, i, objArr, i + i9, this.f3326b);
        Object[] objArr2 = this.f3325a;
        int i10 = this.f3326b;
        t1.O(objArr2, i10 - i9, i10);
        this.f3326b -= i9;
    }

    public final int k(int i, int i9, Collection collection, boolean z9) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i + i10;
            if (collection.contains(this.f3325a[i12]) == z9) {
                Object[] objArr = this.f3325a;
                i10++;
                objArr[i11 + i] = objArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        Object[] objArr2 = this.f3325a;
        i7.h.Z(objArr2, i + i11, objArr2, i9 + i, this.f3326b);
        Object[] objArr3 = this.f3325a;
        int i14 = this.f3326b;
        t1.O(objArr3, i14 - i13, i14);
        if (i13 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3326b -= i13;
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f3326b - 1; i >= 0; i--) {
            if (j.a(this.f3325a[i], obj)) {
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
        g();
        return k(0, this.f3326b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        g();
        return k(0, this.f3326b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i9 = this.f3326b;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        Object[] objArr = this.f3325a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i9) {
        t1.e(i, i9, this.f3326b);
        return new b(this.f3325a, i, i9 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        int length = objArr.length;
        int i = this.f3326b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f3325a, 0, i, objArr.getClass());
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        i7.h.Z(this.f3325a, 0, objArr, 0, i);
        int i9 = this.f3326b;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return t1.a(this.f3325a, 0, this.f3326b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i9 = this.f3326b;
        if (i >= 0 && i <= i9) {
            return new a(this, i);
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        j.e(collection, "elements");
        g();
        int i9 = this.f3326b;
        if (i >= 0 && i <= i9) {
            int size = collection.size();
            e(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i9 = this.f3326b;
        if (i >= 0 && i <= i9) {
            ((AbstractList) this).modCount++;
            h(i, 1);
            this.f3325a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return i7.h.c0(this.f3325a, 0, this.f3326b);
    }
}
