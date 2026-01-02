package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class h implements w6.a0 {
    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        Class cls = aVar.f1153a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new i(cls);
    }
}
