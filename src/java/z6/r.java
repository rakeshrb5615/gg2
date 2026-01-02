package z6;

import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public abstract class r extends w6.z {

    /* renamed from: a  reason: collision with root package name */
    public final t f7442a;

    public r(t tVar) {
        this.f7442a = tVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        Object d9 = d();
        Map map = this.f7442a.f7448a;
        try {
            aVar.f();
            while (aVar.B()) {
                q qVar = (q) map.get(aVar.I());
                if (qVar == null) {
                    aVar.U();
                } else {
                    f(d9, aVar, qVar);
                }
            }
            aVar.y();
            return e(d9);
        } catch (IllegalAccessException e9) {
            q4.b bVar = b7.c.f765a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        } catch (IllegalStateException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        if (obj == null) {
            bVar.B();
            return;
        }
        bVar.i();
        try {
            for (q qVar : this.f7442a.f7449b) {
                qVar.a(bVar, obj);
            }
            bVar.y();
        } catch (IllegalAccessException e9) {
            q4.b bVar2 = b7.c.f765a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, e7.a aVar, q qVar);
}
