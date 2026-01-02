package p0;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5057a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5058b;

    public b(Object obj, Object obj2) {
        this.f5057a = obj;
        this.f5058b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Objects.equals(bVar.f5057a, this.f5057a) && Objects.equals(bVar.f5058b, this.f5058b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5057a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5058b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f5057a + " " + this.f5058b + "}";
    }
}
