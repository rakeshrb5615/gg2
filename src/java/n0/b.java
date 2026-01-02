package n0;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f4375a;

    /* renamed from: b  reason: collision with root package name */
    public String f4376b;

    /* renamed from: c  reason: collision with root package name */
    public List f4377c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Objects.equals(this.f4375a, bVar.f4375a) && Objects.equals(this.f4376b, bVar.f4376b) && Objects.equals(this.f4377c, bVar.f4377c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4375a, this.f4376b, this.f4377c);
    }
}
