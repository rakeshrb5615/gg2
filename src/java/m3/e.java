package m3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3957a = {2130969046};

    /* renamed from: b  reason: collision with root package name */
    public static final Map f3958b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map f3959c;

    static {
        Object obj = new Object();
        Object obj2 = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", obj);
        hashMap.put("google", obj);
        hashMap.put("hmd global", obj);
        hashMap.put("infinix", obj);
        hashMap.put("infinix mobility limited", obj);
        hashMap.put("itel", obj);
        hashMap.put("kyocera", obj);
        hashMap.put("lenovo", obj);
        hashMap.put("lge", obj);
        hashMap.put("meizu", obj);
        hashMap.put("motorola", obj);
        hashMap.put("nothing", obj);
        hashMap.put("oneplus", obj);
        hashMap.put("oppo", obj);
        hashMap.put("realme", obj);
        hashMap.put("robolectric", obj);
        hashMap.put("samsung", obj2);
        hashMap.put("sharp", obj);
        hashMap.put("shift", obj);
        hashMap.put("sony", obj);
        hashMap.put("tcl", obj);
        hashMap.put("tecno", obj);
        hashMap.put("tecno mobile limited", obj);
        hashMap.put("vivo", obj);
        hashMap.put("wingtech", obj);
        hashMap.put("xiaomi", obj);
        f3958b = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", obj);
        hashMap2.put("jio", obj);
        f3959c = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (m0.a.a("Tiramisu") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.app.Activity r2, m3.f r3) {
        /*
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r3 >= r0) goto L8
            goto L7d
        L8:
            int r0 = m0.a.f3941a
            r0 = 33
            if (r3 >= r0) goto L4a
            r0 = 32
            if (r3 < r0) goto L22
            java.lang.String r3 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "CODENAME"
            kotlin.jvm.internal.j.d(r3, r0)
            java.lang.String r3 = "Tiramisu"
            boolean r3 = m0.a.a(r3)
            if (r3 == 0) goto L22
            goto L4a
        L22:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            java.util.Map r1 = m3.e.f3958b
            java.lang.Object r3 = r1.get(r3)
            m3.c r3 = (m3.c) r3
            if (r3 != 0) goto L42
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r3 = r3.toLowerCase(r0)
            java.util.Map r0 = m3.e.f3959c
            java.lang.Object r3 = r0.get(r3)
            m3.c r3 = (m3.c) r3
        L42:
            if (r3 == 0) goto L7d
            boolean r3 = r3.b()
            if (r3 == 0) goto L7d
        L4a:
            int[] r3 = m3.e.f3957a
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3)
            r0 = 0
            int r0 = r3.getResourceId(r0, r0)
            r3.recycle()
            android.content.res.Resources$Theme r3 = r2.getTheme()
            r1 = 1
            r3.applyStyle(r0, r1)
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L77
            android.view.View r2 = r2.peekDecorView()
            if (r2 == 0) goto L77
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L77
            android.content.res.Resources$Theme r2 = r2.getTheme()
            goto L78
        L77:
            r2 = 0
        L78:
            if (r2 == 0) goto L7d
            r2.applyStyle(r0, r1)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.e.a(android.app.Activity, m3.f):void");
    }
}
