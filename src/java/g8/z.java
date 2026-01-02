package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final d4.l f1962a = new d4.l("NONE", 4, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d4.l f1963b = new d4.l("PENDING", 4, false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(g8.b0 r4, a1.q r5, java.lang.Throwable r6, n7.c r7) {
        /*
            boolean r0 = r7 instanceof g8.f
            if (r0 == 0) goto L13
            r0 = r7
            g8.f r0 = (g8.f) r0
            int r1 = r0.f1894c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1894c = r1
            goto L18
        L13:
            g8.f r0 = new g8.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1893b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1894c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f1892a
            c4.b.e0(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            c4.b.e0(r7)
            r0.f1892a = r6     // Catch: java.lang.Throwable -> L29
            r0.f1894c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.b(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            h7.l r4 = h7.l.f2236a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            q4.b.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.z.a(g8.b0, a1.q, java.lang.Throwable, n7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable b(g8.c r4, g8.d r5, n7.c r6) {
        /*
            boolean r0 = r6 instanceof g8.k
            if (r0 == 0) goto L13
            r0 = r6
            g8.k r0 = (g8.k) r0
            int r1 = r0.f1915c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1915c = r1
            goto L18
        L13:
            g8.k r0 = new g8.k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1914b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1915c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.r r4 = r0.f1913a
            c4.b.e0(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            c4.b.e0(r6)
            kotlin.jvm.internal.r r6 = new kotlin.jvm.internal.r
            r6.<init>()
            g8.m r2 = new g8.m     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f1913a = r6     // Catch: java.lang.Throwable -> L4d
            r0.f1915c = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.f(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7d
        L5b:
            l7.h r6 = r0.getContext()
            d8.b0 r0 = d8.b0.f1162b
            l7.f r6 = r6.get(r0)
            d8.e1 r6 = (d8.e1) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L7e
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r4 != 0) goto L81
            return r5
        L81:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L89
            q4.b.a(r4, r5)
            throw r4
        L89:
            q4.b.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.z.b(g8.c, g8.d, n7.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r2.a(r11, r0) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Type inference failed for: r0v2, types: [l7.c, g8.e] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [f8.r] */
    /* JADX WARN: Type inference failed for: r9v6, types: [f8.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(g8.d r8, f8.p r9, boolean r10, n7.c r11) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.z.c(g8.d, f8.p, boolean, n7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(g8.c r6, n7.c r7) {
        /*
            boolean r0 = r7 instanceof g8.s
            if (r0 == 0) goto L13
            r0 = r7
            g8.s r0 = (g8.s) r0
            int r1 = r0.f1946d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1946d = r1
            goto L18
        L13:
            g8.s r0 = new g8.s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1945c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1946d
            d4.l r3 = h8.f.f2244a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            g8.r r6 = r0.f1944b
            kotlin.jvm.internal.r r0 = r0.f1943a
            c4.b.e0(r7)     // Catch: h8.a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            c4.b.e0(r7)
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            r7.a = r3
            g8.r r2 = new g8.r
            r5 = 0
            r2.<init>(r7, r5)
            r0.f1943a = r7     // Catch: h8.a -> L56
            r0.f1944b = r2     // Catch: h8.a -> L56
            r0.f1946d = r4     // Catch: h8.a -> L56
            java.lang.Object r6 = r6.f(r2, r0)     // Catch: h8.a -> L56
            if (r6 != r1) goto L54
            return r1
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            java.lang.Object r1 = r7.f2237a
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r6 = r0.a
            if (r6 == r3) goto L63
            return r6
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.z.d(g8.c, n7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(g8.c r5, n7.c r6) {
        /*
            boolean r0 = r6 instanceof g8.t
            if (r0 == 0) goto L13
            r0 = r6
            g8.t r0 = (g8.t) r0
            int r1 = r0.f1950d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1950d = r1
            goto L18
        L13:
            g8.t r0 = new g8.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1949c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1950d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            g8.r r5 = r0.f1948b
            kotlin.jvm.internal.r r0 = r0.f1947a
            c4.b.e0(r6)     // Catch: h8.a -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            c4.b.e0(r6)
            kotlin.jvm.internal.r r6 = new kotlin.jvm.internal.r
            r6.<init>()
            g8.r r2 = new g8.r
            r4 = 1
            r2.<init>(r6, r4)
            r0.f1947a = r6     // Catch: h8.a -> L52
            r0.f1948b = r2     // Catch: h8.a -> L52
            r0.f1950d = r3     // Catch: h8.a -> L52
            java.lang.Object r5 = r5.f(r2, r0)     // Catch: h8.a -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            java.lang.Object r1 = r6.f2237a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r5 = r0.a
            return r5
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.z.e(g8.c, n7.c):java.lang.Object");
    }

    public static final c f(w wVar, l7.h hVar, int i, f8.a aVar) {
        return ((((i < 0 || i >= 2) && i != -2) || aVar != f8.a.f1524b) && !((i == 0 || i == -3) && aVar == f8.a.f1523a)) ? new b(wVar, hVar, i, aVar, 1) : wVar;
    }
}
