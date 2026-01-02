package o1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5000a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return j.a(this.f5000a, ((b) obj).f5000a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5000a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f5000a + ')';
    }
}
