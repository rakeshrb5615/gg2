package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class h1 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f89a;

    /* renamed from: b  reason: collision with root package name */
    public m8.c f90b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f91c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k1 f92d;

    /* renamed from: e  reason: collision with root package name */
    public int f93e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var, n7.c cVar) {
        super(cVar);
        this.f92d = k1Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f91c = obj;
        this.f93e |= Integer.MIN_VALUE;
        return this.f92d.a(null, this);
    }
}
