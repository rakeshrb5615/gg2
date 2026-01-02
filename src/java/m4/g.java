package m4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class g extends a implements Set {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3974c = 0;

    /* renamed from: b  reason: collision with root package name */
    public transient d f3975b;

    public static int f(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static g g(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                return new r(obj);
            }
            int f9 = f(i);
            Object[] objArr2 = new Object[f9];
            int i9 = f9 - 1;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                Object obj2 = objArr[i12];
                if (obj2 == null) {
                    throw new NullPointerException(g2.g.c(i12, "at index "));
                }
                int hashCode = obj2.hashCode();
                int U = a.a.U(hashCode);
                while (true) {
                    int i13 = U & i9;
                    Object obj3 = objArr2[i13];
                    if (obj3 == null) {
                        objArr[i11] = obj2;
                        objArr2[i13] = obj2;
                        i10 += hashCode;
                        i11++;
                        break;
                    } else if (obj3.equals(obj2)) {
                        break;
                    } else {
                        U++;
                    }
                }
            }
            Arrays.fill(objArr, i11, i, (Object) null);
            if (i11 == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                return new r(obj4);
            } else if (f(i11) < f9 / 2) {
                return g(i11, objArr);
            } else {
                int length = objArr.length;
                if (i11 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i11);
                }
                return new o(objArr, i10, objArr2, i9, i11);
            }
        }
        return o.f3995p;
    }

    public d e() {
        d dVar = this.f3975b;
        if (dVar == null) {
            d h9 = h();
            this.f3975b = h9;
            return h9;
        }
        return dVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof o) && (((g) obj) instanceof o) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public d h() {
        Object[] array = toArray(a.f3960a);
        b bVar = d.f3967b;
        return d.e(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }
}
