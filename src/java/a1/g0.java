package a1;

import d8.w1;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g0 implements h {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f72a;

    /* renamed from: b  reason: collision with root package name */
    public final l6.c f73b;

    /* renamed from: c  reason: collision with root package name */
    public final d8.c0 f74c;

    /* renamed from: f  reason: collision with root package name */
    public int f77f;

    /* renamed from: g  reason: collision with root package name */
    public w1 f78g;
    public final j6.s i;

    /* renamed from: l  reason: collision with root package name */
    public final j6.s f81l;

    /* renamed from: d  reason: collision with root package name */
    public final l6.c f75d = new l6.c(new t(this, (l7.c) null, 0));

    /* renamed from: e  reason: collision with root package name */
    public final m8.c f76e = m8.d.a();

    /* renamed from: h  reason: collision with root package name */
    public final l6.c f79h = new l6.c(3);
    public final h7.j j = a.a.F(new m(this, 1));

    /* renamed from: k  reason: collision with root package name */
    public final h7.j f80k = a.a.F(new m(this, 0));

    public g0(l0 l0Var, List list, l6.c cVar, d8.c0 c0Var) {
        this.f72a = l0Var;
        this.f73b = cVar;
        this.f74c = c0Var;
        this.i = new j6.s(this, list);
        this.f81l = new j6.s(c0Var, new d0(this, 0), new d(this, (l7.c) null, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:18:0x0048, B:20:0x0050, B:22:0x0054, B:25:0x005a), top: B:30:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(a1.g0 r4, n7.c r5) {
        /*
            boolean r0 = r5 instanceof a1.u
            if (r0 == 0) goto L13
            r0 = r5
            a1.u r0 = (a1.u) r0
            int r1 = r0.f201e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201e = r1
            goto L18
        L13:
            a1.u r0 = new a1.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f199c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f201e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            m8.c r4 = r0.f198b
            a1.g0 r0 = r0.f197a
            c4.b.e0(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            c4.b.e0(r5)
            m8.c r5 = r4.f76e
            r0.f197a = r4
            r0.f198b = r5
            r0.f201e = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f77f     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f77f = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            d8.w1 r1 = r4.f78g     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L62
        L5a:
            r4.f78g = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            r5.f(r0)
            h7.l r4 = h7.l.f2236a
            return r4
        L62:
            r5.f(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.c(a1.g0, n7.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(8:55|(1:(1:(2:59|60))(3:61|62|63))|64|65|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|67|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
        if (r9 != r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(a1.g0 r9, a1.t0 r10, n7.c r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.d(a1.g0, a1.t0, n7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:18:0x0048, B:20:0x004f), top: B:28:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(a1.g0 r4, n7.c r5) {
        /*
            boolean r0 = r5 instanceof a1.w
            if (r0 == 0) goto L13
            r0 = r5
            a1.w r0 = (a1.w) r0
            int r1 = r0.f218e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218e = r1
            goto L18
        L13:
            a1.w r0 = new a1.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f216c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f218e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            m8.c r4 = r0.f215b
            a1.g0 r0 = r0.f214a
            c4.b.e0(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            c4.b.e0(r5)
            m8.c r5 = r4.f76e
            r0.f214a = r4
            r0.f215b = r5
            r0.f218e = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f77f     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 + r3
            r4.f77f = r1     // Catch: java.lang.Throwable -> L5e
            if (r1 != r3) goto L60
            d8.c0 r1 = r4.f74c     // Catch: java.lang.Throwable -> L5e
            a1.n r2 = new a1.n     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L5e
            d8.w1 r1 = d8.f0.p(r1, r2)     // Catch: java.lang.Throwable -> L5e
            r4.f78g = r1     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r4 = move-exception
            goto L66
        L60:
            r5.f(r0)
            h7.l r4 = h7.l.f2236a
            return r4
        L66:
            r5.f(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.e(a1.g0, n7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(a1.g0 r8, boolean r9, l7.c r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.f(a1.g0, boolean, l7.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #0 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:78:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140 A[Catch: all -> 0x016d, TryCatch #3 {all -> 0x016d, blocks: (B:61:0x012e, B:63:0x0140, B:64:0x0148), top: B:83:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #3 {all -> 0x016d, blocks: (B:61:0x012e, B:63:0x0140, B:64:0x0148), top: B:83:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.internal.p, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.r, java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(a1.g0 r9, boolean r10, n7.c r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.g(a1.g0, boolean, n7.c):java.lang.Object");
    }

    @Override // a1.h
    public final Object a(u7.p pVar, n7.c cVar) {
        p1 p1Var = (p1) cVar.getContext().get(o1.f168a);
        if (p1Var != null) {
            p1Var.a(this);
        }
        return d8.f0.x(new p1(p1Var, this), new t(this, pVar, (l7.c) null), cVar);
    }

    @Override // a1.h
    public final g8.c b() {
        return this.f75d;
    }

    public final s0 h() {
        return (s0) this.f80k.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r4.q(r0) != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(n7.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a1.x
            if (r0 == 0) goto L13
            r0 = r6
            a1.x r0 = (a1.x) r0
            int r1 = r0.f225e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225e = r1
            goto L18
        L13:
            a1.x r0 = new a1.x
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f223c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f225e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f222b
            a1.g0 r0 = r0.f221a
            c4.b.e0(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            a1.g0 r2 = r0.f221a
            c4.b.e0(r6)
            goto L51
        L3e:
            c4.b.e0(r6)
            a1.s0 r6 = r5.h()
            r0.f221a = r5
            r0.f225e = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            j6.s r4 = r2.i     // Catch: java.lang.Throwable -> L69
            r0.f221a = r2     // Catch: java.lang.Throwable -> L69
            r0.f222b = r6     // Catch: java.lang.Throwable -> L69
            r0.f225e = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.q(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            h7.l r6 = h7.l.f2236a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            l6.c r0 = r0.f79h
            a1.d1 r2 = new a1.d1
            r2.<init>(r1, r6)
            r0.l(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.i(n7.c):java.lang.Object");
    }

    public final Object j(n7.c cVar) {
        return ((o0) this.j.getValue()).a(new q(3, (l7.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r11, boolean r12, n7.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof a1.e0
            if (r0 == 0) goto L13
            r0 = r13
            a1.e0 r0 = (a1.e0) r0
            int r1 = r0.f49d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49d = r1
            goto L18
        L13:
            a1.e0 r0 = new a1.e0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f47b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f49d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.p r11 = r0.f46a
            c4.b.e0(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            c4.b.e0(r13)
            kotlin.jvm.internal.p r5 = new kotlin.jvm.internal.p
            r5.<init>()
            h7.j r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            a1.o0 r13 = (a1.o0) r13
            a1.f0 r4 = new a1.f0
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f46a = r5
            r0.f49d = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g0.k(java.lang.Object, boolean, n7.c):java.lang.Object");
    }
}
