package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f0 extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public kotlin.jvm.internal.p f58a;

    /* renamed from: b  reason: collision with root package name */
    public int f59b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f60c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f61d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g0 f62e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f63f;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f64m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlin.jvm.internal.p pVar, g0 g0Var, Object obj, boolean z9, l7.c cVar) {
        super(2, cVar);
        this.f61d = pVar;
        this.f62e = g0Var;
        this.f63f = obj;
        this.f64m = z9;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        f0 f0Var = new f0(this.f61d, this.f62e, this.f63f, this.f64m, cVar);
        f0Var.f60c = obj;
        return f0Var;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((q0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r6.b(r2, r7) == r0) goto L21;
     */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            m7.a r0 = m7.a.f4049a
            int r1 = r7.f59b
            java.lang.Object r2 = r7.f63f
            a1.g0 r3 = r7.f62e
            kotlin.jvm.internal.p r4 = r7.f61d
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            c4.b.e0(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.jvm.internal.p r1 = r7.f58a
            java.lang.Object r6 = r7.f60c
            a1.q0 r6 = (a1.q0) r6
            c4.b.e0(r8)
            goto L43
        L28:
            c4.b.e0(r8)
            java.lang.Object r8 = r7.f60c
            a1.q0 r8 = (a1.q0) r8
            a1.s0 r1 = r3.h()
            r7.f60c = r8
            r7.f58a = r4
            r7.f59b = r6
            java.lang.Object r1 = r1.c(r7)
            if (r1 != r0) goto L40
            goto L58
        L40:
            r6 = r8
            r8 = r1
            r1 = r4
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.a = r8
            r8 = 0
            r7.f60c = r8
            r7.f58a = r8
            r7.f59b = r5
            java.lang.Object r8 = r6.b(r2, r7)
            if (r8 != r0) goto L59
        L58:
            return r0
        L59:
            boolean r8 = r7.f64m
            if (r8 == 0) goto L71
            l6.c r8 = r3.f79h
            a1.c r0 = new a1.c
            if (r2 == 0) goto L68
            int r1 = r2.hashCode()
            goto L69
        L68:
            r1 = 0
        L69:
            int r3 = r4.a
            r0.<init>(r2, r1, r3)
            r8.l(r0)
        L71:
            h7.l r8 = h7.l.f2236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
