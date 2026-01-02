package q1;

import androidx.fragment.app.e1;
import androidx.lifecycle.v0;
import r.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class e extends v0 {

    /* renamed from: d  reason: collision with root package name */
    public static final e1 f5214d = new e1(1);

    /* renamed from: b  reason: collision with root package name */
    public final k f5215b = new k();

    /* renamed from: c  reason: collision with root package name */
    public boolean f5216c = false;

    public final void b() {
        k kVar = this.f5215b;
        int i = kVar.f5474c;
        for (int i9 = 0; i9 < i; i9++) {
            c cVar = (c) kVar.e(i9);
            androidx.loader.content.e eVar = cVar.f5208l;
            eVar.cancelLoad();
            eVar.abandon();
            d dVar = cVar.f5210n;
            if (dVar != null) {
                cVar.g(dVar);
                if (dVar.f5213c) {
                    dVar.f5212b.onLoaderReset(dVar.f5211a);
                }
            }
            eVar.unregisterListener(cVar);
            if (dVar != null) {
                boolean z9 = dVar.f5213c;
            }
            eVar.reset();
        }
        int i10 = kVar.f5474c;
        Object[] objArr = kVar.f5473b;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        kVar.f5474c = 0;
    }
}
