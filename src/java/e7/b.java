package e7;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import w6.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class b implements Closeable, Flushable {

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f1344r = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f1345s = new String[128];

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f1346t;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f1347a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f1348b;

    /* renamed from: c  reason: collision with root package name */
    public int f1349c;

    /* renamed from: d  reason: collision with root package name */
    public i f1350d;

    /* renamed from: e  reason: collision with root package name */
    public String f1351e;

    /* renamed from: f  reason: collision with root package name */
    public String f1352f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1353m;

    /* renamed from: n  reason: collision with root package name */
    public int f1354n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1355o;

    /* renamed from: p  reason: collision with root package name */
    public String f1356p;
    public boolean q;

    static {
        for (int i = 0; i <= 31; i++) {
            f1345s[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f1345s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1346t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f1348b = iArr;
        this.f1349c = 0;
        if (iArr.length == 0) {
            this.f1348b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f1348b;
        int i = this.f1349c;
        this.f1349c = i + 1;
        iArr2[i] = 6;
        this.f1354n = 2;
        this.q = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1347a = writer;
        D(i.f6460d);
    }

    public final void A() {
        if (this.f1353m) {
            return;
        }
        String str = this.f1350d.f6461a;
        Writer writer = this.f1347a;
        writer.write(str);
        int i = this.f1349c;
        for (int i9 = 1; i9 < i; i9++) {
            writer.write(this.f1350d.f6462b);
        }
    }

    public b B() {
        if (this.f1356p != null) {
            if (!this.q) {
                this.f1356p = null;
                return this;
            }
            K();
        }
        c();
        this.f1347a.write("null");
        return this;
    }

    public final int C() {
        int i = this.f1349c;
        if (i != 0) {
            return this.f1348b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void D(i iVar) {
        Objects.requireNonNull(iVar);
        this.f1350d = iVar;
        this.f1352f = ",";
        if (iVar.f6463c) {
            this.f1351e = ": ";
            if (iVar.f6461a.isEmpty()) {
                this.f1352f = ", ";
            }
        } else {
            this.f1351e = ":";
        }
        this.f1353m = this.f1350d.f6461a.isEmpty() && this.f1350d.f6462b.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f1355o
            if (r0 == 0) goto L7
            java.lang.String[] r0 = e7.b.f1346t
            goto L9
        L7:
            java.lang.String[] r0 = e7.b.f1345s
        L9:
            java.io.Writer r1 = r8.f1347a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.b.E(java.lang.String):void");
    }

    public void F(double d9) {
        K();
        if (this.f1354n == 1 || !(Double.isNaN(d9) || Double.isInfinite(d9))) {
            c();
            this.f1347a.append((CharSequence) Double.toString(d9));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d9);
    }

    public void G(long j) {
        K();
        c();
        this.f1347a.write(Long.toString(j));
    }

    public void H(Number number) {
        if (number == null) {
            B();
            return;
        }
        K();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.f1354n != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                }
            } else if (cls != Float.class && cls != Double.class && !f1344r.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        }
        c();
        this.f1347a.append((CharSequence) obj);
    }

    public void I(String str) {
        if (str == null) {
            B();
            return;
        }
        K();
        c();
        E(str);
    }

    public void J(boolean z9) {
        K();
        c();
        this.f1347a.write(z9 ? "true" : "false");
    }

    public final void K() {
        if (this.f1356p != null) {
            int C = C();
            if (C == 5) {
                this.f1347a.write(this.f1352f);
            } else if (C != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            A();
            this.f1348b[this.f1349c - 1] = 4;
            E(this.f1356p);
            this.f1356p = null;
        }
    }

    public final void c() {
        int C = C();
        if (C == 1) {
            this.f1348b[this.f1349c - 1] = 2;
            A();
            return;
        }
        Writer writer = this.f1347a;
        if (C == 2) {
            writer.append((CharSequence) this.f1352f);
            A();
        } else if (C == 4) {
            writer.append((CharSequence) this.f1351e);
            this.f1348b[this.f1349c - 1] = 5;
        } else {
            if (C != 6) {
                if (C != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f1354n != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f1348b[this.f1349c - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1347a.close();
        int i = this.f1349c;
        if (i > 1 || (i == 1 && this.f1348b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1349c = 0;
    }

    public void f() {
        K();
        c();
        int i = this.f1349c;
        int[] iArr = this.f1348b;
        if (i == iArr.length) {
            this.f1348b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f1348b;
        int i9 = this.f1349c;
        this.f1349c = i9 + 1;
        iArr2[i9] = 1;
        this.f1347a.write(91);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f1349c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1347a.flush();
    }

    public void i() {
        K();
        c();
        int i = this.f1349c;
        int[] iArr = this.f1348b;
        if (i == iArr.length) {
            this.f1348b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f1348b;
        int i9 = this.f1349c;
        this.f1349c = i9 + 1;
        iArr2[i9] = 3;
        this.f1347a.write(123);
    }

    public final void s(int i, int i9, char c9) {
        int C = C();
        if (C != i9 && C != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1356p != null) {
            throw new IllegalStateException("Dangling name: " + this.f1356p);
        }
        this.f1349c--;
        if (C == i9) {
            A();
        }
        this.f1347a.write(c9);
    }

    public void x() {
        s(1, 2, ']');
    }

    public void y() {
        s(3, 5, '}');
    }

    public void z(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1356p != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int C = C();
        if (C != 3 && C != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f1356p = str;
    }
}
