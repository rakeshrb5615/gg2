package i8;

import d8.a0;
import d8.b2;
import d8.h0;
import d8.k0;
import d8.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g extends a0 implements k0 {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2776n = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k0 f2777c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f2778d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2779e;

    /* renamed from: f  reason: collision with root package name */
    public final k f2780f;

    /* renamed from: m  reason: collision with root package name */
    public final Object f2781m;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public g(a0 a0Var, int i) {
        k0 k0Var = a0Var instanceof k0 ? (k0) a0Var : null;
        this.f2777c = k0Var == null ? h0.f1201a : k0Var;
        this.f2778d = a0Var;
        this.f2779e = i;
        this.f2780f = new k();
        this.f2781m = new Object();
    }

    @Override // d8.k0
    public final p0 c(long j, b2 b2Var, l7.h hVar) {
        return this.f2777c.c(j, b2Var, hVar);
    }

    @Override // d8.k0
    public final void f(long j, d8.n nVar) {
        this.f2777c.f(j, nVar);
    }

    @Override // d8.a0
    public final void i(l7.h hVar, Runnable runnable) {
        this.f2780f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2776n;
        if (atomicIntegerFieldUpdater.get(this) < this.f2779e) {
            synchronized (this.f2781m) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f2779e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable y9 = y();
                if (y9 == null) {
                    return;
                }
                this.f2778d.i(this, new b5.l(this, y9));
            }
        }
    }

    @Override // d8.a0
    public final String toString() {
        return this.f2778d + ".limitedParallelism(" + this.f2779e + ')';
    }

    public final Runnable y() {
        while (true) {
            Runnable runnable = (Runnable) this.f2780f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f2781m) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2776n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2780f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
