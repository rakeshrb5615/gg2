package z6;

import java.util.BitSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class r0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        boolean z9;
        BitSet bitSet = new BitSet();
        aVar.c();
        int O = aVar.O();
        int i = 0;
        while (O != 2) {
            int c9 = u.e.c(O);
            if (c9 == 5 || c9 == 6) {
                int G = aVar.G();
                if (G == 0) {
                    z9 = false;
                } else if (G != 1) {
                    StringBuilder p8 = v1.a.p("Invalid bitset value ", G, ", expected 0 or 1; at path ");
                    p8.append(aVar.A(true));
                    throw new RuntimeException(p8.toString());
                } else {
                    z9 = true;
                }
            } else if (c9 != 7) {
                throw new RuntimeException("Invalid bitset value type: " + v1.a.z(O) + "; at path " + aVar.A(false));
            } else {
                z9 = aVar.E();
            }
            if (z9) {
                bitSet.set(i);
            }
            i++;
            O = aVar.O();
        }
        aVar.x();
        return bitSet;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.f();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            bVar.G(bitSet.get(i) ? 1L : 0L);
        }
        bVar.x();
    }
}
