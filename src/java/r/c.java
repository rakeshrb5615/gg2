package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public int f5452a;

    /* renamed from: b  reason: collision with root package name */
    public int f5453b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5454c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f5455d;

    public c(e eVar) {
        this.f5455d = eVar;
        this.f5452a = eVar.f5471c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f5454c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.f5453b;
                e eVar = this.f5455d;
                return kotlin.jvm.internal.j.a(key, eVar.g(i)) && kotlin.jvm.internal.j.a(entry.getValue(), eVar.j(this.f5453b));
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f5454c) {
            return this.f5455d.g(this.f5453b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f5454c) {
            return this.f5455d.j(this.f5453b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5453b < this.f5452a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.f5454c) {
            int i = this.f5453b;
            e eVar = this.f5455d;
            Object g3 = eVar.g(i);
            Object j = eVar.j(this.f5453b);
            return (g3 == null ? 0 : g3.hashCode()) ^ (j != null ? j.hashCode() : 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f5453b++;
            this.f5454c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5454c) {
            throw new IllegalStateException();
        }
        this.f5455d.h(this.f5453b);
        this.f5453b--;
        this.f5452a--;
        this.f5454c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5454c) {
            return this.f5455d.i(this.f5453b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
