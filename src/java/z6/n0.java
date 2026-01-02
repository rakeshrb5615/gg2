package z6;

import java.util.Currency;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class n0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        String M = aVar.M();
        try {
            return Currency.getInstance(M);
        } catch (IllegalArgumentException e9) {
            StringBuilder q = v1.a.q("Failed parsing '", M, "' as Currency; at path ");
            q.append(aVar.A(true));
            throw new RuntimeException(q.toString(), e9);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        bVar.I(((Currency) obj).getCurrencyCode());
    }
}
