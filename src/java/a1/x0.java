package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class x0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f226a;

    /* renamed from: b  reason: collision with root package name */
    public Object f227b;

    /* renamed from: c  reason: collision with root package name */
    public Object f228c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f229d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z0 f230e;

    /* renamed from: f  reason: collision with root package name */
    public int f231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, n7.c cVar) {
        super(cVar);
        this.f230e = z0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f229d = obj;
        this.f231f |= Integer.MIN_VALUE;
        return this.f230e.a(null, this);
    }
}
