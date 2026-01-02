package u6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public k f6116a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f6117b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f6118c;

    /* renamed from: d  reason: collision with root package name */
    public int f6119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, n7.c cVar) {
        super(cVar);
        this.f6118c = kVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f6117b = obj;
        this.f6119d |= Integer.MIN_VALUE;
        return this.f6118c.b(this);
    }
}
