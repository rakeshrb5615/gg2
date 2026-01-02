package m4;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class m extends d {

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f3987c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f3988d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f3989e;

    public m(Object[] objArr, int i, int i9) {
        this.f3987c = objArr;
        this.f3988d = i;
        this.f3989e = i9;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a.a.f(i, this.f3989e);
        Object obj = this.f3987c[(i * 2) + this.f3988d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3989e;
    }
}
