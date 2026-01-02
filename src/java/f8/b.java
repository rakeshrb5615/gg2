package f8;

import d8.f0;
import d8.f2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b implements f2 {

    /* renamed from: a  reason: collision with root package name */
    public Object f1527a = e.f1554p;

    /* renamed from: b  reason: collision with root package name */
    public d8.n f1528b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f1529c;

    public b(c cVar) {
        this.f1529c = cVar;
    }

    @Override // d8.f2
    public final void a(i8.r rVar, int i) {
        d8.n nVar = this.f1528b;
        if (nVar != null) {
            nVar.a(rVar, i);
        }
    }

    public final Object b(g8.e eVar) {
        k kVar;
        k kVar2;
        Object obj = this.f1527a;
        boolean z9 = true;
        if (obj == e.f1554p || obj == e.f1550l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1535m;
            c cVar = this.f1529c;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.f1530b.get(cVar), true)) {
                long andIncrement = c.f1531c.getAndIncrement(cVar);
                long j = e.f1542b;
                long j8 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (kVar3.f2799c != j8) {
                    k l5 = cVar.l(j8, kVar3);
                    if (l5 == null) {
                        continue;
                    } else {
                        kVar = l5;
                    }
                } else {
                    kVar = kVar3;
                }
                Object z10 = cVar.z(kVar, i, andIncrement, null);
                d4.l lVar = e.f1551m;
                if (z10 == lVar) {
                    throw new IllegalStateException("unreachable");
                }
                d4.l lVar2 = e.f1553o;
                if (z10 == lVar2) {
                    if (andIncrement < cVar.p()) {
                        kVar.b();
                    }
                    kVar3 = kVar;
                } else if (z10 != e.f1552n) {
                    kVar.b();
                    this.f1527a = z10;
                    return Boolean.valueOf(z9);
                } else {
                    d8.n k9 = f0.k(q4.b.C(eVar));
                    try {
                        this.f1528b = k9;
                        try {
                            Object z11 = cVar.z(kVar, i, andIncrement, this);
                            if (z11 == lVar) {
                                a(kVar, i);
                            } else {
                                if (z11 == lVar2) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.b();
                                    }
                                    k kVar4 = (k) c.f1535m.get(cVar);
                                    while (true) {
                                        if (cVar.r(c.f1530b.get(cVar), true)) {
                                            d8.n nVar = this.f1528b;
                                            kotlin.jvm.internal.j.b(nVar);
                                            this.f1528b = null;
                                            this.f1527a = e.f1550l;
                                            Throwable m9 = cVar.m();
                                            if (m9 == null) {
                                                nVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                nVar.resumeWith(c4.b.p(m9));
                                            }
                                        } else {
                                            long andIncrement2 = c.f1531c.getAndIncrement(cVar);
                                            long j9 = e.f1542b;
                                            long j10 = andIncrement2 / j9;
                                            int i9 = (int) (andIncrement2 % j9);
                                            if (kVar4.f2799c != j10) {
                                                kVar2 = cVar.l(j10, kVar4);
                                                if (kVar2 == null) {
                                                }
                                            } else {
                                                kVar2 = kVar4;
                                            }
                                            Object z12 = cVar.z(kVar2, i9, andIncrement2, this);
                                            if (z12 == e.f1551m) {
                                                a(kVar2, i9);
                                                break;
                                            } else if (z12 == e.f1553o) {
                                                if (andIncrement2 < cVar.p()) {
                                                    kVar2.b();
                                                }
                                                kVar4 = kVar2;
                                            } else if (z12 == e.f1552n) {
                                                throw new IllegalStateException("unexpected");
                                            } else {
                                                kVar2.b();
                                                this.f1527a = z12;
                                                this.f1528b = null;
                                            }
                                        }
                                    }
                                } else {
                                    kVar.b();
                                    this.f1527a = z11;
                                    this.f1528b = null;
                                }
                                k9.z(Boolean.TRUE, null);
                            }
                            Object q = k9.q();
                            m7.a aVar = m7.a.f4049a;
                            return q;
                        } catch (Throwable th) {
                            th = th;
                            k9.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            this.f1527a = e.f1550l;
            Throwable m10 = cVar.m();
            if (m10 != null) {
                int i10 = i8.s.f2800a;
                throw m10;
            }
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
