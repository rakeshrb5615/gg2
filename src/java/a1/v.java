package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class v extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f206a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f207b;

    /* renamed from: c  reason: collision with root package name */
    public d8.u f208c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f209d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g0 f210e;

    /* renamed from: f  reason: collision with root package name */
    public int f211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g0 g0Var, n7.c cVar) {
        super(cVar);
        this.f210e = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f209d = obj;
        this.f211f |= Integer.MIN_VALUE;
        return g0.d(this.f210e, null, this);
    }
}
