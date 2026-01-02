package x8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class r implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public byte f6671a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f6672b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f6673c;

    /* renamed from: d  reason: collision with root package name */
    public final s f6674d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f6675e;

    public r(i iVar) {
        kotlin.jvm.internal.j.e(iVar, "source");
        b0 b0Var = new b0(iVar);
        this.f6672b = b0Var;
        Inflater inflater = new Inflater(true);
        this.f6673c = inflater;
        this.f6674d = new s(b0Var, inflater);
        this.f6675e = new CRC32();
    }

    public static void c(int i, int i9, String str) {
        if (i9 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + b8.i.C0(8, b.i(i9)) + " != expected 0x" + b8.i.C0(8, b.i(i)));
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6672b.f6616a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6674d.close();
    }

    public final void f(g gVar, long j, long j8) {
        int i;
        c0 c0Var = gVar.f6641a;
        kotlin.jvm.internal.j.b(c0Var);
        while (true) {
            int i9 = c0Var.f6621c;
            int i10 = c0Var.f6620b;
            if (j < i9 - i10) {
                break;
            }
            j -= i9 - i10;
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
        }
        while (j8 > 0) {
            int min = (int) Math.min(c0Var.f6621c - i, j8);
            this.f6675e.update(c0Var.f6619a, (int) (c0Var.f6620b + j), min);
            j8 -= min;
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
            j = 0;
        }
    }

    @Override // x8.h0
    public final long t(g gVar, long j) {
        r rVar = this;
        kotlin.jvm.internal.j.e(gVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            byte b10 = rVar.f6671a;
            CRC32 crc32 = rVar.f6675e;
            b0 b0Var = rVar.f6672b;
            if (b10 == 0) {
                b0Var.o(10L);
                g gVar2 = b0Var.f6617b;
                byte A = gVar2.A(3L);
                boolean z9 = ((A >> 1) & 1) == 1;
                if (z9) {
                    rVar.f(gVar2, 0L, 10L);
                }
                c(8075, b0Var.readShort(), "ID1ID2");
                b0Var.skip(8L);
                if (((A >> 2) & 1) == 1) {
                    b0Var.o(2L);
                    if (z9) {
                        f(gVar2, 0L, 2L);
                    }
                    long E = gVar2.E() & 65535;
                    b0Var.o(E);
                    if (z9) {
                        f(gVar2, 0L, E);
                    }
                    b0Var.skip(E);
                }
                if (((A >> 3) & 1) == 1) {
                    long c9 = b0Var.c((byte) 0, 0L, Long.MAX_VALUE);
                    if (c9 == -1) {
                        throw new EOFException();
                    }
                    if (z9) {
                        f(gVar2, 0L, c9 + 1);
                    }
                    b0Var.skip(c9 + 1);
                }
                if (((A >> 4) & 1) == 1) {
                    long c10 = b0Var.c((byte) 0, 0L, Long.MAX_VALUE);
                    if (c10 == -1) {
                        throw new EOFException();
                    }
                    if (z9) {
                        rVar = this;
                        rVar.f(gVar2, 0L, c10 + 1);
                    } else {
                        rVar = this;
                    }
                    b0Var.skip(c10 + 1);
                } else {
                    rVar = this;
                }
                if (z9) {
                    c(b0Var.s(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                rVar.f6671a = (byte) 1;
            }
            if (rVar.f6671a == 1) {
                long j8 = gVar.f6642b;
                long t7 = rVar.f6674d.t(gVar, j);
                if (t7 != -1) {
                    rVar.f(gVar, j8, t7);
                    return t7;
                }
                rVar.f6671a = (byte) 2;
            }
            if (rVar.f6671a == 2) {
                c(b0Var.f(), (int) crc32.getValue(), "CRC");
                c(b0Var.f(), (int) rVar.f6673c.getBytesWritten(), "ISIZE");
                rVar.f6671a = (byte) 3;
                if (!b0Var.h()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }
}
