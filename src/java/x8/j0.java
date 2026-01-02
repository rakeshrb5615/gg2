package x8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final i0 f6647d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f6648a;

    /* renamed from: b  reason: collision with root package name */
    public long f6649b;

    /* renamed from: c  reason: collision with root package name */
    public long f6650c;

    public j0 a() {
        this.f6648a = false;
        return this;
    }

    public j0 b() {
        this.f6650c = 0L;
        return this;
    }

    public long c() {
        if (this.f6648a) {
            return this.f6649b;
        }
        throw new IllegalStateException("No deadline");
    }

    public j0 d(long j) {
        this.f6648a = true;
        this.f6649b = j;
        return this;
    }

    public boolean e() {
        return this.f6648a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f6648a && this.f6649b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public j0 g(long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.j.e(timeUnit, "unit");
        if (j >= 0) {
            this.f6650c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(v1.a.g(j, "timeout < 0: ").toString());
    }
}
