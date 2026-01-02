package e7;

import d1.h;
import g2.g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.ResponseBody;
import u.e;
import v3.f;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final ResponseBody.BomAwareReader f1330a;

    /* renamed from: n  reason: collision with root package name */
    public long f1337n;

    /* renamed from: o  reason: collision with root package name */
    public int f1338o;

    /* renamed from: p  reason: collision with root package name */
    public String f1339p;
    public int[] q;

    /* renamed from: s  reason: collision with root package name */
    public String[] f1341s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f1342t;

    /* renamed from: u  reason: collision with root package name */
    public int f1343u = 2;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1331b = new char[1024];

    /* renamed from: c  reason: collision with root package name */
    public int f1332c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1333d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1334e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1335f = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f1336m = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1340r = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [v3.f, java.lang.Object] */
    static {
        f.f6186a = new Object();
    }

    public a(ResponseBody.BomAwareReader bomAwareReader) {
        int[] iArr = new int[32];
        this.q = iArr;
        iArr[0] = 6;
        this.f1341s = new String[32];
        this.f1342t = new int[32];
        this.f1330a = bomAwareReader;
    }

    public final String A(boolean z9) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i9 = this.f1340r;
            if (i >= i9) {
                return sb.toString();
            }
            int i10 = this.q[i];
            switch (i10) {
                case 1:
                case 2:
                    int i11 = this.f1342t[i];
                    if (z9 && i11 > 0 && i == i9 - 1) {
                        i11--;
                    }
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                    break;
                case h.INTEGER_FIELD_NUMBER /* 3 */:
                case 4:
                case h.STRING_FIELD_NUMBER /* 5 */:
                    sb.append('.');
                    String str = this.f1341s[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                default:
                    throw new AssertionError(g.c(i10, "Unknown scope value: "));
            }
            i++;
        }
    }

    public final boolean B() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean C(char c9) {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    public final String D() {
        return " at line " + (this.f1334e + 1) + " column " + ((this.f1332c - this.f1335f) + 1) + " path " + A(false);
    }

    public final boolean E() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i == 5) {
            this.f1336m = 0;
            int[] iArr = this.f1342t;
            int i9 = this.f1340r - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        } else if (i == 6) {
            this.f1336m = 0;
            int[] iArr2 = this.f1342t;
            int i10 = this.f1340r - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        } else {
            throw W("a boolean");
        }
    }

    public final double F() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            this.f1336m = 0;
            int[] iArr = this.f1342t;
            int i9 = this.f1340r - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f1337n;
        }
        if (i == 16) {
            this.f1339p = new String(this.f1331b, this.f1332c, this.f1338o);
            this.f1332c += this.f1338o;
        } else if (i == 8 || i == 9) {
            this.f1339p = L(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f1339p = N();
        } else if (i != 11) {
            throw W("a double");
        }
        this.f1336m = 11;
        double parseDouble = Double.parseDouble(this.f1339p);
        if (this.f1343u != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            V("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f1339p = null;
        this.f1336m = 0;
        int[] iArr2 = this.f1342t;
        int i10 = this.f1340r - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public final int G() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            long j = this.f1337n;
            int i9 = (int) j;
            if (j != i9) {
                throw new NumberFormatException("Expected an int but was " + this.f1337n + D());
            }
            this.f1336m = 0;
            int[] iArr = this.f1342t;
            int i10 = this.f1340r - 1;
            iArr[i10] = iArr[i10] + 1;
            return i9;
        }
        if (i == 16) {
            this.f1339p = new String(this.f1331b, this.f1332c, this.f1338o);
            this.f1332c += this.f1338o;
        } else if (i != 8 && i != 9 && i != 10) {
            throw W("an int");
        } else {
            if (i == 10) {
                this.f1339p = N();
            } else {
                this.f1339p = L(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f1339p);
                this.f1336m = 0;
                int[] iArr2 = this.f1342t;
                int i11 = this.f1340r - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1336m = 11;
        double parseDouble = Double.parseDouble(this.f1339p);
        int i12 = (int) parseDouble;
        if (i12 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f1339p + D());
        }
        this.f1339p = null;
        this.f1336m = 0;
        int[] iArr3 = this.f1342t;
        int i13 = this.f1340r - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public final long H() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            this.f1336m = 0;
            int[] iArr = this.f1342t;
            int i9 = this.f1340r - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.f1337n;
        }
        if (i == 16) {
            this.f1339p = new String(this.f1331b, this.f1332c, this.f1338o);
            this.f1332c += this.f1338o;
        } else if (i != 8 && i != 9 && i != 10) {
            throw W("a long");
        } else {
            if (i == 10) {
                this.f1339p = N();
            } else {
                this.f1339p = L(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f1339p);
                this.f1336m = 0;
                int[] iArr2 = this.f1342t;
                int i10 = this.f1340r - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1336m = 11;
        double parseDouble = Double.parseDouble(this.f1339p);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f1339p + D());
        }
        this.f1339p = null;
        this.f1336m = 0;
        int[] iArr3 = this.f1342t;
        int i11 = this.f1340r - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j;
    }

    public final String I() {
        String L;
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i == 14) {
            L = N();
        } else if (i == 12) {
            L = L('\'');
        } else if (i != 13) {
            throw W("a name");
        } else {
            L = L('\"');
        }
        this.f1336m = 0;
        this.f1341s[this.f1340r - 1] = L;
        return L;
    }

    public final int J(boolean z9) {
        char c9;
        int i = this.f1332c;
        int i9 = this.f1333d;
        while (true) {
            if (i == i9) {
                this.f1332c = i;
                if (!z(1)) {
                    if (z9) {
                        throw new EOFException("End of input" + D());
                    }
                    return -1;
                }
                i = this.f1332c;
                i9 = this.f1333d;
            }
            int i10 = i + 1;
            char[] cArr = this.f1331b;
            c9 = cArr[i];
            if (c9 == '\n') {
                this.f1334e++;
                this.f1335f = i10;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 == '/') {
                    this.f1332c = i10;
                    if (i10 == i9) {
                        this.f1332c = i;
                        boolean z10 = z(2);
                        this.f1332c++;
                        if (!z10) {
                            break;
                        }
                    }
                    i();
                    int i11 = this.f1332c;
                    char c10 = cArr[i11];
                    if (c10 == '*') {
                        this.f1332c = i11 + 1;
                        while (true) {
                            if (this.f1332c + 2 > this.f1333d && !z(2)) {
                                V("Unterminated comment");
                                throw null;
                            }
                            int i12 = this.f1332c;
                            if (cArr[i12] != '\n') {
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (cArr[this.f1332c + i13] != "*/".charAt(i13)) {
                                        break;
                                    }
                                }
                                i = this.f1332c + 2;
                                i9 = this.f1333d;
                                break;
                            }
                            this.f1334e++;
                            this.f1335f = i12 + 1;
                            this.f1332c++;
                        }
                    } else if (c10 != '/') {
                        break;
                    } else {
                        this.f1332c = i11 + 1;
                        S();
                        i = this.f1332c;
                        i9 = this.f1333d;
                    }
                } else if (c9 != '#') {
                    this.f1332c = i10;
                    return c9;
                } else {
                    this.f1332c = i10;
                    i();
                    S();
                    i = this.f1332c;
                    i9 = this.f1333d;
                }
            }
            i = i10;
        }
        return c9;
    }

    public final void K() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i != 7) {
            throw W("null");
        }
        this.f1336m = 0;
        int[] iArr = this.f1342t;
        int i9 = this.f1340r - 1;
        iArr[i9] = iArr[i9] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        r11.f1332c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        r1.append(r7, r3, r2 - r3);
        r11.f1332c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String L(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f1332c
            int r3 = r11.f1333d
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f1331b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f1343u
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.V(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f1332c = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f1332c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.Q()
            r1.append(r2)
            int r2 = r11.f1332c
            int r3 = r11.f1333d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f1334e
            int r2 = r2 + r6
            r11.f1334e = r2
            r11.f1335f = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f1332c = r2
            boolean r2 = r11.z(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.V(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.L(char):java.lang.String");
    }

    public final String M() {
        String str;
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i == 10) {
            str = N();
        } else if (i == 8) {
            str = L('\'');
        } else if (i == 9) {
            str = L('\"');
        } else if (i == 11) {
            str = this.f1339p;
            this.f1339p = null;
        } else if (i == 15) {
            str = Long.toString(this.f1337n);
        } else if (i != 16) {
            throw W("a string");
        } else {
            str = new String(this.f1331b, this.f1332c, this.f1338o);
            this.f1332c += this.f1338o;
        }
        this.f1336m = 0;
        int[] iArr = this.f1342t;
        int i9 = this.f1340r - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        i();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String N() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f1332c
            int r4 = r3 + r2
            int r5 = r7.f1333d
            char[] r6 = r7.f1331b
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.i()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.z(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f1332c
            r0.append(r6, r3, r2)
            int r3 = r7.f1332c
            int r3 = r3 + r2
            r7.f1332c = r3
            r2 = 1
            boolean r2 = r7.z(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f1332c
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f1332c
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f1332c
            int r2 = r2 + r1
            r7.f1332c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.N():java.lang.String");
    }

    public final int O() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                return 1;
            case 4:
                return 2;
            case h.STRING_FIELD_NUMBER /* 5 */:
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case h.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case h.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void P(int i) {
        int i9 = this.f1340r;
        if (i9 - 1 >= 255) {
            throw new IOException("Nesting limit 255 reached" + D());
        }
        int[] iArr = this.q;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.q = Arrays.copyOf(iArr, i10);
            this.f1342t = Arrays.copyOf(this.f1342t, i10);
            this.f1341s = (String[]) Arrays.copyOf(this.f1341s, i10);
        }
        int[] iArr2 = this.q;
        int i11 = this.f1340r;
        this.f1340r = i11 + 1;
        iArr2[i11] = i;
    }

    public final char Q() {
        int i;
        if (this.f1332c == this.f1333d && !z(1)) {
            V("Unterminated escape sequence");
            throw null;
        }
        int i9 = this.f1332c;
        int i10 = i9 + 1;
        this.f1332c = i10;
        char[] cArr = this.f1331b;
        char c9 = cArr[i9];
        if (c9 != '\n') {
            if (c9 != '\"') {
                if (c9 != '\'') {
                    if (c9 != '/' && c9 != '\\') {
                        if (c9 != 'b') {
                            if (c9 != 'f') {
                                if (c9 != 'n') {
                                    if (c9 != 'r') {
                                        if (c9 != 't') {
                                            if (c9 != 'u') {
                                                V("Invalid escape sequence");
                                                throw null;
                                            } else if (i9 + 5 > this.f1333d && !z(4)) {
                                                V("Unterminated escape sequence");
                                                throw null;
                                            } else {
                                                int i11 = this.f1332c;
                                                int i12 = i11 + 4;
                                                int i13 = 0;
                                                while (i11 < i12) {
                                                    char c10 = cArr[i11];
                                                    int i14 = i13 << 4;
                                                    if (c10 >= '0' && c10 <= '9') {
                                                        i = c10 - '0';
                                                    } else if (c10 >= 'a' && c10 <= 'f') {
                                                        i = c10 - 'W';
                                                    } else if (c10 < 'A' || c10 > 'F') {
                                                        V("Malformed Unicode escape \\u".concat(new String(cArr, this.f1332c, 4)));
                                                        throw null;
                                                    } else {
                                                        i = c10 - '7';
                                                    }
                                                    i13 = i + i14;
                                                    i11++;
                                                }
                                                this.f1332c += 4;
                                                return (char) i13;
                                            }
                                        }
                                        return '\t';
                                    }
                                    return '\r';
                                }
                                return '\n';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c9;
        } else if (this.f1343u == 3) {
            V("Cannot escape a newline character in strict mode");
            throw null;
        } else {
            this.f1334e++;
            this.f1335f = i10;
        }
        if (this.f1343u == 3) {
            V("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c9;
    }

    public final void R(char c9) {
        do {
            int i = this.f1332c;
            int i9 = this.f1333d;
            while (i < i9) {
                int i10 = i + 1;
                char c10 = this.f1331b[i];
                if (c10 == c9) {
                    this.f1332c = i10;
                    return;
                } else if (c10 == '\\') {
                    this.f1332c = i10;
                    Q();
                    i = this.f1332c;
                    i9 = this.f1333d;
                } else {
                    if (c10 == '\n') {
                        this.f1334e++;
                        this.f1335f = i10;
                    }
                    i = i10;
                }
            }
            this.f1332c = i;
        } while (z(1));
        V("Unterminated string");
        throw null;
    }

    public final void S() {
        char c9;
        do {
            if (this.f1332c >= this.f1333d && !z(1)) {
                return;
            }
            int i = this.f1332c;
            int i9 = i + 1;
            this.f1332c = i9;
            c9 = this.f1331b[i];
            if (c9 == '\n') {
                this.f1334e++;
                this.f1335f = i9;
                return;
            }
        } while (c9 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f1332c
            int r2 = r1 + r0
            int r3 = r4.f1333d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f1331b
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.i()
        L4b:
            int r1 = r4.f1332c
            int r1 = r1 + r0
            r4.f1332c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f1332c = r1
            r0 = 1
            boolean r0 = r4.z(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.T():void");
    }

    public final void U() {
        int i = 0;
        do {
            int i9 = this.f1336m;
            if (i9 == 0) {
                i9 = s();
            }
            switch (i9) {
                case 1:
                    P(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.f1341s[this.f1340r - 1] = null;
                    }
                    this.f1340r--;
                    i--;
                    break;
                case h.INTEGER_FIELD_NUMBER /* 3 */:
                    P(1);
                    i++;
                    break;
                case 4:
                    this.f1340r--;
                    i--;
                    break;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    R('\'');
                    break;
                case 9:
                    R('\"');
                    break;
                case 10:
                    T();
                    break;
                case 12:
                    R('\'');
                    if (i == 0) {
                        this.f1341s[this.f1340r - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    R('\"');
                    if (i == 0) {
                        this.f1341s[this.f1340r - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    T();
                    if (i == 0) {
                        this.f1341s[this.f1340r - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f1332c += this.f1338o;
                    break;
                case 17:
                    return;
            }
            this.f1336m = 0;
        } while (i > 0);
        int[] iArr = this.f1342t;
        int i10 = this.f1340r - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final void V(String str) {
        StringBuilder b10 = e.b(str);
        b10.append(D());
        b10.append("\nSee ");
        b10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(b10.toString());
    }

    public final IllegalStateException W(String str) {
        String str2 = O() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder q = v1.a.q("Expected ", str, " but was ");
        q.append(v1.a.z(O()));
        q.append(D());
        q.append("\nSee ");
        q.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(q.toString());
    }

    public final void c() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i != 3) {
            throw W("BEGIN_ARRAY");
        }
        P(1);
        this.f1342t[this.f1340r - 1] = 0;
        this.f1336m = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1336m = 0;
        this.q[0] = 8;
        this.f1340r = 1;
        this.f1330a.close();
    }

    public final void f() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i != 1) {
            throw W("BEGIN_OBJECT");
        }
        P(3);
        this.f1336m = 0;
    }

    public final void i() {
        if (this.f1343u == 1) {
            return;
        }
        V("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a9, code lost:
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
        if (C(r12) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x021b, code lost:
        if (r5 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x021d, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0223, code lost:
        if (r1 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0225, code lost:
        if (r17 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0228, code lost:
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x022c, code lost:
        if (r1 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x022e, code lost:
        if (r17 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0230, code lost:
        if (r17 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0233, code lost:
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0234, code lost:
        r24.f1337n = r1;
        r24.f1332c += r7;
        r9 = 15;
        r24.f1336m = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0240, code lost:
        if (r5 == r13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0243, code lost:
        if (r5 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0246, code lost:
        if (r5 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0248, code lost:
        r24.f1338o = r7;
        r9 = 16;
        r24.f1336m = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.s():int");
    }

    public final String toString() {
        return a.class.getSimpleName() + D();
    }

    public final void x() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i != 4) {
            throw W("END_ARRAY");
        }
        int i9 = this.f1340r;
        this.f1340r = i9 - 1;
        int[] iArr = this.f1342t;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f1336m = 0;
    }

    public final void y() {
        int i = this.f1336m;
        if (i == 0) {
            i = s();
        }
        if (i != 2) {
            throw W("END_OBJECT");
        }
        int i9 = this.f1340r;
        int i10 = i9 - 1;
        this.f1340r = i10;
        this.f1341s[i10] = null;
        int[] iArr = this.f1342t;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f1336m = 0;
    }

    public final boolean z(int i) {
        int i9;
        int i10;
        int i11 = this.f1335f;
        int i12 = this.f1332c;
        this.f1335f = i11 - i12;
        int i13 = this.f1333d;
        char[] cArr = this.f1331b;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f1333d = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f1333d = 0;
        }
        this.f1332c = 0;
        do {
            int i15 = this.f1333d;
            int read = this.f1330a.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i9 = this.f1333d + read;
            this.f1333d = i9;
            if (this.f1334e == 0 && (i10 = this.f1335f) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f1332c++;
                this.f1335f = i10 + 1;
                i++;
                continue;
            }
        } while (i9 < i);
        return true;
    }
}
