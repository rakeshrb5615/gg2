package l4;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3784a;

    public j(Object obj) {
        this.f3784a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return q4.b.p(this.f3784a, ((j) obj).f3784a);
        }
        return false;
    }

    @Override // l4.f
    public final Object get() {
        return this.f3784a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3784a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f3784a + ")";
    }
}
