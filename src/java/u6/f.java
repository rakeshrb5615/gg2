package u6;

import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class f implements s8.e {

    /* renamed from: a  reason: collision with root package name */
    public static final f f6108a;
    private static final q8.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [s8.e, java.lang.Object, u6.f] */
    static {
        ?? obj = new Object();
        f6108a = obj;
        s8.m mVar = new s8.m("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        mVar.k("sessionsEnabled", false);
        mVar.k("sessionSamplingRate", false);
        mVar.k("sessionTimeoutSeconds", false);
        mVar.k("cacheDurationSeconds", false);
        mVar.k("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override // s8.e
    public final o8.a[] a() {
        o8.a D = t1.D(s8.a.f5857a);
        o8.a D2 = t1.D(s8.c.f5859a);
        s8.f fVar = s8.f.f5866a;
        return new o8.a[]{D, D2, t1.D(fVar), t1.D(fVar), t1.D(s8.i.f5872a)};
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        h hVar = (h) obj;
        kotlin.jvm.internal.j.e(hVar, "value");
        q8.d dVar = descriptor;
        u8.i a10 = iVar.a(dVar);
        a10.g(dVar, 0, s8.a.f5857a, hVar.f6109a);
        a10.g(dVar, 1, s8.c.f5859a, hVar.f6110b);
        s8.f fVar = s8.f.f5866a;
        a10.g(dVar, 2, fVar, hVar.f6111c);
        a10.g(dVar, 3, fVar, hVar.f6112d);
        a10.g(dVar, 4, s8.i.f5872a, hVar.f6113e);
        a10.l(dVar);
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        q8.d dVar = descriptor;
        n.p b10 = pVar.b(dVar);
        int i = 0;
        Boolean bool = null;
        Double d9 = null;
        Integer num = null;
        Integer num2 = null;
        Long l5 = null;
        boolean z9 = true;
        while (z9) {
            int c9 = b10.c(dVar);
            if (c9 == -1) {
                z9 = false;
            } else if (c9 == 0) {
                bool = (Boolean) b10.i(dVar, 0, s8.a.f5857a, bool);
                i |= 1;
            } else if (c9 == 1) {
                d9 = (Double) b10.i(dVar, 1, s8.c.f5859a, d9);
                i |= 2;
            } else if (c9 == 2) {
                num = (Integer) b10.i(dVar, 2, s8.f.f5866a, num);
                i |= 4;
            } else if (c9 == 3) {
                num2 = (Integer) b10.i(dVar, 3, s8.f.f5866a, num2);
                i |= 8;
            } else if (c9 != 4) {
                throw new o8.d(c9);
            } else {
                l5 = (Long) b10.i(dVar, 4, s8.i.f5872a, l5);
                i |= 16;
            }
        }
        b10.n(dVar);
        return new h(i, bool, d9, num, num2, l5);
    }

    @Override // o8.a
    public final q8.d d() {
        return descriptor;
    }
}
