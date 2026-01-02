package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class i extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public j6.s f94a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f95b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j6.s f96c;

    /* renamed from: d  reason: collision with root package name */
    public int f97d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j6.s sVar, n7.c cVar) {
        super(cVar);
        this.f96c = sVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f95b = obj;
        this.f97d |= Integer.MIN_VALUE;
        return this.f96c.e(this);
    }
}
