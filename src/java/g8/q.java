package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class q extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public m f1936a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f1937b;

    /* renamed from: c  reason: collision with root package name */
    public int f1938c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f1939d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, l7.c cVar) {
        super(cVar);
        this.f1939d = mVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f1937b = obj;
        this.f1938c |= Integer.MIN_VALUE;
        return this.f1939d.a(null, this);
    }
}
