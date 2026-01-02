package z6;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k implements w6.a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final j f7416c = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final y6.c f7417a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f7418b = new ConcurrentHashMap();

    static {
        new j(0);
    }

    public k(y6.c cVar) {
        this.f7417a = cVar;
    }

    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        x6.a aVar2 = (x6.a) aVar.f1153a.getAnnotation(x6.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f7417a, mVar, aVar, aVar2, true);
    }

    public final w6.z b(y6.c cVar, w6.m mVar, d7.a aVar, x6.a aVar2, boolean z9) {
        w6.z a10;
        Object c9 = cVar.b(new d7.a(aVar2.value()), true).c();
        boolean nullSafe = aVar2.nullSafe();
        if (c9 instanceof w6.z) {
            a10 = (w6.z) c9;
        } else if (!(c9 instanceof w6.a0)) {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + c9.getClass().getName() + " as a @JsonAdapter for " + y6.i.k(aVar.f1154b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        } else {
            w6.a0 a0Var = (w6.a0) c9;
            if (z9) {
                w6.a0 a0Var2 = (w6.a0) this.f7418b.putIfAbsent(aVar.f1153a, a0Var);
                if (a0Var2 != null) {
                    a0Var = a0Var2;
                }
            }
            a10 = a0Var.a(mVar, aVar);
        }
        return (a10 == null || !nullSafe) ? a10 : a10.a();
    }
}
