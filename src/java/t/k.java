package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k implements p4.b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f5923a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5924b = new j(this);

    public k(i iVar) {
        this.f5923a = new WeakReference(iVar);
    }

    @Override // p4.b
    public final void a(b5.l lVar, Executor executor) {
        this.f5924b.a(lVar, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        i iVar = (i) this.f5923a.get();
        boolean cancel = this.f5924b.cancel(z9);
        if (cancel && iVar != null) {
            iVar.f5918a = null;
            iVar.f5919b = null;
            iVar.f5920c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5924b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5924b.f5915a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5924b.isDone();
    }

    public final String toString() {
        return this.f5924b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f5924b.get(j, timeUnit);
    }
}
