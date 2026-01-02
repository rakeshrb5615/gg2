package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a0 extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b  reason: collision with root package name */
    public int f4b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ boolean f5c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0 f6d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f7e;

    /* renamed from: f  reason: collision with root package name */
    public Object f8f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(g0 g0Var, int i, l7.c cVar, int i9) {
        super(2, cVar);
        this.f3a = i9;
        this.f6d = g0Var;
        this.f7e = i;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f3a) {
            case 0:
                a0 a0Var = new a0(this.f6d, this.f7e, cVar, 0);
                a0Var.f5c = ((Boolean) obj).booleanValue();
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f6d, this.f7e, cVar, 1);
                a0Var2.f5c = ((Boolean) obj).booleanValue();
                return a0Var2;
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        l7.c cVar = (l7.c) obj2;
        switch (i) {
            case 0:
                return ((a0) create(bool, cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((a0) create(bool, cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
