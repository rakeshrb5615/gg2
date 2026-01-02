package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class b0 extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        if (M.length() == 1) {
            return Character.valueOf(M.charAt(0));
        }
        StringBuilder q = v1.a.q("Expecting character, got: ", M, "; at ");
        q.append(aVar.A(true));
        throw new RuntimeException(q.toString());
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Character ch = (Character) obj;
        bVar.I(ch == null ? null : String.valueOf(ch));
    }
}
