package x8;

import a1.n1;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public c0 f6641a;

    /* renamed from: b  reason: collision with root package name */
    public long f6642b;

    public final byte A(long j) {
        b.e(this.f6642b, j, 1L);
        c0 c0Var = this.f6641a;
        if (c0Var == null) {
            kotlin.jvm.internal.j.b((Object) null);
            throw null;
        }
        long j8 = this.f6642b;
        if (j8 - j < j) {
            while (j8 > j) {
                c0Var = c0Var.f6625g;
                kotlin.jvm.internal.j.b(c0Var);
                j8 -= c0Var.f6621c - c0Var.f6620b;
            }
            return c0Var.f6619a[(int) ((c0Var.f6620b + j) - j8)];
        }
        long j9 = 0;
        while (true) {
            int i = c0Var.f6621c;
            int i9 = c0Var.f6620b;
            long j10 = (i - i9) + j9;
            if (j10 > j) {
                return c0Var.f6619a[(int) ((i9 + j) - j9)];
            }
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
            j9 = j10;
        }
    }

    public final long B(byte b10, long j, long j8) {
        c0 c0Var;
        long j9 = 0;
        if (0 > j || j > j8) {
            throw new IllegalArgumentException(("size=" + this.f6642b + " fromIndex=" + j + " toIndex=" + j8).toString());
        }
        long j10 = this.f6642b;
        if (j8 > j10) {
            j8 = j10;
        }
        if (j == j8 || (c0Var = this.f6641a) == null) {
            return -1L;
        }
        if (j10 - j < j) {
            while (j10 > j) {
                c0Var = c0Var.f6625g;
                kotlin.jvm.internal.j.b(c0Var);
                j10 -= c0Var.f6621c - c0Var.f6620b;
            }
            while (j10 < j8) {
                byte[] bArr = c0Var.f6619a;
                int min = (int) Math.min(c0Var.f6621c, (c0Var.f6620b + j8) - j10);
                for (int i = (int) ((c0Var.f6620b + j) - j10); i < min; i++) {
                    if (bArr[i] == b10) {
                        return (i - c0Var.f6620b) + j10;
                    }
                }
                j10 += c0Var.f6621c - c0Var.f6620b;
                c0Var = c0Var.f6624f;
                kotlin.jvm.internal.j.b(c0Var);
                j = j10;
            }
            return -1L;
        }
        while (true) {
            long j11 = (c0Var.f6621c - c0Var.f6620b) + j9;
            if (j11 > j) {
                break;
            }
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
            j9 = j11;
        }
        while (j9 < j8) {
            byte[] bArr2 = c0Var.f6619a;
            int min2 = (int) Math.min(c0Var.f6621c, (c0Var.f6620b + j8) - j9);
            for (int i9 = (int) ((c0Var.f6620b + j) - j9); i9 < min2; i9++) {
                if (bArr2[i9] == b10) {
                    return (i9 - c0Var.f6620b) + j9;
                }
            }
            j9 += c0Var.f6621c - c0Var.f6620b;
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
            j = j9;
        }
        return -1L;
    }

    public final long C(j jVar) {
        int i;
        int i9;
        kotlin.jvm.internal.j.e(jVar, "targetBytes");
        c0 c0Var = this.f6641a;
        if (c0Var == null) {
            return -1L;
        }
        long j = this.f6642b;
        long j8 = 0;
        if (j < 0) {
            while (j > 0) {
                c0Var = c0Var.f6625g;
                kotlin.jvm.internal.j.b(c0Var);
                j -= c0Var.f6621c - c0Var.f6620b;
            }
            if (jVar.d() == 2) {
                byte i10 = jVar.i(0);
                byte i11 = jVar.i(1);
                while (j < this.f6642b) {
                    byte[] bArr = c0Var.f6619a;
                    i = (int) ((c0Var.f6620b + j8) - j);
                    int i12 = c0Var.f6621c;
                    while (i < i12) {
                        byte b10 = bArr[i];
                        if (b10 != i10 && b10 != i11) {
                            i++;
                        }
                        i9 = c0Var.f6620b;
                    }
                    j8 = (c0Var.f6621c - c0Var.f6620b) + j;
                    c0Var = c0Var.f6624f;
                    kotlin.jvm.internal.j.b(c0Var);
                    j = j8;
                }
                return -1L;
            }
            byte[] h9 = jVar.h();
            while (j < this.f6642b) {
                byte[] bArr2 = c0Var.f6619a;
                i = (int) ((c0Var.f6620b + j8) - j);
                int i13 = c0Var.f6621c;
                while (i < i13) {
                    byte b11 = bArr2[i];
                    for (byte b12 : h9) {
                        if (b11 == b12) {
                            i9 = c0Var.f6620b;
                        }
                    }
                    i++;
                }
                j8 = (c0Var.f6621c - c0Var.f6620b) + j;
                c0Var = c0Var.f6624f;
                kotlin.jvm.internal.j.b(c0Var);
                j = j8;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j9 = (c0Var.f6621c - c0Var.f6620b) + j;
            if (j9 > 0) {
                break;
            }
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
            j = j9;
        }
        if (jVar.d() == 2) {
            byte i14 = jVar.i(0);
            byte i15 = jVar.i(1);
            while (j < this.f6642b) {
                byte[] bArr3 = c0Var.f6619a;
                i = (int) ((c0Var.f6620b + j8) - j);
                int i16 = c0Var.f6621c;
                while (i < i16) {
                    byte b13 = bArr3[i];
                    if (b13 != i14 && b13 != i15) {
                        i++;
                    }
                    i9 = c0Var.f6620b;
                }
                j8 = (c0Var.f6621c - c0Var.f6620b) + j;
                c0Var = c0Var.f6624f;
                kotlin.jvm.internal.j.b(c0Var);
                j = j8;
            }
            return -1L;
        }
        byte[] h10 = jVar.h();
        while (j < this.f6642b) {
            byte[] bArr4 = c0Var.f6619a;
            i = (int) ((c0Var.f6620b + j8) - j);
            int i17 = c0Var.f6621c;
            while (i < i17) {
                byte b14 = bArr4[i];
                for (byte b15 : h10) {
                    if (b14 == b15) {
                        i9 = c0Var.f6620b;
                    }
                }
                i++;
            }
            j8 = (c0Var.f6621c - c0Var.f6620b) + j;
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
            j = j8;
        }
        return -1L;
        return (i - i9) + j;
    }

    public final byte[] D(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(v1.a.g(j, "byteCount: ").toString());
        }
        if (this.f6642b >= j) {
            byte[] bArr = new byte[(int) j];
            kotlin.jvm.internal.j.e(bArr, "sink");
            int i = 0;
            while (i < bArr.length) {
                int read = read(bArr, i, bArr.length - i);
                if (read == -1) {
                    throw new EOFException();
                }
                i += read;
            }
            return bArr;
        }
        throw new EOFException();
    }

    public final short E() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String F(long j, Charset charset) {
        kotlin.jvm.internal.j.e(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(v1.a.g(j, "byteCount: ").toString());
        }
        if (this.f6642b >= j) {
            if (i == 0) {
                return "";
            }
            c0 c0Var = this.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int i9 = c0Var.f6620b;
            if (i9 + j > c0Var.f6621c) {
                return new String(D(j), charset);
            }
            int i10 = (int) j;
            String str = new String(c0Var.f6619a, i9, i10, charset);
            int i11 = c0Var.f6620b + i10;
            c0Var.f6620b = i11;
            this.f6642b -= j;
            if (i11 == c0Var.f6621c) {
                this.f6641a = c0Var.a();
                d0.a(c0Var);
            }
            return str;
        }
        throw new EOFException();
    }

    public final String G() {
        return F(this.f6642b, b8.a.f766a);
    }

    public final int H() {
        int i;
        int i9;
        int i10;
        if (this.f6642b != 0) {
            byte A = A(0L);
            if ((A & 128) == 0) {
                i = A & Byte.MAX_VALUE;
                i10 = 0;
                i9 = 1;
            } else if ((A & 224) == 192) {
                i = A & 31;
                i9 = 2;
                i10 = 128;
            } else if ((A & 240) == 224) {
                i = A & 15;
                i9 = 3;
                i10 = 2048;
            } else if ((A & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i = A & 7;
                i9 = 4;
                i10 = 65536;
            }
            long j = i9;
            if (this.f6642b < j) {
                StringBuilder p8 = v1.a.p("size < ", i9, ": ");
                p8.append(this.f6642b);
                p8.append(" (to read code point prefixed 0x");
                p8.append(b.h(A));
                p8.append(')');
                throw new EOFException(p8.toString());
            }
            for (int i11 = 1; i11 < i9; i11++) {
                long j8 = i11;
                byte A2 = A(j8);
                if ((A2 & 192) != 128) {
                    skip(j8);
                    return 65533;
                }
                i = (i << 6) | (A2 & 63);
            }
            skip(j);
            if (i > 1114111) {
                return 65533;
            }
            if ((55296 > i || i >= 57344) && i >= i10) {
                return i;
            }
            return 65533;
        }
        throw new EOFException();
    }

    public final j I(int i) {
        if (i == 0) {
            return j.f6643d;
        }
        b.e(this.f6642b, 0L, i);
        c0 c0Var = this.f6641a;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            kotlin.jvm.internal.j.b(c0Var);
            int i12 = c0Var.f6621c;
            int i13 = c0Var.f6620b;
            if (i12 == i13) {
                throw new AssertionError("s.limit == s.pos");
            }
            i10 += i12 - i13;
            i11++;
            c0Var = c0Var.f6624f;
        }
        byte[][] bArr = new byte[i11];
        int[] iArr = new int[i11 * 2];
        c0 c0Var2 = this.f6641a;
        int i14 = 0;
        while (i9 < i) {
            kotlin.jvm.internal.j.b(c0Var2);
            bArr[i14] = c0Var2.f6619a;
            i9 += c0Var2.f6621c - c0Var2.f6620b;
            iArr[i14] = Math.min(i9, i);
            iArr[i14 + i11] = c0Var2.f6620b;
            c0Var2.f6622d = true;
            i14++;
            c0Var2 = c0Var2.f6624f;
        }
        return new e0(bArr, iArr);
    }

    public final c0 J(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        c0 c0Var = this.f6641a;
        if (c0Var == null) {
            c0 b10 = d0.b();
            this.f6641a = b10;
            b10.f6625g = b10;
            b10.f6624f = b10;
            return b10;
        }
        c0 c0Var2 = c0Var.f6625g;
        kotlin.jvm.internal.j.b(c0Var2);
        if (c0Var2.f6621c + i > 8192 || !c0Var2.f6623e) {
            c0 b11 = d0.b();
            c0Var2.b(b11);
            return b11;
        }
        return c0Var2;
    }

    public final void K(j jVar) {
        kotlin.jvm.internal.j.e(jVar, "byteString");
        jVar.s(this, jVar.d());
    }

    public final long L(h0 h0Var) {
        kotlin.jvm.internal.j.e(h0Var, "source");
        long j = 0;
        while (true) {
            long t7 = h0Var.t(this, 8192L);
            if (t7 == -1) {
                return j;
            }
            j += t7;
        }
    }

    public final void M(int i) {
        c0 J = J(1);
        byte[] bArr = J.f6619a;
        int i9 = J.f6621c;
        J.f6621c = i9 + 1;
        bArr[i9] = (byte) i;
        this.f6642b++;
    }

    public final void N(long j) {
        boolean z9;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            M(48);
            return;
        }
        if (i < 0) {
            j = -j;
            if (j < 0) {
                S("-9223372036854775808");
                return;
            }
            z9 = true;
        } else {
            z9 = false;
        }
        byte[] bArr = y8.a.f6971a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i9 = numberOfLeadingZeros + (j > y8.a.f6972b[numberOfLeadingZeros] ? 1 : 0);
        if (z9) {
            i9++;
        }
        c0 J = J(i9);
        byte[] bArr2 = J.f6619a;
        int i10 = J.f6621c + i9;
        while (j != 0) {
            long j8 = 10;
            i10--;
            bArr2[i10] = y8.a.f6971a[(int) (j % j8)];
            j /= j8;
        }
        if (z9) {
            bArr2[i10 - 1] = 45;
        }
        J.f6621c += i9;
        this.f6642b += i9;
    }

    public final void O(long j) {
        if (j == 0) {
            M(48);
            return;
        }
        long j8 = (j >>> 1) | j;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        c0 J = J(i);
        byte[] bArr = J.f6619a;
        int i9 = J.f6621c;
        for (int i10 = (i9 + i) - 1; i10 >= i9; i10--) {
            bArr[i10] = y8.a.f6971a[(int) (15 & j)];
            j >>>= 4;
        }
        J.f6621c += i;
        this.f6642b += i;
    }

    public final void P(int i) {
        c0 J = J(4);
        byte[] bArr = J.f6619a;
        int i9 = J.f6621c;
        bArr[i9] = (byte) ((i >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i & 255);
        J.f6621c = i9 + 4;
        this.f6642b += 4;
    }

    public final void Q(int i) {
        c0 J = J(2);
        byte[] bArr = J.f6619a;
        int i9 = J.f6621c;
        bArr[i9] = (byte) ((i >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i & 255);
        J.f6621c = i9 + 2;
        this.f6642b += 2;
    }

    public final void R(int i, int i9, String str) {
        char charAt;
        kotlin.jvm.internal.j.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(g2.g.c(i, "beginIndex < 0: ").toString());
        }
        if (i9 < i) {
            throw new IllegalArgumentException(v1.a.i("endIndex < beginIndex: ", i9, i, " < ").toString());
        }
        if (i9 > str.length()) {
            StringBuilder p8 = v1.a.p("endIndex > string.length: ", i9, " > ");
            p8.append(str.length());
            throw new IllegalArgumentException(p8.toString().toString());
        }
        while (i < i9) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                c0 J = J(1);
                byte[] bArr = J.f6619a;
                int i10 = J.f6621c - i;
                int min = Math.min(i9, 8192 - i10);
                int i11 = i + 1;
                bArr[i + i10] = (byte) charAt2;
                while (true) {
                    i = i11;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i11 = i + 1;
                    bArr[i + i10] = (byte) charAt;
                }
                int i12 = J.f6621c;
                int i13 = (i10 + i) - i12;
                J.f6621c = i12 + i13;
                this.f6642b += i13;
            } else {
                if (charAt2 < 2048) {
                    c0 J2 = J(2);
                    byte[] bArr2 = J2.f6619a;
                    int i14 = J2.f6621c;
                    bArr2[i14] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                    J2.f6621c = i14 + 2;
                    this.f6642b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    c0 J3 = J(3);
                    byte[] bArr3 = J3.f6619a;
                    int i15 = J3.f6621c;
                    bArr3[i15] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                    J3.f6621c = i15 + 3;
                    this.f6642b += 3;
                } else {
                    int i16 = i + 1;
                    char charAt3 = i16 < i9 ? str.charAt(i16) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        M(63);
                        i = i16;
                    } else {
                        int i17 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        c0 J4 = J(4);
                        byte[] bArr4 = J4.f6619a;
                        int i18 = J4.f6621c;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        J4.f6621c = i18 + 4;
                        this.f6642b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void S(String str) {
        kotlin.jvm.internal.j.e(str, "string");
        R(0, str.length(), str);
    }

    public final void T(int i) {
        if (i < 128) {
            M(i);
        } else if (i < 2048) {
            c0 J = J(2);
            byte[] bArr = J.f6619a;
            int i9 = J.f6621c;
            bArr[i9] = (byte) ((i >> 6) | 192);
            bArr[i9 + 1] = (byte) ((i & 63) | 128);
            J.f6621c = i9 + 2;
            this.f6642b += 2;
        } else if (55296 <= i && i < 57344) {
            M(63);
        } else if (i < 65536) {
            c0 J2 = J(3);
            byte[] bArr2 = J2.f6619a;
            int i10 = J2.f6621c;
            bArr2[i10] = (byte) ((i >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i & 63) | 128);
            J2.f6621c = i10 + 3;
            this.f6642b += 3;
        } else if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.i(i)));
        } else {
            c0 J3 = J(4);
            byte[] bArr3 = J3.f6619a;
            int i11 = J3.f6621c;
            bArr3[i11] = (byte) ((i >> 18) | 240);
            bArr3[i11 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i11 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i11 + 3] = (byte) ((i & 63) | 128);
            J3.f6621c = i11 + 4;
            this.f6642b += 4;
        }
    }

    @Override // x8.i
    public final g a() {
        return this;
    }

    @Override // x8.h0
    public final j0 b() {
        return j0.f6647d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, x8.f0
    public final void close() {
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h d(long j) {
        O(j);
        return this;
    }

    @Override // x8.i
    public final j e(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(v1.a.g(j, "byteCount: ").toString());
        }
        if (this.f6642b >= j) {
            if (j >= 4096) {
                j I = I((int) j);
                skip(j);
                return I;
            }
            return new j(D(j));
        }
        throw new EOFException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            long j = this.f6642b;
            g gVar = (g) obj;
            if (j != gVar.f6642b) {
                return false;
            }
            if (j == 0) {
                return true;
            }
            c0 c0Var = this.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            c0 c0Var2 = gVar.f6641a;
            kotlin.jvm.internal.j.b(c0Var2);
            int i = c0Var.f6620b;
            int i9 = c0Var2.f6620b;
            long j8 = 0;
            while (j8 < this.f6642b) {
                long min = Math.min(c0Var.f6621c - i, c0Var2.f6621c - i9);
                long j9 = 0;
                while (j9 < min) {
                    int i10 = i + 1;
                    int i11 = i9 + 1;
                    if (c0Var.f6619a[i] != c0Var2.f6619a[i9]) {
                        return false;
                    }
                    j9++;
                    i = i10;
                    i9 = i11;
                }
                if (i == c0Var.f6621c) {
                    c0Var = c0Var.f6624f;
                    kotlin.jvm.internal.j.b(c0Var);
                    i = c0Var.f6620b;
                }
                if (i9 == c0Var2.f6621c) {
                    c0Var2 = c0Var2.f6624f;
                    kotlin.jvm.internal.j.b(c0Var2);
                    i9 = c0Var2.f6620b;
                }
                j8 += min;
            }
            return true;
        }
        return false;
    }

    @Override // x8.h, x8.f0, java.io.Flushable
    public final void flush() {
    }

    @Override // x8.i
    public final String g() {
        return l(Long.MAX_VALUE);
    }

    @Override // x8.i
    public final boolean h() {
        return this.f6642b == 0;
    }

    public final int hashCode() {
        c0 c0Var = this.f6641a;
        if (c0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i9 = c0Var.f6621c;
            for (int i10 = c0Var.f6620b; i10 < i9; i10++) {
                i = (i * 31) + c0Var.f6619a[i10];
            }
            c0Var = c0Var.f6624f;
            kotlin.jvm.internal.j.b(c0Var);
        } while (c0Var != this.f6641a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h j(j jVar) {
        K(jVar);
        return this;
    }

    @Override // x8.f0
    public final void k(g gVar, long j) {
        c0 c0Var;
        c0 b10;
        kotlin.jvm.internal.j.e(gVar, "source");
        if (gVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.e(gVar.f6642b, 0L, j);
        while (j > 0) {
            c0 c0Var2 = gVar.f6641a;
            kotlin.jvm.internal.j.b(c0Var2);
            int i = c0Var2.f6621c;
            kotlin.jvm.internal.j.b(gVar.f6641a);
            int i9 = (j > (i - c0Var.f6620b) ? 1 : (j == (i - c0Var.f6620b) ? 0 : -1));
            int i10 = 0;
            if (i9 < 0) {
                c0 c0Var3 = this.f6641a;
                c0 c0Var4 = c0Var3 != null ? c0Var3.f6625g : null;
                if (c0Var4 != null && c0Var4.f6623e) {
                    if ((c0Var4.f6621c + j) - (c0Var4.f6622d ? 0 : c0Var4.f6620b) <= 8192) {
                        c0 c0Var5 = gVar.f6641a;
                        kotlin.jvm.internal.j.b(c0Var5);
                        c0Var5.d(c0Var4, (int) j);
                        gVar.f6642b -= j;
                        this.f6642b += j;
                        return;
                    }
                }
                c0 c0Var6 = gVar.f6641a;
                kotlin.jvm.internal.j.b(c0Var6);
                int i11 = (int) j;
                if (i11 <= 0 || i11 > c0Var6.f6621c - c0Var6.f6620b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    b10 = c0Var6.c();
                } else {
                    b10 = d0.b();
                    byte[] bArr = c0Var6.f6619a;
                    byte[] bArr2 = b10.f6619a;
                    int i12 = c0Var6.f6620b;
                    i7.h.Y(bArr, 0, bArr2, i12, i12 + i11);
                }
                b10.f6621c = b10.f6620b + i11;
                c0Var6.f6620b += i11;
                c0 c0Var7 = c0Var6.f6625g;
                kotlin.jvm.internal.j.b(c0Var7);
                c0Var7.b(b10);
                gVar.f6641a = b10;
            }
            c0 c0Var8 = gVar.f6641a;
            kotlin.jvm.internal.j.b(c0Var8);
            long j8 = c0Var8.f6621c - c0Var8.f6620b;
            gVar.f6641a = c0Var8.a();
            c0 c0Var9 = this.f6641a;
            if (c0Var9 == null) {
                this.f6641a = c0Var8;
                c0Var8.f6625g = c0Var8;
                c0Var8.f6624f = c0Var8;
            } else {
                c0 c0Var10 = c0Var9.f6625g;
                kotlin.jvm.internal.j.b(c0Var10);
                c0Var10.b(c0Var8);
                c0 c0Var11 = c0Var8.f6625g;
                if (c0Var11 == c0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.j.b(c0Var11);
                if (c0Var11.f6623e) {
                    int i13 = c0Var8.f6621c - c0Var8.f6620b;
                    c0 c0Var12 = c0Var8.f6625g;
                    kotlin.jvm.internal.j.b(c0Var12);
                    int i14 = 8192 - c0Var12.f6621c;
                    c0 c0Var13 = c0Var8.f6625g;
                    kotlin.jvm.internal.j.b(c0Var13);
                    if (!c0Var13.f6622d) {
                        c0 c0Var14 = c0Var8.f6625g;
                        kotlin.jvm.internal.j.b(c0Var14);
                        i10 = c0Var14.f6620b;
                    }
                    if (i13 <= i14 + i10) {
                        c0 c0Var15 = c0Var8.f6625g;
                        kotlin.jvm.internal.j.b(c0Var15);
                        c0Var8.d(c0Var15, i13);
                        c0Var8.a();
                        d0.a(c0Var8);
                    }
                }
            }
            gVar.f6642b -= j8;
            this.f6642b += j8;
            j -= j8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, x8.g] */
    @Override // x8.i
    public final String l(long j) {
        if (j >= 0) {
            long j8 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long B = B((byte) 10, 0L, j8);
            if (B != -1) {
                return y8.a.b(this, B);
            }
            if (j8 < this.f6642b && A(j8 - 1) == 13 && A(j8) == 10) {
                return y8.a.b(this, j8);
            }
            ?? obj = new Object();
            z(obj, 0L, Math.min(32, this.f6642b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f6642b, j) + " content=" + obj.e(obj.f6642b).e() + (char) 8230);
        }
        throw new IllegalArgumentException(v1.a.g(j, "limit < 0: ").toString());
    }

    @Override // x8.i
    public final int m(x xVar) {
        kotlin.jvm.internal.j.e(xVar, "options");
        int c9 = y8.a.c(this, xVar, false);
        if (c9 == -1) {
            return -1;
        }
        skip(xVar.f6686a[c9].d());
        return c9;
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h n(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    @Override // x8.i
    public final void o(long j) {
        if (this.f6642b < j) {
            throw new EOFException();
        }
    }

    @Override // x8.i
    public final long p(g gVar) {
        long j = this.f6642b;
        if (j > 0) {
            gVar.k(this, j);
        }
        return j;
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h q(String str) {
        S(str);
        return this;
    }

    @Override // x8.h
    public final OutputStream r() {
        return new n1(this, 1);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.j.e(byteBuffer, "sink");
        c0 c0Var = this.f6641a;
        if (c0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0Var.f6621c - c0Var.f6620b);
        byteBuffer.put(c0Var.f6619a, c0Var.f6620b, min);
        int i = c0Var.f6620b + min;
        c0Var.f6620b = i;
        this.f6642b -= min;
        if (i == c0Var.f6621c) {
            this.f6641a = c0Var.a();
            d0.a(c0Var);
        }
        return min;
    }

    @Override // x8.i
    public final byte readByte() {
        if (this.f6642b != 0) {
            c0 c0Var = this.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int i = c0Var.f6620b;
            int i9 = c0Var.f6621c;
            int i10 = i + 1;
            byte b10 = c0Var.f6619a[i];
            this.f6642b--;
            if (i10 != i9) {
                c0Var.f6620b = i10;
                return b10;
            }
            this.f6641a = c0Var.a();
            d0.a(c0Var);
            return b10;
        }
        throw new EOFException();
    }

    @Override // x8.i
    public final int readInt() {
        if (this.f6642b >= 4) {
            c0 c0Var = this.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int i = c0Var.f6620b;
            int i9 = c0Var.f6621c;
            if (i9 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c0Var.f6619a;
            int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i11 = i + 3;
            int i12 = i + 4;
            int i13 = (bArr[i11] & 255) | i10 | ((bArr[i + 2] & 255) << 8);
            this.f6642b -= 4;
            if (i12 != i9) {
                c0Var.f6620b = i12;
                return i13;
            }
            this.f6641a = c0Var.a();
            d0.a(c0Var);
            return i13;
        }
        throw new EOFException();
    }

    @Override // x8.i
    public final short readShort() {
        if (this.f6642b >= 2) {
            c0 c0Var = this.f6641a;
            kotlin.jvm.internal.j.b(c0Var);
            int i = c0Var.f6620b;
            int i9 = c0Var.f6621c;
            if (i9 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = c0Var.f6619a;
            int i10 = i + 1;
            int i11 = i + 2;
            int i12 = (bArr[i10] & 255) | ((bArr[i] & 255) << 8);
            this.f6642b -= 2;
            if (i11 == i9) {
                this.f6641a = c0Var.a();
                d0.a(c0Var);
            } else {
                c0Var.f6620b = i11;
            }
            return (short) i12;
        }
        throw new EOFException();
    }

    @Override // x8.i
    public final boolean request(long j) {
        return this.f6642b >= j;
    }

    public final void s() {
        skip(this.f6642b);
    }

    @Override // x8.i
    public final void skip(long j) {
        while (j > 0) {
            c0 c0Var = this.f6641a;
            if (c0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, c0Var.f6621c - c0Var.f6620b);
            long j8 = min;
            this.f6642b -= j8;
            j -= j8;
            int i = c0Var.f6620b + min;
            c0Var.f6620b = i;
            if (i == c0Var.f6621c) {
                this.f6641a = c0Var.a();
                d0.a(c0Var);
            }
        }
    }

    @Override // x8.h0
    public final long t(g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "sink");
        if (j >= 0) {
            long j8 = this.f6642b;
            if (j8 == 0) {
                return -1L;
            }
            if (j > j8) {
                j = j8;
            }
            gVar.k(this, j);
            return j;
        }
        throw new IllegalArgumentException(v1.a.g(j, "byteCount < 0: ").toString());
    }

    public final String toString() {
        long j = this.f6642b;
        if (j <= 2147483647L) {
            return I((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f6642b).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EDGE_INSN: B:41:0x008d->B:37:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, x8.g] */
    @Override // x8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            r14 = this;
            long r0 = r14.f6642b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            x8.c0 r6 = r14.f6641a
            kotlin.jvm.internal.j.b(r6)
            byte[] r7 = r6.f6619a
            int r8 = r6.f6620b
            int r9 = r6.f6621c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            x8.g r0 = new x8.g
            r0.<init>()
            r0.O(r4)
            r0.M(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.G()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = x8.b.h(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r8 != r9) goto L85
            x8.c0 r7 = r6.a()
            r14.f6641a = r7
            x8.d0.a(r6)
            goto L87
        L85:
            r6.f6620b = r8
        L87:
            if (r1 != 0) goto L8d
            x8.c0 r6 = r14.f6641a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.f6642b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f6642b = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.g.u():long");
    }

    @Override // x8.i
    public final String v(Charset charset) {
        kotlin.jvm.internal.j.e(charset, "charset");
        return F(this.f6642b, charset);
    }

    @Override // x8.i
    public final InputStream w() {
        return new f(this, 0);
    }

    @Override // x8.h
    public final h write(byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h writeByte(int i) {
        M(i);
        return this;
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h writeInt(int i) {
        P(i);
        return this;
    }

    @Override // x8.h
    public final /* bridge */ /* synthetic */ h writeShort(int i) {
        Q(i);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x8.g] */
    /* renamed from: x */
    public final g clone() {
        ?? obj = new Object();
        if (this.f6642b == 0) {
            return obj;
        }
        c0 c0Var = this.f6641a;
        kotlin.jvm.internal.j.b(c0Var);
        c0 c9 = c0Var.c();
        obj.f6641a = c9;
        c9.f6625g = c9;
        c9.f6624f = c9;
        for (c0 c0Var2 = c0Var.f6624f; c0Var2 != c0Var; c0Var2 = c0Var2.f6624f) {
            c0 c0Var3 = c9.f6625g;
            kotlin.jvm.internal.j.b(c0Var3);
            kotlin.jvm.internal.j.b(c0Var2);
            c0Var3.b(c0Var2.c());
        }
        obj.f6642b = this.f6642b;
        return obj;
    }

    public final long y() {
        long j = this.f6642b;
        if (j == 0) {
            return 0L;
        }
        c0 c0Var = this.f6641a;
        kotlin.jvm.internal.j.b(c0Var);
        c0 c0Var2 = c0Var.f6625g;
        kotlin.jvm.internal.j.b(c0Var2);
        int i = c0Var2.f6621c;
        return (i >= 8192 || !c0Var2.f6623e) ? j : j - (i - c0Var2.f6620b);
    }

    public final void z(g gVar, long j, long j8) {
        kotlin.jvm.internal.j.e(gVar, "out");
        long j9 = j;
        b.e(this.f6642b, j9, j8);
        if (j8 == 0) {
            return;
        }
        gVar.f6642b += j8;
        c0 c0Var = this.f6641a;
        while (true) {
            kotlin.jvm.internal.j.b(c0Var);
            long j10 = c0Var.f6621c - c0Var.f6620b;
            if (j9 < j10) {
                break;
            }
            j9 -= j10;
            c0Var = c0Var.f6624f;
        }
        c0 c0Var2 = c0Var;
        long j11 = j8;
        while (j11 > 0) {
            kotlin.jvm.internal.j.b(c0Var2);
            c0 c9 = c0Var2.c();
            int i = c9.f6620b + ((int) j9);
            c9.f6620b = i;
            c9.f6621c = Math.min(i + ((int) j11), c9.f6621c);
            c0 c0Var3 = gVar.f6641a;
            if (c0Var3 == null) {
                c9.f6625g = c9;
                c9.f6624f = c9;
                gVar.f6641a = c9;
            } else {
                c0 c0Var4 = c0Var3.f6625g;
                kotlin.jvm.internal.j.b(c0Var4);
                c0Var4.b(c9);
            }
            j11 -= c9.f6621c - c9.f6620b;
            c0Var2 = c0Var2.f6624f;
            j9 = 0;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.j.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            c0 J = J(1);
            int min = Math.min(i, 8192 - J.f6621c);
            byteBuffer.get(J.f6619a, J.f6621c, min);
            i -= min;
            J.f6621c += min;
        }
        this.f6642b += remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i, int i9) {
        kotlin.jvm.internal.j.e(bArr, "sink");
        b.e(bArr.length, i, i9);
        c0 c0Var = this.f6641a;
        if (c0Var == null) {
            return -1;
        }
        int min = Math.min(i9, c0Var.f6621c - c0Var.f6620b);
        byte[] bArr2 = c0Var.f6619a;
        int i10 = c0Var.f6620b;
        i7.h.Y(bArr2, i, bArr, i10, i10 + min);
        int i11 = c0Var.f6620b + min;
        c0Var.f6620b = i11;
        this.f6642b -= min;
        if (i11 == c0Var.f6621c) {
            this.f6641a = c0Var.a();
            d0.a(c0Var);
        }
        return min;
    }

    public final void write(byte[] bArr, int i, int i9) {
        kotlin.jvm.internal.j.e(bArr, "source");
        long j = i9;
        b.e(bArr.length, i, j);
        int i10 = i9 + i;
        while (i < i10) {
            c0 J = J(1);
            int min = Math.min(i10 - i, 8192 - J.f6621c);
            int i11 = i + min;
            i7.h.Y(bArr, J.f6621c, J.f6619a, i, i11);
            J.f6621c += min;
            i = i11;
        }
        this.f6642b += j;
    }
}
