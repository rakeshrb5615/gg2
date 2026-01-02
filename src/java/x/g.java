package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f6518m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f6512e = 2;
        } else {
            this.f6512e = 3;
        }
    }

    @Override // x.f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f6514g = i;
        ArrayList arrayList = this.f6516k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
