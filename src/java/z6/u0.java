package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class u0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        return Boolean.valueOf(aVar.M());
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.I(bool == null ? "null" : bool.toString());
    }
}
