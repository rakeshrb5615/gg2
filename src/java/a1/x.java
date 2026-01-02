package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class x extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public g0 f221a;

    /* renamed from: b  reason: collision with root package name */
    public int f222b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f223c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0 f224d;

    /* renamed from: e  reason: collision with root package name */
    public int f225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, n7.c cVar) {
        super(cVar);
        this.f224d = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f223c = obj;
        this.f225e |= Integer.MIN_VALUE;
        return this.f224d.i(this);
    }
}
