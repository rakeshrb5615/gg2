package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public o0 f141a;

    /* renamed from: b  reason: collision with root package name */
    public i0 f142b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f143c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f144d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o0 f145e;

    /* renamed from: f  reason: collision with root package name */
    public int f146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, n7.c cVar) {
        super(cVar);
        this.f145e = o0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f144d = obj;
        this.f146f |= Integer.MIN_VALUE;
        return this.f145e.a(null, this);
    }
}
