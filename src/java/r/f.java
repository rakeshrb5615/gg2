package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f implements Collection, Set, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f5460a = s.a.f5772a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f5461b = s.a.f5773b;

    /* renamed from: c  reason: collision with root package name */
    public int f5462c;

    public f(int i) {
        if (i > 0) {
            h.a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int b10;
        int i9 = this.f5462c;
        if (obj == null) {
            b10 = h.b(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            b10 = h.b(this, obj, hashCode);
        }
        if (b10 >= 0) {
            return false;
        }
        int i10 = ~b10;
        int[] iArr = this.f5460a;
        if (i9 >= iArr.length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f5461b;
            int[] iArr2 = new int[i11];
            this.f5460a = iArr2;
            this.f5461b = new Object[i11];
            if (i9 != this.f5462c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                i7.h.X(0, 0, iArr.length, iArr, iArr2);
                i7.h.a0(objArr, 0, this.f5461b, objArr.length, 6);
            }
        }
        if (i10 < i9) {
            int[] iArr3 = this.f5460a;
            int i12 = i10 + 1;
            i7.h.X(i12, i10, i9, iArr3, iArr3);
            Object[] objArr2 = this.f5461b;
            i7.h.Z(objArr2, i12, objArr2, i10, i9);
        }
        int i13 = this.f5462c;
        if (i9 == i13) {
            int[] iArr4 = this.f5460a;
            if (i10 < iArr4.length) {
                iArr4[i10] = i;
                this.f5461b[i10] = obj;
                this.f5462c = i13 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "elements");
        int size = collection.size() + this.f5462c;
        int i = this.f5462c;
        int[] iArr = this.f5460a;
        boolean z9 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5461b;
            int[] iArr2 = new int[size];
            this.f5460a = iArr2;
            this.f5461b = new Object[size];
            if (i > 0) {
                i7.h.X(0, 0, i, iArr, iArr2);
                i7.h.a0(objArr, 0, this.f5461b, this.f5462c, 6);
            }
        }
        if (this.f5462c == i) {
            for (Object obj : collection) {
                z9 |= add(obj);
            }
            return z9;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int i) {
        int i9 = this.f5462c;
        Object[] objArr = this.f5461b;
        Object obj = objArr[i];
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i10 = i9 - 1;
        int[] iArr = this.f5460a;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i < i10) {
                int i11 = i + 1;
                i7.h.X(i, i11, i9, iArr, iArr);
                Object[] objArr2 = this.f5461b;
                i7.h.Z(objArr2, i, objArr2, i11, i9);
            }
            this.f5461b[i10] = null;
        } else {
            int i12 = i9 > 8 ? i9 + (i9 >> 1) : 8;
            int[] iArr2 = new int[i12];
            this.f5460a = iArr2;
            this.f5461b = new Object[i12];
            if (i > 0) {
                i7.h.X(0, 0, i, iArr, iArr2);
                i7.h.a0(objArr, 0, this.f5461b, i, 6);
            }
            if (i < i10) {
                int i13 = i + 1;
                i7.h.X(i, i13, i9, iArr, this.f5460a);
                i7.h.Z(objArr, i, this.f5461b, i13, i9);
            }
        }
        if (i9 == this.f5462c) {
            this.f5462c = i10;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f5462c != 0) {
            this.f5460a = s.a.f5772a;
            this.f5461b = s.a.f5773b;
            this.f5462c = 0;
        }
        if (this.f5462c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "elements");
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f5462c == ((Set) obj).size()) {
            try {
                int i = this.f5462c;
                for (int i9 = 0; i9 < i; i9++) {
                    if (!((Set) obj).contains(this.f5461b[i9])) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5460a;
        int i = this.f5462c;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5462c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b10 = obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode());
        if (b10 >= 0) {
            b(b10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "elements");
        boolean z9 = false;
        for (Object obj : collection) {
            z9 |= remove(obj);
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "elements");
        boolean z9 = false;
        for (int i = this.f5462c - 1; -1 < i; i--) {
            if (!i7.i.Z(collection, this.f5461b[i])) {
                b(i);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5462c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return i7.h.c0(this.f5461b, 0, this.f5462c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5462c * 14);
        sb.append('{');
        int i = this.f5462c;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = this.f5461b[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "array");
        int i = this.f5462c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        i7.h.Z(this.f5461b, 0, objArr, 0, this.f5462c);
        return objArr;
    }
}
