package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f1201a;

    static {
        String str;
        k0 k0Var;
        int i = i8.t.f2801a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            k8.e eVar = n0.f1224a;
            e8.c cVar = i8.n.f2795a;
            e8.c cVar2 = cVar.f1359e;
            k0Var = cVar;
            if (cVar == null) {
                k0Var = g0.f1197p;
            }
        } else {
            k0Var = g0.f1197p;
        }
        f1201a = k0Var;
    }
}
