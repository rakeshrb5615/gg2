package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class y extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public g0 f232a;

    /* renamed from: b  reason: collision with root package name */
    public l1 f233b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f234c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f235d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g0 f236e;

    /* renamed from: f  reason: collision with root package name */
    public int f237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, l7.c cVar) {
        super(cVar);
        this.f236e = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f235d = obj;
        this.f237f |= Integer.MIN_VALUE;
        return g0.f(this.f236e, false, this);
    }
}
