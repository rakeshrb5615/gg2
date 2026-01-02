package v3;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g extends f {

    /* renamed from: e  reason: collision with root package name */
    public final float f6194e;

    public g(float f9) {
        this.f6194e = f9 - 0.001f;
    }

    @Override // v3.f
    public final void k(float f9, float f10, float f11, z zVar) {
        double d9 = this.f6194e;
        float sqrt = (float) ((Math.sqrt(2.0d) * d9) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d9, 2.0d) - Math.pow(sqrt, 2.0d));
        zVar.d(f10 - sqrt, ((float) (-((Math.sqrt(2.0d) * d9) - d9))) + sqrt2, 270.0f, 0.0f);
        zVar.c(f10, (float) (-((Math.sqrt(2.0d) * d9) - d9)));
        zVar.c(f10 + sqrt, ((float) (-((Math.sqrt(2.0d) * d9) - d9))) + sqrt2);
    }
}
