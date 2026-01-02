package v3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f6167a;

    public c(float f9) {
        this.f6167a = f9;
    }

    @Override // v3.d
    public final float a(RectF rectF) {
        return c4.b.g(this.f6167a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f6167a == ((c) obj).f6167a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6167a)});
    }
}
