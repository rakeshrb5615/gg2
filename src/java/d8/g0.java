package d8;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g0 extends w0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: p  reason: collision with root package name */
    public static final g0 f1197p;
    public static final long q;

    /* JADX WARN: Type inference failed for: r0v0, types: [d8.w0, d8.g0, d8.x0] */
    static {
        Long l5;
        ?? w0Var = new w0();
        f1197p = w0Var;
        w0Var.A(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        q = timeUnit.toNanos(l5.longValue());
    }

    @Override // d8.x0
    public final void D(long j, u0 u0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // d8.w0
    public final void E(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.E(runnable);
    }

    public final synchronized void J() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            w0.f1257m.set(this, null);
            w0.f1258n.set(this, null);
            notifyAll();
        }
    }

    @Override // d8.w0, d8.k0
    public final p0 c(long j, b2 b2Var, l7.h hVar) {
        long j8 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            t0 t0Var = new t0(j8 + nanoTime, b2Var);
            I(nanoTime, t0Var);
            return t0Var;
        }
        return t1.f1246a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean H;
        z1.f1269a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (H) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long B = B();
                    if (B == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = q + nanoTime;
                        }
                        long j8 = j - nanoTime;
                        if (j8 <= 0) {
                            _thread = null;
                            J();
                            if (H()) {
                                return;
                            }
                            z();
                            return;
                        } else if (B > j8) {
                            B = j8;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (B > 0) {
                        int i9 = debugStatus;
                        if (i9 == 2 || i9 == 3) {
                            _thread = null;
                            J();
                            if (H()) {
                                return;
                            }
                            z();
                            return;
                        }
                        LockSupport.parkNanos(this, B);
                    }
                }
            }
        } finally {
            _thread = null;
            J();
            if (!H()) {
                z();
            }
        }
    }

    @Override // d8.w0, d8.x0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // d8.a0
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // d8.x0
    public final Thread z() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f1197p.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }
}
