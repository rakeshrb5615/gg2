package f8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n extends c {
    public final a q;

    public n(int i, a aVar) {
        super(i);
        this.q = aVar;
        if (aVar != a.f1523a) {
            if (i < 1) {
                throw new IllegalArgumentException(v1.a.j("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).b() + " instead").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            f8.a r1 = r15.q
            f8.a r2 = f8.a.f1525c
            h7.l r8 = h7.l.f2236a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.d(r16)
            boolean r2 = r1 instanceof f8.i
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof f8.h
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            d4.l r6 = f8.e.f1544d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f8.c.f1534f
            java.lang.Object r1 = r1.get(r15)
            f8.k r1 = (f8.k) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f8.c.f1530b
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.r(r2, r7)
            int r9 = f8.e.f1542b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f2799c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            f8.k r2 = f8.c.a(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.o()
            f8.h r2 = new f8.h
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = f8.c.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.b()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f8.c.f1531c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.b()
        L7e:
            java.lang.Throwable r1 = r15.o()
            f8.h r2 = new f8.h
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.o()
            f8.h r2 = new f8.h
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof d8.f2
            if (r3 == 0) goto La6
            d8.f2 r6 = (d8.f2) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f2799c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.j(r3)
        Lb6:
            return r8
        Lb7:
            r1.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.n.C(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // f8.c, f8.s
    public final Object b(Object obj, l7.c cVar) {
        if (C(obj, true) instanceof h) {
            throw o();
        }
        return h7.l.f2236a;
    }

    @Override // f8.c, f8.s
    public final Object d(Object obj) {
        return C(obj, false);
    }

    @Override // f8.c
    public final boolean s() {
        return this.q == a.f1524b;
    }
}
