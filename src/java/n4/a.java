package n4;

import d1.h;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4855a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f4856b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4857c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4858d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4859e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i >= cArr.length) {
                this.f4855a = str;
                this.f4856b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int I = a.a.I(length);
                    this.f4857c = I;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(I);
                    this.f4858d = I >> numberOfTrailingZeros;
                    this.f4859e = bArr;
                    boolean[] zArr = new boolean[1 << (3 - numberOfTrailingZeros)];
                    for (int i9 = 0; i9 < this.f4858d; i9++) {
                        int i10 = i9 * 8;
                        int i11 = this.f4857c;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        roundingMode2.getClass();
                        if (i11 == 0) {
                            throw new ArithmeticException("/ by zero");
                        }
                        int i12 = i10 / i11;
                        int i13 = i10 - (i11 * i12);
                        if (i13 != 0) {
                            int i14 = ((i10 ^ i11) >> 31) | 1;
                            switch (o4.a.f5010a[roundingMode2.ordinal()]) {
                                case 1:
                                    if (i13 != 0) {
                                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                    }
                                    break;
                                case 2:
                                    break;
                                case h.INTEGER_FIELD_NUMBER /* 3 */:
                                    if (i14 >= 0) {
                                        break;
                                    }
                                    i12 += i14;
                                    break;
                                case 4:
                                    i12 += i14;
                                    break;
                                case h.STRING_FIELD_NUMBER /* 5 */:
                                    if (i14 <= 0) {
                                        break;
                                    }
                                    i12 += i14;
                                    break;
                                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                                case h.BYTES_FIELD_NUMBER /* 8 */:
                                    int abs = Math.abs(i13);
                                    int abs2 = abs - (Math.abs(i11) - abs);
                                    if (abs2 == 0) {
                                        RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                        RoundingMode roundingMode4 = RoundingMode.HALF_EVEN;
                                        break;
                                    } else {
                                        if (abs2 <= 0) {
                                            break;
                                        }
                                        i12 += i14;
                                        break;
                                    }
                                default:
                                    throw new AssertionError();
                            }
                        }
                        zArr[i12] = true;
                    }
                    return;
                } catch (ArithmeticException e9) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e9);
                }
            }
            char c9 = cArr[i];
            if (!(c9 < 128)) {
                throw new IllegalArgumentException(c4.b.L("Non-ASCII character: %s", Character.valueOf(c9)));
            }
            if (!(bArr[c9] == -1)) {
                throw new IllegalArgumentException(c4.b.L("Duplicate character: %s", Character.valueOf(c9)));
            }
            bArr[c9] = (byte) i;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && Arrays.equals(this.f4856b, ((a) obj).f4856b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4856b) + 1237;
    }

    public final String toString() {
        return this.f4855a;
    }
}
