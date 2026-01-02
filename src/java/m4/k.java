package m4;

import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class k extends g {

    /* renamed from: d  reason: collision with root package name */
    public final transient f f3982d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f3983e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f3984f;

    public k(f fVar, Object[] objArr, int i) {
        this.f3982d = fVar;
        this.f3983e = objArr;
        this.f3984f = i;
    }

    @Override // m4.a
    public final int a(Object[] objArr) {
        return e().a(objArr);
    }

    @Override // m4.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3982d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.g
    public final d h() {
        return new j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final s iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3984f;
    }
}
