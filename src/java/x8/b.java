package x8;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class b {
    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i9, int i10) {
        kotlin.jvm.internal.j.e(bArr, "a");
        kotlin.jvm.internal.j.e(bArr2, "b");
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11 + i] != bArr2[i11 + i9]) {
                return false;
            }
        }
        return true;
    }

    public static final a0 b(f0 f0Var) {
        kotlin.jvm.internal.j.e(f0Var, "<this>");
        return new a0(f0Var);
    }

    public static final b0 c(h0 h0Var) {
        kotlin.jvm.internal.j.e(h0Var, "<this>");
        return new b0(h0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [x8.h0, java.lang.Object, x8.g] */
    /* JADX WARN: Type inference failed for: r4v9, types: [x8.h0, java.lang.Object, x8.g] */
    public static void d(long j, g gVar, int i, ArrayList arrayList, int i9, int i10, ArrayList arrayList2) {
        int i11;
        int i12;
        ArrayList arrayList3;
        long j8;
        int i13;
        int i14 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i9 >= i10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i15 = i9; i15 < i10; i15++) {
            if (((j) arrayList4.get(i15)).d() < i14) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        j jVar = (j) arrayList.get(i9);
        j jVar2 = (j) arrayList4.get(i10 - 1);
        if (i14 == jVar.d()) {
            int intValue = ((Number) arrayList5.get(i9)).intValue();
            int i16 = i9 + 1;
            j jVar3 = (j) arrayList4.get(i16);
            i11 = i16;
            i12 = intValue;
            jVar = jVar3;
        } else {
            i11 = i9;
            i12 = -1;
        }
        if (jVar.i(i14) == jVar2.i(i14)) {
            int min = Math.min(jVar.d(), jVar2.d());
            int i17 = 0;
            for (int i18 = i14; i18 < min && jVar.i(i18) == jVar2.i(i18); i18++) {
                i17++;
            }
            long j9 = 4;
            long j10 = (gVar.f6642b / j9) + j + 2 + i17 + 1;
            gVar.P(-i17);
            gVar.P(i12);
            int i19 = i14 + i17;
            while (i14 < i19) {
                gVar.P(jVar.i(i14) & 255);
                i14++;
            }
            if (i11 + 1 == i10) {
                if (i19 != ((j) arrayList4.get(i11)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                gVar.P(((Number) arrayList5.get(i11)).intValue());
                return;
            }
            ?? obj = new Object();
            gVar.P(((int) ((obj.f6642b / j9) + j10)) * (-1));
            d(j10, obj, i19, arrayList4, i11, i10, arrayList5);
            gVar.L(obj);
            return;
        }
        int i20 = 1;
        for (int i21 = i11 + 1; i21 < i10; i21++) {
            if (((j) arrayList4.get(i21 - 1)).i(i14) != ((j) arrayList4.get(i21)).i(i14)) {
                i20++;
            }
        }
        long j11 = 4;
        long j12 = (gVar.f6642b / j11) + j + 2 + (i20 * 2);
        gVar.P(i20);
        gVar.P(i12);
        for (int i22 = i11; i22 < i10; i22++) {
            byte i23 = ((j) arrayList4.get(i22)).i(i14);
            if (i22 == i11 || i23 != ((j) arrayList4.get(i22 - 1)).i(i14)) {
                gVar.P(i23 & 255);
            }
        }
        ?? obj2 = new Object();
        int i24 = i11;
        while (i24 < i10) {
            byte i25 = ((j) arrayList4.get(i24)).i(i14);
            int i26 = i24 + 1;
            int i27 = i26;
            while (true) {
                if (i27 >= i10) {
                    i27 = i10;
                    break;
                } else if (i25 != ((j) arrayList4.get(i27)).i(i14)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i26 == i27 && i14 + 1 == ((j) arrayList4.get(i24)).d()) {
                gVar.P(((Number) arrayList5.get(i24)).intValue());
                arrayList3 = arrayList5;
                j8 = j12;
                i13 = i27;
            } else {
                gVar.P(((int) ((obj2.f6642b / j11) + j12)) * (-1));
                arrayList3 = arrayList5;
                j8 = j12;
                i13 = i27;
                d(j8, obj2, i14 + 1, arrayList, i24, i13, arrayList3);
                arrayList4 = arrayList;
            }
            j12 = j8;
            i24 = i13;
            arrayList5 = arrayList3;
        }
        gVar.L(obj2);
    }

    public static final void e(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0135, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, x8.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x8.x f(x8.j... r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.f(x8.j[]):x8.x");
    }

    public static final int g(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final String h(byte b10) {
        char[] cArr = y8.b.f6973a;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final String i(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = y8.b.f6973a;
        int i9 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i9 < 8 && cArr2[i9] == '0') {
            i9++;
        }
        if (i9 >= 0) {
            if (i9 <= 8) {
                return new String(cArr2, i9, 8 - i9);
            }
            throw new IllegalArgumentException(v1.a.i("startIndex: ", i9, 8, " > endIndex: "));
        }
        throw new IndexOutOfBoundsException("startIndex: " + i9 + ", endIndex: 8, size: 8");
    }
}
