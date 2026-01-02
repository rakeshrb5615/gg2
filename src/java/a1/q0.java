package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class q0 extends i0 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7, n7.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a1.p0
            if (r0 == 0) goto L13
            r0 = r8
            a1.p0 r0 = (a1.p0) r0
            int r1 = r0.f176e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f176e = r1
            goto L18
        L13:
            a1.p0 r0 = new a1.p0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f174c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f176e
            h7.l r3 = h7.l.f2236a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.io.FileOutputStream r7 = r0.f173b
            java.io.FileOutputStream r0 = r0.f172a
            c4.b.e0(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L6c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            c4.b.e0(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.f100c
            boolean r8 = r8.get()
            if (r8 != 0) goto L72
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            java.io.File r2 = r6.f98a
            r8.<init>(r2)
            a1.f1 r2 = r6.f99b     // Catch: java.lang.Throwable -> L6a
            a1.n1 r5 = new a1.n1     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L6a
            r0.f172a = r8     // Catch: java.lang.Throwable -> L6a
            r0.f173b = r8     // Catch: java.lang.Throwable -> L6a
            r0.f176e = r4     // Catch: java.lang.Throwable -> L6a
            r2.a(r7, r5)     // Catch: java.lang.Throwable -> L6a
            if (r3 != r1) goto L5c
            return r1
        L5c:
            r7 = r8
            r0 = r7
        L5e:
            java.io.FileDescriptor r7 = r7.getFD()     // Catch: java.lang.Throwable -> L2d
            r7.sync()     // Catch: java.lang.Throwable -> L2d
            r7 = 0
            j5.t1.f(r0, r7)
            return r3
        L6a:
            r7 = move-exception
            r0 = r8
        L6c:
            throw r7     // Catch: java.lang.Throwable -> L6d
        L6d:
            r8 = move-exception
            j5.t1.f(r0, r7)
            throw r8
        L72:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This scope has already been closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.q0.b(java.lang.Object, n7.c):java.lang.Object");
    }
}
