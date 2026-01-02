package u6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f6126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f6127b;

    /* renamed from: c  reason: collision with root package name */
    public int f6128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, n7.c cVar) {
        super(cVar);
        this.f6127b = oVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f6126a = obj;
        this.f6128c |= Integer.MIN_VALUE;
        return this.f6127b.c(null, this);
    }
}
