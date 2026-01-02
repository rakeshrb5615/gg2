package v3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final d f6161a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6162b;

    public b(float f9, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f6161a;
            f9 += ((b) dVar).f6162b;
        }
        this.f6161a = dVar;
        this.f6162b = f9;
    }

    @Override // v3.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f6161a.a(rectF) + this.f6162b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f6161a.equals(bVar.f6161a) && this.f6162b == bVar.f6162b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6161a, Float.valueOf(this.f6162b)});
    }
}
