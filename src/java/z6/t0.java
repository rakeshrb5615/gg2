package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class t0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        int O = aVar.O();
        if (O != 9) {
            return O == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.M())) : Boolean.valueOf(aVar.E());
        }
        aVar.K();
        return null;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            bVar.B();
            return;
        }
        bVar.K();
        bVar.c();
        bVar.f1347a.write(bool.booleanValue() ? "true" : "false");
    }
}
