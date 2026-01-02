package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class k0 implements s8.e {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f5692a;
    private static final q8.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [r6.k0, s8.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5692a = obj;
        s8.m mVar = new s8.m("com.google.firebase.sessions.SessionDetails", obj, 4);
        mVar.k("sessionId", false);
        mVar.k("firstSessionId", false);
        mVar.k("sessionIndex", false);
        mVar.k("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override // s8.e
    public final o8.a[] a() {
        s8.p pVar = s8.p.f5893a;
        return new o8.a[]{pVar, pVar, s8.f.f5866a, s8.i.f5872a};
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        m0 m0Var = (m0) obj;
        kotlin.jvm.internal.j.e(m0Var, "value");
        q8.d dVar = descriptor;
        u8.i a10 = iVar.a(dVar);
        a10.k(dVar, 0, m0Var.f5696a);
        a10.k(dVar, 1, m0Var.f5697b);
        int i = m0Var.f5698c;
        a10.b(dVar, 2);
        a10.c(i);
        a10.e(dVar, 3, m0Var.f5699d);
        a10.l(dVar);
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        q8.d dVar = descriptor;
        n.p b10 = pVar.b(dVar);
        int i = 0;
        int i9 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z9 = true;
        while (z9) {
            int c9 = b10.c(dVar);
            if (c9 == -1) {
                z9 = false;
            } else if (c9 == 0) {
                str = b10.m(dVar, 0);
                i |= 1;
            } else if (c9 == 1) {
                str2 = b10.m(dVar, 1);
                i |= 2;
            } else if (c9 == 2) {
                i9 = b10.e(dVar, 2);
                i |= 4;
            } else if (c9 != 3) {
                throw new o8.d(c9);
            } else {
                j = b10.g(dVar, 3);
                i |= 8;
            }
        }
        b10.n(dVar);
        return new m0(j, str, i, i9, str2);
    }

    @Override // o8.a
    public final q8.d d() {
        return descriptor;
    }
}
