package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class d1 implements s8.e {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f5635a;
    private static final q8.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [r6.d1, s8.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5635a = obj;
        s8.m mVar = new s8.m("com.google.firebase.sessions.Time", obj, 3);
        mVar.k("ms", false);
        mVar.k("us", true);
        mVar.k("seconds", true);
        descriptor = mVar;
    }

    @Override // s8.e
    public final o8.a[] a() {
        s8.i iVar = s8.i.f5872a;
        return new o8.a[]{iVar, iVar, iVar};
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        f1 f1Var = (f1) obj;
        kotlin.jvm.internal.j.e(f1Var, "value");
        q8.d dVar = descriptor;
        u8.i a10 = iVar.a(dVar);
        long j = f1Var.f5646a;
        long j8 = f1Var.f5648c;
        long j9 = f1Var.f5647b;
        a10.e(dVar, 0, j);
        if (a10.o(dVar) || j9 != 1000 * j) {
            a10.e(dVar, 1, j9);
        }
        if (a10.o(dVar) || j8 != j / 1000) {
            a10.e(dVar, 2, j8);
        }
        a10.l(dVar);
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        q8.d dVar = descriptor;
        n.p b10 = pVar.b(dVar);
        int i = 0;
        long j = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z9 = true;
        while (z9) {
            int c9 = b10.c(dVar);
            if (c9 == -1) {
                z9 = false;
            } else if (c9 == 0) {
                j = b10.g(dVar, 0);
                i |= 1;
            } else if (c9 == 1) {
                j8 = b10.g(dVar, 1);
                i |= 2;
            } else if (c9 != 2) {
                throw new o8.d(c9);
            } else {
                j9 = b10.g(dVar, 2);
                i |= 4;
            }
        }
        b10.n(dVar);
        return new f1(i, j, j8, j9);
    }

    @Override // o8.a
    public final q8.d d() {
        return descriptor;
    }
}
