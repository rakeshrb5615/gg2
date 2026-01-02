package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class r0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public s0 f5721a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f5722b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s0 f5723c;

    /* renamed from: d  reason: collision with root package name */
    public int f5724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, n7.c cVar) {
        super(cVar);
        this.f5723c = s0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f5722b = obj;
        this.f5724d |= Integer.MIN_VALUE;
        return s0.a(this.f5723c, this);
    }
}
