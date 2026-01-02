package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class y implements s8.e {

    /* renamed from: a  reason: collision with root package name */
    public static final y f5764a;
    private static final q8.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [s8.e, java.lang.Object, r6.y] */
    static {
        ?? obj = new Object();
        f5764a = obj;
        s8.m mVar = new s8.m("com.google.firebase.sessions.ProcessData", obj, 2);
        mVar.k("pid", false);
        mVar.k("uuid", false);
        descriptor = mVar;
    }

    @Override // s8.e
    public final o8.a[] a() {
        return new o8.a[]{s8.f.f5866a, s8.p.f5893a};
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        a0 a0Var = (a0) obj;
        kotlin.jvm.internal.j.e(a0Var, "value");
        q8.d dVar = descriptor;
        u8.i a10 = iVar.a(dVar);
        int i = a0Var.f5589a;
        a10.b(dVar, 0);
        a10.c(i);
        a10.k(dVar, 1, a0Var.f5590b);
        a10.l(dVar);
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        q8.d dVar = descriptor;
        n.p b10 = pVar.b(dVar);
        String str = null;
        boolean z9 = true;
        int i = 0;
        int i9 = 0;
        while (z9) {
            int c9 = b10.c(dVar);
            if (c9 == -1) {
                z9 = false;
            } else if (c9 == 0) {
                i9 = b10.e(dVar, 0);
                i |= 1;
            } else if (c9 != 1) {
                throw new o8.d(c9);
            } else {
                str = b10.m(dVar, 1);
                i |= 2;
            }
        }
        b10.n(dVar);
        return new a0(i, i9, str);
    }

    @Override // o8.a
    public final q8.d d() {
        return descriptor;
    }
}
