package x8;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class q implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f6666a;

    /* renamed from: b  reason: collision with root package name */
    public final Deflater f6667b;

    /* renamed from: c  reason: collision with root package name */
    public final k f6668c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6669d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f6670e;

    public q(h hVar) {
        a0 a0Var = new a0(hVar);
        this.f6666a = a0Var;
        Deflater deflater = new Deflater(-1, true);
        this.f6667b = deflater;
        this.f6668c = new k(a0Var, deflater);
        this.f6670e = new CRC32();
        g gVar = a0Var.f6614b;
        gVar.Q(8075);
        gVar.M(8);
        gVar.M(0);
        gVar.P(0);
        gVar.M(0);
        gVar.M(0);
    }

    @Override // x8.f0
    public final j0 b() {
        return this.f6666a.f6613a.b();
    }

    @Override // x8.f0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int value;
        boolean z9;
        g gVar;
        Deflater deflater = this.f6667b;
        a0 a0Var = this.f6666a;
        if (this.f6669d) {
            return;
        }
        try {
            k kVar = this.f6668c;
            kVar.f6652b.finish();
            kVar.c(false);
            value = (int) this.f6670e.getValue();
            z9 = a0Var.f6615c;
            gVar = a0Var.f6614b;
        } catch (Throwable th) {
            th = th;
        }
        if (z9) {
            throw new IllegalStateException("closed");
        }
        gVar.P(b.g(value));
        a0Var.c();
        int bytesRead = (int) deflater.getBytesRead();
        if (a0Var.f6615c) {
            throw new IllegalStateException("closed");
        }
        gVar.P(b.g(bytesRead));
        a0Var.c();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            a0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f6669d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // x8.f0, java.io.Flushable
    public final void flush() {
        this.f6668c.flush();
    }

    @Override // x8.f0
    public final void k(g gVar, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
        }
        if (i == 0) {
            return;
        }
        c0 c0Var = gVar.f6641a;
        kotlin.jvm.internal.j.b(c0Var);
        long j8 = j;
        while (j8 > 0) {
            int min = (int) Math.min(j8, c0Var.f6621c - c0Var.f6620b);
            this.f6670e.update(c0Var.f6619a, c0Var.f6620b, min);
            j8 -= min;
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
        }
        this.f6668c.k(gVar, j);
    }
}
