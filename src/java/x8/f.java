package x8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f6640b;

    public /* synthetic */ f(i iVar, int i) {
        this.f6639a = i;
        this.f6640b = iVar;
    }

    private final void c() {
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        switch (this.f6639a) {
            case 0:
                min = Math.min(((g) this.f6640b).f6642b, Integer.MAX_VALUE);
                break;
            default:
                b0 b0Var = (b0) this.f6640b;
                if (!b0Var.f6618c) {
                    min = Math.min(b0Var.f6617b.f6642b, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6639a) {
            case 0:
                return;
            default:
                ((b0) this.f6640b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f6639a) {
            case 0:
                g gVar = (g) this.f6640b;
                if (gVar.f6642b > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                b0 b0Var = (b0) this.f6640b;
                g gVar2 = b0Var.f6617b;
                if (!b0Var.f6618c) {
                    if (gVar2.f6642b == 0 && b0Var.f6616a.t(gVar2, 8192L) == -1) {
                        return -1;
                    }
                    return gVar2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.f6639a) {
            case 0:
                return ((g) this.f6640b) + ".inputStream()";
            default:
                return ((b0) this.f6640b) + ".inputStream()";
        }
    }

    public long transferTo(OutputStream outputStream) {
        switch (this.f6639a) {
            case 1:
                kotlin.jvm.internal.j.e(outputStream, "out");
                b0 b0Var = (b0) this.f6640b;
                g gVar = b0Var.f6617b;
                if (b0Var.f6618c) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j8 = 0;
                while (true) {
                    if (gVar.f6642b == j && b0Var.f6616a.t(gVar, 8192L) == -1) {
                        return j8;
                    }
                    long j9 = gVar.f6642b;
                    j8 += j9;
                    b.e(j9, 0L, j9);
                    c0 c0Var = gVar.f6641a;
                    while (j9 > j) {
                        kotlin.jvm.internal.j.b(c0Var);
                        int min = (int) Math.min(j9, c0Var.f6621c - c0Var.f6620b);
                        outputStream.write(c0Var.f6619a, c0Var.f6620b, min);
                        int i = c0Var.f6620b + min;
                        c0Var.f6620b = i;
                        long j10 = min;
                        gVar.f6642b -= j10;
                        j9 -= j10;
                        if (i == c0Var.f6621c) {
                            c0 a10 = c0Var.a();
                            gVar.f6641a = a10;
                            d0.a(c0Var);
                            c0Var = a10;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i9) {
        switch (this.f6639a) {
            case 0:
                kotlin.jvm.internal.j.e(bArr, "sink");
                return ((g) this.f6640b).read(bArr, i, i9);
            default:
                kotlin.jvm.internal.j.e(bArr, "data");
                b0 b0Var = (b0) this.f6640b;
                g gVar = b0Var.f6617b;
                if (!b0Var.f6618c) {
                    b.e(bArr.length, i, i9);
                    if (gVar.f6642b == 0 && b0Var.f6616a.t(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.read(bArr, i, i9);
                }
                throw new IOException("closed");
        }
    }
}
