package s6;

import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f5856a;

    public e(String str) {
        j.e(str, "sessionId");
        this.f5856a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f5856a, ((e) obj).f5856a);
    }

    public final int hashCode() {
        return this.f5856a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f5856a + ')';
    }
}
