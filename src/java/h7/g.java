package h7;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f2227a;

    public g(Throwable th) {
        kotlin.jvm.internal.j.e(th, "exception");
        this.f2227a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.j.a(this.f2227a, ((g) obj).f2227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2227a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2227a + ')';
    }
}
