package y8;

import j6.s;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import x8.c0;
import x8.d0;
import x8.f0;
import x8.j0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f6980a;

    /* renamed from: b  reason: collision with root package name */
    public final i f6981b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f6982c;

    public d(s sVar) {
        this.f6982c = sVar;
        Socket socket = (Socket) sVar.f3282b;
        this.f6980a = socket.getOutputStream();
        this.f6981b = new i(socket);
    }

    @Override // x8.f0
    public final j0 b() {
        return this.f6981b;
    }

    @Override // x8.f0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i;
        OutputStream outputStream = this.f6980a;
        s sVar = this.f6982c;
        i iVar = this.f6981b;
        iVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) sVar.f3283c;
            Socket socket = (Socket) sVar.f3282b;
            kotlin.jvm.internal.j.e(atomicInteger, "<this>");
            while (true) {
                int i9 = atomicInteger.get();
                if ((i9 & 1) == 0) {
                    int i10 = i9 | 1;
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
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // x8.f0, java.io.Flushable
    public final void flush() {
        i iVar = this.f6981b;
        iVar.h();
        try {
            this.f6980a.flush();
            if (iVar.i()) {
                throw iVar.j(null);
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

    @Override // x8.f0
    public final void k(x8.g gVar, long j) {
        x8.b.e(gVar.f6642b, 0L, j);
        while (j > 0) {
            i iVar = this.f6981b;
            iVar.f();
            c0 c0Var = gVar.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int min = (int) Math.min(j, c0Var.f6621c - c0Var.f6620b);
            iVar.h();
            try {
                try {
                    this.f6980a.write(c0Var.f6619a, c0Var.f6620b, min);
                    if (iVar.i()) {
                        throw iVar.j(null);
                    }
                    int i = c0Var.f6620b + min;
                    c0Var.f6620b = i;
                    long j8 = min;
                    j -= j8;
                    gVar.f6642b -= j8;
                    if (i == c0Var.f6621c) {
                        gVar.f6641a = c0Var.a();
                        d0.a(c0Var);
                    }
                } catch (IOException e9) {
                    if (!iVar.i()) {
                        throw e9;
                    }
                    throw iVar.j(e9);
                }
            } catch (Throwable th) {
                iVar.i();
                throw th;
            }
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f6982c.f3282b) + ')';
    }
}
