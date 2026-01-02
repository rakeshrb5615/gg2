package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class z extends n7.i implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f245a;

    /* renamed from: b  reason: collision with root package name */
    public int f246b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, l7.c cVar) {
        super(1, cVar);
        this.f247c = g0Var;
    }

    @Override // n7.a
    public final l7.c create(l7.c cVar) {
        return new z(this.f247c, cVar);
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        return ((z) create((l7.c) obj)).invokeSuspend(h7.l.f2236a);
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        l1 l1Var;
        m7.a aVar = m7.a.f4049a;
        int i = this.f246b;
        g0 g0Var = this.f247c;
        try {
        } catch (Throwable th2) {
            s0 h9 = g0Var.h();
            this.f245a = th2;
            this.f246b = 2;
            Object e9 = h9.e(this);
            if (e9 != aVar) {
                th = th2;
                obj = e9;
            }
        }
        if (i == 0) {
            c4.b.e0(obj);
            this.f246b = 1;
            obj = g0.g(g0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            if (i == 2) {
                th = this.f245a;
                c4.b.e0(obj);
                l1Var = new d1(((Number) obj).intValue(), th);
                return new h7.f(l1Var, Boolean.TRUE);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            c4.b.e0(obj);
        }
        l1Var = (l1) obj;
        return new h7.f(l1Var, Boolean.TRUE);
    }
}
