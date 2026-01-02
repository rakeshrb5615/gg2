package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n1 extends n7.h implements u7.p {

    /* renamed from: b  reason: collision with root package name */
    public s1 f1225b;

    /* renamed from: c  reason: collision with root package name */
    public r f1226c;

    /* renamed from: d  reason: collision with root package name */
    public int f1227d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f1228e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r1 f1229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r1 r1Var, l7.c cVar) {
        super(2, cVar);
        this.f1229f = r1Var;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        n1 n1Var = new n1(this.f1229f, cVar);
        n1Var.f1228e = obj;
        return n1Var;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((a8.g) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007a). Please submit an issue!!! */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            m7.a r0 = m7.a.f4049a
            int r1 = r5.f1227d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            d8.r r1 = r5.f1226c
            d8.s1 r3 = r5.f1225b
            java.lang.Object r4 = r5.f1228e
            a8.g r4 = (a8.g) r4
            c4.b.e0(r6)
            goto L7a
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            c4.b.e0(r6)
            goto L7f
        L24:
            c4.b.e0(r6)
            java.lang.Object r6 = r5.f1228e
            a8.g r6 = (a8.g) r6
            d8.r1 r1 = r5.f1229f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = d8.r1.f1241a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof d8.r
            if (r4 == 0) goto L41
            d8.r r1 = (d8.r) r1
            d8.s r1 = r1.f1239e
            r5.f1227d = r3
            r6.d(r1, r5)
            return r0
        L41:
            boolean r3 = r1 instanceof d8.b1
            if (r3 == 0) goto L7f
            d8.b1 r1 = (d8.b1) r1
            d8.s1 r1 = r1.c()
            if (r1 == 0) goto L7f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = i8.j.f2783a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.j.c(r3, r4)
            i8.j r3 = (i8.j) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5e:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L7f
            boolean r6 = r1 instanceof d8.r
            if (r6 == 0) goto L7a
            d8.r r1 = (d8.r) r1
            d8.s r6 = r1.f1239e
            r5.f1228e = r4
            r5.f1225b = r3
            r5.f1226c = r1
            r5.f1227d = r2
            r4.d(r6, r5)
            m7.a r6 = m7.a.f4049a
            return r0
        L7a:
            i8.j r1 = r1.g()
            goto L5e
        L7f:
            h7.l r6 = h7.l.f2236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
