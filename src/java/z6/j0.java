package z6;

import java.net.URL;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class j0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        if (M.equals("null")) {
            return null;
        }
        return new URL(M);
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.I(url == null ? null : url.toExternalForm());
    }
}
