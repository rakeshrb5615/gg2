package q0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class l1 extends k1 {
    public l1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
    }

    @Override // q0.p1
    public s1 a() {
        return s1.g(null, this.f5142c.consumeDisplayCutout());
    }

    @Override // q0.p1
    public j e() {
        DisplayCutout displayCutout = this.f5142c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // q0.j1, q0.p1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            return Objects.equals(this.f5142c, l1Var.f5142c) && Objects.equals(this.f5146g, l1Var.f5146g) && j1.y(this.f5147h, l1Var.f5147h);
        }
        return false;
    }

    @Override // q0.p1
    public int hashCode() {
        return this.f5142c.hashCode();
    }
}
