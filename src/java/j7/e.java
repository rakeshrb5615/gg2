package j7;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e implements Map.Entry, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final f f3329a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3330b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3331c;

    public e(f fVar, int i) {
        j.e(fVar, "map");
        this.f3329a = fVar;
        this.f3330b = i;
        this.f3331c = fVar.f3340n;
    }

    public final void b() {
        if (this.f3329a.f3340n != this.f3331c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        b();
        return this.f3329a.f3333a[this.f3330b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        b();
        Object[] objArr = this.f3329a.f3334b;
        j.b(objArr);
        return objArr[this.f3330b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        b();
        f fVar = this.f3329a;
        fVar.c();
        Object[] objArr = fVar.f3334b;
        if (objArr == null) {
            int length = fVar.f3333a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f3334b = objArr;
        }
        int i = this.f3330b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
