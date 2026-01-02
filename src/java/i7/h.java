package i7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class h extends q4.b {
    public static List V(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }

    public static boolean W(Object[] objArr, Object obj) {
        int i;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i9 = 0; i9 < length2; i9++) {
                if (obj.equals(objArr[i9])) {
                    i = i9;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    public static void X(int i, int i9, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        kotlin.jvm.internal.j.e(iArr2, "destination");
        System.arraycopy(iArr, i9, iArr2, i, i10 - i9);
    }

    public static void Y(byte[] bArr, int i, byte[] bArr2, int i9, int i10) {
        kotlin.jvm.internal.j.e(bArr, "<this>");
        kotlin.jvm.internal.j.e(bArr2, "destination");
        System.arraycopy(bArr, i9, bArr2, i, i10 - i9);
    }

    public static void Z(Object[] objArr, int i, Object[] objArr2, int i9, int i10) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(objArr2, "destination");
        System.arraycopy(objArr, i9, objArr2, i, i10 - i9);
    }

    public static /* synthetic */ void a0(Object[] objArr, int i, Object[] objArr2, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        Z(objArr, 0, objArr2, i, i9);
    }

    public static byte[] b0(byte[] bArr, int i, int i9) {
        kotlin.jvm.internal.j.e(bArr, "<this>");
        q4.b.i(i9, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i9);
        kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] c0(Object[] objArr, int i, int i9) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        q4.b.i(i9, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i9);
        kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void d0(Object[] objArr, int i, int i9) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        Arrays.fill(objArr, i, i9, (Object) null);
    }

    public static ArrayList e0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object f0(int i, Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static String g0(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            c4.b.d(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public static List h0(long[] jArr) {
        kotlin.jvm.internal.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return a.a.G(Long.valueOf(jArr[0]));
        }
        return n.f2745a;
    }

    public static List i0(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new f(objArr, false)) : a.a.G(objArr[0]) : n.f2745a;
    }
}
