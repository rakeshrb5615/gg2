package u6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final p f6120a;

    /* renamed from: b  reason: collision with root package name */
    public final p f6121b;

    public k(p pVar, p pVar2) {
        kotlin.jvm.internal.j.e(pVar, "localOverrideSettings");
        kotlin.jvm.internal.j.e(pVar2, "remoteSettings");
        this.f6120a = pVar;
        this.f6121b = pVar2;
    }

    public final double a() {
        Double b10 = this.f6120a.b();
        if (b10 != null) {
            double doubleValue = b10.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double b11 = this.f6121b.b();
        if (b11 != null) {
            double doubleValue2 = b11.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r6.c(r0) != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(n7.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof u6.j
            if (r0 == 0) goto L13
            r0 = r6
            u6.j r0 = (u6.j) r0
            int r1 = r0.f6119d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6119d = r1
            goto L18
        L13:
            u6.j r0 = new u6.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f6117b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f6119d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            c4.b.e0(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            u6.k r2 = r0.f6116a
            c4.b.e0(r6)
            goto L49
        L38:
            c4.b.e0(r6)
            r0.f6116a = r5
            r0.f6119d = r4
            u6.p r6 = r5.f6120a
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            u6.p r6 = r2.f6121b
            r2 = 0
            r0.f6116a = r2
            r0.f6119d = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            h7.l r6 = h7.l.f2236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.k.b(n7.c):java.lang.Object");
    }
}
