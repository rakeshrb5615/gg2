package r;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public int[] f5469a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f5470b;

    /* renamed from: c  reason: collision with root package name */
    public int f5471c;

    public j(int i) {
        this.f5469a = i == 0 ? s.a.f5772a : new int[i];
        this.f5470b = i == 0 ? s.a.f5773b : new Object[i << 1];
    }

    public final int b(Object obj) {
        int i = this.f5471c * 2;
        Object[] objArr = this.f5470b;
        if (obj == null) {
            for (int i9 = 1; i9 < i; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i; i10 += 2) {
            if (obj.equals(objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i) {
        int i9 = this.f5471c;
        int[] iArr = this.f5469a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f5469a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5470b, i * 2);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            this.f5470b = copyOf2;
        }
        if (this.f5471c != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.f5471c > 0) {
            this.f5469a = s.a.f5772a;
            this.f5470b = s.a.f5773b;
            this.f5471c = 0;
        }
        if (this.f5471c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final int d(int i, Object obj) {
        int i9 = this.f5471c;
        if (i9 == 0) {
            return -1;
        }
        int a10 = s.a.a(i9, i, this.f5469a);
        if (a10 >= 0 && !kotlin.jvm.internal.j.a(obj, this.f5470b[a10 << 1])) {
            int i10 = a10 + 1;
            while (i10 < i9 && this.f5469a[i10] == i) {
                if (kotlin.jvm.internal.j.a(obj, this.f5470b[i10 << 1])) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = a10 - 1; i11 >= 0 && this.f5469a[i11] == i; i11--) {
                if (kotlin.jvm.internal.j.a(obj, this.f5470b[i11 << 1])) {
                    return i11;
                }
            }
            return ~i10;
        }
        return a10;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i = this.f5471c;
                if (i != ((j) obj).f5471c) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i9 = 0; i9 < i; i9++) {
                    Object g3 = g(i9);
                    Object j = j(i9);
                    Object obj2 = jVar.get(g3);
                    if (j == null) {
                        if (obj2 != null || !jVar.containsKey(g3)) {
                            return false;
                        }
                    } else if (!j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if ((obj instanceof Map) && this.f5471c == ((Map) obj).size()) {
                int i10 = this.f5471c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object g4 = g(i11);
                    Object j8 = j(i11);
                    Object obj3 = ((Map) obj).get(g4);
                    if (j8 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(g4)) {
                            return false;
                        }
                    } else if (!j8.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.f5471c;
        if (i == 0) {
            return -1;
        }
        int a10 = s.a.a(i, 0, this.f5469a);
        if (a10 >= 0 && this.f5470b[a10 << 1] != null) {
            int i9 = a10 + 1;
            while (i9 < i && this.f5469a[i9] == 0) {
                if (this.f5470b[i9 << 1] == null) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a10 - 1; i10 >= 0 && this.f5469a[i10] == 0; i10--) {
                if (this.f5470b[i10 << 1] == null) {
                    return i10;
                }
            }
            return ~i9;
        }
        return a10;
    }

    public final Object g(int i) {
        boolean z9 = false;
        if (i >= 0 && i < this.f5471c) {
            z9 = true;
        }
        if (z9) {
            return this.f5470b[i << 1];
        }
        s.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object get(Object obj) {
        int e9 = e(obj);
        if (e9 >= 0) {
            return this.f5470b[(e9 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e9 = e(obj);
        return e9 >= 0 ? this.f5470b[(e9 << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        int i9;
        if (i < 0 || i >= (i9 = this.f5471c)) {
            s.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f5470b;
        int i10 = i << 1;
        Object obj = objArr[i10 + 1];
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i11 = i9 - 1;
        int[] iArr = this.f5469a;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i < i11) {
                int i12 = i + 1;
                i7.h.X(i, i12, i9, iArr, iArr);
                Object[] objArr2 = this.f5470b;
                i7.h.Z(objArr2, i10, objArr2, i12 << 1, i9 << 1);
            }
            Object[] objArr3 = this.f5470b;
            int i13 = i11 << 1;
            objArr3[i13] = null;
            objArr3[i13 + 1] = null;
        } else {
            int i14 = i9 > 8 ? i9 + (i9 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i14);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f5469a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5470b, i14 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            this.f5470b = copyOf2;
            if (i9 != this.f5471c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                i7.h.X(0, 0, i, iArr, this.f5469a);
                i7.h.Z(objArr, 0, this.f5470b, 0, i10);
            }
            if (i < i11) {
                int i15 = i + 1;
                i7.h.X(i, i15, i9, iArr, this.f5469a);
                i7.h.Z(objArr, i10, this.f5470b, i15 << 1, i9 << 1);
            }
        }
        if (i9 == this.f5471c) {
            this.f5471c = i11;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int[] iArr = this.f5469a;
        Object[] objArr = this.f5470b;
        int i = this.f5471c;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            Object obj = objArr[i9];
            i11 += (obj != null ? obj.hashCode() : 0) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public final Object i(int i, Object obj) {
        boolean z9 = false;
        if (i >= 0 && i < this.f5471c) {
            z9 = true;
        }
        if (!z9) {
            s.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i9 = (i << 1) + 1;
        Object[] objArr = this.f5470b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f5471c <= 0;
    }

    public final Object j(int i) {
        boolean z9 = false;
        if (i >= 0 && i < this.f5471c) {
            z9 = true;
        }
        if (z9) {
            return this.f5470b[(i << 1) + 1];
        }
        s.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f5471c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int d9 = obj != null ? d(hashCode, obj) : f();
        if (d9 >= 0) {
            int i9 = (d9 << 1) + 1;
            Object[] objArr = this.f5470b;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~d9;
        int[] iArr = this.f5469a;
        if (i >= iArr.length) {
            int i11 = 8;
            if (i >= 8) {
                i11 = (i >> 1) + i;
            } else if (i < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f5469a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5470b, i11 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            this.f5470b = copyOf2;
            if (i != this.f5471c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i) {
            int[] iArr2 = this.f5469a;
            int i12 = i10 + 1;
            i7.h.X(i12, i10, i, iArr2, iArr2);
            Object[] objArr2 = this.f5470b;
            i7.h.Z(objArr2, i12 << 1, objArr2, i10 << 1, this.f5471c << 1);
        }
        int i13 = this.f5471c;
        if (i == i13) {
            int[] iArr3 = this.f5469a;
            if (i10 < iArr3.length) {
                iArr3[i10] = hashCode;
                Object[] objArr3 = this.f5470b;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f5471c = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int e9 = e(obj);
        if (e9 >= 0) {
            return h(e9);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e9 = e(obj);
        if (e9 >= 0) {
            return i(e9, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f5471c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5471c * 28);
        sb.append('{');
        int i = this.f5471c;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object g3 = g(i9);
            if (g3 != sb) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j = j(i9);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e9 = e(obj);
        if (e9 < 0 || !kotlin.jvm.internal.j.a(obj2, j(e9))) {
            return false;
        }
        h(e9);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e9 = e(obj);
        if (e9 < 0 || !kotlin.jvm.internal.j.a(obj2, j(e9))) {
            return false;
        }
        i(e9, obj3);
        return true;
    }
}
