package q5;

import d8.c0;
import g8.z;
import h7.l;
import i7.o;
import n7.i;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5408a;

    /* renamed from: b  reason: collision with root package name */
    public int f5409b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, l7.c cVar, int i) {
        super(2, cVar);
        this.f5408a = i;
        this.f5410c = obj;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f5408a) {
            case 0:
                return new b((d) this.f5410c, cVar, 0);
            default:
                return new b((w1.a) this.f5410c, cVar, 1);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        l7.c cVar = (l7.c) obj2;
        switch (this.f5408a) {
            case 0:
                return ((b) create(c0Var, cVar)).invokeSuspend(l.f2236a);
            default:
                return ((b) create(c0Var, cVar)).invokeSuspend(l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5408a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                int i = this.f5409b;
                if (i == 0) {
                    c4.b.e0(obj);
                    g8.c b10 = ((d) this.f5410c).f5417c.f1303a.b();
                    this.f5409b = 1;
                    obj = z.e(b10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c4.b.e0(obj);
                }
                e1.b bVar = (e1.b) obj;
                return bVar != null ? bVar.a() : o.f2746a;
            default:
                m7.a aVar2 = m7.a.f4049a;
                int i9 = this.f5409b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        c4.b.e0(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4.b.e0(obj);
                x1.b bVar2 = ((w1.a) this.f5410c).f6425a;
                this.f5409b = 1;
                Object b11 = bVar2.b(this);
                return b11 == aVar2 ? aVar2 : b11;
        }
    }
}
