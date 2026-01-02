package z6;

import java.net.InetAddress;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class l0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        return InetAddress.getByName(aVar.M());
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.I(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
