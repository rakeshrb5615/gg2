package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s0 implements p0 {

    /* renamed from: f  reason: collision with root package name */
    public static final double f5728f = Math.random();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f5729g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final q4.f f5730a;

    /* renamed from: b  reason: collision with root package name */
    public final d6.d f5731b;

    /* renamed from: c  reason: collision with root package name */
    public final u6.k f5732c;

    /* renamed from: d  reason: collision with root package name */
    public final l f5733d;

    /* renamed from: e  reason: collision with root package name */
    public final l7.h f5734e;

    public s0(q4.f fVar, d6.d dVar, u6.k kVar, l lVar, l7.h hVar) {
        kotlin.jvm.internal.j.e(fVar, "firebaseApp");
        kotlin.jvm.internal.j.e(dVar, "firebaseInstallations");
        kotlin.jvm.internal.j.e(kVar, "sessionSettings");
        kotlin.jvm.internal.j.e(lVar, "eventGDTLogger");
        kotlin.jvm.internal.j.e(hVar, "backgroundDispatcher");
        this.f5730a = fVar;
        this.f5731b = dVar;
        this.f5732c = kVar;
        this.f5733d = lVar;
        this.f5734e = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r7 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (r7.b(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(r6.s0 r6, n7.c r7) {
        /*
            boolean r0 = r7 instanceof r6.r0
            if (r0 == 0) goto L13
            r0 = r7
            r6.r0 r0 = (r6.r0) r0
            int r1 = r0.f5724d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5724d = r1
            goto L18
        L13:
            r6.r0 r0 = new r6.r0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5722b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f5724d
            r3 = 2
            r4 = 1
            java.lang.String r5 = "FirebaseSessions"
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            r6.s0 r6 = r0.f5721a
            c4.b.e0(r7)
            goto L80
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            r6.s0 r6 = r0.f5721a
            c4.b.e0(r7)
            goto L4c
        L3c:
            c4.b.e0(r7)
            s6.c r7 = s6.c.f5851a
            r0.f5721a = r6
            r0.f5724d = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L4c
            goto L7f
        L4c:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            if (r7 == 0) goto L5b
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L5b
            goto Lbc
        L5b:
            java.util.Iterator r7 = r7.iterator()
        L5f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r7.next()
            g5.k r2 = (g5.k) r2
            g5.v r2 = r2.f1796a
            boolean r2 = r2.a()
            if (r2 == 0) goto L5f
            u6.k r7 = r6.f5732c
            r0.f5721a = r6
            r0.f5724d = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            u6.k r7 = r6.f5732c
            u6.p r0 = r7.f6120a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L8f
            boolean r4 = r0.booleanValue()
            goto L9b
        L8f:
            u6.p r7 = r7.f6121b
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L9b
            boolean r4 = r7.booleanValue()
        L9b:
            if (r4 != 0) goto La5
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        La5:
            u6.k r6 = r6.f5732c
            double r6 = r6.a()
            double r0 = r6.s0.f5728f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lb4
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lb4:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lbc:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.s0.a(r6.s0, n7.c):java.lang.Object");
    }
}
