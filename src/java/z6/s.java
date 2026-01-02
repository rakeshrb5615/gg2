package z6;

import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class s extends r {

    /* renamed from: b  reason: collision with root package name */
    public final y6.p f7443b;

    public s(y6.p pVar, t tVar) {
        super(tVar);
        this.f7443b = pVar;
    }

    @Override // z6.r
    public final Object d() {
        return this.f7443b.c();
    }

    @Override // z6.r
    public final Object e(Object obj) {
        return obj;
    }

    @Override // z6.r
    public final void f(Object obj, e7.a aVar, q qVar) {
        Field field = qVar.f7432b;
        Object b10 = qVar.f7436f.b(aVar);
        if (b10 == null && qVar.f7437g) {
            return;
        }
        if (qVar.f7438h) {
            throw new RuntimeException(g2.g.l("Cannot set value of 'static final' ", b7.c.d(field, false)));
        }
        field.set(obj, b10);
    }
}
