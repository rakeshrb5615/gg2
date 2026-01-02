package e1;

import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f1304a;

    public e(String str) {
        j.e(str, "name");
        this.f1304a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f1304a, ((e) obj).f1304a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1304a.hashCode();
    }

    public final String toString() {
        return this.f1304a;
    }
}
