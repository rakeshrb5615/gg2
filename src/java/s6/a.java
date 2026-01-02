package s6;

import g5.k;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m8.c f5840a;

    /* renamed from: b  reason: collision with root package name */
    public k f5841b = null;

    public a(m8.c cVar) {
        this.f5840a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f5840a.equals(aVar.f5840a) && j.a(this.f5841b, aVar.f5841b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5840a.hashCode() * 31;
        k kVar = this.f5841b;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f5840a + ", subscriber=" + this.f5841b + ')';
    }
}
