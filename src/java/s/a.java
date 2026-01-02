package s;

import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5772a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f5773b = new Object[0];

    public static final int a(int i, int i9, int[] iArr) {
        j.e(iArr, "array");
        int i10 = i - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else if (i13 <= i9) {
                return i12;
            } else {
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final int b(long[] jArr, int i, long j) {
        j.e(jArr, "array");
        int i9 = i - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = (jArr[i11] > j ? 1 : (jArr[i11] == j ? 0 : -1));
            if (i12 < 0) {
                i10 = i11 + 1;
            } else if (i12 <= 0) {
                return i11;
            } else {
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final void c(String str) {
        j.e(str, "message");
        throw new IllegalArgumentException(str);
    }
}
