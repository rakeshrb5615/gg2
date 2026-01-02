package k8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a extends Thread {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3427o = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final m f3428a;

    /* renamed from: b  reason: collision with root package name */
    public final r f3429b;

    /* renamed from: c  reason: collision with root package name */
    public b f3430c;

    /* renamed from: d  reason: collision with root package name */
    public long f3431d;

    /* renamed from: e  reason: collision with root package name */
    public long f3432e;

    /* renamed from: f  reason: collision with root package name */
    public int f3433f;
    private volatile int indexInArray;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3434m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ c f3435n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public a(c cVar, int i) {
        this.f3435n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f3428a = new m();
        this.f3429b = new Object();
        this.f3430c = b.f3439d;
        this.nextParkedWorker = c.q;
        int nanoTime = (int) System.nanoTime();
        this.f3433f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final i a(boolean z9) {
        i e9;
        i e10;
        long j;
        b bVar = this.f3430c;
        b bVar2 = b.f3436a;
        c cVar = this.f3435n;
        i iVar = null;
        m mVar = this.f3428a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3443o;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3467b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f3458b) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.f3469d.get(mVar);
                    int i9 = m.f3468c.get(mVar);
                    while (true) {
                        if (i != i9 && m.f3470e.get(mVar) != 0) {
                            i9--;
                            i b10 = mVar.b(i9, true);
                            if (b10 != null) {
                                iVar = b10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f3450f.d();
                        return iVar3 == null ? i(1) : iVar3;
                    }
                    return iVar;
                }
            } while (!c.f3443o.compareAndSet(cVar, j, j - 4398046511104L));
            this.f3430c = b.f3436a;
        }
        if (z9) {
            boolean z10 = d(cVar.f3445a * 2) == 0;
            if (z10 && (e10 = e()) != null) {
                return e10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f3467b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z10 && (e9 = e()) != null) {
                return e9;
            }
        } else {
            i e11 = e();
            if (e11 != null) {
                return e11;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i9 = this.f3433f;
        int i10 = i9 ^ (i9 << 13);
        int i11 = i10 ^ (i10 >> 17);
        int i12 = i11 ^ (i11 << 5);
        this.f3433f = i12;
        int i13 = i - 1;
        return (i13 & i) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d9 = d(2);
        c cVar = this.f3435n;
        if (d9 == 0) {
            i iVar = (i) cVar.f3449e.d();
            return iVar != null ? iVar : (i) cVar.f3450f.d();
        }
        i iVar2 = (i) cVar.f3450f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f3449e.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3435n.f3448d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f3430c;
        boolean z9 = bVar2 == b.f3436a;
        if (z9) {
            c.f3443o.addAndGet(this.f3435n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f3430c = bVar;
        }
        return z9;
    }

    public final i i(int i) {
        long j;
        i iVar;
        long j8;
        long j9;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3443o;
        c cVar = this.f3435n;
        int i9 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i9 < 2) {
            return null;
        }
        int d9 = d(i9);
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (i10 < i9) {
            d9++;
            if (d9 > i9) {
                d9 = 1;
            }
            a aVar = (a) cVar.f3451m.b(d9);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f3428a;
                if (i == 3) {
                    iVar = mVar.a();
                    j = 0;
                } else {
                    mVar.getClass();
                    int i11 = m.f3469d.get(mVar);
                    int i12 = m.f3468c.get(mVar);
                    boolean z9 = i == 1;
                    while (true) {
                        if (i11 == i12) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z9 || m.f3470e.get(mVar) != 0) {
                            int i13 = i11 + 1;
                            iVar = mVar.b(i11, z9);
                            if (iVar != null) {
                                break;
                            }
                            i11 = i13;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                r rVar = this.f3429b;
                if (iVar != null) {
                    rVar.a = iVar;
                    iVar2 = iVar3;
                    j9 = -1;
                    j8 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3467b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j8 = -1;
                            break;
                        }
                        j8 = -1;
                        if (((iVar4.f3458b ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f3465f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f3457a;
                        long j11 = k.f3461b;
                        if (nanoTime < j11) {
                            j9 = j11 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                rVar.a = iVar4;
                                j9 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j9 = -2;
                    iVar2 = iVar3;
                }
                if (j9 == j8) {
                    i iVar5 = (i) rVar.a;
                    rVar.a = iVar2;
                    return iVar5;
                } else if (j9 > j) {
                    j10 = Math.min(j10, j9);
                }
            }
            i10++;
            iVar3 = null;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = 0;
        }
        this.f3432e = j10;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.a.run():void");
    }
}
