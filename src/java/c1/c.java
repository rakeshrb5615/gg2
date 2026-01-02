package c1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public d f852a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f853b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f854c;

    /* renamed from: d  reason: collision with root package name */
    public int f855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, n7.c cVar) {
        super(cVar);
        this.f854c = dVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f853b = obj;
        this.f855d |= Integer.MIN_VALUE;
        return this.f854c.a(null, this);
    }
}
