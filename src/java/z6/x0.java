package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class x0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        try {
            return Integer.valueOf(aVar.G());
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
            bVar.G(number.intValue());
        }
    }
}
