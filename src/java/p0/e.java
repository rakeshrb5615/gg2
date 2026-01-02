package p0;

import java.io.PrintWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f5062a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static char[] f5063b = new char[24];

    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void b(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void e(long j, PrintWriter printWriter) {
        synchronized (f5062a) {
            printWriter.print(new String(f5063b, 0, f(j)));
        }
    }

    public static int f(long j) {
        char c9;
        int i;
        int i9;
        int i10;
        if (f5063b.length < 0) {
            f5063b = new char[0];
        }
        char[] cArr = f5063b;
        int i11 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i11 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (i11 > 0) {
            c9 = '+';
        } else {
            j = -j;
            c9 = '-';
        }
        int i12 = (int) (j % 1000);
        int floor = (int) Math.floor(j / 1000);
        if (floor > 86400) {
            i = floor / 86400;
            floor -= 86400 * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i9 = floor / 3600;
            floor -= i9 * 3600;
        } else {
            i9 = 0;
        }
        if (floor > 60) {
            int i13 = floor / 60;
            floor -= i13 * 60;
            i10 = i13;
        } else {
            i10 = 0;
        }
        cArr[0] = c9;
        int g3 = g(cArr, i, 'd', 1, false, 0);
        int g4 = g(cArr, i9, 'h', g3, g3 != 1, 0);
        int g6 = g(cArr, i10, 'm', g4, g4 != 1, 0);
        int g9 = g(cArr, i12, 'm', g(cArr, floor, 's', g6, g6 != 1, 0), true, 0);
        cArr[g9] = 's';
        return g9 + 1;
    }

    public static int g(char[] cArr, int i, char c9, int i9, boolean z9, int i10) {
        int i11;
        if (z9 || i > 0) {
            if ((!z9 || i10 < 3) && i <= 99) {
                i11 = i9;
            } else {
                int i12 = i / 100;
                cArr[i9] = (char) (i12 + 48);
                i11 = i9 + 1;
                i -= i12 * 100;
            }
            if ((z9 && i10 >= 2) || i > 9 || i9 != i11) {
                int i13 = i / 10;
                cArr[i11] = (char) (i13 + 48);
                i11++;
                i -= i13 * 10;
            }
            cArr[i11] = (char) (i + 48);
            cArr[i11 + 1] = c9;
            return i11 + 2;
        }
        return i9;
    }
}
