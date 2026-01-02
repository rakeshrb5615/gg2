package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class w0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        try {
            int G = aVar.G();
            if (G > 65535 || G < -32768) {
                StringBuilder p8 = v1.a.p("Lossy conversion from ", G, " to short; at path ");
                p8.append(aVar.A(true));
                throw new RuntimeException(p8.toString());
            }
            return Short.valueOf((short) G);
        } catch (NumberFormatException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.B();
        } else {
            bVar.G(number.shortValue());
        }
    }
}
