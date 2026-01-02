package y8;

import j6.s;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import x8.c0;
import x8.d0;
import x8.h0;
import x8.j0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f6983a;

    /* renamed from: b  reason: collision with root package name */
    public final i f6984b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f6985c;

    public e(s sVar) {
        this.f6985c = sVar;
        Socket socket = (Socket) sVar.f3282b;
        this.f6983a = socket.getInputStream();
        this.f6984b = new i(socket);
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6984b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        s sVar = this.f6985c;
        i iVar = this.f6984b;
        iVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) sVar.f3283c;
            Socket socket = (Socket) sVar.f3282b;
            kotlin.jvm.internal.j.e(atomicInteger, "<this>");
            while (true) {
                int i9 = atomicInteger.get();
                if ((i9 & 2) == 0) {
                    int i10 = i9 | 2;
                    if (atomicInteger.compareAndSet(i9, i10)) {
                        i = i10;
                        break;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f6983a.close();
                    }
                }
                if (iVar.i()) {
                    throw iVar.j(null);
                }
            }
        } catch (IOException e9) {
            if (!iVar.i()) {
                throw e9;
            }
            throw iVar.j(e9);
        } finally {
            iVar.i();
        }
    }

    @Override // x8.h0
    public final long t(x8.g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            i iVar = this.f6984b;
            iVar.f();
            c0 J = gVar.J(1);
            int min = (int) Math.min(j, 8192 - J.f6621c);
            try {
                iVar.h();
                try {
                    int read = this.f6983a.read(J.f6619a, J.f6621c, min);
                    if (iVar.i()) {
                        throw iVar.j(null);
                    }
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
                } catch (IOException e9) {
                    if (iVar.i()) {
                        throw iVar.j(e9);
                    }
                    throw e9;
                }
            } catch (AssertionError e10) {
                if (m.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }

    public final String toString() {
        return "source(" + ((Socket) this.f6985c.f3282b) + ')';
    }
}
