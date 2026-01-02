package f8;

import d8.f0;
import d8.f1;
import d8.r1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z8.u;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class p extends d8.a implements q, g {

    /* renamed from: d  reason: collision with root package name */
    public final c f1568d;

    public p(l7.h hVar, c cVar) {
        super(hVar, true);
        this.f1568d = cVar;
    }

    @Override // d8.a
    public final void O(boolean z9, Throwable th) {
        if (this.f1568d.g(false, th) || z9) {
            return;
        }
        f0.l(th, this.f1156c);
    }

    @Override // d8.a
    public final void P(Object obj) {
        h7.l lVar = (h7.l) obj;
        this.f1568d.g(false, null);
    }

    public final void R(u uVar) {
        c cVar = this.f1568d;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1538p;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, uVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    d4.l lVar = e.q;
                    if (obj != lVar) {
                        if (obj == e.f1555r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    d4.l lVar2 = e.f1555r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, lVar, lVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != lVar) {
                            break;
                        }
                    }
                    uVar.invoke(cVar.m());
                    return;
                }
            }
        }
    }

    @Override // f8.s
    public final Object b(Object obj, l7.c cVar) {
        return this.f1568d.b(obj, cVar);
    }

    @Override // d8.r1, d8.e1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new f1(l(), null, this);
        }
        j(cancellationException);
    }

    @Override // f8.s
    public final Object d(Object obj) {
        return this.f1568d.d(h7.l.f2236a);
    }

    @Override // d8.r1
    public final void j(CancellationException cancellationException) {
        CancellationException L = r1.L(this, cancellationException);
        this.f1568d.g(true, L);
        i(L);
    }
}
