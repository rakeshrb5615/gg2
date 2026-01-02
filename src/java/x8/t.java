package x8;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class t implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f6680a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f6681b;

    public t(InputStream inputStream, j0 j0Var) {
        this.f6680a = inputStream;
        this.f6681b = j0Var;
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6681b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6680a.close();
    }

    @Override // x8.h0
    public final long t(g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.f6681b.f();
                c0 J = gVar.J(1);
                int read = this.f6680a.read(J.f6619a, J.f6621c, (int) Math.min(j, 8192 - J.f6621c));
                if (read != -1) {
                    J.f6621c += read;
                    long j8 = read;
                    gVar.f6642b += j8;
                    return j8;
                } else if (J.f6620b == J.f6621c) {
                    gVar.f6641a = J.a();
                    d0.a(J);
                    return -1L;
                } else {
                    return -1L;
                }
            } catch (AssertionError e9) {
                if (y8.m.a(e9)) {
                    throw new IOException(e9);
                }
                throw e9;
            }
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }

    public final String toString() {
        return "source(" + this.f6680a + ')';
    }
}
