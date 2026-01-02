package x8;

import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f6676a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f6677b;

    /* renamed from: c  reason: collision with root package name */
    public int f6678c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6679d;

    public s(b0 b0Var, Inflater inflater) {
        this.f6676a = b0Var;
        this.f6677b = inflater;
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6676a.f6616a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6679d) {
            return;
        }
        this.f6677b.end();
        this.f6679d = true;
        this.f6676a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085 A[SYNTHETIC] */
    @Override // x8.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t(x8.g r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.j.e(r11, r0)
        L5:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb4
            boolean r3 = r10.f6679d
            if (r3 != 0) goto Lac
            x8.b0 r3 = r10.f6676a
            java.util.zip.Inflater r4 = r10.f6677b
            if (r2 != 0) goto L16
            goto L80
        L16:
            r2 = 1
            x8.c0 r2 = r11.J(r2)     // Catch: java.util.zip.DataFormatException -> L6f
            int r5 = r2.f6621c     // Catch: java.util.zip.DataFormatException -> L6f
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> L6f
            long r5 = java.lang.Math.min(r12, r5)     // Catch: java.util.zip.DataFormatException -> L6f
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> L6f
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> L6f
            if (r6 != 0) goto L2c
            goto L46
        L2c:
            boolean r6 = r3.h()     // Catch: java.util.zip.DataFormatException -> L6f
            if (r6 == 0) goto L33
            goto L46
        L33:
            x8.g r6 = r3.f6617b     // Catch: java.util.zip.DataFormatException -> L6f
            x8.c0 r6 = r6.f6641a     // Catch: java.util.zip.DataFormatException -> L6f
            kotlin.jvm.internal.j.b(r6)     // Catch: java.util.zip.DataFormatException -> L6f
            int r7 = r6.f6621c     // Catch: java.util.zip.DataFormatException -> L6f
            int r8 = r6.f6620b     // Catch: java.util.zip.DataFormatException -> L6f
            int r7 = r7 - r8
            r10.f6678c = r7     // Catch: java.util.zip.DataFormatException -> L6f
            byte[] r6 = r6.f6619a     // Catch: java.util.zip.DataFormatException -> L6f
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L6f
        L46:
            byte[] r6 = r2.f6619a     // Catch: java.util.zip.DataFormatException -> L6f
            int r7 = r2.f6621c     // Catch: java.util.zip.DataFormatException -> L6f
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> L6f
            int r6 = r10.f6678c     // Catch: java.util.zip.DataFormatException -> L6f
            if (r6 != 0) goto L53
            goto L61
        L53:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> L6f
            int r6 = r6 - r7
            int r7 = r10.f6678c     // Catch: java.util.zip.DataFormatException -> L6f
            int r7 = r7 - r6
            r10.f6678c = r7     // Catch: java.util.zip.DataFormatException -> L6f
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L6f
            r3.skip(r6)     // Catch: java.util.zip.DataFormatException -> L6f
        L61:
            if (r5 <= 0) goto L71
            int r6 = r2.f6621c     // Catch: java.util.zip.DataFormatException -> L6f
            int r6 = r6 + r5
            r2.f6621c = r6     // Catch: java.util.zip.DataFormatException -> L6f
            long r6 = r11.f6642b     // Catch: java.util.zip.DataFormatException -> L6f
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> L6f
            long r6 = r6 + r8
            r11.f6642b = r6     // Catch: java.util.zip.DataFormatException -> L6f
            goto L81
        L6f:
            r11 = move-exception
            goto La6
        L71:
            int r5 = r2.f6620b     // Catch: java.util.zip.DataFormatException -> L6f
            int r6 = r2.f6621c     // Catch: java.util.zip.DataFormatException -> L6f
            if (r5 != r6) goto L80
            x8.c0 r5 = r2.a()     // Catch: java.util.zip.DataFormatException -> L6f
            r11.f6641a = r5     // Catch: java.util.zip.DataFormatException -> L6f
            x8.d0.a(r2)     // Catch: java.util.zip.DataFormatException -> L6f
        L80:
            r8 = r0
        L81:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L86
            return r8
        L86:
            boolean r0 = r4.finished()
            if (r0 != 0) goto La3
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L93
            goto La3
        L93:
            boolean r0 = r3.h()
            if (r0 != 0) goto L9b
            goto L5
        L9b:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La3:
            r11 = -1
            return r11
        La6:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lac:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        Lb4:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = v1.a.g(r12, r11)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.s.t(x8.g, long):long");
    }
}
