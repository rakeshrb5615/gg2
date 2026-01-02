package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class w extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public g0 f214a;

    /* renamed from: b  reason: collision with root package name */
    public m8.c f215b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f216c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0 f217d;

    /* renamed from: e  reason: collision with root package name */
    public int f218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0 g0Var, n7.c cVar) {
        super(cVar);
        this.f217d = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f216c = obj;
        this.f218e |= Integer.MIN_VALUE;
        return g0.e(this.f217d, this);
    }
}
