package n2;

import android.opengl.Matrix;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f4511a;

    /* renamed from: b  reason: collision with root package name */
    public final h f4512b;

    public g(a aVar, h hVar) {
        this.f4511a = aVar;
        this.f4512b = hVar;
    }

    public final void a(int i, int i9) {
        if (i != 0 && i9 != 0) {
            a aVar = this.f4511a;
            aVar.f4428z = i;
            aVar.A = i9;
            float f9 = i;
            float f10 = i9;
            Matrix.orthoM(aVar.f4416m, 0, 0.0f, f9, f10, 0.0f, -10.0f, 10.0f);
            aVar.k0();
            w wVar = aVar.D;
            if (wVar != null) {
                wVar.f4846m = f9;
                if (f10 > f9) {
                    wVar.f4847n = f10 / f9;
                } else {
                    wVar.f4847n = f9 / f10;
                }
                c4.b.a0(wVar.j, wVar.f4844k, wVar.f4845l, 0.0f, f9, f10, 0.0f);
            }
        }
        this.f4512b.q0(i, i9);
    }
}
