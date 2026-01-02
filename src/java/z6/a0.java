package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class a0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        return Double.valueOf(aVar.F());
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.B();
        } else {
            bVar.F(number.doubleValue());
        }
    }
}
