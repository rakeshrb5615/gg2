package y7;

import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c9 = this.f6959a;
            char c10 = this.f6960b;
            if (j.f(c9, c10) > 0) {
                c cVar = (c) obj;
                if (j.f(cVar.f6959a, cVar.f6960b) > 0) {
                    return true;
                }
            }
            c cVar2 = (c) obj;
            return c9 == cVar2.f6959a && c10 == cVar2.f6960b;
        }
        return false;
    }

    public final int hashCode() {
        char c9 = this.f6959a;
        char c10 = this.f6960b;
        if (j.f(c9, c10) > 0) {
            return -1;
        }
        return (c9 * 31) + c10;
    }

    public final String toString() {
        return this.f6959a + ".." + this.f6960b;
    }
}
