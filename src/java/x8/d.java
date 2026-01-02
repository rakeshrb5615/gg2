package x8;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class d extends j0 {

    /* renamed from: h  reason: collision with root package name */
    public static final h.f f6626h;
    public static d i;
    public static final ReentrantLock j;

    /* renamed from: k  reason: collision with root package name */
    public static final Condition f6627k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f6628l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f6629m;

    /* renamed from: e  reason: collision with root package name */
    public int f6630e;

    /* renamed from: f  reason: collision with root package name */
    public int f6631f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f6632g;

    static {
        h.f fVar = new h.f(7, false);
        fVar.f2041c = new d[8];
        f6626h = fVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.j.d(newCondition, "newCondition(...)");
        f6627k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f6628l = millis;
        f6629m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j8 = this.f6650c;
        boolean z9 = this.f6648a;
        if (j8 != 0 || z9) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.f6630e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f6630e = 1;
                c5.c.e(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i9 = this.f6630e;
            this.f6630e = 0;
            if (i9 != 1) {
                return i9 == 2;
            }
            f6626h.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
