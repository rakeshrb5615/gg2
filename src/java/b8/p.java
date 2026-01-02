package b8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class p extends o {
    public static boolean l0(String str, String str2, boolean z9) {
        kotlin.jvm.internal.j.e(str, "<this>");
        return !z9 ? str.endsWith(str2) : m0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean m0(int i, int i9, int i10, String str, String str2, boolean z9) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(str2, "other");
        return !z9 ? str.regionMatches(i, str2, i9, i10) : str.regionMatches(z9, i, str2, i9, i10);
    }

    public static String n0(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(str3, "newValue");
        int u02 = i.u0(str, str2, 0, false);
        if (u02 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i9 = 0;
            do {
                sb.append((CharSequence) str, i9, u02);
                sb.append(str3);
                i9 = u02 + length;
                if (u02 >= str.length()) {
                    break;
                }
                u02 = i.u0(str, str2, u02 + i, false);
            } while (u02 > 0);
            sb.append((CharSequence) str, i9, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.j.d(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static boolean o0(String str, String str2, int i, boolean z9) {
        kotlin.jvm.internal.j.e(str, "<this>");
        return !z9 ? str.startsWith(str2, i) : m0(i, 0, str2.length(), str, str2, z9);
    }

    public static boolean p0(String str, String str2) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static Integer q0(String str) {
        boolean z9;
        int i;
        int i9;
        kotlin.jvm.internal.j.e(str, "<this>");
        a.a.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        int i11 = -2147483647;
        if (kotlin.jvm.internal.j.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z9 = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i11 = Integer.MIN_VALUE;
                z9 = true;
            }
        } else {
            z9 = false;
            i = 0;
        }
        int i12 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / 10))) || (i9 = i10 * 10) < i11 + digit) {
                return null;
            }
            i10 = i9 - digit;
            i++;
        }
        return z9 ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }
}
