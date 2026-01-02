package a1;

import d8.f2;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b1 extends kotlin.jvm.internal.k implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f23c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i, Object obj, Object obj2) {
        super(1);
        this.f21a = i;
        this.f22b = obj;
        this.f23c = obj2;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        f8.i hVar;
        h7.l lVar;
        h7.l lVar2;
        switch (this.f21a) {
            case 0:
                boolean a10 = kotlin.jvm.internal.j.a((String) obj, ((File) this.f22b).getName());
                h7.l lVar3 = h7.l.f2236a;
                if (a10) {
                    f8.p pVar = (f8.p) ((f8.q) this.f23c);
                    Object d9 = pVar.d(lVar3);
                    if (d9 instanceof f8.i) {
                        Object obj2 = ((f8.j) d8.f0.t(new d(pVar, (l7.c) null, 4))).f1562a;
                    } else {
                        h7.l lVar4 = (h7.l) d9;
                    }
                }
                return lVar3;
            case 1:
                Throwable th = (Throwable) obj;
                ((d0) this.f22b).invoke(th);
                f8.c cVar = (f8.c) ((j6.s) this.f23c).f3284d;
                cVar.g(false, th);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = f8.c.f1531c;
                    long j = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8.c.f1530b;
                    long j8 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j8, true)) {
                        hVar = new f8.h(cVar.m());
                    } else {
                        int i = (j > (j8 & 1152921504606846975L) ? 1 : (j == (j8 & 1152921504606846975L) ? 0 : -1));
                        f8.i iVar = f8.j.f1561b;
                        if (i < 0) {
                            d4.l lVar5 = f8.e.f1549k;
                            f8.k kVar = (f8.k) f8.c.f1535m.get(cVar);
                            while (true) {
                                if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                                    hVar = new f8.h(cVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j9 = f8.e.f1542b;
                                    long j10 = andIncrement / j9;
                                    int i9 = (int) (andIncrement % j9);
                                    if (kVar.f2799c != j10) {
                                        f8.k l5 = cVar.l(j10, kVar);
                                        if (l5 == null) {
                                            continue;
                                        } else {
                                            kVar = l5;
                                        }
                                    }
                                    Object z9 = cVar.z(kVar, i9, andIncrement, lVar5);
                                    if (z9 == f8.e.f1551m) {
                                        f2 f2Var = lVar5 instanceof f2 ? (f2) lVar5 : null;
                                        if (f2Var != null) {
                                            f2Var.a(kVar, i9);
                                        }
                                        cVar.B(andIncrement);
                                        kVar.i();
                                    } else if (z9 == f8.e.f1553o) {
                                        if (andIncrement < cVar.p()) {
                                            kVar.b();
                                        }
                                    } else if (z9 == f8.e.f1552n) {
                                        throw new IllegalStateException("unexpected");
                                    } else {
                                        kVar.b();
                                        hVar = z9;
                                    }
                                }
                            }
                        }
                        hVar = iVar;
                    }
                    lVar = null;
                    if (hVar instanceof f8.i) {
                        hVar = null;
                    }
                    lVar2 = h7.l.f2236a;
                    if (hVar != null) {
                        ((t0) hVar).f194b.O(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        lVar = lVar2;
                        continue;
                    }
                } while (lVar != null);
                return lVar2;
            default:
                Throwable th2 = (Throwable) obj;
                t.i iVar2 = (t.i) this.f22b;
                if (th2 == null) {
                    Object q = ((d8.j0) this.f23c).q();
                    iVar2.f5921d = true;
                    t.k kVar2 = iVar2.f5919b;
                    if (kVar2 != null && kVar2.f5924b.j(q)) {
                        iVar2.f5918a = null;
                        iVar2.f5919b = null;
                        iVar2.f5920c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    iVar2.f5921d = true;
                    t.k kVar3 = iVar2.f5919b;
                    if (kVar3 != null && kVar3.f5924b.cancel(true)) {
                        iVar2.f5918a = null;
                        iVar2.f5919b = null;
                        iVar2.f5920c = null;
                    }
                } else {
                    iVar2.f5921d = true;
                    t.k kVar4 = iVar2.f5919b;
                    if (kVar4 != null && kVar4.f5924b.k(th2)) {
                        iVar2.f5918a = null;
                        iVar2.f5919b = null;
                        iVar2.f5920c = null;
                    }
                }
                return h7.l.f2236a;
        }
    }
}
