package h0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import j5.t1;
import r.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final c4.b f2132a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f2133b;

    static {
        t1.c("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f2132a = new c4.b();
        } else if (i >= 28) {
            f2132a = new f();
        } else {
            f2132a = new f();
        }
        f2133b = new i(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3.equals(r9) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, g0.e r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, g0.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.e.a(android.content.Context, g0.e, android.content.res.Resources, int, java.lang.String, int, int, g0.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i9, int i10) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i9 + '-' + i + '-' + i10;
    }
}
