package a1;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class k1 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final m8.c f121a = m8.d.a();

    /* renamed from: b  reason: collision with root package name */
    public final l6.c f122b = new l6.c(1);

    /* renamed from: c  reason: collision with root package name */
    public final l6.c f123c = new l6.c((u7.p) new n7.i(2, null));

    public k1(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r9.d(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // a1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(u7.l r8, n7.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a1.h1
            if (r0 == 0) goto L13
            r0 = r9
            a1.h1 r0 = (a1.h1) r0
            int r1 = r0.f93e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93e = r1
            goto L18
        L13:
            a1.h1 r0 = new a1.h1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f91c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f93e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f89a
            m8.a r8 = (m8.a) r8
            c4.b.e0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            m8.c r8 = r0.f90b
            java.lang.Object r2 = r0.f89a
            u7.l r2 = (u7.l) r2
            c4.b.e0(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            c4.b.e0(r9)
            r0.f89a = r8
            m8.c r9 = r7.f121a
            r0.f90b = r9
            r0.f93e = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.f89a = r9     // Catch: java.lang.Throwable -> L6d
            r0.f90b = r5     // Catch: java.lang.Throwable -> L6d
            r0.f93e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            m8.c r8 = (m8.c) r8
            r8.f(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            m8.c r8 = (m8.c) r8
            r8.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k1.a(u7.l, n7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // a1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(u7.p r7, n7.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a1.i1
            if (r0 == 0) goto L13
            r0 = r8
            a1.i1 r0 = (a1.i1) r0
            int r1 = r0.f105e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105e = r1
            goto L18
        L13:
            a1.i1 r0 = new a1.i1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f103c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f105e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f102b
            m8.c r0 = r0.f101a
            c4.b.e0(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            c4.b.e0(r8)
            m8.c r8 = r6.f121a
            boolean r2 = r8.e()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f101a = r8     // Catch: java.lang.Throwable -> L59
            r0.f102b = r2     // Catch: java.lang.Throwable -> L59
            r0.f105e = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.f(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.f(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k1.b(u7.p, n7.c):java.lang.Object");
    }

    @Override // a1.s0
    public final Object c(f0 f0Var) {
        return new Integer(((AtomicInteger) this.f122b.f3791b).incrementAndGet());
    }

    @Override // a1.s0
    public final g8.c d() {
        return this.f123c;
    }

    @Override // a1.s0
    public final Object e(n7.c cVar) {
        return new Integer(((AtomicInteger) this.f122b.f3791b).get());
    }
}
