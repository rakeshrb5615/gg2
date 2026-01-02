package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public h8.g f1875a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f1876b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l6.c f1877c;

    /* renamed from: d  reason: collision with root package name */
    public int f1878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l6.c cVar, n7.c cVar2) {
        super(cVar2);
        this.f1877c = cVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f1876b = obj;
        this.f1878d |= Integer.MIN_VALUE;
        return this.f1877c.f(null, this);
    }
}
