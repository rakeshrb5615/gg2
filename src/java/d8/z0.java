package d8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class z0 extends y0 implements k0 {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f1268c;

    public z0(Executor executor) {
        this.f1268c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // d8.k0
    public final p0 c(long j, b2 b2Var, l7.h hVar) {
        Executor executor = this.f1268c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(b2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                e1 e1Var = (e1) hVar.get(b0.f1162b);
                if (e1Var != null) {
                    e1Var.cancel(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new o0(scheduledFuture) : g0.f1197p.c(j, b2Var, hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1268c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).f1268c == this.f1268c;
    }

    @Override // d8.k0
    public final void f(long j, n nVar) {
        Executor executor = this.f1268c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            b5.l lVar = new b5.l(4, this, nVar);
            l7.h hVar = nVar.f1223e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(lVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                e1 e1Var = (e1) hVar.get(b0.f1162b);
                if (e1Var != null) {
                    e1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            nVar.u(new j(scheduledFuture, 0));
        } else {
            g0.f1197p.f(j, nVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1268c);
    }

    @Override // d8.a0
    public final void i(l7.h hVar, Runnable runnable) {
        try {
            this.f1268c.execute(runnable);
        } catch (RejectedExecutionException e9) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e9);
            e1 e1Var = (e1) hVar.get(b0.f1162b);
            if (e1Var != null) {
                e1Var.cancel(cancellationException);
            }
            k8.e eVar = n0.f1224a;
            k8.d.f3452c.i(hVar, runnable);
        }
    }

    @Override // d8.a0
    public final String toString() {
        return this.f1268c.toString();
    }
}
