package z6;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class y0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        try {
            return new AtomicInteger(aVar.G());
        } catch (NumberFormatException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        bVar.G(((AtomicInteger) obj).get());
    }
}
