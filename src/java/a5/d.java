package a5;

import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public interface d {
    default Object a(Class cls) {
        return e(x.a(cls));
    }

    c6.b b(x xVar);

    default Set c(x xVar) {
        return (Set) d(xVar).get();
    }

    c6.b d(x xVar);

    default Object e(x xVar) {
        c6.b b10 = b(xVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    default c6.b f(Class cls) {
        return b(x.a(cls));
    }

    v g(x xVar);

    default v h(Class cls) {
        return g(x.a(cls));
    }
}
