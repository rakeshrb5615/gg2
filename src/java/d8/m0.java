package d8;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class m0 extends k8.i {

    /* renamed from: c  reason: collision with root package name */
    public int f1218c;

    public m0(int i) {
        super(0L, false);
        this.f1218c = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract l7.c d();

    public Throwable f(Object obj) {
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar != null) {
            return wVar.f1256a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        f0.l(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        r4 = (d8.e1) r5.get(d8.b0.f1162b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            l7.c r0 = r11.d()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.j.c(r0, r1)     // Catch: java.lang.Throwable -> L21
            i8.f r0 = (i8.f) r0     // Catch: java.lang.Throwable -> L21
            n7.c r1 = r0.f2773e     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.f2775m     // Catch: java.lang.Throwable -> L21
            l7.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = i8.a.l(r2, r0)     // Catch: java.lang.Throwable -> L21
            d4.l r3 = i8.a.f2762d     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r0 == r3) goto L24
            d8.d2 r3 = d8.f0.w(r1, r2, r0)     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r0 = move-exception
            goto L8c
        L24:
            r3 = r4
        L25:
            l7.h r5 = r1.getContext()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r11.i()     // Catch: java.lang.Throwable -> L48
            java.lang.Throwable r7 = r11.f(r6)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L4a
            int r8 = r11.f1218c     // Catch: java.lang.Throwable -> L48
            r9 = 1
            if (r8 == r9) goto L3d
            r10 = 2
            if (r8 != r10) goto L3c
            goto L3d
        L3c:
            r9 = 0
        L3d:
            if (r9 == 0) goto L4a
            d8.b0 r4 = d8.b0.f1162b     // Catch: java.lang.Throwable -> L48
            l7.f r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L48
            d8.e1 r4 = (d8.e1) r4     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r1 = move-exception
            goto L80
        L4a:
            if (r4 == 0) goto L61
            boolean r5 = r4.isActive()     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L61
            java.util.concurrent.CancellationException r4 = r4.getCancellationException()     // Catch: java.lang.Throwable -> L48
            r11.b(r4)     // Catch: java.lang.Throwable -> L48
            h7.g r4 = c4.b.p(r4)     // Catch: java.lang.Throwable -> L48
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L48
            goto L72
        L61:
            if (r7 == 0) goto L6b
            h7.g r4 = c4.b.p(r7)     // Catch: java.lang.Throwable -> L48
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L48
            goto L72
        L6b:
            java.lang.Object r4 = r11.g(r6)     // Catch: java.lang.Throwable -> L48
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L48
        L72:
            if (r3 == 0) goto L7c
            boolean r1 = r3.R()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L7b
            goto L7c
        L7b:
            return
        L7c:
            i8.a.g(r2, r0)     // Catch: java.lang.Throwable -> L21
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.R()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L8b
        L88:
            i8.a.g(r2, r0)     // Catch: java.lang.Throwable -> L21
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L21
        L8c:
            r11.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.m0.run():void");
    }
}
