package x8;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e0 extends j {

    /* renamed from: e  reason: collision with root package name */
    public final transient byte[][] f6637e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int[] f6638f;

    public e0(byte[][] bArr, int[] iArr) {
        super(j.f6643d.f6644a);
        this.f6637e = bArr;
        this.f6638f = iArr;
    }

    @Override // x8.j
    public final String a() {
        throw null;
    }

    @Override // x8.j
    public final j c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f6637e;
        int length = bArr.length;
        int i = 0;
        int i9 = 0;
        while (i < length) {
            int[] iArr = this.f6638f;
            int i10 = iArr[length + i];
            int i11 = iArr[i];
            messageDigest.update(bArr[i], i10, i11 - i9);
            i++;
            i9 = i11;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.j.b(digest);
        return new j(digest);
    }

    @Override // x8.j
    public final int d() {
        return this.f6638f[this.f6637e.length - 1];
    }

    @Override // x8.j
    public final String e() {
        return u().e();
    }

    @Override // x8.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.d() == d() && l(0, jVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.j
    public final int f(int i, byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "other");
        return u().f(i, bArr);
    }

    @Override // x8.j
    public final byte[] h() {
        return t();
    }

    @Override // x8.j
    public final int hashCode() {
        int i = this.f6645b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f6637e;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            int[] iArr = this.f6638f;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            byte[] bArr2 = bArr[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr2[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        this.f6645b = i10;
        return i10;
    }

    @Override // x8.j
    public final byte i(int i) {
        byte[][] bArr = this.f6637e;
        int[] iArr = this.f6638f;
        b.e(iArr[bArr.length - 1], i, 1L);
        int g3 = y8.b.g(this, i);
        return bArr[g3][(i - (g3 == 0 ? 0 : iArr[g3 - 1])) + iArr[bArr.length + g3]];
    }

    @Override // x8.j
    public final int j(byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "other");
        return u().j(bArr);
    }

    @Override // x8.j
    public final boolean l(int i, j jVar, int i9) {
        kotlin.jvm.internal.j.e(jVar, "other");
        if (i >= 0 && i <= d() - i9) {
            int i10 = i9 + i;
            int g3 = y8.b.g(this, i);
            int i11 = 0;
            while (i < i10) {
                int[] iArr = this.f6638f;
                int i12 = g3 == 0 ? 0 : iArr[g3 - 1];
                byte[][] bArr = this.f6637e;
                int i13 = iArr[bArr.length + g3];
                int min = Math.min(i10, (iArr[g3] - i12) + i12) - i;
                if (jVar.m(i11, bArr[g3], (i - i12) + i13, min)) {
                    i11 += min;
                    i += min;
                    g3++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // x8.j
    public final boolean m(int i, byte[] bArr, int i9, int i10) {
        kotlin.jvm.internal.j.e(bArr, "other");
        if (i < 0 || i > d() - i10 || i9 < 0 || i9 > bArr.length - i10) {
            return false;
        }
        int i11 = i10 + i;
        int g3 = y8.b.g(this, i);
        while (i < i11) {
            int[] iArr = this.f6638f;
            int i12 = g3 == 0 ? 0 : iArr[g3 - 1];
            byte[][] bArr2 = this.f6637e;
            int i13 = iArr[bArr2.length + g3];
            int min = Math.min(i11, (iArr[g3] - i12) + i12) - i;
            if (!b.a(bArr2[g3], (i - i12) + i13, bArr, i9, min)) {
                return false;
            }
            i9 += min;
            i += min;
            g3++;
        }
        return true;
    }

    @Override // x8.j
    public final String n(Charset charset) {
        kotlin.jvm.internal.j.e(charset, "charset");
        return u().n(charset);
    }

    @Override // x8.j
    public final j o(int i, int i9) {
        if (i9 == -1234567890) {
            i9 = d();
        }
        if (i >= 0) {
            if (i9 > d()) {
                StringBuilder p8 = v1.a.p("endIndex=", i9, " > length(");
                p8.append(d());
                p8.append(')');
                throw new IllegalArgumentException(p8.toString().toString());
            }
            int i10 = i9 - i;
            if (i10 >= 0) {
                if (i == 0 && i9 == d()) {
                    return this;
                }
                if (i == i9) {
                    return j.f6643d;
                }
                int g3 = y8.b.g(this, i);
                int g4 = y8.b.g(this, i9 - 1);
                byte[][] bArr = this.f6637e;
                byte[][] bArr2 = (byte[][]) i7.h.c0(bArr, g3, g4 + 1);
                int[] iArr = new int[bArr2.length * 2];
                int[] iArr2 = this.f6638f;
                if (g3 <= g4) {
                    int i11 = g3;
                    int i12 = 0;
                    while (true) {
                        iArr[i12] = Math.min(iArr2[i11] - i, i10);
                        int i13 = i12 + 1;
                        iArr[i12 + bArr2.length] = iArr2[bArr.length + i11];
                        if (i11 == g4) {
                            break;
                        }
                        i11++;
                        i12 = i13;
                    }
                }
                int i14 = g3 != 0 ? iArr2[g3 - 1] : 0;
                int length = bArr2.length;
                iArr[length] = (i - i14) + iArr[length];
                return new e0(bArr2, iArr);
            }
            throw new IllegalArgumentException(v1.a.i("endIndex=", i9, i, " < beginIndex=").toString());
        }
        throw new IllegalArgumentException(v1.a.j("beginIndex=", i, " < 0").toString());
    }

    @Override // x8.j
    public final j q() {
        return u().q();
    }

    @Override // x8.j
    public final void s(g gVar, int i) {
        int g3 = y8.b.g(this, 0);
        int i9 = 0;
        while (i9 < i) {
            int[] iArr = this.f6638f;
            int i10 = g3 == 0 ? 0 : iArr[g3 - 1];
            byte[][] bArr = this.f6637e;
            int i11 = iArr[bArr.length + g3];
            int min = Math.min(i, (iArr[g3] - i10) + i10) - i9;
            int i12 = (i9 - i10) + i11;
            c0 c0Var = new c0(bArr[g3], i12, i12 + min, true, false);
            c0 c0Var2 = gVar.f6641a;
            if (c0Var2 == null) {
                c0Var.f6625g = c0Var;
                c0Var.f6624f = c0Var;
                gVar.f6641a = c0Var;
            } else {
                c0 c0Var3 = c0Var2.f6625g;
                kotlin.jvm.internal.j.b(c0Var3);
                c0Var3.b(c0Var);
            }
            i9 += min;
            g3++;
        }
        gVar.f6642b += i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f6637e;
        int length = bArr2.length;
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        while (i < length) {
            int[] iArr = this.f6638f;
            int i11 = iArr[length + i];
            int i12 = iArr[i];
            int i13 = i12 - i9;
            i7.h.Y(bArr2[i], i10, bArr, i11, i11 + i13);
            i10 += i13;
            i++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // x8.j
    public final String toString() {
        return u().toString();
    }

    public final j u() {
        return new j(t());
    }
}
