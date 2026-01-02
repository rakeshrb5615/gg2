package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class v extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f5742a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f5743b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f5744c;

    /* renamed from: d  reason: collision with root package name */
    public int f5745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, n7.c cVar) {
        super(cVar);
        this.f5744c = qVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f5743b = obj;
        this.f5745d |= Integer.MIN_VALUE;
        return this.f5744c.a(null, this);
    }
}
