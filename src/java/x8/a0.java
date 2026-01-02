package x8;

import a1.n1;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a0 implements h {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f6613a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6614b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6615c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, x8.g] */
    public a0(f0 f0Var) {
        kotlin.jvm.internal.j.e(f0Var, "sink");
        this.f6613a = f0Var;
        this.f6614b = new Object();
    }

    @Override // x8.h
    public final g a() {
        return this.f6614b;
    }

    @Override // x8.f0
    public final j0 b() {
        return this.f6613a.b();
    }

    public final h c() {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f6614b;
        long y9 = gVar.y();
        if (y9 > 0) {
            this.f6613a.k(gVar, y9);
        }
        return this;
    }

    @Override // x8.f0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        f0 f0Var = this.f6613a;
        if (this.f6615c) {
            return;
        }
        try {
            g gVar = this.f6614b;
            long j = gVar.f6642b;
            if (j > 0) {
                f0Var.k(gVar, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            f0Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f6615c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // x8.h
    public final h d(long j) {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.O(j);
        c();
        return this;
    }

    @Override // x8.h, x8.f0, java.io.Flushable
    public final void flush() {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f6614b;
        long j = gVar.f6642b;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        f0 f0Var = this.f6613a;
        if (i > 0) {
            f0Var.k(gVar, j);
        }
        f0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6615c;
    }

    @Override // x8.h
    public final h j(j jVar) {
        kotlin.jvm.internal.j.e(jVar, "byteString");
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.K(jVar);
        c();
        return this;
    }

    @Override // x8.f0
    public final void k(g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "source");
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.k(gVar, j);
        c();
    }

    @Override // x8.h
    public final h n(int i, byte[] bArr) {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.write(bArr, 0, i);
        c();
        return this;
    }

    @Override // x8.h
    public final h q(String str) {
        kotlin.jvm.internal.j.e(str, "string");
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.S(str);
        c();
        return this;
    }

    @Override // x8.h
    public final OutputStream r() {
        return new n1(this, 2);
    }

    public final String toString() {
        return "buffer(" + this.f6613a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.j.e(byteBuffer, "source");
        if (!this.f6615c) {
            int write = this.f6614b.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.h
    public final h writeByte(int i) {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.M(i);
        c();
        return this;
    }

    @Override // x8.h
    public final h writeInt(int i) {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.P(i);
        c();
        return this;
    }

    @Override // x8.h
    public final h writeShort(int i) {
        if (this.f6615c) {
            throw new IllegalStateException("closed");
        }
        this.f6614b.Q(i);
        c();
        return this;
    }

    @Override // x8.h
    public final h write(byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "source");
        if (!this.f6615c) {
            this.f6614b.write(bArr, 0, bArr.length);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
