package x8;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class u implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6682a;

    /* renamed from: b  reason: collision with root package name */
    public int f6683b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f6684c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final RandomAccessFile f6685d;

    public u(RandomAccessFile randomAccessFile) {
        this.f6685d = randomAccessFile;
    }

    public final l c(long j) {
        ReentrantLock reentrantLock = this.f6684c;
        reentrantLock.lock();
        try {
            if (this.f6682a) {
                throw new IllegalStateException("closed");
            }
            this.f6683b++;
            reentrantLock.unlock();
            return new l(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f6684c;
        reentrantLock.lock();
        try {
            if (this.f6682a) {
                return;
            }
            this.f6682a = true;
            if (this.f6683b != 0) {
                return;
            }
            synchronized (this) {
                this.f6685d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f6684c;
        reentrantLock.lock();
        try {
            if (this.f6682a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f6685d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
