package r;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class k implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ int[] f5472a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object[] f5473b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ int f5474c;

    public k() {
        int i;
        int i9 = 4;
        while (true) {
            i = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i = i10;
                break;
            }
            i9++;
        }
        int i11 = i / 4;
        this.f5472a = new int[i11];
        this.f5473b = new Object[i11];
    }

    public final void a(int i, Object obj) {
        int i9 = this.f5474c;
        if (i9 != 0 && i <= this.f5472a[i9 - 1]) {
            d(i, obj);
            return;
        }
        if (i9 >= this.f5472a.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f5472a, i13);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f5472a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5473b, i13);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            this.f5473b = copyOf2;
        }
        this.f5472a[i9] = i;
        this.f5473b[i9] = obj;
        this.f5474c = i9 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int a10 = s.a.a(this.f5474c, i, this.f5472a);
        if (a10 < 0 || (obj = this.f5473b[a10]) == h.f5468b) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f5472a = (int[]) this.f5472a.clone();
        kVar.f5473b = (Object[]) this.f5473b.clone();
        return kVar;
    }

    public final void d(int i, Object obj) {
        int a10 = s.a.a(this.f5474c, i, this.f5472a);
        if (a10 >= 0) {
            this.f5473b[a10] = obj;
            return;
        }
        int i9 = ~a10;
        int i10 = this.f5474c;
        if (i9 < i10) {
            Object[] objArr = this.f5473b;
            if (objArr[i9] == h.f5468b) {
                this.f5472a[i9] = i;
                objArr[i9] = obj;
                return;
            }
        }
        if (i10 >= this.f5472a.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.f5472a, i14);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f5472a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5473b, i14);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            this.f5473b = copyOf2;
        }
        int i15 = this.f5474c;
        if (i15 - i9 != 0) {
            int[] iArr = this.f5472a;
            int i16 = i9 + 1;
            i7.h.X(i16, i9, i15, iArr, iArr);
            Object[] objArr2 = this.f5473b;
            i7.h.Z(objArr2, i16, objArr2, i9, this.f5474c);
        }
        this.f5472a[i9] = i;
        this.f5473b[i9] = obj;
        this.f5474c++;
    }

    public final Object e(int i) {
        Object[] objArr = this.f5473b;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.f5474c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i9 = this.f5474c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5472a[i10]);
            sb.append('=');
            Object e9 = e(i10);
            if (e9 != this) {
                sb.append(e9);
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
