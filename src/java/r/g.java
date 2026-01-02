package r;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f5463a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ long[] f5464b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f5465c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ int f5466d;

    public g() {
        int i;
        int i9 = 4;
        while (true) {
            i = 80;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (80 <= i10) {
                i = i10;
                break;
            }
            i9++;
        }
        int i11 = i / 8;
        this.f5464b = new long[i11];
        this.f5465c = new Object[i11];
    }

    public final void a() {
        int i = this.f5466d;
        Object[] objArr = this.f5465c;
        for (int i9 = 0; i9 < i; i9++) {
            objArr[i9] = null;
        }
        this.f5466d = 0;
        this.f5463a = false;
    }

    public final Object b(long j) {
        Object obj;
        int b10 = s.a.b(this.f5464b, this.f5466d, j);
        if (b10 < 0 || (obj = this.f5465c[b10]) == h.f5467a) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f5464b = (long[]) this.f5464b.clone();
        gVar.f5465c = (Object[]) this.f5465c.clone();
        return gVar;
    }

    public final long d(int i) {
        int i9;
        if (i < 0 || i >= (i9 = this.f5466d)) {
            s.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f5463a) {
            long[] jArr = this.f5464b;
            Object[] objArr = this.f5465c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != h.f5467a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f5463a = false;
            this.f5466d = i10;
        }
        return this.f5464b[i];
    }

    public final void e(long j, Object obj) {
        Object obj2 = h.f5467a;
        int b10 = s.a.b(this.f5464b, this.f5466d, j);
        if (b10 >= 0) {
            this.f5465c[b10] = obj;
            return;
        }
        int i = ~b10;
        int i9 = this.f5466d;
        if (i < i9) {
            Object[] objArr = this.f5465c;
            if (objArr[i] == obj2) {
                this.f5464b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f5463a) {
            long[] jArr = this.f5464b;
            if (i9 >= jArr.length) {
                Object[] objArr2 = this.f5465c;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj3 = objArr2[i11];
                    if (obj3 != obj2) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr2[i10] = obj3;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f5463a = false;
                this.f5466d = i10;
                i = ~s.a.b(this.f5464b, i10, j);
            }
        }
        int i12 = this.f5466d;
        if (i12 >= this.f5464b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.f5464b, i16);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f5464b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5465c, i16);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            this.f5465c = copyOf2;
        }
        int i17 = this.f5466d - i;
        if (i17 != 0) {
            long[] jArr2 = this.f5464b;
            int i18 = i + 1;
            kotlin.jvm.internal.j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i18, i17);
            Object[] objArr3 = this.f5465c;
            i7.h.Z(objArr3, i18, objArr3, i, this.f5466d);
        }
        this.f5464b[i] = j;
        this.f5465c[i] = obj;
        this.f5466d++;
    }

    public final int g() {
        if (this.f5463a) {
            int i = this.f5466d;
            long[] jArr = this.f5464b;
            Object[] objArr = this.f5465c;
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                Object obj = objArr[i10];
                if (obj != h.f5467a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f5463a = false;
            this.f5466d = i9;
        }
        return this.f5466d;
    }

    public final Object h(int i) {
        int i9;
        if (i < 0 || i >= (i9 = this.f5466d)) {
            s.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f5463a) {
            long[] jArr = this.f5464b;
            Object[] objArr = this.f5465c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != h.f5467a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f5463a = false;
            this.f5466d = i10;
        }
        return this.f5465c[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5466d * 28);
        sb.append('{');
        int i = this.f5466d;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(d(i9));
            sb.append('=');
            Object h9 = h(i9);
            if (h9 != sb) {
                sb.append(h9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }
}
