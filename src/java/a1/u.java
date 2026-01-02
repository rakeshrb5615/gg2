package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class u extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public g0 f197a;

    /* renamed from: b  reason: collision with root package name */
    public m8.c f198b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f199c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0 f200d;

    /* renamed from: e  reason: collision with root package name */
    public int f201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g0 g0Var, n7.c cVar) {
        super(cVar);
        this.f200d = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f199c = obj;
        this.f201e |= Integer.MIN_VALUE;
        return g0.c(this.f200d, this);
    }
}
