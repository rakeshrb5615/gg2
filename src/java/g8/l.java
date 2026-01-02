package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class l extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public m f1916a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f1917b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f1918c;

    /* renamed from: d  reason: collision with root package name */
    public int f1919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, l7.c cVar) {
        super(cVar);
        this.f1918c = mVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f1917b = obj;
        this.f1919d |= Integer.MIN_VALUE;
        return this.f1918c.a(null, this);
    }
}
