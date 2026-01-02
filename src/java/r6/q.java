package r6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class q implements t6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5711a;

    public static a1.g0 b(a1.f1 f1Var, l6.c cVar, i8.c cVar2, u7.a aVar) {
        i7.n nVar = i7.n.f2745a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new a1.g0(new a1.l0(f1Var, new a1.d0(cVar2, 1), aVar), a.a.G(new a1.d(nVar, (l7.c) null, 0)), cVar, cVar2);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new a1.g0(new a1.l0(f1Var, a1.j0.f114a, aVar), a.a.G(new a1.d(nVar, (l7.c) null, 0)), cVar, cVar2);
        }
    }

    public static void c(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.j.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        } else if (parentFile.isDirectory()) {
        } else {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
            } catch (Exception e9) {
                throw new IOException("Failed to create directory: " + parentFile, e9);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|43|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r10 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(d6.d r9, n7.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof r6.v
            if (r0 == 0) goto L13
            r0 = r10
            r6.v r0 = (r6.v) r0
            int r1 = r0.f5745d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5745d = r1
            goto L18
        L13:
            r6.v r0 = new r6.v
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5743b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f5745d
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.f5742a
            java.lang.String r9 = (java.lang.String) r9
            c4.b.e0(r10)     // Catch: java.lang.Exception -> L32
            goto L8d
        L32:
            r10 = move-exception
            goto L94
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f5742a
            d6.d r9 = (d6.d) r9
            c4.b.e0(r10)     // Catch: java.lang.Exception -> L45
            goto L64
        L45:
            r10 = move-exception
            goto L70
        L47:
            c4.b.e0(r10)
            r10 = r9
            d6.c r10 = (d6.c) r10     // Catch: java.lang.Exception -> L45
            com.google.android.gms.tasks.Task r9 = r10.d()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "getToken(...)"
            kotlin.jvm.internal.j.d(r9, r2)     // Catch: java.lang.Exception -> L6c
            r0.f5742a = r10     // Catch: java.lang.Exception -> L6c
            r0.f5745d = r5     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = j5.t1.b(r9, r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r1) goto L61
            goto L8c
        L61:
            r7 = r10
            r10 = r9
            r9 = r7
        L64:
            d6.a r10 = (d6.a) r10     // Catch: java.lang.Exception -> L45
            java.lang.String r10 = r10.f1128a     // Catch: java.lang.Exception -> L45
            r7 = r10
            r10 = r9
            r9 = r7
            goto L77
        L6c:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L70:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r3, r2, r10)
            r10 = r9
            r9 = r6
        L77:
            d6.c r10 = (d6.c) r10     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.Task r10 = r10.c()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "getId(...)"
            kotlin.jvm.internal.j.d(r10, r2)     // Catch: java.lang.Exception -> L32
            r0.f5742a = r9     // Catch: java.lang.Exception -> L32
            r0.f5745d = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = j5.t1.b(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r1) goto L8d
        L8c:
            return r1
        L8d:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L92
            goto L99
        L92:
            r6 = r10
            goto L99
        L94:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r3, r0, r10)
        L99:
            r6.w r10 = new r6.w
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.q.a(d6.d, n7.c):java.lang.Object");
    }

    @Override // g7.a
    public Object get() {
        switch (this.f5711a) {
            case 1:
                return g1.f5653a;
            default:
                return h1.f5666a;
        }
    }
}
