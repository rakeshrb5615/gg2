package m4;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final i f3978e = new i(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f3979c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f3980d;

    public i(Object[] objArr, int i) {
        this.f3979c = objArr;
        this.f3980d = i;
    }

    @Override // m4.d, m4.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f3979c;
        int i = this.f3980d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // m4.a
    public final Object[] b() {
        return this.f3979c;
    }

    @Override // m4.a
    public final int c() {
        return this.f3980d;
    }

    @Override // m4.a
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a.a.f(i, this.f3980d);
        Object obj = this.f3979c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3980d;
    }
}
