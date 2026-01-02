package z6;

import java.math.BigDecimal;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class d0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        try {
            return y6.i.i(M);
        } catch (NumberFormatException e9) {
            StringBuilder q = v1.a.q("Failed parsing '", M, "' as BigDecimal; at path ");
            q.append(aVar.A(true));
            throw new RuntimeException(q.toString(), e9);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        bVar.H((BigDecimal) obj);
    }
}
