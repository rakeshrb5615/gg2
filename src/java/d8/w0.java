package d8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class w0 extends x0 implements k0 {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1257m = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1258n = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1259o = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // d8.x0
    public final long B() {
        Runnable runnable;
        u0 u0Var;
        d4.l lVar = f0.f1187c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1257m;
        if (!C()) {
            F();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                } else if (!(obj instanceof i8.m)) {
                    if (obj != lVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                } else {
                    i8.m mVar = (i8.m) obj;
                    Object d9 = mVar.d();
                    if (d9 != i8.m.f2790g) {
                        runnable = (Runnable) d9;
                        break;
                    }
                    i8.m c9 = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            i7.g gVar = this.f1264e;
            if (((gVar == null || gVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof i8.m) {
                        long j = i8.m.f2789f.get((i8.m) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == lVar) {
                        return Long.MAX_VALUE;
                    }
                }
                v0 v0Var = (v0) f1258n.get(this);
                if (v0Var != null) {
                    synchronized (v0Var) {
                        u0[] u0VarArr = v0Var.f2803a;
                        u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    }
                    if (u0Var != null) {
                        long nanoTime = u0Var.f1247a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void E(Runnable runnable) {
        F();
        if (!G(runnable)) {
            g0.f1197p.E(runnable);
            return;
        }
        Thread z9 = z();
        if (Thread.currentThread() != z9) {
            LockSupport.unpark(z9);
        }
    }

    public final void F() {
        u0 u0Var;
        v0 v0Var = (v0) f1258n.get(this);
        if (v0Var == null || i8.u.f2802b.get(v0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (v0Var) {
                try {
                    u0[] u0VarArr = v0Var.f2803a;
                    u0 u0Var2 = u0VarArr != null ? u0VarArr[0] : null;
                    if (u0Var2 == null) {
                        continue;
                    } else {
                        u0Var = ((nanoTime - u0Var2.f1247a) > 0L ? 1 : ((nanoTime - u0Var2.f1247a) == 0L ? 0 : -1)) >= 0 ? G(u0Var2) : false ? v0Var.b(0) : null;
                        continue;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (u0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d8.w0.f1257m
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = d8.w0.f1259o
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof i8.m
            if (r4 == 0) goto L47
            r4 = r1
            i8.m r4 = (i8.m) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            i8.m r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            d4.l r4 = d8.f0.f1187c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            i8.m r3 = new i8.m
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.w0.G(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        if ((i8.u.f2802b.get(r0) == 0) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H() {
        /*
            r7 = this;
            i7.g r0 = r7.f1264e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d8.w0.f1258n
            java.lang.Object r0 = r0.get(r7)
            d8.v0 r0 = (d8.v0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = i8.u.f2802b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d8.w0.f1257m
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof i8.m
            if (r3 == 0) goto L4f
            i8.m r0 = (i8.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = i8.m.f2789f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            d4.l r3 = d8.f0.f1187c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.w0.H():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, d8.v0] */
    public final void I(long j, u0 u0Var) {
        int c9;
        Thread z9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1258n;
        if (f1259o.get(this) != 0) {
            c9 = 1;
        } else {
            v0 v0Var = (v0) atomicReferenceFieldUpdater.get(this);
            if (v0Var == null) {
                ?? obj = new Object();
                obj.f1254c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj2);
                v0Var = (v0) obj2;
            }
            c9 = u0Var.c(j, v0Var, this);
        }
        if (c9 != 0) {
            if (c9 == 1) {
                D(j, u0Var);
                return;
            } else if (c9 != 2) {
                throw new IllegalStateException("unexpected result");
            } else {
                return;
            }
        }
        v0 v0Var2 = (v0) atomicReferenceFieldUpdater.get(this);
        if (v0Var2 != null) {
            synchronized (v0Var2) {
                u0[] u0VarArr = v0Var2.f2803a;
                r2 = u0VarArr != null ? u0VarArr[0] : null;
            }
        }
        if (r2 != u0Var || Thread.currentThread() == (z9 = z())) {
            return;
        }
        LockSupport.unpark(z9);
    }

    public p0 c(long j, b2 b2Var, l7.h hVar) {
        return h0.f1201a.c(j, b2Var, hVar);
    }

    @Override // d8.k0
    public final void f(long j, n nVar) {
        long j8 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            s0 s0Var = new s0(this, j8 + nanoTime, nVar);
            I(nanoTime, s0Var);
            nVar.u(new j(s0Var, 2));
        }
    }

    @Override // d8.a0
    public final void i(l7.h hVar, Runnable runnable) {
        E(runnable);
    }

    @Override // d8.x0
    public void shutdown() {
        u0 b10;
        z1.f1269a.set(null);
        f1259o.set(this, 1);
        d4.l lVar = f0.f1187c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1257m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof i8.m)) {
                    if (obj != lVar) {
                        i8.m mVar = new i8.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((i8.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (B() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            v0 v0Var = (v0) f1258n.get(this);
            if (v0Var == null) {
                return;
            }
            synchronized (v0Var) {
                b10 = i8.u.f2802b.get(v0Var) > 0 ? v0Var.b(0) : null;
            }
            if (b10 == null) {
                return;
            }
            D(nanoTime, b10);
        }
    }
}
