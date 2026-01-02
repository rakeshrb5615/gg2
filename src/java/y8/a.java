package y8;

import x8.c0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f6971a;

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f6972b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(b8.a.f766a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        f6971a = bytes;
        f6972b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean a(c0 c0Var, int i, byte[] bArr, int i9, int i10) {
        int i11 = c0Var.f6621c;
        byte[] bArr2 = c0Var.f6619a;
        while (i9 < i10) {
            if (i == i11) {
                c0Var = c0Var.f6624f;
                kotlin.jvm.internal.j.b(c0Var);
                byte[] bArr3 = c0Var.f6619a;
                bArr2 = bArr3;
                i = c0Var.f6620b;
                i11 = c0Var.f6621c;
            }
            if (bArr2[i] != bArr[i9]) {
                return false;
            }
            i++;
            i9++;
        }
        return true;
    }

    public static final String b(x8.g gVar, long j) {
        if (j > 0) {
            long j8 = j - 1;
            if (gVar.A(j8) == 13) {
                String F = gVar.F(j8, b8.a.f766a);
                gVar.skip(2L);
                return F;
            }
        }
        String F2 = gVar.F(j, b8.a.f766a);
        gVar.skip(1L);
        return F2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r18 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(x8.g r16, x8.x r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.a.c(x8.g, x8.x, boolean):int");
    }
}
