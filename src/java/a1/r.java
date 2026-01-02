package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class r extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f182a;

    /* renamed from: b  reason: collision with root package name */
    public int f183b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, l7.c cVar) {
        super(cVar);
        this.f184c = sVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f182a = obj;
        this.f183b |= Integer.MIN_VALUE;
        return this.f184c.a(null, this);
    }
}
