package q6;

import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f5435a;

    public d(HashSet hashSet) {
        this.f5435a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f5435a.equals(((d) obj).f5435a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5435a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f5435a + "}";
    }
}
