package h7;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2225a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2226b;

    public f(Object obj, Object obj2) {
        this.f2225a = obj;
        this.f2226b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.j.a(this.f2225a, fVar.f2225a) && kotlin.jvm.internal.j.a(this.f2226b, fVar.f2226b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2225a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2226b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2225a + ", " + this.f2226b + ')';
    }
}
