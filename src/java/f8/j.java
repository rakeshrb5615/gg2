package f8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final i f1561b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1562a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return kotlin.jvm.internal.j.a(this.f1562a, ((j) obj).f1562a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1562a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f1562a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
