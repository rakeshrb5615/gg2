package i7;

import j5.t1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g extends e {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f2740d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f2741a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f2742b = f2740d;

    /* renamed from: c  reason: collision with root package name */
    public int f2743c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i9;
        int i10 = this.f2743c;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i10, ", size: "));
        }
        if (i == i10) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            j();
            e(this.f2743c + 1);
            int i11 = i(this.f2741a + i);
            int i12 = this.f2743c;
            if (i < ((i12 + 1) >> 1)) {
                if (i11 == 0) {
                    Object[] objArr = this.f2742b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    i11 = objArr.length;
                }
                int i13 = i11 - 1;
                int i14 = this.f2741a;
                if (i14 == 0) {
                    Object[] objArr2 = this.f2742b;
                    kotlin.jvm.internal.j.e(objArr2, "<this>");
                    i9 = objArr2.length - 1;
                } else {
                    i9 = i14 - 1;
                }
                int i15 = this.f2741a;
                if (i13 >= i15) {
                    Object[] objArr3 = this.f2742b;
                    objArr3[i9] = objArr3[i15];
                    h.Z(objArr3, i15, objArr3, i15 + 1, i13 + 1);
                } else {
                    Object[] objArr4 = this.f2742b;
                    h.Z(objArr4, i15 - 1, objArr4, i15, objArr4.length);
                    Object[] objArr5 = this.f2742b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    h.Z(objArr5, 0, objArr5, 1, i13 + 1);
                }
                this.f2742b[i13] = obj;
                this.f2741a = i9;
            } else {
                int i16 = i(i12 + this.f2741a);
                if (i11 < i16) {
                    Object[] objArr6 = this.f2742b;
                    h.Z(objArr6, i11 + 1, objArr6, i11, i16);
                } else {
                    Object[] objArr7 = this.f2742b;
                    h.Z(objArr7, 1, objArr7, 0, i16);
                    Object[] objArr8 = this.f2742b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    h.Z(objArr8, i11 + 1, objArr8, i11, objArr8.length - 1);
                }
                this.f2742b[i11] = obj;
            }
            this.f2743c++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        kotlin.jvm.internal.j.e(collection, "elements");
        int i9 = this.f2743c;
        if (i >= 0 && i <= i9) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.f2743c) {
                return addAll(collection);
            }
            j();
            e(collection.size() + this.f2743c);
            int i10 = i(this.f2743c + this.f2741a);
            int i11 = i(this.f2741a + i);
            int size = collection.size();
            if (i < ((this.f2743c + 1) >> 1)) {
                int i12 = this.f2741a;
                int i13 = i12 - size;
                if (i11 < i12) {
                    Object[] objArr = this.f2742b;
                    h.Z(objArr, i13, objArr, i12, objArr.length);
                    if (size >= i11) {
                        Object[] objArr2 = this.f2742b;
                        h.Z(objArr2, objArr2.length - size, objArr2, 0, i11);
                    } else {
                        Object[] objArr3 = this.f2742b;
                        h.Z(objArr3, objArr3.length - size, objArr3, 0, size);
                        Object[] objArr4 = this.f2742b;
                        h.Z(objArr4, 0, objArr4, size, i11);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f2742b;
                    h.Z(objArr5, i13, objArr5, i12, i11);
                } else {
                    Object[] objArr6 = this.f2742b;
                    i13 += objArr6.length;
                    int i14 = i11 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        h.Z(objArr6, i13, objArr6, i12, i11);
                    } else {
                        h.Z(objArr6, i13, objArr6, i12, i12 + length);
                        Object[] objArr7 = this.f2742b;
                        h.Z(objArr7, 0, objArr7, this.f2741a + length, i11);
                    }
                }
                this.f2741a = i13;
                d(g(i11 - size), collection);
                return true;
            }
            int i15 = i11 + size;
            if (i11 < i10) {
                int i16 = size + i10;
                Object[] objArr8 = this.f2742b;
                if (i16 <= objArr8.length) {
                    h.Z(objArr8, i15, objArr8, i11, i10);
                } else if (i15 >= objArr8.length) {
                    h.Z(objArr8, i15 - objArr8.length, objArr8, i11, i10);
                } else {
                    int length2 = i10 - (i16 - objArr8.length);
                    h.Z(objArr8, 0, objArr8, length2, i10);
                    Object[] objArr9 = this.f2742b;
                    h.Z(objArr9, i15, objArr9, i11, length2);
                }
            } else {
                Object[] objArr10 = this.f2742b;
                h.Z(objArr10, size, objArr10, 0, i10);
                Object[] objArr11 = this.f2742b;
                if (i15 >= objArr11.length) {
                    h.Z(objArr11, i15 - objArr11.length, objArr11, i11, objArr11.length);
                } else {
                    h.Z(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f2742b;
                    h.Z(objArr12, i15, objArr12, i11, objArr12.length - size);
                }
            }
            d(i11, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
    }

    public final void addFirst(Object obj) {
        j();
        e(this.f2743c + 1);
        int i = this.f2741a;
        if (i == 0) {
            Object[] objArr = this.f2742b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i = objArr.length;
        }
        int i9 = i - 1;
        this.f2741a = i9;
        this.f2742b[i9] = obj;
        this.f2743c++;
    }

    public final void addLast(Object obj) {
        j();
        e(b() + 1);
        this.f2742b[i(b() + this.f2741a)] = obj;
        this.f2743c = b() + 1;
    }

    @Override // i7.e
    public final int b() {
        return this.f2743c;
    }

    @Override // i7.e
    public final Object c(int i) {
        int i9 = this.f2743c;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        if (i == a.a.y(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i10 = i(this.f2741a + i);
        Object[] objArr = this.f2742b;
        Object obj = objArr[i10];
        if (i < (this.f2743c >> 1)) {
            int i11 = this.f2741a;
            if (i10 >= i11) {
                h.Z(objArr, i11 + 1, objArr, i11, i10);
            } else {
                h.Z(objArr, 1, objArr, 0, i10);
                Object[] objArr2 = this.f2742b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f2741a;
                h.Z(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2742b;
            int i13 = this.f2741a;
            objArr3[i13] = null;
            this.f2741a = f(i13);
        } else {
            int i14 = i(a.a.y(this) + this.f2741a);
            if (i10 <= i14) {
                Object[] objArr4 = this.f2742b;
                h.Z(objArr4, i10, objArr4, i10 + 1, i14 + 1);
            } else {
                Object[] objArr5 = this.f2742b;
                h.Z(objArr5, i10, objArr5, i10 + 1, objArr5.length);
                Object[] objArr6 = this.f2742b;
                objArr6[objArr6.length - 1] = objArr6[0];
                h.Z(objArr6, 0, objArr6, 1, i14 + 1);
            }
            this.f2742b[i14] = null;
        }
        this.f2743c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f2741a, i(b() + this.f2741a));
        }
        this.f2741a = 0;
        this.f2743c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2742b.length;
        while (i < length && it.hasNext()) {
            this.f2742b[i] = it.next();
            i++;
        }
        int i9 = this.f2741a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f2742b[i10] = it.next();
        }
        this.f2743c = collection.size() + this.f2743c;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2742b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f2740d) {
            if (i < 10) {
                i = 10;
            }
            this.f2742b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i9 = length + (length >> 1);
        if (i9 - i < 0) {
            i9 = i;
        }
        if (i9 - 2147483639 > 0) {
            i9 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i9];
        h.Z(objArr, 0, objArr2, this.f2741a, objArr.length);
        Object[] objArr3 = this.f2742b;
        int length2 = objArr3.length;
        int i10 = this.f2741a;
        h.Z(objArr3, length2 - i10, objArr2, 0, i10);
        this.f2741a = 0;
        this.f2742b = objArr2;
    }

    public final int f(int i) {
        Object[] objArr = this.f2742b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int g(int i) {
        return i < 0 ? i + this.f2742b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int b10 = b();
        if (i < 0 || i >= b10) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, b10, ", size: "));
        }
        return this.f2742b[i(this.f2741a + i)];
    }

    public final void h(int i, int i9) {
        if (i < i9) {
            h.d0(this.f2742b, i, i9);
            return;
        }
        Object[] objArr = this.f2742b;
        h.d0(objArr, i, objArr.length);
        h.d0(this.f2742b, 0, i9);
    }

    public final int i(int i) {
        Object[] objArr = this.f2742b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i9 = i(b() + this.f2741a);
        int i10 = this.f2741a;
        if (i10 < i9) {
            while (i10 < i9) {
                if (kotlin.jvm.internal.j.a(obj, this.f2742b[i10])) {
                    i = this.f2741a;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < i9) {
            return -1;
        } else {
            int length = this.f2742b.length;
            while (true) {
                if (i10 >= length) {
                    for (int i11 = 0; i11 < i9; i11++) {
                        if (kotlin.jvm.internal.j.a(obj, this.f2742b[i11])) {
                            i10 = i11 + this.f2742b.length;
                            i = this.f2741a;
                        }
                    }
                    return -1;
                } else if (kotlin.jvm.internal.j.a(obj, this.f2742b[i10])) {
                    i = this.f2741a;
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i9 = i(this.f2743c + this.f2741a);
        int i10 = this.f2741a;
        if (i10 < i9) {
            length = i9 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f2742b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i = this.f2741a;
                return length - i;
            }
            return -1;
        }
        if (i10 > i9) {
            int i11 = i9 - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f2742b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f2741a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f2742b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i = this.f2741a;
                    }
                } else if (kotlin.jvm.internal.j.a(obj, this.f2742b[i11])) {
                    length = i11 + this.f2742b.length;
                    i = this.f2741a;
                    break;
                } else {
                    i11--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        kotlin.jvm.internal.j.e(collection, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f2742b.length != 0) {
            int i9 = i(this.f2743c + this.f2741a);
            int i10 = this.f2741a;
            if (i10 < i9) {
                i = i10;
                while (i10 < i9) {
                    Object obj = this.f2742b[i10];
                    if (collection.contains(obj)) {
                        z9 = true;
                    } else {
                        this.f2742b[i] = obj;
                        i++;
                    }
                    i10++;
                }
                h.d0(this.f2742b, i, i9);
            } else {
                int length = this.f2742b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f2742b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f2742b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                i = i(i11);
                for (int i12 = 0; i12 < i9; i12++) {
                    Object[] objArr2 = this.f2742b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f2742b[i] = obj3;
                        i = f(i);
                    }
                }
                z9 = z10;
            }
            if (z9) {
                j();
                this.f2743c = g(i - this.f2741a);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f2742b;
        int i = this.f2741a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2741a = f(i);
        this.f2743c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i(a.a.y(this) + this.f2741a);
        Object[] objArr = this.f2742b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2743c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i9) {
        t1.e(i, i9, this.f2743c);
        int i10 = i9 - i;
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f2743c) {
            clear();
        } else if (i10 == 1) {
            c(i);
        } else {
            j();
            if (i < this.f2743c - i9) {
                int i11 = i(this.f2741a + (i - 1));
                int i12 = i(this.f2741a + (i9 - 1));
                while (i > 0) {
                    int i13 = i11 + 1;
                    int min = Math.min(i, Math.min(i13, i12 + 1));
                    Object[] objArr = this.f2742b;
                    int i14 = i12 - min;
                    int i15 = i11 - min;
                    h.Z(objArr, i14 + 1, objArr, i15 + 1, i13);
                    i11 = g(i15);
                    i12 = g(i14);
                    i -= min;
                }
                int i16 = i(this.f2741a + i10);
                h(this.f2741a, i16);
                this.f2741a = i16;
            } else {
                int i17 = i(this.f2741a + i9);
                int i18 = i(this.f2741a + i);
                int i19 = this.f2743c;
                while (true) {
                    i19 -= i9;
                    if (i19 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f2742b;
                    i9 = Math.min(i19, Math.min(objArr2.length - i17, objArr2.length - i18));
                    Object[] objArr3 = this.f2742b;
                    int i20 = i17 + i9;
                    h.Z(objArr3, i18, objArr3, i17, i20);
                    i17 = i(i20);
                    i18 = i(i18 + i9);
                }
                int i21 = i(this.f2743c + this.f2741a);
                h(g(i21 - i10), i21);
            }
            this.f2743c -= i10;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        kotlin.jvm.internal.j.e(collection, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f2742b.length != 0) {
            int i9 = i(this.f2743c + this.f2741a);
            int i10 = this.f2741a;
            if (i10 < i9) {
                i = i10;
                while (i10 < i9) {
                    Object obj = this.f2742b[i10];
                    if (collection.contains(obj)) {
                        this.f2742b[i] = obj;
                        i++;
                    } else {
                        z9 = true;
                    }
                    i10++;
                }
                h.d0(this.f2742b, i, i9);
            } else {
                int length = this.f2742b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f2742b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f2742b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                i = i(i11);
                for (int i12 = 0; i12 < i9; i12++) {
                    Object[] objArr2 = this.f2742b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f2742b[i] = obj3;
                        i = f(i);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                j();
                this.f2743c = g(i - this.f2741a);
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int b10 = b();
        if (i < 0 || i >= b10) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, b10, ", size: "));
        }
        int i9 = i(this.f2741a + i);
        Object[] objArr = this.f2742b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "array");
        int length = objArr.length;
        int i = this.f2743c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int i9 = i(this.f2743c + this.f2741a);
        int i10 = this.f2741a;
        if (i10 < i9) {
            h.a0(this.f2742b, i10, objArr, i9, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2742b;
            h.Z(objArr2, 0, objArr, this.f2741a, objArr2.length);
            Object[] objArr3 = this.f2742b;
            h.Z(objArr3, objArr3.length - this.f2741a, objArr, 0, i9);
        }
        int i11 = this.f2743c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        e(collection.size() + b());
        d(i(b() + this.f2741a), collection);
        return true;
    }
}
