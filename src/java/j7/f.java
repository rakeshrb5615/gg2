package j7;

import j5.t1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f implements Map, Serializable, v7.b {

    /* renamed from: t  reason: collision with root package name */
    public static final f f3332t;

    /* renamed from: a  reason: collision with root package name */
    public Object[] f3333a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f3334b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3335c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3336d;

    /* renamed from: e  reason: collision with root package name */
    public int f3337e;

    /* renamed from: f  reason: collision with root package name */
    public int f3338f;

    /* renamed from: m  reason: collision with root package name */
    public int f3339m;

    /* renamed from: n  reason: collision with root package name */
    public int f3340n;

    /* renamed from: o  reason: collision with root package name */
    public int f3341o;

    /* renamed from: p  reason: collision with root package name */
    public g f3342p;
    public h q;

    /* renamed from: r  reason: collision with root package name */
    public g f3343r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3344s;

    static {
        f fVar = new f(0);
        fVar.f3344s = true;
        f3332t = fVar;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f3333a = objArr;
        this.f3334b = null;
        this.f3335c = iArr;
        this.f3336d = new int[highestOneBit];
        this.f3337e = 2;
        this.f3338f = 0;
        this.f3339m = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int b(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i = this.f3337e * 2;
            int length = this.f3336d.length / 2;
            if (i > length) {
                i = length;
            }
            int i9 = 0;
            while (true) {
                int[] iArr = this.f3336d;
                int i10 = iArr[j];
                if (i10 <= 0) {
                    int i11 = this.f3338f;
                    Object[] objArr = this.f3333a;
                    if (i11 < objArr.length) {
                        int i12 = i11 + 1;
                        this.f3338f = i12;
                        objArr[i11] = obj;
                        this.f3335c[i11] = j;
                        iArr[j] = i12;
                        this.f3341o++;
                        this.f3340n++;
                        if (i9 > this.f3337e) {
                            this.f3337e = i9;
                        }
                        return i11;
                    }
                    g(1);
                } else if (j.a(this.f3333a[i10 - 1], obj)) {
                    return -i10;
                } else {
                    i9++;
                    if (i9 > i) {
                        k(this.f3336d.length * 2);
                        break;
                    }
                    j = j == 0 ? this.f3336d.length - 1 : j - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.f3344s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f3338f - 1;
        if (i >= 0) {
            int i9 = 0;
            while (true) {
                int[] iArr = this.f3335c;
                int i10 = iArr[i9];
                if (i10 >= 0) {
                    this.f3336d[i10] = 0;
                    iArr[i9] = -1;
                }
                if (i9 == i) {
                    break;
                }
                i9++;
            }
        }
        t1.O(this.f3333a, 0, this.f3338f);
        Object[] objArr = this.f3334b;
        if (objArr != null) {
            t1.O(objArr, 0, this.f3338f);
        }
        this.f3341o = 0;
        this.f3338f = 0;
        this.f3340n++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z9) {
        int i;
        Object[] objArr = this.f3334b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i = this.f3338f;
            if (i9 >= i) {
                break;
            }
            int[] iArr = this.f3335c;
            int i11 = iArr[i9];
            if (i11 >= 0) {
                Object[] objArr2 = this.f3333a;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                if (z9) {
                    iArr[i10] = i11;
                    this.f3336d[i11] = i10 + 1;
                }
                i10++;
            }
            i9++;
        }
        t1.O(this.f3333a, i10, i);
        if (objArr != null) {
            t1.O(objArr, i10, this.f3338f);
        }
        this.f3338f = i10;
    }

    public final boolean e(Collection collection) {
        j.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f3343r;
        if (gVar == null) {
            g gVar2 = new g(this, 0);
            this.f3343r = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return this.f3341o == map.size() && e(map.entrySet());
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        j.e(entry, "entry");
        int h9 = h(entry.getKey());
        if (h9 < 0) {
            return false;
        }
        Object[] objArr = this.f3334b;
        j.b(objArr);
        return j.a(objArr[h9], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f3333a;
        int length = objArr2.length;
        int i9 = this.f3338f;
        int i10 = length - i9;
        int i11 = i9 - this.f3341o;
        if (i10 < i && i10 + i11 >= i && i11 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i12 = i9 + i;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        if (i12 > objArr2.length) {
            int length2 = objArr2.length;
            int i13 = length2 + (length2 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i13);
            j.d(copyOf, "copyOf(...)");
            this.f3333a = copyOf;
            Object[] objArr3 = this.f3334b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i13);
                j.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f3334b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f3335c, i13);
            j.d(copyOf2, "copyOf(...)");
            this.f3335c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i13 >= 1 ? i13 : 1) * 3);
            if (highestOneBit > this.f3336d.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h9 = h(obj);
        if (h9 < 0) {
            return null;
        }
        Object[] objArr = this.f3334b;
        j.b(objArr);
        return objArr[h9];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i = this.f3337e;
        while (true) {
            int i9 = this.f3336d[j];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (j.a(this.f3333a[i10], obj)) {
                    return i10;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? this.f3336d.length - 1 : j - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i9 = dVar.f2144a;
            f fVar = (f) dVar.f2147d;
            if (i9 >= fVar.f3338f) {
                throw new NoSuchElementException();
            }
            dVar.f2144a = i9 + 1;
            dVar.f2145b = i9;
            Object obj = fVar.f3333a[i9];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f3334b;
            j.b(objArr);
            Object obj2 = objArr[dVar.f2145b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.f();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f3338f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f3335c[i] >= 0) {
                Object[] objArr = this.f3334b;
                j.b(objArr);
                if (j.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3341o == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f3339m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r3[r0] = r6;
        r5.f3335c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f3340n
            int r0 = r0 + 1
            r5.f3340n = r0
            int r0 = r5.f3338f
            int r1 = r5.f3341o
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f3336d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f3339m = r6
        L1c:
            int r6 = r5.f3338f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f3333a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f3337e
        L2c:
            int[] r3 = r5.f3336d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f3335c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f3342p;
        if (gVar == null) {
            g gVar2 = new g(this, 1);
            this.f3342p = gVar2;
            return gVar2;
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f3333a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.j.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f3334b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f3335c
            r0 = r0[r12]
            int r1 = r11.f3337e
            int r1 = r1 * 2
            int[] r2 = r11.f3336d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f3336d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f3337e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f3336d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f3336d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f3333a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f3336d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f3335c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f3336d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f3335c
            r0[r12] = r6
            int r12 = r11.f3341o
            int r12 = r12 + r6
            r11.f3341o = r12
            int r12 = r11.f3340n
            int r12 = r12 + 1
            r11.f3340n = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int b10 = b(obj);
        Object[] objArr = this.f3334b;
        if (objArr == null) {
            int length = this.f3333a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f3334b = objArr;
        }
        if (b10 >= 0) {
            objArr[b10] = obj2;
            return null;
        }
        int i = (-b10) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        j.e(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int b10 = b(entry.getKey());
            Object[] objArr = this.f3334b;
            if (objArr == null) {
                int length = this.f3333a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f3334b = objArr;
            }
            if (b10 >= 0) {
                objArr[b10] = entry.getValue();
            } else {
                int i = (-b10) - 1;
                if (!j.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h9 = h(obj);
        if (h9 < 0) {
            return null;
        }
        Object[] objArr = this.f3334b;
        j.b(objArr);
        Object obj2 = objArr[h9];
        l(h9);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3341o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f3341o * 3) + 2);
        sb.append("{");
        int i = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i9 = dVar.f2144a;
            f fVar = (f) dVar.f2147d;
            if (i9 >= fVar.f3338f) {
                throw new NoSuchElementException();
            }
            dVar.f2144a = i9 + 1;
            dVar.f2145b = i9;
            Object obj = fVar.f3333a[i9];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f3334b;
            j.b(objArr);
            Object obj2 = objArr[dVar.f2145b];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.f();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.q;
        if (hVar == null) {
            h hVar2 = new h(this);
            this.q = hVar2;
            return hVar2;
        }
        return hVar;
    }
}
