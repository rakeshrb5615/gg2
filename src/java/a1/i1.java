package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class i1 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public m8.c f101a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f102b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f103c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k1 f104d;

    /* renamed from: e  reason: collision with root package name */
    public int f105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, n7.c cVar) {
        super(cVar);
        this.f104d = k1Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f103c = obj;
        this.f105e |= Integer.MIN_VALUE;
        return this.f104d.b(null, this);
    }
}
