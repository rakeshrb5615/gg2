package h;

import android.content.Context;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2062b;

    public /* synthetic */ k(Context context, int i) {
        this.f2061a = i;
        this.f2062b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f2061a
            switch(r0) {
                case 0: goto L35;
                case 1: goto L2f;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            x1.d r0 = new x1.d
            r0.<init>()
            a6.e r1 = y1.c.f6740a
            r2 = 0
            android.content.Context r3 = r11.f2062b
            y1.c.t(r3, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            h.k r0 = new h.k
            r1 = 3
            android.content.Context r2 = r11.f2062b
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L2f:
            android.content.Context r0 = r11.f2062b
            h.p.p(r0)
            return
        L35:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L8d
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f2062b
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L8d
            if (r0 < r2) goto L66
            java.lang.Object r0 = h.p.c()
            if (r0 == 0) goto L6b
            android.os.LocaleList r0 = h.m.a(r0)
            m0.h r2 = new m0.h
            m0.i r4 = new m0.i
            r4.<init>(r0)
            r2.<init>(r4)
            goto L6d
        L66:
            m0.h r2 = h.p.f2098c
            if (r2 == 0) goto L6b
            goto L6d
        L6b:
            m0.h r2 = m0.h.f3949b
        L6d:
            boolean r0 = r2.b()
            if (r0 == 0) goto L86
            java.lang.String r0 = d0.d.e(r5)
            java.lang.String r2 = "locale"
            java.lang.Object r2 = r5.getSystemService(r2)
            if (r2 == 0) goto L86
            android.os.LocaleList r0 = h.l.a(r0)
            h.m.b(r2, r0)
        L86:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L8d:
            h.p.f2101f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.k.run():void");
    }
}
