package s3;

import android.graphics.Typeface;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends g0.b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q4.b f5820h;
    public final /* synthetic */ d i;

    public b(d dVar, q4.b bVar) {
        this.i = dVar;
        this.f5820h = bVar;
    }

    @Override // g0.b
    public final void h(int i) {
        this.i.f5835n = true;
        this.f5820h.I(i);
    }

    @Override // g0.b
    public final void i(Typeface typeface) {
        d dVar = this.i;
        dVar.f5837p = Typeface.create(typeface, dVar.f5827d);
        dVar.f5835n = true;
        this.f5820h.J(dVar.f5837p, false);
    }
}
