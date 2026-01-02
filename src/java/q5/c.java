package q5;

import e1.e;
import h7.l;
import n7.i;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5411a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f5412b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Long f5413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Long l5, l7.c cVar) {
        super(2, cVar);
        this.f5412b = eVar;
        this.f5413c = l5;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        c cVar2 = new c(this.f5412b, this.f5413c, cVar);
        cVar2.f5411a = obj;
        return cVar2;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = l.f2236a;
        ((c) create((e1.b) obj, (l7.c) obj2)).invokeSuspend(lVar);
        return lVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        m7.a aVar = m7.a.f4049a;
        c4.b.e0(obj);
        ((e1.b) this.f5411a).d(this.f5412b, this.f5413c);
        return l.f2236a;
    }
}
