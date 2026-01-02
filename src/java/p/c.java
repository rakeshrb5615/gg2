package p;

import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5046a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5047b;

    /* renamed from: c  reason: collision with root package name */
    public c f5048c;

    /* renamed from: d  reason: collision with root package name */
    public c f5049d;

    public c(Object obj, Object obj2) {
        this.f5046a = obj;
        this.f5047b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f5046a.equals(cVar.f5046a) && this.f5047b.equals(cVar.f5047b);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5046a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5047b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5046a.hashCode() ^ this.f5047b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5046a + "=" + this.f5047b;
    }
}
