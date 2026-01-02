package z6;

import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class k0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        try {
            String M = aVar.M();
            if (M.equals("null")) {
                return null;
            }
            return new URI(M);
        } catch (URISyntaxException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.I(uri == null ? null : uri.toASCIIString());
    }
}
