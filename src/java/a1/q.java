package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class q extends n7.i implements u7.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f179a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f180b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f181c;

    public /* synthetic */ q(int i, l7.c cVar) {
        super(i, cVar);
    }

    @Override // u7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f179a) {
            case 0:
                g8.d dVar = (g8.d) obj;
                Throwable th = (Throwable) obj2;
                return new q((g0) this.f181c, (l7.c) obj3).invokeSuspend(h7.l.f2236a);
            default:
                ((Boolean) obj2).getClass();
                q qVar = new q(3, (l7.c) obj3);
                qVar.f181c = (i0) obj;
                return qVar.invokeSuspend(h7.l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f179a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                int i = this.f180b;
                if (i == 0) {
                    c4.b.e0(obj);
                    this.f180b = 1;
                    if (g0.c((g0) this.f181c, this) == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c4.b.e0(obj);
                }
                return h7.l.f2236a;
            default:
                m7.a aVar2 = m7.a.f4049a;
                int i9 = this.f180b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        c4.b.e0(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4.b.e0(obj);
                i0 i0Var = (i0) this.f181c;
                this.f180b = 1;
                i0Var.getClass();
                Object a10 = i0.a(i0Var, this);
                return a10 == aVar2 ? aVar2 : a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0 g0Var, l7.c cVar) {
        super(3, cVar);
        this.f181c = g0Var;
    }
}
