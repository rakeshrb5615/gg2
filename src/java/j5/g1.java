package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g1 extends i2 {

    /* renamed from: a  reason: collision with root package name */
    public final List f2973a;

    public g1(List list) {
        this.f2973a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            return this.f2973a.equals(((g1) ((i2) obj)).f2973a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2973a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f2973a + "}";
    }
}
