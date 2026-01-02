package m4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class f implements Map, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient k f3971a;

    /* renamed from: b  reason: collision with root package name */
    public transient l f3972b;

    /* renamed from: c  reason: collision with root package name */
    public transient m f3973c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        m mVar = this.f3973c;
        if (mVar == null) {
            n nVar = (n) this;
            m mVar2 = new m(nVar.f3992e, 1, nVar.f3993f);
            this.f3973c = mVar2;
            mVar = mVar2;
        }
        return mVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        k kVar = this.f3971a;
        if (kVar == null) {
            n nVar = (n) this;
            k kVar2 = new k(nVar, nVar.f3992e, nVar.f3993f);
            this.f3971a = kVar2;
            return kVar2;
        }
        return kVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((g) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        k kVar = this.f3971a;
        if (kVar == null) {
            n nVar = (n) this;
            k kVar2 = new k(nVar, nVar.f3992e, nVar.f3993f);
            this.f3971a = kVar2;
            kVar = kVar2;
        }
        Iterator it = kVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((n) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        l lVar = this.f3972b;
        if (lVar == null) {
            n nVar = (n) this;
            l lVar2 = new l(nVar, new m(nVar.f3992e, 0, nVar.f3993f));
            this.f3972b = lVar2;
            return lVar2;
        }
        return lVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((n) this).f3993f;
        if (i < 0) {
            throw new IllegalArgumentException(g2.g.c(i, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        s it = ((k) entrySet()).iterator();
        boolean z9 = true;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        m mVar = this.f3973c;
        if (mVar == null) {
            n nVar = (n) this;
            m mVar2 = new m(nVar.f3992e, 1, nVar.f3993f);
            this.f3973c = mVar2;
            return mVar2;
        }
        return mVar;
    }
}
