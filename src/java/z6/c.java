package z6;

import java.util.Collection;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends w6.z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7403a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7404b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7405c;

    public c(m mVar, y6.p pVar) {
        this.f7404b = mVar;
        this.f7405c = pVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        switch (this.f7403a) {
            case 0:
                if (aVar.O() == 9) {
                    aVar.K();
                    return null;
                }
                Collection collection = (Collection) ((y6.p) this.f7405c).c();
                aVar.c();
                while (aVar.B()) {
                    collection.add(((m) this.f7404b).f7422c.b(aVar));
                }
                aVar.x();
                return collection;
            default:
                Class cls = (Class) this.f7404b;
                Object b10 = ((q0) this.f7405c).f7441c.b(aVar);
                if (b10 == null || cls.isInstance(b10)) {
                    return b10;
                }
                throw new RuntimeException("Expected a " + cls.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.A(true));
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        switch (this.f7403a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.B();
                    return;
                }
                bVar.f();
                for (Object obj2 : collection) {
                    ((m) this.f7404b).c(bVar, obj2);
                }
                bVar.x();
                return;
            default:
                ((q0) this.f7405c).f7441c.c(bVar, obj);
                return;
        }
    }

    public c(q0 q0Var, Class cls) {
        this.f7405c = q0Var;
        this.f7404b = cls;
    }
}
