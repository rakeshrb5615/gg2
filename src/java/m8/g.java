package m8;

import d8.m;
import d8.n;
import h7.l;
import i8.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4063b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4064c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4065d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4066e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4067f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final m f4068a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1 - i;
        this.f4068a = new m(this, 2);
    }

    public final void a(b bVar) {
        Object b10;
        i iVar;
        n nVar = bVar.f4057a;
        c cVar = bVar.f4058b;
        while (true) {
            int andDecrement = f4067f.getAndDecrement(this);
            if (andDecrement <= 1) {
                l lVar = l.f2236a;
                if (andDecrement > 0) {
                    c.f4059g.set(cVar, null);
                    nVar.A(lVar, nVar.f1218c, new m(new a6.i(cVar, bVar), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4065d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4066e.getAndIncrement(this);
                e eVar = e.f4061a;
                long j = andIncrement / h.f4074f;
                while (true) {
                    b10 = i8.a.b(iVar2, j, eVar);
                    if (!i8.a.e(b10)) {
                        r c9 = i8.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
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
                                        iVar2 = iVar;
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
                    iVar2 = iVar;
                }
                i iVar3 = (i) i8.a.c(b10);
                AtomicReferenceArray atomicReferenceArray = iVar3.f4075e;
                int i = (int) (andIncrement % h.f4074f);
                while (!atomicReferenceArray.compareAndSet(i, null, bVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        d4.l lVar2 = h.f4070b;
                        d4.l lVar3 = h.f4071c;
                        while (!atomicReferenceArray.compareAndSet(i, lVar2, lVar3)) {
                            if (atomicReferenceArray.get(i) != lVar2) {
                                break;
                            }
                        }
                        c.f4059g.set(cVar, null);
                        nVar.A(lVar, nVar.f1218c, new m(new a6.i(cVar, bVar), 0));
                        return;
                    }
                }
                bVar.a(iVar3, i);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c4, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.g.b():void");
    }
}
