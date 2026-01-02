package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class n extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f148a;

    /* renamed from: b  reason: collision with root package name */
    public int f149b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(g0 g0Var, l7.c cVar, int i) {
        super(2, cVar);
        this.f148a = i;
        this.f150c = g0Var;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f148a) {
            case 0:
                return new n(this.f150c, cVar, 0);
            case 1:
                return new n(this.f150c, cVar, 1);
            default:
                return new n(this.f150c, cVar, 2);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f148a) {
            case 0:
                return ((n) create((g8.d) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 1:
                return ((n) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            default:
                return ((n) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r13 == r0) goto L44;
     */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
