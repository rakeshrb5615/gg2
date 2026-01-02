package m4;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j extends d {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f3981c;

    public j(k kVar) {
        this.f3981c = kVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k kVar = this.f3981c;
        a.a.f(i, kVar.f3984f);
        Object[] objArr = kVar.f3983e;
        int i9 = i * 2;
        Object obj = objArr[i9];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3981c.f3984f;
    }
}
