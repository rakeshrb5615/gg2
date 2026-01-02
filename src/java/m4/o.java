package m4;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class o extends g {

    /* renamed from: o  reason: collision with root package name */
    public static final Object[] f3994o;

    /* renamed from: p  reason: collision with root package name */
    public static final o f3995p;

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f3996d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f3997e;

    /* renamed from: f  reason: collision with root package name */
    public final transient Object[] f3998f;

    /* renamed from: m  reason: collision with root package name */
    public final transient int f3999m;

    /* renamed from: n  reason: collision with root package name */
    public final transient int f4000n;

    static {
        Object[] objArr = new Object[0];
        f3994o = objArr;
        f3995p = new o(objArr, 0, objArr, 0, 0);
    }

    public o(Object[] objArr, int i, Object[] objArr2, int i9, int i10) {
        this.f3996d = objArr;
        this.f3997e = i;
        this.f3998f = objArr2;
        this.f3999m = i9;
        this.f4000n = i10;
    }

    @Override // m4.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f3996d;
        int i = this.f4000n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // m4.a
    public final Object[] b() {
        return this.f3996d;
    }

    @Override // m4.a
    public final int c() {
        return this.f4000n;
    }

    @Override // m4.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f3998f;
            if (objArr.length != 0) {
                int U = a.a.U(obj.hashCode());
                while (true) {
                    int i = U & this.f3999m;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    U = i + 1;
                }
            }
        }
        return false;
    }

    @Override // m4.a
    public final int d() {
        return 0;
    }

    @Override // m4.g
    public final d h() {
        return d.e(this.f4000n, this.f3996d);
    }

    @Override // m4.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f3997e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4000n;
    }
}
