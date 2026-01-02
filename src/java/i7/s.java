package i7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class s extends d implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2749b;

    /* renamed from: c  reason: collision with root package name */
    public int f2750c;

    /* renamed from: d  reason: collision with root package name */
    public int f2751d;

    public s(Object[] objArr, int i) {
        this.f2748a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(g2.g.c(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f2749b = objArr.length;
            this.f2751d = i;
            return;
        }
        StringBuilder p8 = v1.a.p("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
        p8.append(objArr.length);
        throw new IllegalArgumentException(p8.toString().toString());
    }

    @Override // i7.a
    public final int b() {
        return this.f2751d;
    }

    public final void c() {
        if (20 > this.f2751d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f2751d).toString());
        }
        int i = this.f2750c;
        int i9 = this.f2749b;
        int i10 = (i + 20) % i9;
        Object[] objArr = this.f2748a;
        if (i > i10) {
            h.d0(objArr, i, i9);
            h.d0(objArr, 0, i10);
        } else {
            h.d0(objArr, i, i10);
        }
        this.f2750c = i10;
        this.f2751d -= 20;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int b10 = b();
        if (i < 0 || i >= b10) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, b10, ", size: "));
        }
        return this.f2748a[(this.f2750c + i) % this.f2749b];
    }

    @Override // i7.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new b8.b(this);
    }

    @Override // i7.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // i7.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        kotlin.jvm.internal.j.e(objArr, "array");
        int length = objArr.length;
        int i = this.f2751d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            kotlin.jvm.internal.j.d(objArr, "copyOf(...)");
        }
        int i9 = this.f2751d;
        int i10 = this.f2750c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr2 = this.f2748a;
            if (i12 >= i9 || i10 >= this.f2749b) {
                break;
            }
            objArr[i12] = objArr2[i10];
            i12++;
            i10++;
        }
        while (i12 < i9) {
            objArr[i12] = objArr2[i11];
            i12++;
            i11++;
        }
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }
}
