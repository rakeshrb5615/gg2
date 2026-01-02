package n5;

import a5.i;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import g5.z;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o2.d;
import o2.h;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final double f4873a;

    /* renamed from: b  reason: collision with root package name */
    public final double f4874b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4875c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4876d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4877e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayBlockingQueue f4878f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f4879g;

    /* renamed from: h  reason: collision with root package name */
    public final a2.b f4880h;
    public final k2.c i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public long f4881k;

    public c(a2.b bVar, o5.c cVar, k2.c cVar2) {
        double d9 = cVar.f5018d;
        double d10 = cVar.f5019e;
        this.f4873a = d9;
        this.f4874b = d10;
        this.f4875c = cVar.f5020f * 1000;
        this.f4880h = bVar;
        this.i = cVar2;
        this.f4876d = SystemClock.elapsedRealtime();
        int i = (int) d9;
        this.f4877e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f4878f = arrayBlockingQueue;
        this.f4879g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f4881k = 0L;
    }

    public final int a() {
        if (this.f4881k == 0) {
            this.f4881k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4881k) / this.f4875c);
        int min = this.f4878f.size() == this.f4877e ? Math.min(100, this.j + currentTimeMillis) : Math.max(0, this.j - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.f4881k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(final g5.b bVar, final TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.f1774b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z9 = SystemClock.elapsedRealtime() - this.f4876d < 2000;
        this.f4880h.l(new o2.a(bVar.f1773a, d.f5008c, null), new h() { // from class: n5.b
            @Override // o2.h
            public final void a(Exception exc) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z9) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new i(13, c.this, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = z.f1874a;
                    boolean z11 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = nanoTime - System.nanoTime();
                                    z11 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z10) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                    }
                }
                taskCompletionSource2.trySetResult(bVar);
            }
        });
    }
}
