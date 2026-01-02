package j7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g extends AbstractSet implements Set, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3345a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3346b;

    public /* synthetic */ g(f fVar, int i) {
        this.f3345a = i;
        this.f3346b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3345a) {
            case 0:
                j.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f3345a) {
            case 0:
                j.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                j.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3345a) {
            case 0:
                this.f3346b.clear();
                return;
            default:
                this.f3346b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f3345a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return this.f3346b.f((Map.Entry) obj);
                }
                return false;
            default:
                return this.f3346b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f3345a) {
            case 0:
                j.e(collection, "elements");
                return this.f3346b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f3345a) {
            case 0:
                return this.f3346b.isEmpty();
            default:
                return this.f3346b.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3345a) {
            case 0:
                f fVar = this.f3346b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f3346b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f3345a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    f fVar = this.f3346b;
                    fVar.getClass();
                    fVar.c();
                    int h9 = fVar.h(entry.getKey());
                    if (h9 < 0) {
                        return false;
                    }
                    Object[] objArr = fVar.f3334b;
                    j.b(objArr);
                    if (j.a(objArr[h9], entry.getValue())) {
                        fVar.l(h9);
                        return true;
                    }
                    return false;
                }
                return false;
            default:
                f fVar2 = this.f3346b;
                fVar2.c();
                int h10 = fVar2.h(obj);
                if (h10 < 0) {
                    return false;
                }
                fVar2.l(h10);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f3345a) {
            case 0:
                j.e(collection, "elements");
                this.f3346b.c();
                return super.removeAll(collection);
            default:
                j.e(collection, "elements");
                this.f3346b.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f3345a) {
            case 0:
                j.e(collection, "elements");
                this.f3346b.c();
                return super.retainAll(collection);
            default:
                j.e(collection, "elements");
                this.f3346b.c();
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3345a) {
            case 0:
                return this.f3346b.f3341o;
            default:
                return this.f3346b.f3341o;
        }
    }
}
