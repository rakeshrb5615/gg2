package b8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class j extends c4.b {
    public static String k0(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i.y0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List X = a8.h.X(new a8.i(str, 2));
        int length = str.length();
        X.size();
        int y9 = a.a.y(X);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : X) {
            int i9 = i + 1;
            String str2 = null;
            if (i < 0) {
                a.a.V();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != y9) || !i.y0(str3)) {
                int length2 = str3.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i10 = -1;
                        break;
                    } else if (!a.a.D(str3.charAt(i10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1 && p.o0(str3, "|", i10, false)) {
                    str2 = str3.substring("|".length() + i10);
                    kotlin.jvm.internal.j.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i9;
        }
        StringBuilder sb = new StringBuilder(length);
        i7.i.b0(arrayList, sb);
        return sb.toString();
    }
}
