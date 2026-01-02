package q2;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class m extends w {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5280a;

    public m(ArrayList arrayList) {
        this.f5280a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f5280a.equals(((m) ((w) obj)).f5280a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5280a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5280a + "}";
    }
}
