package q0;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f5138a;

    public j(DisplayCutout displayCutout) {
        this.f5138a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5138a, ((j) obj).f5138a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f5138a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5138a + "}";
    }
}
