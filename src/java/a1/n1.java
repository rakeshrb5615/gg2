package a1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class n1 extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f158a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f159b;

    public /* synthetic */ n1(x8.h hVar, int i) {
        this.f158a = i;
        this.f159b = hVar;
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void i() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f158a) {
            case 0:
            case 1:
                return;
            default:
                ((x8.a0) this.f159b).close();
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f158a) {
            case 0:
                ((FileOutputStream) this.f159b).flush();
                return;
            case 1:
                return;
            default:
                x8.a0 a0Var = (x8.a0) this.f159b;
                if (a0Var.f6615c) {
                    return;
                }
                a0Var.flush();
                return;
        }
    }

    public String toString() {
        switch (this.f158a) {
            case 1:
                return ((x8.g) this.f159b) + ".outputStream()";
            case 2:
                return ((x8.a0) this.f159b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.f158a) {
            case 0:
                kotlin.jvm.internal.j.e(bArr, "b");
                ((FileOutputStream) this.f159b).write(bArr);
                return;
            default:
                super.write(bArr);
                return;
        }
    }

    public n1(FileOutputStream fileOutputStream) {
        this.f158a = 0;
        this.f159b = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f158a) {
            case 0:
                ((FileOutputStream) this.f159b).write(i);
                return;
            case 1:
                ((x8.g) this.f159b).M(i);
                return;
            default:
                x8.a0 a0Var = (x8.a0) this.f159b;
                if (!a0Var.f6615c) {
                    a0Var.f6614b.M((byte) i);
                    a0Var.c();
                    return;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i9) {
        switch (this.f158a) {
            case 0:
                kotlin.jvm.internal.j.e(bArr, "bytes");
                ((FileOutputStream) this.f159b).write(bArr, i, i9);
                return;
            case 1:
                kotlin.jvm.internal.j.e(bArr, "data");
                ((x8.g) this.f159b).write(bArr, i, i9);
                return;
            default:
                kotlin.jvm.internal.j.e(bArr, "data");
                x8.a0 a0Var = (x8.a0) this.f159b;
                if (!a0Var.f6615c) {
                    a0Var.f6614b.write(bArr, i, i9);
                    a0Var.c();
                    return;
                }
                throw new IOException("closed");
        }
    }
}
