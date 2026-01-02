package y8;

import java.io.IOException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import u7.p;
import x8.b0;
import x8.e0;
import x8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f6973a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6974b = new byte[0];

    public static final int a(char c9) {
        if ('0' > c9 || c9 >= ':') {
            if ('a' > c9 || c9 >= 'g') {
                if ('A' > c9 || c9 >= 'G') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c9);
                }
                return c9 - '7';
            }
            return c9 - 'W';
        }
        return c9 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
        if (r5.l(0, r8, r8.d()) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.LinkedHashMap b(java.util.ArrayList r26) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.b.b(java.util.ArrayList):java.util.LinkedHashMap");
    }

    public static final String c(int i) {
        a.a.j(16);
        String num = Integer.toString(i, 16);
        kotlin.jvm.internal.j.d(num, "toString(...)");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public static final j d(final b0 b0Var) {
        int f9 = b0Var.f();
        if (f9 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(f9));
        }
        b0Var.skip(4L);
        short s5 = b0Var.s();
        int i = s5 & 65535;
        if ((s5 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        int s9 = b0Var.s() & 65535;
        int s10 = b0Var.s() & 65535;
        int s11 = b0Var.s() & 65535;
        long f10 = b0Var.f() & 4294967295L;
        final ?? obj = new Object();
        ((q) obj).a = b0Var.f() & 4294967295L;
        final ?? obj2 = new Object();
        ((q) obj2).a = b0Var.f() & 4294967295L;
        int s12 = b0Var.s() & 65535;
        int s13 = 65535 & b0Var.s();
        b0Var.skip(8L);
        final ?? obj3 = new Object();
        ((q) obj3).a = b0Var.f() & 4294967295L;
        String x9 = b0Var.x(b0Var.s() & 65535);
        if (b8.i.r0(x9, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = ((q) obj2).a == 4294967295L ? 8 : 0L;
        if (((q) obj).a == 4294967295L) {
            j += 8;
        }
        if (((q) obj3).a == 4294967295L) {
            j += 8;
        }
        final ?? obj4 = new Object();
        final ?? obj5 = new Object();
        final ?? obj6 = new Object();
        final ?? obj7 = new Object();
        e(b0Var, s12, new p() { // from class: y8.l
            @Override // u7.p
            public final Object invoke(Object obj8, Object obj9) {
                int intValue = ((Integer) obj8).intValue();
                long longValue = ((Long) obj9).longValue();
                b0 b0Var2 = b0Var;
                if (intValue == 1) {
                    o oVar = obj7;
                    if (oVar.a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    oVar.a = true;
                    if (longValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    q qVar = obj2;
                    long j8 = qVar.a;
                    if (j8 == 4294967295L) {
                        j8 = b0Var2.i();
                    }
                    qVar.a = j8;
                    q qVar2 = obj;
                    qVar2.a = qVar2.a == 4294967295L ? b0Var2.i() : 0L;
                    q qVar3 = obj3;
                    qVar3.a = qVar3.a == 4294967295L ? b0Var2.i() : 0L;
                } else if (intValue == 10) {
                    if (longValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    b0Var2.skip(4L);
                    b.e(b0Var2, (int) (longValue - 4), new k(obj4, b0Var2, obj5, obj6));
                }
                return h7.l.f2236a;
            }
        });
        if (j <= 0 || ((o) obj7).a) {
            String x10 = b0Var.x(s13);
            String str = y.f6688b;
            return new j(a6.e.d("/").c(x9), b8.p.l0(x9, "/", false), x10, f10, ((q) obj).a, ((q) obj2).a, s9, ((q) obj3).a, s11, s10, (Long) ((r) obj4).a, (Long) ((r) obj5).a, (Long) ((r) obj6).a, 57344);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final void e(b0 b0Var, int i, p pVar) {
        x8.g gVar = b0Var.f6617b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int s5 = b0Var.s() & 65535;
            long s9 = b0Var.s() & 65535;
            long j8 = j - 4;
            if (j8 < s9) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            b0Var.o(s9);
            long j9 = gVar.f6642b;
            pVar.invoke(Integer.valueOf(s5), Long.valueOf(s9));
            long j10 = (gVar.f6642b + s9) - j9;
            int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i9 < 0) {
                throw new IOException(g2.g.c(s5, "unsupported zip: too many bytes processed for "));
            }
            if (i9 > 0) {
                gVar.skip(j10);
            }
            j = j8 - s9;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public static final j f(b0 b0Var, j jVar) {
        int f9 = b0Var.f();
        if (f9 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(f9));
        }
        b0Var.skip(2L);
        short s5 = b0Var.s();
        int i = s5 & 65535;
        if ((s5 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        b0Var.skip(18L);
        int s9 = b0Var.s() & 65535;
        b0Var.skip(b0Var.s() & 65535);
        if (jVar == null) {
            b0Var.skip(s9);
            return null;
        }
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        e(b0Var, s9, new k(b0Var, (r) obj, (r) obj2, (r) obj3));
        return new j(jVar.f6996a, jVar.f6997b, jVar.f6998c, jVar.f6999d, jVar.f7000e, jVar.f7001f, jVar.f7002g, jVar.f7003h, jVar.i, jVar.j, jVar.f7004k, jVar.f7005l, jVar.f7006m, (Integer) ((r) obj).a, (Integer) ((r) obj2).a, (Integer) ((r) obj3).a);
    }

    public static final int g(e0 e0Var, int i) {
        int i9;
        int[] iArr = e0Var.f6638f;
        int i10 = i + 1;
        int length = e0Var.f6637e.length;
        kotlin.jvm.internal.j.e(iArr, "<this>");
        int i11 = length - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= i11) {
                i9 = (i12 + i11) >>> 1;
                int i13 = iArr[i9];
                if (i13 >= i10) {
                    if (i13 <= i10) {
                        break;
                    }
                    i11 = i9 - 1;
                } else {
                    i12 = i9 + 1;
                }
            } else {
                i9 = (-i12) - 1;
                break;
            }
        }
        return i9 >= 0 ? i9 : ~i9;
    }
}
