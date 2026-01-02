package d8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d1 extends i1 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1174f = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e  reason: collision with root package name */
    public final u7.l f1175e;

    public d1(u7.l lVar) {
        this.f1175e = lVar;
    }

    @Override // d8.i1
    public final boolean j() {
        return true;
    }

    @Override // d8.i1
    public final void k(Throwable th) {
        if (f1174f.compareAndSet(this, 0, 1)) {
            this.f1175e.invoke(th);
        }
    }
}
