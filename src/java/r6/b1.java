package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b1 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public String f5598a;

    /* renamed from: b  reason: collision with root package name */
    public z0 f5599b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f5600c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c1 f5601d;

    /* renamed from: e  reason: collision with root package name */
    public int f5602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, l7.c cVar) {
        super(cVar);
        this.f5601d = c1Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f5600c = obj;
        this.f5602e |= Integer.MIN_VALUE;
        return c1.a(this.f5601d, null, null, this);
    }
}
