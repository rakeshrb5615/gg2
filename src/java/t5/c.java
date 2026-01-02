package t5;

import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f5972a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f5973b;

    public c(String str, Map map) {
        this.f5972a = str;
        this.f5973b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f5972a.equals(cVar.f5972a) && this.f5973b.equals(cVar.f5973b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5973b.hashCode() + (this.f5972a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f5972a + ", properties=" + this.f5973b.values() + "}";
    }
}
