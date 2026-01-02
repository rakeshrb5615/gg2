package i7;

import j5.t1;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final d f2735a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2736b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2737c;

    public c(d dVar, int i, int i9) {
        this.f2735a = dVar;
        this.f2736b = i;
        t1.e(i, i9, dVar.b());
        this.f2737c = i9 - i;
    }

    @Override // i7.a
    public final int b() {
        return this.f2737c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i9 = this.f2737c;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, i9, ", size: "));
        }
        return this.f2735a.get(this.f2736b + i);
    }

    @Override // i7.d, java.util.List
    public final List subList(int i, int i9) {
        t1.e(i, i9, this.f2737c);
        int i10 = this.f2736b;
        return new c(this.f2735a, i + i10, i10 + i9);
    }
}
