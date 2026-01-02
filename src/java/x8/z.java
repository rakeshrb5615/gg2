package x8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class z implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final i f6690a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6691b;

    /* renamed from: c  reason: collision with root package name */
    public c0 f6692c;

    /* renamed from: d  reason: collision with root package name */
    public int f6693d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6694e;

    /* renamed from: f  reason: collision with root package name */
    public long f6695f;

    public z(i iVar) {
        this.f6690a = iVar;
        g a10 = iVar.a();
        this.f6691b = a10;
        c0 c0Var = a10.f6641a;
        this.f6692c = c0Var;
        this.f6693d = c0Var != null ? c0Var.f6620b : -1;
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6690a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6694e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r3 == r5.f6620b) goto L14;
     */
    @Override // x8.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t(x8.g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.j.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f6694e
            if (r3 != 0) goto L63
            x8.c0 r3 = r8.f6692c
            x8.g r4 = r8.f6691b
            if (r3 == 0) goto L2b
            x8.c0 r5 = r4.f6641a
            if (r3 != r5) goto L23
            int r3 = r8.f6693d
            kotlin.jvm.internal.j.b(r5)
            int r5 = r5.f6620b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f6695f
            r2 = 1
            long r0 = r0 + r2
            x8.i r2 = r8.f6690a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            x8.c0 r0 = r8.f6692c
            if (r0 != 0) goto L4c
            x8.c0 r0 = r4.f6641a
            if (r0 == 0) goto L4c
            r8.f6692c = r0
            int r0 = r0.f6620b
            r8.f6693d = r0
        L4c:
            long r0 = r4.f6642b
            long r2 = r8.f6695f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            x8.g r2 = r8.f6691b
            long r4 = r8.f6695f
            r3 = r9
            r2.z(r3, r4, r6)
            long r9 = r8.f6695f
            long r9 = r9 + r6
            r8.f6695f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = v1.a.g(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.z.t(x8.g, long):long");
    }
}
