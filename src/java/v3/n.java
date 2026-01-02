package v3;

import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n extends t1 {
    @Override // j5.t1
    public final void x(z zVar, float f9, float f10) {
        float f11 = f10 * f9;
        zVar.d(0.0f, f11, 180.0f, 90.0f);
        float f12 = f11 * 2.0f;
        v vVar = new v(0.0f, 0.0f, f12, f12);
        vVar.f6276f = 180.0f;
        vVar.f6277g = 90.0f;
        zVar.f6289g.add(vVar);
        t tVar = new t(vVar);
        zVar.a(180.0f);
        zVar.f6290h.add(tVar);
        zVar.f6287e = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d9 = 270.0f;
        zVar.f6285c = (((float) Math.cos(Math.toRadians(d9))) * f14) + f13;
        zVar.f6286d = (f14 * ((float) Math.sin(Math.toRadians(d9)))) + f13;
    }
}
