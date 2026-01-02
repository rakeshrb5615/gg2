package i5;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class k implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final Logger f2719m = Logger.getLogger(k.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f2720a;

    /* renamed from: b  reason: collision with root package name */
    public int f2721b;

    /* renamed from: c  reason: collision with root package name */
    public int f2722c;

    /* renamed from: d  reason: collision with root package name */
    public h f2723d;

    /* renamed from: e  reason: collision with root package name */
    public h f2724e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f2725f;

    public k(File file) {
        byte[] bArr = new byte[16];
        this.f2725f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i9 = 0; i9 < 4; i9++) {
                    F(bArr2, i, iArr[i9]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f2720a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int y9 = y(0, bArr);
        this.f2721b = y9;
        if (y9 > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f2721b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f2722c = y(4, bArr);
        int y10 = y(8, bArr);
        int y11 = y(12, bArr);
        this.f2723d = x(y10);
        this.f2724e = x(y11);
    }

    public static void F(byte[] bArr, int i, int i9) {
        bArr[i] = (byte) (i9 >> 24);
        bArr[i + 1] = (byte) (i9 >> 16);
        bArr[i + 2] = (byte) (i9 >> 8);
        bArr[i + 3] = (byte) i9;
    }

    public static int y(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void A(int i, byte[] bArr, int i9, int i10) {
        int D = D(i);
        int i11 = D + i10;
        int i12 = this.f2721b;
        RandomAccessFile randomAccessFile = this.f2720a;
        if (i11 <= i12) {
            randomAccessFile.seek(D);
            randomAccessFile.readFully(bArr, i9, i10);
            return;
        }
        int i13 = i12 - D;
        randomAccessFile.seek(D);
        randomAccessFile.readFully(bArr, i9, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i9 + i13, i10 - i13);
    }

    public final void B(byte[] bArr, int i, int i9) {
        int D = D(i);
        int i10 = D + i9;
        int i11 = this.f2721b;
        RandomAccessFile randomAccessFile = this.f2720a;
        if (i10 <= i11) {
            randomAccessFile.seek(D);
            randomAccessFile.write(bArr, 0, i9);
            return;
        }
        int i12 = i11 - D;
        randomAccessFile.seek(D);
        randomAccessFile.write(bArr, 0, i12);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i12, i9 - i12);
    }

    public final int C() {
        if (this.f2722c == 0) {
            return 16;
        }
        h hVar = this.f2724e;
        int i = hVar.f2714a;
        int i9 = this.f2723d.f2714a;
        return i >= i9 ? (i - i9) + 4 + hVar.f2715b + 16 : (((i + 4) + hVar.f2715b) + this.f2721b) - i9;
    }

    public final int D(int i) {
        int i9 = this.f2721b;
        return i < i9 ? i : (i + 16) - i9;
    }

    public final void E(int i, int i9, int i10, int i11) {
        int[] iArr = {i, i9, i10, i11};
        int i12 = 0;
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f2725f;
            if (i12 >= 4) {
                RandomAccessFile randomAccessFile = this.f2720a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
            F(bArr, i13, iArr[i12]);
            i13 += 4;
            i12++;
        }
    }

    public final void c(byte[] bArr) {
        int D;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean s5 = s();
                    if (s5) {
                        D = 16;
                    } else {
                        h hVar = this.f2724e;
                        D = D(hVar.f2714a + 4 + hVar.f2715b);
                    }
                    h hVar2 = new h(D, length);
                    F(this.f2725f, 0, length);
                    B(this.f2725f, D, 4);
                    B(bArr, D + 4, length);
                    E(this.f2721b, this.f2722c + 1, s5 ? D : this.f2723d.f2714a, D);
                    this.f2724e = hVar2;
                    this.f2722c++;
                    if (s5) {
                        this.f2723d = hVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f2720a.close();
    }

    public final void f(int i) {
        int i9 = i + 4;
        int C = this.f2721b - C();
        if (C >= i9) {
            return;
        }
        int i10 = this.f2721b;
        do {
            C += i10;
            i10 <<= 1;
        } while (C < i9);
        RandomAccessFile randomAccessFile = this.f2720a;
        randomAccessFile.setLength(i10);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f2724e;
        int D = D(hVar.f2714a + 4 + hVar.f2715b);
        if (D < this.f2723d.f2714a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f2721b);
            long j = D - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i11 = this.f2724e.f2714a;
        int i12 = this.f2723d.f2714a;
        if (i11 < i12) {
            int i13 = (this.f2721b + i11) - 16;
            E(i10, this.f2722c, i12, i13);
            this.f2724e = new h(i13, this.f2724e.f2715b);
        } else {
            E(i10, this.f2722c, i12, i11);
        }
        this.f2721b = i10;
    }

    public final synchronized void i(j jVar) {
        int i = this.f2723d.f2714a;
        for (int i9 = 0; i9 < this.f2722c; i9++) {
            h x9 = x(i);
            jVar.b(new i(this, x9), x9.f2715b);
            i = D(x9.f2714a + 4 + x9.f2715b);
        }
    }

    public final synchronized boolean s() {
        return this.f2722c == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(k.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f2721b);
        sb.append(", size=");
        sb.append(this.f2722c);
        sb.append(", first=");
        sb.append(this.f2723d);
        sb.append(", last=");
        sb.append(this.f2724e);
        sb.append(", element lengths=[");
        try {
            i(new i2.m(sb));
        } catch (IOException e9) {
            f2719m.log(Level.WARNING, "read error", (Throwable) e9);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final h x(int i) {
        if (i == 0) {
            return h.f2713c;
        }
        RandomAccessFile randomAccessFile = this.f2720a;
        randomAccessFile.seek(i);
        return new h(i, randomAccessFile.readInt());
    }

    public final synchronized void z() {
        if (s()) {
            throw new NoSuchElementException();
        }
        if (this.f2722c == 1) {
            synchronized (this) {
                E(4096, 0, 0, 0);
                this.f2722c = 0;
                h hVar = h.f2713c;
                this.f2723d = hVar;
                this.f2724e = hVar;
                if (this.f2721b > 4096) {
                    RandomAccessFile randomAccessFile = this.f2720a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f2721b = 4096;
            }
        } else {
            h hVar2 = this.f2723d;
            int D = D(hVar2.f2714a + 4 + hVar2.f2715b);
            A(D, this.f2725f, 0, 4);
            int y9 = y(0, this.f2725f);
            E(this.f2721b, this.f2722c - 1, D, this.f2724e.f2714a);
            this.f2722c--;
            this.f2723d = new h(D, y9);
        }
    }
}
