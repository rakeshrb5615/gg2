package g0;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1626a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f1627b;

    public j(Resources resources, Resources.Theme theme) {
        this.f1626a = resources;
        this.f1627b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f1626a.equals(jVar.f1626a) && Objects.equals(this.f1627b, jVar.f1627b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1626a, this.f1627b);
    }
}
