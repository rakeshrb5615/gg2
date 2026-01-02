package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public kotlin.jvm.internal.p f46a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f47b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f48c;

    /* renamed from: d  reason: collision with root package name */
    public int f49d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, n7.c cVar) {
        super(cVar);
        this.f48c = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f47b = obj;
        this.f49d |= Integer.MIN_VALUE;
        return this.f48c.k(null, false, this);
    }
}
