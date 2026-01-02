package g8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public o f1923a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1924b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f1925c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f1926d;

    /* renamed from: e  reason: collision with root package name */
    public int f1927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, l7.c cVar) {
        super(cVar);
        this.f1926d = oVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f1925c = obj;
        this.f1927e |= Integer.MIN_VALUE;
        return this.f1926d.a(null, this);
    }
}
