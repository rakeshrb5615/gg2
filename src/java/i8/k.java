package i8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2786a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2786a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a10 = mVar.a(runnable);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                m c9 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c9) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2786a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c9 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c9) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f2786a.get(this);
        mVar.getClass();
        long j = m.f2789f.get(mVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2786a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d9 = mVar.d();
            if (d9 != m.f2790g) {
                return d9;
            }
            m c9 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c9) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
