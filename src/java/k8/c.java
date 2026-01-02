package k8;

import d8.f0;
import i8.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c implements Executor, Closeable {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3442n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3443o = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3444p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final d4.l q = new d4.l("NOT_IN_STACK", 4, false);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f3445a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3446b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3447c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final String f3448d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3449e;

    /* renamed from: f  reason: collision with root package name */
    public final f f3450f;

    /* renamed from: m  reason: collision with root package name */
    public final p f3451m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v10, types: [k8.f, i8.k] */
    /* JADX WARN: Type inference failed for: r4v9, types: [k8.f, i8.k] */
    public c(int i, int i9, long j, String str) {
        this.f3445a = i;
        this.f3446b = i9;
        this.f3447c = j;
        this.f3448d = str;
        if (i < 1) {
            throw new IllegalArgumentException(v1.a.j("Core pool size ", i, " should be at least 1").toString());
        }
        if (i9 < i) {
            throw new IllegalArgumentException(v1.a.i("Max pool size ", i9, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i9 > 2097150) {
            throw new IllegalArgumentException(v1.a.j("Max pool size ", i9, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f3449e = new i8.k();
        this.f3450f = new i8.k();
        this.f3451m = new p((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final int c() {
        synchronized (this.f3451m) {
            try {
                if (f3444p.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3443o;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i9 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i9 < 0) {
                    i9 = 0;
                }
                if (i9 >= this.f3445a) {
                    return 0;
                }
                if (i >= this.f3446b) {
                    return 0;
                }
                int i10 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i10 <= 0 || this.f3451m.b(i10) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i10);
                this.f3451m.c(i10, aVar);
                if (i10 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i11 = i9 + 1;
                    aVar.start();
                    return i11;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r1 == null) goto L48;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = k8.c.f3444p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof k8.a
            r3 = 0
            if (r1 == 0) goto L17
            k8.a r0 = (k8.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            k8.c r1 = r0.f3435n
            boolean r1 = kotlin.jvm.internal.j.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            i8.p r1 = r8.f3451m
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = k8.c.f3443o     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            i8.p r5 = r8.f3451m
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.j.b(r5)
            k8.a r5 = (k8.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            k8.m r5 = r5.f3428a
            k8.f r6 = r8.f3450f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = k8.m.f3467b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            k8.i r7 = (k8.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            k8.i r7 = r5.a()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            k8.f r1 = r8.f3450f
            r1.b()
            k8.f r1 = r8.f3449e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            k8.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            k8.f r1 = r8.f3449e
            java.lang.Object r1 = r1.d()
            k8.i r1 = (k8.i) r1
            if (r1 != 0) goto Lb2
            k8.f r1 = r8.f3450f
            java.lang.Object r1 = r1.d()
            k8.i r1 = (k8.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            k8.b r1 = k8.b.f3440e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = k8.c.f3442n
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = k8.c.f3443o
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(runnable, false);
    }

    public final void f(Runnable runnable, boolean z9) {
        i jVar;
        b bVar;
        k.f3465f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f3457a = nanoTime;
            jVar.f3458b = z9;
        } else {
            jVar = new j(runnable, nanoTime, z9);
        }
        boolean z10 = jVar.f3458b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3443o;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f3435n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f3430c) != b.f3440e && (jVar.f3458b || bVar != b.f3437b)) {
            aVar.f3434m = true;
            m mVar = aVar.f3428a;
            mVar.getClass();
            jVar = (i) m.f3467b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f3471a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f3468c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f3469d.get(mVar) != 127) {
                    if (jVar.f3458b) {
                        m.f3470e.incrementAndGet(mVar);
                    }
                    int i = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f3458b ? this.f3450f.a(jVar) : this.f3449e.a(jVar))) {
                throw new RejectedExecutionException(v1.a.n(new StringBuilder(), this.f3448d, " was terminated"));
            }
        }
        if (z10) {
            if (x() || s(addAndGet)) {
                return;
            }
            x();
        } else if (x() || s(atomicLongFieldUpdater.get(this))) {
        } else {
            x();
        }
    }

    public final void i(a aVar, int i, int i9) {
        while (true) {
            long j = f3442n.get(this);
            int i10 = (int) (2097151 & j);
            long j8 = (2097152 + j) & (-2097152);
            if (i10 == i) {
                if (i9 == 0) {
                    Object c9 = aVar.c();
                    while (true) {
                        if (c9 == q) {
                            i10 = -1;
                            break;
                        } else if (c9 == null) {
                            i10 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c9;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i10 = b10;
                                break;
                            }
                            c9 = aVar2.c();
                        }
                    }
                } else {
                    i10 = i9;
                }
            }
            if (i10 >= 0) {
                if (f3442n.compareAndSet(this, j, i10 | j8)) {
                    return;
                }
            }
        }
    }

    public final boolean s(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i9 = this.f3445a;
        if (i < i9) {
            int c9 = c();
            if (c9 == 1 && i9 > 1) {
                c();
            }
            if (c9 > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f3451m;
        int a10 = pVar.a();
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a10; i13++) {
            a aVar = (a) pVar.b(i13);
            if (aVar != null) {
                m mVar = aVar.f3428a;
                mVar.getClass();
                int i14 = m.f3467b.get(mVar) != null ? (m.f3468c.get(mVar) - m.f3469d.get(mVar)) + 1 : m.f3468c.get(mVar) - m.f3469d.get(mVar);
                int ordinal = aVar.f3430c.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i14);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i9++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i14);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i10++;
                } else if (ordinal == 3) {
                    i11++;
                    if (i14 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i14);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal != 4) {
                    throw new RuntimeException();
                } else {
                    i12++;
                }
            }
        }
        long j = f3443o.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3448d);
        sb4.append('@');
        sb4.append(f0.j(this));
        sb4.append("[Pool Size {core = ");
        int i15 = this.f3445a;
        sb4.append(i15);
        sb4.append(", max = ");
        sb4.append(this.f3446b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i9);
        sb4.append(", parked = ");
        sb4.append(i10);
        sb4.append(", dormant = ");
        sb4.append(i11);
        sb4.append(", terminated = ");
        sb4.append(i12);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3449e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3450f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i15 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean x() {
        d4.l lVar;
        int i;
        while (true) {
            long j = f3442n.get(this);
            a aVar = (a) this.f3451m.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j8 = (2097152 + j) & (-2097152);
                Object c9 = aVar.c();
                while (true) {
                    lVar = q;
                    if (c9 == lVar) {
                        i = -1;
                        break;
                    } else if (c9 == null) {
                        i = 0;
                        break;
                    } else {
                        a aVar2 = (a) c9;
                        i = aVar2.b();
                        if (i != 0) {
                            break;
                        }
                        c9 = aVar2.c();
                    }
                }
                if (i >= 0) {
                    if (f3442n.compareAndSet(this, j, i | j8)) {
                        aVar.g(lVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f3427o.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
