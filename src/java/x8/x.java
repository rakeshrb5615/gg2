package x8;

import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class x extends i7.d implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final j[] f6686a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f6687b;

    public x(j[] jVarArr, int[] iArr) {
        this.f6686a = jVarArr;
        this.f6687b = iArr;
    }

    @Override // i7.a
    public final int b() {
        return this.f6686a.length;
    }

    @Override // i7.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f6686a[i];
    }

    @Override // i7.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // i7.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
