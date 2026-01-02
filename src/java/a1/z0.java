package a1;

import java.io.File;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class z0 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final l7.h f248a;

    /* renamed from: b  reason: collision with root package name */
    public final File f249b;

    /* renamed from: c  reason: collision with root package name */
    public final g8.b f250c;

    /* renamed from: d  reason: collision with root package name */
    public final String f251d;

    /* renamed from: e  reason: collision with root package name */
    public final String f252e;

    /* renamed from: f  reason: collision with root package name */
    public final String f253f;

    /* renamed from: g  reason: collision with root package name */
    public final m8.c f254g;

    /* renamed from: h  reason: collision with root package name */
    public final h7.j f255h;
    public final h7.j i;

    public z0(l7.h hVar, File file) {
        kotlin.jvm.internal.j.e(hVar, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.f248a = hVar;
        this.f249b = file;
        Object obj = c1.f32b;
        this.f250c = new g8.b(new t(file, (l7.c) null, 2), l7.i.f3796a, -2, f8.a.f1523a, 0);
        this.f251d = ".lock";
        this.f252e = ".version";
        this.f253f = "fcntl failed: EAGAIN";
        this.f254g = m8.d.a();
        this.f255h = a.a.F(new w0(this, 2));
        this.i = a.a.F(new w0(this, 1));
    }

    public static final void f(z0 z0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00e5, blocks: (B:31:0x0083, B:42:0x00bb, B:56:0x00db, B:57:0x00de), top: B:65:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #2 {all -> 0x00e5, blocks: (B:31:0x0083, B:42:0x00bb, B:56:0x00db, B:57:0x00de), top: B:65:0x0022 }] */
    /* JADX WARN: Type inference failed for: r9v15, types: [m8.a] */
    @Override // a1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(u7.l r9, n7.c r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.z0.a(u7.l, n7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:59:0x00dd, B:71:0x00f8, B:72:0x00fb), top: B:82:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:59:0x00dd, B:71:0x00f8, B:72:0x00fb), top: B:82:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a1.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // a1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(u7.p r18, n7.c r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.z0.b(u7.p, n7.c):java.lang.Object");
    }

    @Override // a1.s0
    public final Object c(f0 f0Var) {
        return this.i.f2233b != h7.k.f2235a ? new Integer(g1.f82b.nativeIncrementAndGetCounterValue(((g1) this.i.getValue()).f83a)) : d8.f0.x(this.f248a, new v0(this, null, 1), f0Var);
    }

    @Override // a1.s0
    public final g8.c d() {
        return this.f250c;
    }

    @Override // a1.s0
    public final Object e(n7.c cVar) {
        return this.i.f2233b != h7.k.f2235a ? new Integer(g1.f82b.nativeGetCounterValue(((g1) this.i.getValue()).f83a)) : d8.f0.x(this.f248a, new v0(this, null, 0), cVar);
    }
}
