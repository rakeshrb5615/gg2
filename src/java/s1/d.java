package s1;

import i7.n;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List f5785a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5786b;

    public d(List list, int i) {
        this.f5785a = list;
        this.f5786b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder p8 = v1.a.p("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        p8.append(new y7.d(0, list.size() - 1, 1));
        p8.append("'.");
        throw new IllegalArgumentException(p8.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5786b == dVar.f5786b && kotlin.jvm.internal.j.a(this.f5785a, dVar.f5785a);
    }

    public final int hashCode() {
        return this.f5785a.hashCode() + (this.f5786b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f5786b + ", mergedHistory=" + this.f5785a + ')';
    }

    public d() {
        this(n.f2745a, -1);
    }
}
