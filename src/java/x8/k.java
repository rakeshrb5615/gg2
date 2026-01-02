package x8;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f6651a;

    /* renamed from: b  reason: collision with root package name */
    public final Deflater f6652b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6653c;

    public k(a0 a0Var, Deflater deflater) {
        this.f6651a = a0Var;
        this.f6652b = deflater;
    }

    @Override // x8.f0
    public final j0 b() {
        return this.f6651a.f6613a.b();
    }

    public final void c(boolean z9) {
        c0 J;
        int deflate;
        a0 a0Var = this.f6651a;
        g gVar = a0Var.f6614b;
        while (true) {
            J = gVar.J(1);
            byte[] bArr = J.f6619a;
            Deflater deflater = this.f6652b;
            if (z9) {
                try {
                    int i = J.f6621c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e9) {
                    throw new IOException("Deflater already closed", e9);
                }
            } else {
                int i9 = J.f6621c;
                deflate = deflater.deflate(bArr, i9, 8192 - i9);
            }
            if (deflate > 0) {
                J.f6621c += deflate;
                gVar.f6642b += deflate;
                a0Var.c();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (J.f6620b == J.f6621c) {
            gVar.f6641a = J.a();
            d0.a(J);
        }
    }

    @Override // x8.f0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        Deflater deflater = this.f6652b;
        if (this.f6653c) {
            return;
        }
        try {
            deflater.finish();
            c(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f6651a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f6653c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // x8.f0, java.io.Flushable
    public final void flush() {
        c(true);
        this.f6651a.flush();
    }

    @Override // x8.f0
    public final void k(g gVar, long j) {
        b.e(gVar.f6642b, 0L, j);
        while (true) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            Deflater deflater = this.f6652b;
            if (i <= 0) {
                deflater.setInput(y8.b.f6974b, 0, 0);
                return;
            }
            c0 c0Var = gVar.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int min = (int) Math.min(j, c0Var.f6621c - c0Var.f6620b);
            deflater.setInput(c0Var.f6619a, c0Var.f6620b, min);
            c(false);
            long j8 = min;
            gVar.f6642b -= j8;
            int i9 = c0Var.f6620b + min;
            c0Var.f6620b = i9;
            if (i9 == c0Var.f6621c) {
                gVar.f6641a = c0Var.a();
                d0.a(c0Var);
            }
            j -= j8;
        }
    }

    public final String toString() {
        return "DeflaterSink(" + this.f6651a + ')';
    }
}
