package w;

import java.util.ArrayList;
import x.n;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class i extends d {

    /* renamed from: q0  reason: collision with root package name */
    public d[] f6421q0 = new d[4];

    /* renamed from: r0  reason: collision with root package name */
    public int f6422r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i9 = 0; i9 < this.f6422r0; i9++) {
            d dVar = this.f6421q0[i9];
            ArrayList arrayList2 = nVar.f6526a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i10 = 0; i10 < this.f6422r0; i10++) {
            x.h.b(this.f6421q0[i10], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
