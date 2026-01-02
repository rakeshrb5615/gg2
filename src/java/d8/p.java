package d8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class p extends i1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1233e;

    /* renamed from: f  reason: collision with root package name */
    public final n f1234f;

    public /* synthetic */ p(n nVar, int i) {
        this.f1233e = i;
        this.f1234f = nVar;
    }

    @Override // d8.i1
    public final boolean j() {
        switch (this.f1233e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // d8.i1
    public final void k(Throwable th) {
        switch (this.f1233e) {
            case 0:
                r1 i = i();
                n nVar = this.f1234f;
                Throwable p8 = nVar.p(i);
                if (nVar.v()) {
                    i8.f fVar = (i8.f) nVar.f1222d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i8.f.f2771n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        d4.l lVar = i8.a.f2761c;
                        if (!kotlin.jvm.internal.j.a(obj, lVar)) {
                            if (!(obj instanceof Throwable)) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                        break;
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, lVar, p8)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != lVar) {
                                    break;
                                }
                            }
                            return;
                        }
                    }
                }
                nVar.m(p8);
                if (nVar.v()) {
                    return;
                }
                nVar.n();
                return;
            default:
                this.f1234f.resumeWith(h7.l.f2236a);
                return;
        }
    }
}
