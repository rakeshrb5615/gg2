package h;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2072a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f2073b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final o f2074c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f2075d;

    public n(o oVar) {
        this.f2074c = oVar;
    }

    public final void a() {
        synchronized (this.f2072a) {
            try {
                Runnable runnable = (Runnable) this.f2073b.poll();
                this.f2075d = runnable;
                if (runnable != null) {
                    this.f2074c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2072a) {
            try {
                this.f2073b.add(new a5.i(7, this, runnable));
                if (this.f2075d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
