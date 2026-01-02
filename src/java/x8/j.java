package x8;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class j implements Serializable, Comparable {

    /* renamed from: d  reason: collision with root package name */
    public static final j f6643d = new j(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f6644a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f6645b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f6646c;

    public j(byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "data");
        this.f6644a = bArr;
    }

    public static int g(j jVar, j jVar2) {
        jVar.getClass();
        kotlin.jvm.internal.j.e(jVar2, "other");
        return jVar.f(0, jVar2.h());
    }

    public static int k(j jVar, j jVar2) {
        jVar.getClass();
        kotlin.jvm.internal.j.e(jVar2, "other");
        return jVar.j(jVar2.h());
    }

    public static /* synthetic */ j p(j jVar, int i, int i9, int i10) {
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = -1234567890;
        }
        return jVar.o(i, i9);
    }

    public String a() {
        byte[] bArr = a.f6612a;
        byte[] bArr2 = this.f6644a;
        kotlin.jvm.internal.j.e(bArr2, "<this>");
        kotlin.jvm.internal.j.e(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i9 = 0;
        while (i < length) {
            byte b10 = bArr2[i];
            int i10 = i + 2;
            byte b11 = bArr2[i + 1];
            i += 3;
            byte b12 = bArr2[i10];
            bArr3[i9] = bArr[(b10 & 255) >> 2];
            bArr3[i9 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr3[i9 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i9 += 4;
            bArr3[i11] = bArr[b12 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b13 = bArr2[i];
            bArr3[i9] = bArr[(b13 & 255) >> 2];
            bArr3[i9 + 1] = bArr[(b13 & 3) << 4];
            bArr3[i9 + 2] = 61;
            bArr3[i9 + 3] = 61;
        } else if (length2 == 2) {
            int i12 = i + 1;
            byte b14 = bArr2[i];
            byte b15 = bArr2[i12];
            bArr3[i9] = bArr[(b14 & 255) >> 2];
            bArr3[i9 + 1] = bArr[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i9 + 2] = bArr[(b15 & 15) << 2];
            bArr3[i9 + 3] = 61;
        }
        return new String(bArr3, b8.a.f766a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(j jVar) {
        kotlin.jvm.internal.j.e(jVar, "other");
        int d9 = d();
        int d10 = jVar.d();
        int min = Math.min(d9, d10);
        for (int i = 0; i < min; i++) {
            int i9 = i(i) & 255;
            int i10 = jVar.i(i) & 255;
            if (i9 != i10) {
                return i9 < i10 ? -1 : 1;
            }
        }
        if (d9 == d10) {
            return 0;
        }
        return d9 < d10 ? -1 : 1;
    }

    public j c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f6644a, 0, d());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.j.b(digest);
        return new j(digest);
    }

    public int d() {
        return this.f6644a.length;
    }

    public String e() {
        byte[] bArr = this.f6644a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b10 : bArr) {
            int i9 = i + 1;
            char[] cArr2 = y8.b.f6973a;
            cArr[i] = cArr2[(b10 >> 4) & 15];
            i += 2;
            cArr[i9] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int d9 = jVar.d();
            byte[] bArr = this.f6644a;
            if (d9 == bArr.length && jVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i, byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "other");
        byte[] bArr2 = this.f6644a;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!b.a(bArr2, max, bArr, 0, bArr.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f6644a;
    }

    public int hashCode() {
        int i = this.f6645b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f6644a);
        this.f6645b = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.f6644a[i];
    }

    public int j(byte[] bArr) {
        kotlin.jvm.internal.j.e(bArr, "other");
        int d9 = d();
        byte[] bArr2 = this.f6644a;
        for (int min = Math.min(d9, bArr2.length - bArr.length); -1 < min; min--) {
            if (b.a(bArr2, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, j jVar, int i9) {
        kotlin.jvm.internal.j.e(jVar, "other");
        return jVar.m(0, this.f6644a, i, i9);
    }

    public boolean m(int i, byte[] bArr, int i9, int i10) {
        kotlin.jvm.internal.j.e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f6644a;
            return i <= bArr2.length - i10 && i9 >= 0 && i9 <= bArr.length - i10 && b.a(bArr2, i, bArr, i9, i10);
        }
        return false;
    }

    public String n(Charset charset) {
        kotlin.jvm.internal.j.e(charset, "charset");
        return new String(this.f6644a, charset);
    }

    public j o(int i, int i9) {
        if (i9 == -1234567890) {
            i9 = d();
        }
        if (i >= 0) {
            byte[] bArr = this.f6644a;
            if (i9 <= bArr.length) {
                if (i9 - i >= 0) {
                    return (i == 0 && i9 == bArr.length) ? this : new j(i7.h.b0(bArr, i, i9));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public j q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f6644a;
            if (i >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i];
            if (b10 >= 65 && b10 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                copyOf[i] = (byte) (b10 + 32);
                for (int i9 = i + 1; i9 < copyOf.length; i9++) {
                    byte b11 = copyOf[i9];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i9] = (byte) (b11 + 32);
                    }
                }
                return new j(copyOf);
            }
            i++;
        }
    }

    public final String r() {
        String str = this.f6646c;
        if (str == null) {
            byte[] h9 = h();
            kotlin.jvm.internal.j.e(h9, "<this>");
            String str2 = new String(h9, b8.a.f766a);
            this.f6646c = str2;
            return str2;
        }
        return str;
    }

    public void s(g gVar, int i) {
        gVar.write(this.f6644a, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0134, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0140, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x016c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0173, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x017a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01aa, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01ad, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01b0, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01b3, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0085, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0096, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00fe, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.j.toString():java.lang.String");
    }
}
