package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class z extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        return Float.valueOf((float) aVar.F());
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.B();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        bVar.H(number);
    }
}
