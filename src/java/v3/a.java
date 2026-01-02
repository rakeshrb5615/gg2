package v3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f6160a;

    public a(float f9) {
        this.f6160a = f9;
    }

    @Override // v3.d
    public final float a(RectF rectF) {
        return this.f6160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6160a == ((a) obj).f6160a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6160a)});
    }

    public final String toString() {
        return this.f6160a + "px";
    }
}
