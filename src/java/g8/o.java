package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1928a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1929b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1930c;

    /* renamed from: d  reason: collision with root package name */
    public final n7.i f1931d;

    public o(kotlin.jvm.internal.o oVar, d dVar, a1.p pVar) {
        this.f1929b = oVar;
        this.f1930c = dVar;
        this.f1931d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    @Override // g8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, l7.c r9) {
        /*
            r7 = this;
            int r0 = r7.f1928a
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f1929b
            l7.h r0 = (l7.h) r0
            n7.i r1 = r7.f1931d
            a1.d r1 = (a1.d) r1
            java.lang.Object r2 = r7.f1930c
            java.lang.Object r8 = h8.f.a(r0, r8, r2, r1, r9)
            m7.a r9 = m7.a.f4049a
            if (r8 != r9) goto L18
            goto L1a
        L18:
            h7.l r8 = h7.l.f2236a
        L1a:
            return r8
        L1b:
            boolean r0 = r9 instanceof g8.n
            if (r0 == 0) goto L2e
            r0 = r9
            g8.n r0 = (g8.n) r0
            int r1 = r0.f1927e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.f1927e = r1
            goto L33
        L2e:
            g8.n r0 = new g8.n
            r0.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r0.f1925c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1927e
            r3 = 3
            r4 = 2
            h7.l r5 = h7.l.f2236a
            r6 = 1
            if (r2 == 0) goto L5b
            if (r2 == r6) goto L46
            if (r2 == r4) goto L53
            if (r2 != r3) goto L4b
        L46:
            c4.b.e0(r9)
        L49:
            r1 = r5
            goto La4
        L4b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L53:
            java.lang.Object r8 = r0.f1924b
            g8.o r2 = r0.f1923a
            c4.b.e0(r9)
            goto L85
        L5b:
            c4.b.e0(r9)
            java.lang.Object r9 = r7.f1929b
            kotlin.jvm.internal.o r9 = (kotlin.jvm.internal.o) r9
            boolean r9 = r9.a
            if (r9 == 0) goto L73
            java.lang.Object r9 = r7.f1930c
            g8.d r9 = (g8.d) r9
            r0.f1927e = r6
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L49
            goto La4
        L73:
            n7.i r9 = r7.f1931d
            a1.p r9 = (a1.p) r9
            r0.f1923a = r7
            r0.f1924b = r8
            r0.f1927e = r4
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L84
            goto La4
        L84:
            r2 = r7
        L85:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L49
            java.lang.Object r9 = r2.f1929b
            kotlin.jvm.internal.o r9 = (kotlin.jvm.internal.o) r9
            r9.a = r6
            java.lang.Object r9 = r2.f1930c
            g8.d r9 = (g8.d) r9
            r2 = 0
            r0.f1923a = r2
            r0.f1924b = r2
            r0.f1927e = r3
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L49
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.o.a(java.lang.Object, l7.c):java.lang.Object");
    }

    public o(d dVar, l7.h hVar) {
        this.f1929b = hVar;
        this.f1930c = i8.a.k(hVar);
        this.f1931d = new a1.d(dVar, (l7.c) null, 7);
    }
}
