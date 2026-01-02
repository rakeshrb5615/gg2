package t;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class h implements p4.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5911d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f5912e = Logger.getLogger(h.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final q4.b f5913f;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f5914m;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f5915a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f5916b;

    /* renamed from: c  reason: collision with root package name */
    public volatile g f5917c;

    static {
        q4.b bVar;
        try {
            bVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            bVar = new q4.b(27);
        }
        f5913f = bVar;
        if (th != null) {
            f5912e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5914m = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f5917c;
        } while (!f5913f.d(hVar, gVar, g.f5908c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f5909a;
            if (thread != null) {
                gVar.f5909a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f5910b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f5916b;
        } while (!f5913f.b(hVar, dVar2, d.f5901d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f5904c;
            dVar.f5904c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f5904c;
            e(dVar3.f5902a, dVar3.f5903b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            Level level = Level.SEVERE;
            f5912e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f5898b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f5900a);
        } else {
            if (obj == f5914m) {
                return null;
            }
            return obj;
        }
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // p4.b
    public final void a(b5.l lVar, Executor executor) {
        d dVar = this.f5916b;
        d dVar2 = d.f5901d;
        if (dVar == dVar2) {
            e(lVar, executor);
        }
        d dVar3 = new d(lVar, executor);
        do {
            dVar3.f5904c = dVar;
            if (f5913f.b(this, dVar, dVar3)) {
                return;
            }
            dVar = this.f5916b;
        } while (dVar != dVar2);
        e(lVar, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g3 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g3 == this ? "this future" : String.valueOf(g3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        Object obj = this.f5915a;
        if (obj == null) {
            if (f5913f.c(this, obj, f5911d ? new a(z9, new CancellationException("Future.cancel() was called.")) : z9 ? a.f5895c : a.f5896d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Locale locale;
        g gVar = g.f5908c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f5915a;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar2 = this.f5917c;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    do {
                        q4.b bVar = f5913f;
                        bVar.M(gVar3, gVar2);
                        if (bVar.d(this, gVar2, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5915a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(gVar3);
                        } else {
                            gVar2 = this.f5917c;
                        }
                    } while (gVar2 != gVar);
                    return f(this.f5915a);
                }
                return f(this.f5915a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5915a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String d9 = g2.g.d(str, " (plus ");
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z9 = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str2 = d9 + convert + " " + lowerCase;
                    if (z9) {
                        str2 = g2.g.d(str2, ",");
                    }
                    d9 = g2.g.d(str2, " ");
                }
                if (z9) {
                    d9 = d9 + nanos2 + " nanoseconds ";
                }
                str = g2.g.d(d9, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(g2.g.d(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(g2.g.e(str, " for ", hVar));
        }
        throw new InterruptedException();
    }

    public String h() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(g gVar) {
        gVar.f5909a = null;
        while (true) {
            g gVar2 = this.f5917c;
            if (gVar2 == g.f5908c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f5910b;
                if (gVar2.f5909a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f5910b = gVar4;
                    if (gVar3.f5909a == null) {
                        break;
                    }
                } else if (!f5913f.d(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5915a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5915a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f5914m;
        }
        if (f5913f.c(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (f5913f.c(this, null, new c(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5915a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e9) {
                str = "Exception thrown from implementation: " + e9.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f5908c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5915a;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar2 = this.f5917c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    q4.b bVar = f5913f;
                    bVar.M(gVar3, gVar2);
                    if (bVar.d(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5915a;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar2 = this.f5917c;
                } while (gVar2 != gVar);
                return f(this.f5915a);
            }
            return f(this.f5915a);
        }
        throw new InterruptedException();
    }
}
