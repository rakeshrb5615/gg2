package b8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class i extends p {
    public static int A0(String str, String str2) {
        int t02 = t0(str);
        kotlin.jvm.internal.j.e(str, "<this>");
        return str.lastIndexOf(str2, t02);
    }

    public static String B0(int i, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                sb.append((CharSequence) str);
                int length = i - str.length();
                int i9 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(' ');
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                    }
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(v1.a.j("Desired length ", i, " is less than zero."));
    }

    public static String C0(int i, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i9 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(v1.a.j("Desired length ", i, " is less than zero."));
    }

    public static String D0(String str, String str2) {
        if (p.p0(str, str2)) {
            String substring = str.substring(str2.length());
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static List E0(String str, char[] cArr) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int u02 = u0(str, valueOf, 0, false);
            if (u02 != -1) {
                ArrayList arrayList = new ArrayList(10);
                int i = 0;
                do {
                    arrayList.add(str.subSequence(i, u02).toString());
                    i = valueOf.length() + u02;
                    u02 = u0(str, valueOf, i, false);
                } while (u02 != -1);
                arrayList.add(str.subSequence(i, str.length()).toString());
                return arrayList;
            }
            return a.a.G(str.toString());
        }
        a8.k kVar = new a8.k(new a8.e(str, new q(0, cArr)));
        ArrayList arrayList2 = new ArrayList(i7.j.X(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            y7.e eVar = (y7.e) bVar.next();
            kotlin.jvm.internal.j.e(eVar, "range");
            arrayList2.add(str.subSequence(eVar.f6967a, eVar.f6968b + 1).toString());
        }
    }

    public static String F0(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e(str2, "delimiter");
        int w02 = w0(str, str2, 0, 6);
        if (w02 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + w02, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public static String G0(int i, String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(v1.a.j("Requested character count ", i, " is less than zero.").toString());
    }

    public static CharSequence H0(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z9 = false;
        while (i <= length) {
            boolean D = a.a.D(str.charAt(!z9 ? i : length));
            if (z9) {
                if (!D) {
                    break;
                }
                length--;
            } else if (D) {
                i++;
            } else {
                z9 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean r0(CharSequence charSequence, char c9) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return v0(charSequence, c9, 0, 2) >= 0;
    }

    public static boolean s0(CharSequence charSequence, String str) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return w0(charSequence, str, 0, 2) >= 0;
    }

    public static final int t0(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int u0(CharSequence charSequence, String str, int i, boolean z9) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        kotlin.jvm.internal.j.e(str, "string");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        y7.d dVar = new y7.d(i, length, 1);
        boolean z10 = charSequence instanceof String;
        int i9 = dVar.f6969c;
        int i10 = dVar.f6968b;
        int i11 = dVar.f6967a;
        if (z10 && (str instanceof String)) {
            if ((i9 <= 0 || i11 > i10) && (i9 >= 0 || i10 > i11)) {
                return -1;
            }
            int i12 = i11;
            while (true) {
                String str2 = str;
                boolean z11 = z9;
                if (p.m0(0, i12, str.length(), str2, (String) charSequence, z11)) {
                    return i12;
                }
                if (i12 == i10) {
                    return -1;
                }
                i12 += i9;
                str = str2;
                z9 = z11;
            }
        } else if ((i9 <= 0 || i11 > i10) && (i9 >= 0 || i10 > i11)) {
            return -1;
        } else {
            while (true) {
                int length3 = str.length();
                kotlin.jvm.internal.j.e(str, "<this>");
                kotlin.jvm.internal.j.e(charSequence, "other");
                boolean z12 = false;
                if (i11 >= 0 && str.length() - length3 >= 0 && i11 <= charSequence.length() - length3) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length3) {
                            z12 = true;
                            break;
                        } else if (!a.a.s(str.charAt(0 + i13), charSequence.charAt(i11 + i13), z9)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z12) {
                    return i11;
                }
                if (i11 == i10) {
                    return -1;
                }
                i11 += i9;
            }
        }
    }

    public static int v0(CharSequence charSequence, char c9, int i, int i9) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? x0(charSequence, new char[]{c9}, i, false) : ((String) charSequence).indexOf(c9, i);
    }

    public static /* synthetic */ int w0(CharSequence charSequence, String str, int i, int i9) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        return u0(charSequence, str, i, false);
    }

    public static final int x0(CharSequence charSequence, char[] cArr, int i, boolean z9) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (!z9 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i < 0) {
            i = 0;
        }
        int t02 = t0(charSequence);
        if (i > t02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c9 : cArr) {
                if (a.a.s(c9, charAt, z9)) {
                    return i;
                }
            }
            if (i == t02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean y0(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!a.a.D(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int z0(String str, char c9, int i, int i9) {
        if ((i9 & 2) != 0) {
            i = t0(str);
        }
        return str.lastIndexOf(c9, i);
    }
}
