package k8;

import d8.a0;
import d8.y0;
import i8.t;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d extends y0 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final d f3452c = new a0();

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f3453d;

    /* JADX WARN: Type inference failed for: r0v0, types: [d8.a0, k8.d] */
    static {
        l lVar = l.f3466c;
        int i = t.f2801a;
        if (64 >= i) {
            i = 64;
        }
        f3453d = lVar.x(i8.a.j(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(l7.i.f3796a, runnable);
    }

    @Override // d8.a0
    public final void i(l7.h hVar, Runnable runnable) {
        f3453d.i(hVar, runnable);
    }

    @Override // d8.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
