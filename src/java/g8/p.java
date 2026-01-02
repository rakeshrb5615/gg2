package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class p extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f1932a;

    /* renamed from: b  reason: collision with root package name */
    public int f1933b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k2.c f1934c;

    /* renamed from: d  reason: collision with root package name */
    public m f1935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k2.c cVar, n7.c cVar2) {
        super(cVar2);
        this.f1934c = cVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f1932a = obj;
        this.f1933b |= Integer.MIN_VALUE;
        return this.f1934c.f(null, this);
    }
}
