package v3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f6233a;

    public m(float f9) {
        this.f6233a = f9;
    }

    @Override // v3.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f6233a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f6233a == ((m) obj).f6233a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6233a)});
    }

    public final String toString() {
        return ((int) (this.f6233a * 100.0f)) + "%";
    }
}
