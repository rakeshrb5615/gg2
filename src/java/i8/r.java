package i8;

import d8.u1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class r extends b implements u1 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2798d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* renamed from: c  reason: collision with root package name */
    public final long f2799c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j, r rVar, int i) {
        super(rVar);
        this.f2799c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // i8.b
    public final boolean d() {
        return f2798d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f2798d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, l7.h hVar);

    public final void i() {
        if (f2798d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f2798d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
