package a1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class o0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final File f162a;

    /* renamed from: b  reason: collision with root package name */
    public final f1 f163b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f164c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f165d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f166e;

    /* renamed from: f  reason: collision with root package name */
    public final m8.c f167f;

    public o0(File file, f1 f1Var, s0 s0Var, k0 k0Var) {
        kotlin.jvm.internal.j.e(f1Var, "serializer");
        kotlin.jvm.internal.j.e(s0Var, "coordinator");
        this.f162a = file;
        this.f163b = f1Var;
        this.f164c = s0Var;
        this.f165d = k0Var;
        this.f166e = new AtomicBoolean(false);
        this.f167f = m8.d.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:28|29))(2:30|(6:32|33|34|36|37|(1:39)(1:40))(2:49|50))|14|15|16|(2:(1:19)|20)(1:22)))|52|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:38:0x0083), top: B:50:0x0020 }] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a1.m0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a1.o0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a1.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a1.q r8, n7.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a1.m0
            if (r0 == 0) goto L13
            r0 = r9
            a1.m0 r0 = (a1.m0) r0
            int r1 = r0.f146f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146f = r1
            goto L18
        L13:
            a1.m0 r0 = new a1.m0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f144d
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f146f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r8 = r0.f143c
            a1.i0 r1 = r0.f142b
            a1.o0 r0 = r0.f141a
            c4.b.e0(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6a
        L2e:
            r9 = move-exception
            goto L83
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            c4.b.e0(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f166e
            boolean r9 = r9.get()
            if (r9 != 0) goto L99
            m8.c r9 = r7.f167f
            boolean r9 = r9.e()
            a1.i0 r2 = new a1.i0     // Catch: java.lang.Throwable -> L8c
            java.io.File r5 = r7.f162a     // Catch: java.lang.Throwable -> L8c
            a1.f1 r6 = r7.f163b     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7d
            r0.f141a = r7     // Catch: java.lang.Throwable -> L7d
            r0.f142b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f143c = r9     // Catch: java.lang.Throwable -> L7d
            r0.f146f = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r8 = r8.b(r2, r5, r0)     // Catch: java.lang.Throwable -> L7d
            if (r8 != r1) goto L65
            return r1
        L65:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6a:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            r1 = r4
            goto L70
        L6f:
            r1 = move-exception
        L70:
            if (r1 != 0) goto L7a
            if (r8 == 0) goto L79
            m8.c r8 = r0.f167f
            r8.f(r4)
        L79:
            return r9
        L7a:
            throw r1     // Catch: java.lang.Throwable -> L7b
        L7b:
            r9 = move-exception
            goto L91
        L7d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L83:
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r1 = move-exception
            q4.b.a(r9, r1)     // Catch: java.lang.Throwable -> L7b
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L7b
        L8c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L91:
            if (r8 == 0) goto L98
            m8.c r8 = r0.f167f
            r8.f(r4)
        L98:
            throw r9
        L99:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.o0.a(a1.q, n7.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|15|16|17|(4:19|(5:21|22|23|24|(2:26|27))|31|32)(1:33))(2:43|44))(1:45))(2:63|(5:65|(2:67|(2:69|70))|71|(1:73)|52)(2:74|75))|46|47|48|49|50|(5:53|15|16|17|(0)(0))|52))|47|48|49|50|(0)|52)|81|6|7|(0)(0)|46|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
        r14 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x0122, IOException -> 0x0124, TRY_ENTER, TryCatch #1 {all -> 0x0122, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00eb, B:52:0x0101, B:53:0x0121, B:60:0x012f, B:69:0x013e, B:71:0x0144, B:72:0x0147, B:66:0x0139, B:67:0x013c, B:33:0x009e, B:34:0x00ba), top: B:79:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f A[Catch: all -> 0x0122, IOException -> 0x0124, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0122, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00eb, B:52:0x0101, B:53:0x0121, B:60:0x012f, B:69:0x013e, B:71:0x0144, B:72:0x0147, B:66:0x0139, B:67:0x013c, B:33:0x009e, B:34:0x00ba), top: B:79:0x0023 }] */
    /* JADX WARN: Type inference failed for: r13v6, types: [u7.p] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [u7.p] */
    /* JADX WARN: Type inference failed for: r8v2, types: [a1.q0, a1.i0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(a1.f0 r13, n7.c r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.o0.b(a1.f0, n7.c):java.lang.Object");
    }

    @Override // a1.a
    public final void close() {
        this.f166e.set(true);
        this.f165d.invoke();
    }
}
