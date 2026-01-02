package y6;

import w6.z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d extends z {

    /* renamed from: a  reason: collision with root package name */
    public volatile z f6908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6909b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f6910c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w6.m f6911d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d7.a f6912e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f6913f;

    public d(e eVar, boolean z9, boolean z10, w6.m mVar, d7.a aVar) {
        this.f6913f = eVar;
        this.f6909b = z9;
        this.f6910c = z10;
        this.f6911d = mVar;
        this.f6912e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r7 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r7 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[SYNTHETIC] */
    @Override // w6.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(e7.a r11) {
        /*
            r10 = this;
            boolean r0 = r10.f6909b
            if (r0 == 0) goto L9
            r11.U()
            r11 = 0
            return r11
        L9:
            w6.z r0 = r10.f6908a
            if (r0 != 0) goto La0
            w6.m r0 = r10.f6911d
            y6.e r1 = r10.f6913f
            d7.a r2 = r10.f6912e
            z6.k r3 = r0.f6475d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f7418b
            z6.j r5 = z6.k.f7416c
            r6 = 1
            if (r1 != r5) goto L20
            goto L61
        L20:
            java.lang.Class r5 = r2.f1153a
            java.lang.Object r7 = r4.get(r5)
            w6.a0 r7 = (w6.a0) r7
            if (r7 == 0) goto L2d
            if (r7 != r1) goto L62
            goto L61
        L2d:
            java.lang.Class<x6.a> r7 = x6.a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            x6.a r7 = (x6.a) r7
            if (r7 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r7 = r7.value()
            java.lang.Class<w6.a0> r8 = w6.a0.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L45
            goto L62
        L45:
            y6.c r8 = r3.f7417a
            d7.a r9 = new d7.a
            r9.<init>(r7)
            y6.p r7 = r8.b(r9, r6)
            java.lang.Object r7 = r7.c()
            w6.a0 r7 = (w6.a0) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            w6.a0 r4 = (w6.a0) r4
            if (r4 == 0) goto L5f
            r7 = r4
        L5f:
            if (r7 != r1) goto L62
        L61:
            r1 = r3
        L62:
            java.util.List r3 = r0.f6476e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            w6.a0 r5 = (w6.a0) r5
            if (r4 != 0) goto L7b
            if (r5 != r1) goto L69
            r4 = r6
            goto L69
        L7b:
            w6.z r5 = r5.a(r0, r2)
            if (r5 == 0) goto L69
            r0 = r5
            goto L89
        L83:
            if (r4 != 0) goto L8c
            w6.z r0 = r0.b(r2)
        L89:
            r10.f6908a = r0
            goto La0
        L8c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        La0:
            java.lang.Object r11 = r0.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d.b(e7.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r7 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r7 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC] */
    @Override // w6.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(e7.b r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r10.f6910c
            if (r0 == 0) goto L8
            r11.B()
            return
        L8:
            w6.z r0 = r10.f6908a
            if (r0 != 0) goto L9f
            w6.m r0 = r10.f6911d
            y6.e r1 = r10.f6913f
            d7.a r2 = r10.f6912e
            z6.k r3 = r0.f6475d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f7418b
            z6.j r5 = z6.k.f7416c
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f1153a
            java.lang.Object r7 = r4.get(r5)
            w6.a0 r7 = (w6.a0) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<x6.a> r7 = x6.a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            x6.a r7 = (x6.a) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<w6.a0> r8 = w6.a0.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            y6.c r8 = r3.f7417a
            d7.a r9 = new d7.a
            r9.<init>(r7)
            y6.p r7 = r8.b(r9, r6)
            java.lang.Object r7 = r7.c()
            w6.a0 r7 = (w6.a0) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            w6.a0 r4 = (w6.a0) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.f6476e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            w6.a0 r5 = (w6.a0) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            w6.z r5 = r5.a(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            w6.z r0 = r0.b(r2)
        L88:
            r10.f6908a = r0
            goto L9f
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L9f:
            r0.c(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d.c(e7.b, java.lang.Object):void");
    }
}
