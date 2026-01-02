package f8;

import d8.f2;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class c implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1530b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1531c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1532d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1533e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1534f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1535m = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1536n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1537o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1538p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f1539a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i) {
        this.f1539a = i;
        if (i < 0) {
            throw new IllegalArgumentException(v1.a.j("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        k kVar = e.f1541a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f1532d.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (t()) {
            kVar2 = e.f1541a;
            kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f1556s;
    }

    public static final k a(c cVar, long j, k kVar) {
        Object b10;
        c cVar2;
        k kVar2 = e.f1541a;
        d dVar = d.f1540a;
        loop0: while (true) {
            b10 = i8.a.b(kVar, j, dVar);
            if (!i8.a.e(b10)) {
                i8.r c9 = i8.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1534f;
                    i8.r rVar = (i8.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f2799c >= c9.f2799c) {
                        break loop0;
                    } else if (!c9.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c9)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                                if (c9.f()) {
                                    c9.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean e9 = i8.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1531c;
        if (e9) {
            cVar.i();
            if (kVar.f2799c * e.f1542b < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) i8.a.c(b10);
            long j8 = kVar3.f2799c;
            if (j8 <= j) {
                return kVar3;
            }
            long j9 = e.f1542b * j8;
            while (true) {
                long j10 = f1530b.get(cVar);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j9) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f1530b.compareAndSet(cVar2, j10, (((int) (j10 >> 60)) << 60) + j11)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j8 * e.f1542b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.b();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, d8.n nVar) {
        nVar.resumeWith(c4.b.p(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int i, Object obj, long j, Object obj2, boolean z9) {
        kVar.n(i, obj);
        if (z9) {
            return cVar.A(kVar, i, obj, j, obj2, z9);
        }
        Object l5 = kVar.l(i);
        if (l5 == null) {
            if (cVar.f(j)) {
                if (kVar.k(i, null, e.f1544d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l5 instanceof f2) {
            kVar.n(i, null);
            if (cVar.x(l5, obj)) {
                kVar.o(i, e.i);
                return 0;
            }
            d4.l lVar = e.f1549k;
            if (kVar.f1564f.getAndSet((i * 2) + 1, lVar) != lVar) {
                kVar.m(i, true);
                return 5;
            }
            return 5;
        }
        return cVar.A(kVar, i, obj, j, obj2, z9);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1533e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean y(Object obj) {
        if (!(obj instanceof d8.l)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        d8.l lVar = (d8.l) obj;
        k kVar = e.f1541a;
        d4.l c9 = lVar.c(h7.l.f2236a, null);
        if (c9 != null) {
            lVar.e(c9);
            return true;
        }
        return false;
    }

    public final int A(k kVar, int i, Object obj, long j, Object obj2, boolean z9) {
        while (true) {
            Object l5 = kVar.l(i);
            if (l5 == null) {
                if (!f(j) || z9) {
                    if (z9) {
                        if (kVar.k(i, null, e.j)) {
                            kVar.i();
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (kVar.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.k(i, null, e.f1544d)) {
                    break;
                }
            } else if (l5 != e.f1545e) {
                d4.l lVar = e.f1549k;
                if (l5 == lVar) {
                    kVar.n(i, null);
                    return 5;
                } else if (l5 == e.f1548h) {
                    kVar.n(i, null);
                    return 5;
                } else if (l5 == e.f1550l) {
                    kVar.n(i, null);
                    i();
                    return 4;
                } else {
                    kVar.n(i, null);
                    if (l5 instanceof t) {
                        l5 = ((t) l5).f1569a;
                    }
                    if (x(l5, obj)) {
                        kVar.o(i, e.i);
                        return 0;
                    }
                    if (kVar.f1564f.getAndSet((i * 2) + 1, lVar) != lVar) {
                        kVar.m(i, true);
                    }
                    return 5;
                }
            } else if (kVar.k(i, l5, e.f1544d)) {
                break;
            }
        }
        return 1;
    }

    public final void B(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.t()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f1532d;
            if (atomicLongFieldUpdater.get(cVar) > j) {
                break;
            }
            cVar = this;
        }
        int i = e.f1543c;
        int i9 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1533e;
            if (i9 < i) {
                long j8 = atomicLongFieldUpdater.get(cVar);
                if (j8 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j8 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                }
                i9++;
            } else {
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j9, (j9 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    }
                    cVar = this;
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(cVar);
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z9 = (j11 & 4611686018427387904L) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    } else if (z9) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j11, 4611686018427387904L + j12);
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j13, j13 & 4611686018427387903L)) {
                        return;
                    }
                    cVar = this;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // f8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.Object r24, l7.c r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.b(java.lang.Object, l7.c):java.lang.Object");
    }

    @Override // f8.r
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    @Override // f8.s
    public Object d(Object obj) {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1530b;
        boolean z9 = false;
        long j8 = 1152921504606846975L;
        boolean z10 = r(atomicLongFieldUpdater.get(this), false) ? false : !f(j & 1152921504606846975L);
        i iVar = j.f1561b;
        if (z10) {
            return iVar;
        }
        d4.l lVar = e.j;
        k kVar = (k) f1534f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = andIncrement & j8;
            boolean r8 = r(andIncrement, z9);
            int i = e.f1542b;
            long j10 = i;
            long j11 = j9 / j10;
            int i9 = (int) (j9 % j10);
            if (kVar.f2799c != j11) {
                k a10 = a(this, j11, kVar);
                if (a10 != null) {
                    kVar = a10;
                } else if (r8) {
                    return new h(o());
                } else {
                    z9 = false;
                    j8 = 1152921504606846975L;
                }
            }
            int e9 = e(this, kVar, i9, obj, j9, lVar, r8);
            h7.l lVar2 = h7.l.f2236a;
            if (e9 == 0) {
                kVar.b();
                return lVar2;
            } else if (e9 == 1) {
                return lVar2;
            } else {
                if (e9 == 2) {
                    if (r8) {
                        kVar.i();
                        return new h(o());
                    }
                    f2 f2Var = lVar instanceof f2 ? (f2) lVar : null;
                    if (f2Var != null) {
                        f2Var.a(kVar, i9 + i);
                    }
                    kVar.i();
                    return iVar;
                } else if (e9 == 3) {
                    throw new IllegalStateException("unexpected");
                } else {
                    if (e9 == 4) {
                        if (j9 < f1531c.get(this)) {
                            kVar.b();
                        }
                        return new h(o());
                    }
                    if (e9 == 5) {
                        kVar.b();
                    }
                    z9 = false;
                    j8 = 1152921504606846975L;
                }
            }
        }
    }

    public final boolean f(long j) {
        return j < f1532d.get(this) || j < f1531c.get(this) + ((long) this.f1539a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[LOOP:2: B:19:0x003c->B:20:0x0049, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[LOOP:5: B:22:0x004c->B:30:0x0067, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[LOOP:3: B:33:0x006e->B:53:0x006e, LOOP_LABEL: LOOP:3: B:33:0x006e->B:53:0x006e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(boolean r13, java.lang.Throwable r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f8.c.f1530b
            r9 = 1
            if (r13 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            f8.k r4 = f8.e.f1541a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            d4.l r5 = f8.e.f1556s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f8.c.f1537o
            boolean r7 = r6.compareAndSet(r12, r5, r14)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r14 = 0
            r10 = r14
        L39:
            r11 = 3
            if (r13 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.i()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = f8.c.f1538p
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            d4.l r0 = f8.e.q
            goto L7b
        L79:
            d4.l r0 = f8.e.f1555r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            kotlin.jvm.internal.u.a(r9, r14)
            u7.l r14 = (u7.l) r14
            java.lang.Throwable r13 = r12.m()
            r14.invoke(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.g(boolean, java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        r1 = (f8.k) ((i8.b) i8.b.f2767b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f8.k h(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.h(long):f8.k");
    }

    public final void i() {
        r(f1530b.get(this), false);
    }

    public final void j(long j) {
        k kVar = (k) f1535m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1531c;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f1539a + j8, f1532d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, 1 + j8)) {
                long j9 = e.f1542b;
                long j10 = j8 / j9;
                int i = (int) (j8 % j9);
                if (kVar.f2799c != j10) {
                    k l5 = l(j10, kVar);
                    if (l5 != null) {
                        kVar = l5;
                    }
                }
                k kVar2 = kVar;
                if (z(kVar2, i, j8, null) != e.f1553o) {
                    kVar2.b();
                } else if (j8 < p()) {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b10;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1536n;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1532d.getAndIncrement(this);
            long j = andIncrement / e.f1542b;
            if (p() <= andIncrement) {
                if (kVar.f2799c < j && kVar.c() != null) {
                    u(j, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f2799c != j) {
                d dVar = d.f1540a;
                while (true) {
                    b10 = i8.a.b(kVar, j, dVar);
                    if (!i8.a.e(b10)) {
                        i8.r c9 = i8.a.c(b10);
                        while (true) {
                            i8.r rVar = (i8.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f2799c >= c9.f2799c) {
                                break;
                            } else if (!c9.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c9)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        if (c9.f()) {
                                            c9.e();
                                        }
                                    }
                                }
                                if (rVar.f()) {
                                    rVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (i8.a.e(b10)) {
                    i();
                    u(j, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) i8.a.c(b10);
                    long j8 = kVar3.f2799c;
                    if (j8 > j) {
                        long j9 = j8 * e.f1542b;
                        if (f1532d.compareAndSet(this, 1 + andIncrement, j9)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1533e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j9 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i = (int) (andIncrement % e.f1542b);
            Object l5 = kVar.l(i);
            boolean z9 = l5 instanceof f2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1531c;
            if (!z9 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.k(i, l5, e.f1547g)) {
                while (true) {
                    Object l9 = kVar.l(i);
                    if (!(l9 instanceof f2)) {
                        if (l9 != e.j) {
                            if (l9 != null) {
                                if (l9 == e.f1544d || l9 == e.f1548h || l9 == e.i || l9 == e.f1549k || l9 == e.f1550l) {
                                    break loop0;
                                } else if (l9 != e.f1546f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l9).toString());
                                }
                            } else if (kVar.k(i, l9, e.f1545e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.k(i, l9, new t((f2) l9))) {
                            break loop0;
                        }
                    } else if (kVar.k(i, l9, e.f1547g)) {
                        if (y(l9)) {
                            kVar.o(i, e.f1544d);
                            break;
                        } else {
                            kVar.o(i, e.j);
                            kVar.i();
                        }
                    }
                }
            } else if (y(l5)) {
                kVar.o(i, e.f1544d);
                break;
            } else {
                kVar.o(i, e.j);
                kVar.i();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j, k kVar) {
        Object b10;
        long j8;
        k kVar2 = e.f1541a;
        d dVar = d.f1540a;
        loop0: while (true) {
            b10 = i8.a.b(kVar, j, dVar);
            if (!i8.a.e(b10)) {
                i8.r c9 = i8.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1535m;
                    i8.r rVar = (i8.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f2799c >= c9.f2799c) {
                        break loop0;
                    } else if (!c9.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c9)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c9.f()) {
                                    c9.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (i8.a.e(b10)) {
            i();
            if (kVar.f2799c * e.f1542b < p()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) i8.a.c(b10);
            long j9 = kVar3.f2799c;
            if (!t() && j <= f1532d.get(this) / e.f1542b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1536n;
                    i8.r rVar2 = (i8.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f2799c >= j9 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j9 <= j) {
                return kVar3;
            }
            long j10 = j9 * e.f1542b;
            do {
                j8 = f1531c.get(this);
                if (j8 >= j10) {
                    break;
                }
            } while (!f1531c.compareAndSet(this, j8, j10));
            if (j9 * e.f1542b < p()) {
                kVar3.b();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f1537o.get(this);
    }

    public final Throwable n() {
        Throwable m9 = m();
        return m9 == null ? new NoSuchElementException("Channel was closed") : m9;
    }

    public final Throwable o() {
        Throwable m9 = m();
        return m9 == null ? new IllegalStateException("Channel was closed") : m9;
    }

    public final long p() {
        return f1530b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
        r0 = (f8.k) ((i8.b) i8.b.f2767b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.r(long, boolean):boolean");
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j = f1532d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
        r16 = r7;
        r3 = (f8.k) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0194 A[EDGE_INSN: B:94:0x0194->B:72:0x0194 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(long r5, f8.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f2799c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            i8.b r0 = r7.c()
            f8.k r0 = (f8.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            i8.b r5 = r7.c()
            f8.k r5 = (f8.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f8.c.f1536n
            java.lang.Object r6 = r5.get(r4)
            i8.r r6 = (i8.r) r6
            long r0 = r6.f2799c
            long r2 = r7.f2799c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.u(long, f8.k):void");
    }

    public final Object v(Object obj, l7.c cVar) {
        d8.n nVar = new d8.n(1, q4.b.C(cVar));
        nVar.r();
        nVar.resumeWith(c4.b.p(o()));
        Object q = nVar.q();
        return q == m7.a.f4049a ? q : h7.l.f2236a;
    }

    public final void w(f2 f2Var, boolean z9) {
        if (f2Var instanceof d8.l) {
            ((l7.c) f2Var).resumeWith(c4.b.p(z9 ? n() : o()));
        } else if (!(f2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + f2Var).toString());
        } else {
            b bVar = (b) f2Var;
            d8.n nVar = bVar.f1528b;
            kotlin.jvm.internal.j.b(nVar);
            bVar.f1528b = null;
            bVar.f1527a = e.f1550l;
            Throwable m9 = bVar.f1529c.m();
            if (m9 == null) {
                nVar.resumeWith(Boolean.FALSE);
            } else {
                nVar.resumeWith(c4.b.p(m9));
            }
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof d8.l)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            d8.l lVar = (d8.l) obj;
            k kVar = e.f1541a;
            d4.l c9 = lVar.c(obj2, null);
            if (c9 != null) {
                lVar.e(c9);
                return true;
            }
            return false;
        }
        b bVar = (b) obj;
        d8.n nVar = bVar.f1528b;
        kotlin.jvm.internal.j.b(nVar);
        bVar.f1528b = null;
        bVar.f1527a = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f1541a;
        d4.l c10 = nVar.c(bool, null);
        if (c10 != null) {
            nVar.e(c10);
            return true;
        }
        return false;
    }

    public final Object z(k kVar, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f1564f;
        Object l5 = kVar.l(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1530b;
        if (l5 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f1552n;
                }
                if (kVar.k(i, l5, obj)) {
                    k();
                    return e.f1551m;
                }
            }
        } else if (l5 == e.f1544d && kVar.k(i, l5, e.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kVar.n(i, null);
            return obj2;
        }
        while (true) {
            Object l9 = kVar.l(i);
            if (l9 == null || l9 == e.f1545e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.k(i, l9, e.f1548h)) {
                        k();
                        return e.f1553o;
                    }
                } else if (obj == null) {
                    return e.f1552n;
                } else {
                    if (kVar.k(i, l9, obj)) {
                        k();
                        return e.f1551m;
                    }
                }
            } else if (l9 != e.f1544d) {
                d4.l lVar = e.j;
                if (l9 != lVar && l9 != e.f1548h) {
                    if (l9 == e.f1550l) {
                        k();
                        return e.f1553o;
                    } else if (l9 != e.f1547g && kVar.k(i, l9, e.f1546f)) {
                        boolean z9 = l9 instanceof t;
                        if (z9) {
                            l9 = ((t) l9).f1569a;
                        }
                        if (y(l9)) {
                            kVar.o(i, e.i);
                            k();
                            Object obj3 = atomicReferenceArray.get(i * 2);
                            kVar.n(i, null);
                            return obj3;
                        }
                        kVar.o(i, lVar);
                        kVar.i();
                        if (z9) {
                            k();
                        }
                        return e.f1553o;
                    }
                }
                return e.f1553o;
            } else if (kVar.k(i, l9, e.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i * 2);
                kVar.n(i, null);
                return obj4;
            }
        }
    }
}
