package n0;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final r.i f4394a = new r.i(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f4395b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4396c;

    /* renamed from: d  reason: collision with root package name */
    public static final r.j f4397d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4395b = threadPoolExecutor;
        f4396c = new Object();
        f4397d = new r.j(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            sb.append(((d) list.get(i9)).f4384e);
            sb.append("-");
            sb.append(i);
            if (i9 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #3 {all -> 0x00b7, blocks: (B:3:0x0007, B:5:0x000f, B:8:0x0018, B:9:0x001c, B:30:0x0050, B:33:0x0059, B:35:0x005f, B:37:0x0065, B:39:0x0072, B:47:0x0093, B:50:0x009f, B:43:0x007b, B:45:0x008e, B:14:0x002d, B:16:0x0035, B:19:0x0039, B:21:0x003d, B:26:0x0048, B:56:0x00ad, B:38:0x006c, B:44:0x0088), top: B:64:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:3:0x0007, B:5:0x000f, B:8:0x0018, B:9:0x001c, B:30:0x0050, B:33:0x0059, B:35:0x005f, B:37:0x0065, B:39:0x0072, B:47:0x0093, B:50:0x009f, B:43:0x007b, B:45:0x008e, B:14:0x002d, B:16:0x0035, B:19:0x0039, B:21:0x003d, B:26:0x0048, B:56:0x00ad, B:38:0x006c, B:44:0x0088), top: B:64:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n0.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r.i r0 = n0.h.f4394a
            java.lang.String r1 = "getFontSync"
            j5.t1.c(r1)
            java.lang.Object r1 = r0.get(r8)     // Catch: java.lang.Throwable -> Lb7
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lb7
            if (r1 == 0) goto L18
            n0.g r8 = new n0.g     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L18:
            h.f r10 = n0.c.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad java.lang.Throwable -> Lb7
            java.lang.Object r1 = r10.f2041c     // Catch: java.lang.Throwable -> Lb7
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb7
            int r10 = r10.f2040b     // Catch: java.lang.Throwable -> Lb7
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2d
            if (r10 == r2) goto L2b
        L29:
            r10 = r3
            goto L4e
        L2b:
            r10 = -2
            goto L4e
        L2d:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb7
            n0.i[] r10 = (n0.i[]) r10     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto L4d
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb7
            if (r5 != 0) goto L39
            goto L4d
        L39:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb7
            r6 = r4
        L3b:
            if (r6 >= r5) goto L4b
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lb7
            int r7 = r7.f4402e     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r10 = r7
            goto L4e
        L48:
            int r6 = r6 + 1
            goto L3b
        L4b:
            r10 = r4
            goto L4e
        L4d:
            r10 = r2
        L4e:
            if (r10 == 0) goto L59
            n0.g r8 = new n0.g     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            if (r10 <= r2) goto L7b
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb7
            r2 = 29
            if (r10 < r2) goto L7b
            c4.b r10 = h0.e.f2132a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            j5.t1.c(r10)     // Catch: java.lang.Throwable -> Lb7
            c4.b r10 = h0.e.f2132a     // Catch: java.lang.Throwable -> L76
            android.graphics.Typeface r9 = r10.t(r9, r1, r11)     // Catch: java.lang.Throwable -> L76
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            goto L91
        L76:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb7
        L7b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb7
            n0.i[] r10 = (n0.i[]) r10     // Catch: java.lang.Throwable -> Lb7
            c4.b r1 = h0.e.f2132a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            j5.t1.c(r1)     // Catch: java.lang.Throwable -> Lb7
            c4.b r1 = h0.e.f2132a     // Catch: java.lang.Throwable -> La8
            android.graphics.Typeface r9 = r1.s(r9, r10, r11)     // Catch: java.lang.Throwable -> La8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
        L91:
            if (r9 == 0) goto L9f
            r0.put(r8, r9)     // Catch: java.lang.Throwable -> Lb7
            n0.g r8 = new n0.g     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L9f:
            n0.g r8 = new n0.g     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        La8:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb7
        Lad:
            n0.g r8 = new n0.g     // Catch: java.lang.Throwable -> Lb7
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        Lb7:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.h.b(java.lang.String, android.content.Context, java.util.List, int):n0.g");
    }
}
