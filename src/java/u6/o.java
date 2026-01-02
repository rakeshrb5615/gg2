package u6;

import d8.f0;
import java.util.concurrent.atomic.AtomicReference;
import r6.g1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final g1 f6129a;

    /* renamed from: b  reason: collision with root package name */
    public final a1.h f6130b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference f6131c;

    public o(l7.h hVar, g1 g1Var, a1.h hVar2) {
        kotlin.jvm.internal.j.e(hVar, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(g1Var, "timeProvider");
        kotlin.jvm.internal.j.e(hVar2, "sessionConfigsDataStore");
        this.f6129a = g1Var;
        this.f6130b = hVar2;
        this.f6131c = new AtomicReference();
        f0.p(f0.b(hVar), new m(this, null, 0));
    }

    public final h a() {
        AtomicReference atomicReference = this.f6131c;
        if (atomicReference.get() == null) {
            Object t7 = f0.t(new m(this, null, 1));
            while (!atomicReference.compareAndSet(null, t7) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.j.d(obj, "get(...)");
        return (h) obj;
    }

    public final boolean b() {
        Long l5 = a().f6113e;
        Integer num = a().f6112d;
        return l5 == null || num == null || this.f6129a.a().f5648c - l5.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(u6.h r6, n7.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u6.n
            if (r0 == 0) goto L13
            r0 = r7
            u6.n r0 = (u6.n) r0
            int r1 = r0.f6128c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6128c = r1
            goto L18
        L13:
            u6.n r0 = new u6.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6126a
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f6128c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            c4.b.e0(r7)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            c4.b.e0(r7)
            a1.h r7 = r5.f6130b     // Catch: java.io.IOException -> L27
            a1.o r2 = new a1.o     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L27
            r0.f6128c = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L58:
            h7.l r6 = h7.l.f2236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.o.c(u6.h, n7.c):java.lang.Object");
    }
}
