package z8;

import java.lang.reflect.InvocationHandler;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class r0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f7560a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f7561b;

    public r0(s0 s0Var) {
        this.f7561b = s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = z8.t0.a(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        r9.f7565a.put(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
        r0 = (z8.t0) r0;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Ld
            java.lang.Object r7 = r8.invoke(r6, r9)
            return r7
        Ld:
            if (r9 == 0) goto L11
        Lf:
            r3 = r9
            goto L14
        L11:
            java.lang.Object[] r9 = r6.f7560a
            goto Lf
        L14:
            z8.a r9 = z8.k0.f7503b
            boolean r0 = r9.f(r8)
            if (r0 == 0) goto L21
            java.lang.Object r7 = r9.d(r8, r7, r3)
            return r7
        L21:
            z8.s0 r9 = r6.f7561b
        L23:
            java.util.concurrent.ConcurrentHashMap r0 = r9.f7565a
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof z8.t0
            if (r1 == 0) goto L30
            z8.t0 r0 = (z8.t0) r0
            goto L6c
        L30:
            if (r0 != 0) goto L57
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r9.f7565a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.putIfAbsent(r8, r1)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L56
            z8.s r0 = z8.t0.a(r9, r8)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.ConcurrentHashMap r9 = r9.f7565a     // Catch: java.lang.Throwable -> L4b
            r9.put(r8, r0)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            goto L6c
        L4b:
            r0 = move-exception
            r7 = r0
            goto L59
        L4e:
            r0 = move-exception
            r7 = r0
            java.util.concurrent.ConcurrentHashMap r9 = r9.f7565a     // Catch: java.lang.Throwable -> L4b
            r9.remove(r8)     // Catch: java.lang.Throwable -> L4b
            throw r7     // Catch: java.lang.Throwable -> L4b
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
        L57:
            r1 = r0
            goto L5b
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            throw r7
        L5b:
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r9.f7565a     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L69
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            goto L23
        L66:
            r0 = move-exception
            r7 = r0
            goto L80
        L69:
            z8.t0 r0 = (z8.t0) r0     // Catch: java.lang.Throwable -> L66
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
        L6c:
            r8 = r0
            z8.s r8 = (z8.s) r8
            z8.z r0 = new z8.z
            z8.p0 r1 = r8.f7562a
            okhttp3.Call$Factory r4 = r8.f7563b
            z8.m r5 = r8.f7564c
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = r8.b(r0, r3)
            return r7
        L80:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.r0.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
