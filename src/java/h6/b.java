package h6;

import com.google.android.gms.common.internal.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f2221a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Objects.equal(this.f2221a, ((b) obj).f2221a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.f2221a});
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("token", this.f2221a).toString();
    }
}
