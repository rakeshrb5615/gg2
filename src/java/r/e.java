package r;

import androidx.datastore.preferences.protobuf.z0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e extends j implements Map {

    /* renamed from: d  reason: collision with root package name */
    public z0 f5457d;

    /* renamed from: e  reason: collision with root package name */
    public b f5458e;

    /* renamed from: f  reason: collision with root package name */
    public d f5459f;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        z0 z0Var = this.f5457d;
        if (z0Var == null) {
            z0 z0Var2 = new z0(this, 1);
            this.f5457d = z0Var2;
            return z0Var2;
        }
        return z0Var;
    }

    public final boolean k(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f5458e;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f5458e = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final boolean l(Collection collection) {
        int i = this.f5471c;
        for (Object obj : collection) {
            super.remove(obj);
        }
        return i != this.f5471c;
    }

    public final boolean m(Collection collection) {
        int i = this.f5471c;
        for (int i9 = i - 1; i9 >= 0; i9--) {
            if (!collection.contains(g(i9))) {
                h(i9);
            }
        }
        return i != this.f5471c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c(map.size() + this.f5471c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f5459f;
        if (dVar == null) {
            d dVar2 = new d(this);
            this.f5459f = dVar2;
            return dVar2;
        }
        return dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar) {
        super(0);
        int i = jVar.f5471c;
        c(this.f5471c + i);
        if (this.f5471c != 0) {
            for (int i9 = 0; i9 < i; i9++) {
                put(jVar.g(i9), jVar.j(i9));
            }
        } else if (i > 0) {
            i7.h.X(0, 0, i, jVar.f5469a, this.f5469a);
            i7.h.Z(jVar.f5470b, 0, this.f5470b, 0, i << 1);
            this.f5471c = i;
        }
    }
}
