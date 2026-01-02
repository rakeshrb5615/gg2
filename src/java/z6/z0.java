package z6;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class z0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        return new AtomicBoolean(aVar.E());
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        bVar.J(((AtomicBoolean) obj).get());
    }
}
