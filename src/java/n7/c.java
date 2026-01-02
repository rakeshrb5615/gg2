package n7;

import d8.a0;
import d8.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class c extends a {
    private final l7.h _context;
    private transient l7.c<Object> intercepted;

    public c(l7.c cVar, l7.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // l7.c
    public l7.h getContext() {
        l7.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final l7.c<Object> intercepted() {
        l7.c<Object> cVar = this.intercepted;
        if (cVar == null) {
            l7.e eVar = (l7.e) getContext().get(l7.d.f3795a);
            l7.c<Object> fVar = eVar != null ? new i8.f((a0) eVar, this) : this;
            this.intercepted = fVar;
            return fVar;
        }
        return cVar;
    }

    @Override // n7.a
    public void releaseIntercepted() {
        l7.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            l7.f fVar = getContext().get(l7.d.f3795a);
            j.b(fVar);
            l7.e eVar = (l7.e) fVar;
            i8.f fVar2 = (i8.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i8.f.f2771n;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar2) == i8.a.f2761c);
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
            n nVar = obj instanceof n ? (n) obj : null;
            if (nVar != null) {
                nVar.n();
            }
        }
        this.intercepted = b.f4969a;
    }

    public c(l7.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
