package z6;

import java.math.BigInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class e0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        try {
            y6.i.c(M);
            return new BigInteger(M);
        } catch (NumberFormatException e9) {
            StringBuilder q = v1.a.q("Failed parsing '", M, "' as BigInteger; at path ");
            q.append(aVar.A(true));
            throw new RuntimeException(q.toString(), e9);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        bVar.H((BigInteger) obj);
    }
}
