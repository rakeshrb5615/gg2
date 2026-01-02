package h8;

import d4.l;
import kotlin.jvm.internal.u;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final l f2244a = new l("NULL", 4, false);

    public static final Object a(l7.h hVar, Object obj, Object obj2, p pVar, l7.c cVar) {
        Object invoke;
        Object l5 = i8.a.l(hVar, obj2);
        try {
            k kVar = new k(cVar, hVar);
            if (pVar == null) {
                invoke = q4.b.U(pVar, obj, kVar);
            } else {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, kVar);
            }
            i8.a.g(hVar, l5);
            if (invoke == m7.a.f4049a) {
                kotlin.jvm.internal.j.e(cVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            i8.a.g(hVar, l5);
            throw th;
        }
    }
}
