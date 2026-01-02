package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e1 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public j6.s f50a;

    /* renamed from: b  reason: collision with root package name */
    public m8.a f51b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f52c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j6.s f53d;

    /* renamed from: e  reason: collision with root package name */
    public int f54e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j6.s sVar, n7.c cVar) {
        super(cVar);
        this.f53d = sVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f52c = obj;
        this.f54e |= Integer.MIN_VALUE;
        return this.f53d.q(this);
    }
}
