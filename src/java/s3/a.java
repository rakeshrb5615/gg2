package s3;

import android.graphics.Typeface;
import j6.o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f5817f;

    /* renamed from: g  reason: collision with root package name */
    public final o f5818g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5819h;

    public a(o oVar, Typeface typeface) {
        super(26);
        this.f5817f = typeface;
        this.f5818g = oVar;
    }

    @Override // q4.b
    public final void I(int i) {
        if (this.f5819h) {
            return;
        }
        q3.b bVar = (q3.b) this.f5818g.f3275b;
        if (bVar.l(this.f5817f)) {
            bVar.j(false);
        }
    }

    @Override // q4.b
    public final void J(Typeface typeface, boolean z9) {
        if (this.f5819h) {
            return;
        }
        q3.b bVar = (q3.b) this.f5818g.f3275b;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
