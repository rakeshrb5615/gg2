package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a1 extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5591a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f5592b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c1 f5593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(c1 c1Var, l7.c cVar, int i) {
        super(2, cVar);
        this.f5591a = i;
        this.f5593c = c1Var;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f5591a) {
            case 0:
                a1 a1Var = new a1(this.f5593c, cVar, 0);
                a1Var.f5592b = obj;
                return a1Var;
            default:
                a1 a1Var2 = new a1(this.f5593c, cVar, 1);
                a1Var2.f5592b = obj;
                return a1Var2;
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        l7.c cVar = (l7.c) obj2;
        switch (this.f5591a) {
            case 0:
                return ((a1) create(h0Var, cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((a1) create(h0Var, cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
