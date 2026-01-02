package m8;

import d8.f0;
import d8.n;
import h7.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends g implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4059g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z9) {
        super(z9 ? 1 : 0);
        this.owner$volatile = z9 ? null : d.f4060a;
    }

    public final boolean c() {
        return Math.max(g.f4067f.get(this), 0) == 0;
    }

    public final Object d(n7.c cVar) {
        boolean e9 = e();
        l lVar = l.f2236a;
        if (!e9) {
            n k9 = f0.k(q4.b.C(cVar));
            try {
                a(new b(this, k9));
                Object q = k9.q();
                m7.a aVar = m7.a.f4049a;
                if (q != aVar) {
                    q = lVar;
                }
                if (q == aVar) {
                    return q;
                }
            } catch (Throwable th) {
                k9.y();
                throw th;
            }
        }
        return lVar;
    }

    public final boolean e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f4067f;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else if (i9 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i9, i9 - 1)) {
                    f4059g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4059g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            d4.l lVar = d.f4060a;
            if (obj2 != lVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + f0.j(this) + "[isLocked=" + c() + ",owner=" + f4059g.get(this) + ']';
    }
}
