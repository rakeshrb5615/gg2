package u6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f6088a;

    /* renamed from: b  reason: collision with root package name */
    public m8.a f6089b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f6090c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f6091d;

    /* renamed from: e  reason: collision with root package name */
    public int f6092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, n7.c cVar2) {
        super(cVar2);
        this.f6091d = cVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f6090c = obj;
        this.f6092e |= Integer.MIN_VALUE;
        return this.f6091d.c(this);
    }
}
