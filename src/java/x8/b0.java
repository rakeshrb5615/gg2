package x8;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b0 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f6616a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6617b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6618c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, x8.g] */
    public b0(h0 h0Var) {
        kotlin.jvm.internal.j.e(h0Var, "source");
        this.f6616a = h0Var;
        this.f6617b = new Object();
    }

    @Override // x8.i
    public final g a() {
        return this.f6617b;
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6616a.b();
    }

    public final long c(byte b10, long j, long j8) {
        if (this.f6618c) {
            throw new IllegalStateException("closed");
        }
        if (0 <= j8) {
            long j9 = 0;
            while (j9 < j8) {
                g gVar = this.f6617b;
                byte b11 = b10;
                long j10 = j8;
                long B = gVar.B(b11, j9, j10);
                if (B == -1) {
                    long j11 = gVar.f6642b;
                    if (j11 >= j10 || this.f6616a.t(gVar, 8192L) == -1) {
                        break;
                    }
                    j9 = Math.max(j9, j11);
                    b10 = b11;
                    j8 = j10;
                } else {
                    return B;
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(v1.a.g(j8, "fromIndex=0 toIndex=").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f6618c) {
            return;
        }
        this.f6618c = true;
        this.f6616a.close();
        this.f6617b.s();
    }

    @Override // x8.i
    public final j e(long j) {
        o(j);
        return this.f6617b.e(j);
    }

    public final int f() {
        o(4L);
        return b.g(this.f6617b.readInt());
    }

    @Override // x8.i
    public final String g() {
        return l(Long.MAX_VALUE);
    }

    @Override // x8.i
    public final boolean h() {
        if (this.f6618c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f6617b;
        return gVar.h() && this.f6616a.t(gVar, 8192L) == -1;
    }

    public final long i() {
        long j;
        o(8L);
        g gVar = this.f6617b;
        if (gVar.f6642b >= 8) {
            c0 c0Var = gVar.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int i = c0Var.f6620b;
            int i9 = c0Var.f6621c;
            if (i9 - i < 8) {
                j = ((gVar.readInt() & 4294967295L) << 32) | (4294967295L & gVar.readInt());
            } else {
                byte[] bArr = c0Var.f6619a;
                long j8 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
                int i10 = i + 7;
                int i11 = i + 8;
                long j9 = j8 | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i10] & 255);
                gVar.f6642b -= 8;
                if (i11 == i9) {
                    gVar.f6641a = c0Var.a();
                    d0.a(c0Var);
                } else {
                    c0Var.f6620b = i11;
                }
                j = j9;
            }
            return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6618c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, x8.g] */
    @Override // x8.i
    public final String l(long j) {
        if (j >= 0) {
            long j8 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long c9 = c((byte) 10, 0L, j8);
            int i = (c9 > (-1L) ? 1 : (c9 == (-1L) ? 0 : -1));
            g gVar = this.f6617b;
            if (i != 0) {
                return y8.a.b(gVar, c9);
            }
            if (j8 < Long.MAX_VALUE && request(j8) && gVar.A(j8 - 1) == 13 && request(j8 + 1) && gVar.A(j8) == 10) {
                return y8.a.b(gVar, j8);
            }
            ?? obj = new Object();
            gVar.z(obj, 0L, Math.min(32, gVar.f6642b));
            throw new EOFException("\\n not found: limit=" + Math.min(gVar.f6642b, j) + " content=" + obj.e(obj.f6642b).e() + (char) 8230);
        }
        throw new IllegalArgumentException(v1.a.g(j, "limit < 0: ").toString());
    }

    @Override // x8.i
    public final int m(x xVar) {
        kotlin.jvm.internal.j.e(xVar, "options");
        if (this.f6618c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            g gVar = this.f6617b;
            int c9 = y8.a.c(gVar, xVar, true);
            if (c9 == -2) {
                if (this.f6616a.t(gVar, 8192L) == -1) {
                    break;
                }
            } else if (c9 != -1) {
                gVar.skip(xVar.f6686a[c9].d());
                return c9;
            }
        }
        return -1;
    }

    @Override // x8.i
    public final void o(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // x8.i
    public final long p(g gVar) {
        g gVar2;
        long j = 0;
        while (true) {
            h0 h0Var = this.f6616a;
            gVar2 = this.f6617b;
            if (h0Var.t(gVar2, 8192L) == -1) {
                break;
            }
            long y9 = gVar2.y();
            if (y9 > 0) {
                j += y9;
                gVar.k(gVar2, y9);
            }
        }
        long j8 = gVar2.f6642b;
        if (j8 > 0) {
            long j9 = j + j8;
            gVar.k(gVar2, j8);
            return j9;
        }
        return j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.j.e(byteBuffer, "sink");
        g gVar = this.f6617b;
        if (gVar.f6642b == 0 && this.f6616a.t(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(byteBuffer);
    }

    @Override // x8.i
    public final byte readByte() {
        o(1L);
        return this.f6617b.readByte();
    }

    @Override // x8.i
    public final int readInt() {
        o(4L);
        return this.f6617b.readInt();
    }

    @Override // x8.i
    public final short readShort() {
        o(2L);
        return this.f6617b.readShort();
    }

    @Override // x8.i
    public final boolean request(long j) {
        g gVar;
        if (j >= 0) {
            if (this.f6618c) {
                throw new IllegalStateException("closed");
            }
            do {
                gVar = this.f6617b;
                if (gVar.f6642b >= j) {
                    return true;
                }
            } while (this.f6616a.t(gVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }

    public final short s() {
        o(2L);
        return this.f6617b.E();
    }

    @Override // x8.i
    public final void skip(long j) {
        if (this.f6618c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            g gVar = this.f6617b;
            if (gVar.f6642b == 0 && this.f6616a.t(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, gVar.f6642b);
            gVar.skip(min);
            j -= min;
        }
    }

    @Override // x8.h0
    public final long t(g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (this.f6618c) {
                throw new IllegalStateException("closed");
            }
            g gVar2 = this.f6617b;
            if (gVar2.f6642b == 0) {
                if (i == 0) {
                    return 0L;
                }
                if (this.f6616a.t(gVar2, 8192L) == -1) {
                    return -1L;
                }
            }
            return gVar2.t(gVar, Math.min(j, gVar2.f6642b));
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }

    public final String toString() {
        return "buffer(" + this.f6616a + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        a.a.j(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.jvm.internal.j.d(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // x8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            r6 = this;
            r0 = 1
            r6.o(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.request(r2)
            x8.g r3 = r6.f6617b
            if (r2 == 0) goto L4e
            long r4 = (long) r0
            byte r2 = r3.A(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            a.a.j(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.j.d(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4e:
            long r0 = r3.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b0.u():long");
    }

    @Override // x8.i
    public final String v(Charset charset) {
        kotlin.jvm.internal.j.e(charset, "charset");
        h0 h0Var = this.f6616a;
        g gVar = this.f6617b;
        gVar.L(h0Var);
        return gVar.v(charset);
    }

    @Override // x8.i
    public final InputStream w() {
        return new f(this, 1);
    }

    public final String x(long j) {
        o(j);
        g gVar = this.f6617b;
        gVar.getClass();
        return gVar.F(j, b8.a.f766a);
    }
}
