package r6;

import j5.t1;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class f0 implements s8.e {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f5645a;
    private static final q8.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [s8.e, java.lang.Object, r6.f0] */
    static {
        ?? obj = new Object();
        f5645a = obj;
        s8.m mVar = new s8.m("com.google.firebase.sessions.SessionData", obj, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override // s8.e
    public final o8.a[] a() {
        return new o8.a[]{k0.f5692a, t1.D(d1.f5635a), t1.D(h0.f5662d[2])};
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        h0 h0Var = (h0) obj;
        kotlin.jvm.internal.j.e(h0Var, "value");
        q8.d dVar = descriptor;
        u8.i a10 = iVar.a(dVar);
        o8.a[] aVarArr = h0.f5662d;
        k0 k0Var = k0.f5692a;
        m0 m0Var = h0Var.f5663a;
        Map map = h0Var.f5665c;
        f1 f1Var = h0Var.f5664b;
        a10.h(dVar, 0, k0Var, m0Var);
        if (a10.o(dVar) || f1Var != null) {
            a10.g(dVar, 1, d1.f5635a, f1Var);
        }
        if (a10.o(dVar) || map != null) {
            a10.g(dVar, 2, aVarArr[2], map);
        }
        a10.l(dVar);
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        q8.d dVar = descriptor;
        n.p b10 = pVar.b(dVar);
        o8.a[] aVarArr = h0.f5662d;
        m0 m0Var = null;
        boolean z9 = true;
        int i = 0;
        f1 f1Var = null;
        Map map = null;
        while (z9) {
            int c9 = b10.c(dVar);
            if (c9 == -1) {
                z9 = false;
            } else if (c9 == 0) {
                m0Var = (m0) b10.j(dVar, 0, k0.f5692a, m0Var);
                i |= 1;
            } else if (c9 == 1) {
                f1Var = (f1) b10.i(dVar, 1, d1.f5635a, f1Var);
                i |= 2;
            } else if (c9 != 2) {
                throw new o8.d(c9);
            } else {
                map = (Map) b10.i(dVar, 2, aVarArr[2], map);
                i |= 4;
            }
        }
        b10.n(dVar);
        return new h0(i, m0Var, f1Var, map);
    }

    @Override // o8.a
    public final q8.d d() {
        return descriptor;
    }
}
