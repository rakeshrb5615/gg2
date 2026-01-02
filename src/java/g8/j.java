package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f1908a;

    /* renamed from: b  reason: collision with root package name */
    public int f1909b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k2.c f1910c;

    /* renamed from: d  reason: collision with root package name */
    public k2.c f1911d;

    /* renamed from: e  reason: collision with root package name */
    public d f1912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k2.c cVar, n7.c cVar2) {
        super(cVar2);
        this.f1910c = cVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f1908a = obj;
        this.f1909b |= Integer.MIN_VALUE;
        return this.f1910c.f(null, this);
    }
}
