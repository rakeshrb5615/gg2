package x8;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class l implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final u f6658a;

    /* renamed from: b  reason: collision with root package name */
    public long f6659b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6660c;

    public l(u uVar, long j) {
        this.f6658a = uVar;
        this.f6659b = j;
    }

    @Override // x8.h0
    public final j0 b() {
        return j0.f6647d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f6658a;
        if (this.f6660c) {
            return;
        }
        this.f6660c = true;
        ReentrantLock reentrantLock = uVar.f6684c;
        reentrantLock.lock();
        try {
            int i = uVar.f6683b - 1;
            uVar.f6683b = i;
            if (i == 0) {
                if (uVar.f6682a) {
                    synchronized (uVar) {
                        uVar.f6685d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x8.h0
    public final long t(g gVar, long j) {
        long j8;
        long j9;
        int i;
        kotlin.jvm.internal.j.e(gVar, "sink");
        if (this.f6660c) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.f6658a;
        long j10 = this.f6659b;
        if (j >= 0) {
            long j11 = j + j10;
            long j12 = j10;
            while (true) {
                if (j12 >= j11) {
                    j8 = -1;
                    break;
                }
                c0 J = gVar.J(1);
                byte[] bArr = J.f6619a;
                int i9 = J.f6621c;
                j8 = -1;
                int min = (int) Math.min(j11 - j12, 8192 - i9);
                synchronized (uVar) {
                    kotlin.jvm.internal.j.e(bArr, "array");
                    uVar.f6685d.seek(j12);
                    i = 0;
                    while (true) {
                        if (i >= min) {
                            break;
                        }
                        int read = uVar.f6685d.read(bArr, i9, min - i);
                        if (read != -1) {
                            i += read;
                        } else if (i == 0) {
                            i = -1;
                        }
                    }
                }
                if (i == -1) {
                    if (J.f6620b == J.f6621c) {
                        gVar.f6641a = J.a();
                        d0.a(J);
                    }
                    if (j10 == j12) {
                        j9 = -1;
                    }
                } else {
                    J.f6621c += i;
                    long j13 = i;
                    j12 += j13;
                    gVar.f6642b += j13;
                }
            }
            j9 = j12 - j10;
            if (j9 != j8) {
                this.f6659b += j9;
            }
            return j9;
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }
}
