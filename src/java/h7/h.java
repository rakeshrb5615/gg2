package h7;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2228a;

    public static final Throwable a(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).f2227a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.j.a(this.f2228a, ((h) obj).f2228a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2228a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2228a;
        if (obj instanceof g) {
            return ((g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
