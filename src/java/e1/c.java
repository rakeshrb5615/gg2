package e1;

import h7.l;
import i7.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import n7.i;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1299a;

    /* renamed from: b  reason: collision with root package name */
    public int f1300b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f1301c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f1302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, l7.c cVar, int i) {
        super(2, cVar);
        this.f1299a = i;
        switch (i) {
            case 1:
                this.f1302d = (i) pVar;
                super(2, cVar);
                return;
            default:
                this.f1302d = (i) pVar;
                return;
        }
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f1299a) {
            case 0:
                c cVar2 = new c(this.f1302d, cVar, 0);
                cVar2.f1301c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.f1302d, cVar, 1);
                cVar3.f1301c = obj;
                return cVar3;
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        l7.c cVar = (l7.c) obj2;
        switch (this.f1299a) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(l.f2236a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1299a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                int i = this.f1300b;
                if (i == 0) {
                    c4.b.e0(obj);
                    this.f1300b = 1;
                    obj = this.f1302d.invoke((b) this.f1301c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c4.b.e0(obj);
                }
                b bVar = (b) obj;
                j.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar.f1298b.f3791b).set(true);
                return bVar;
            default:
                m7.a aVar2 = m7.a.f4049a;
                int i9 = this.f1300b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        b bVar2 = (b) this.f1301c;
                        c4.b.e0(obj);
                        return bVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4.b.e0(obj);
                Object bVar3 = new b(r.s0(((b) this.f1301c).a()), false);
                this.f1301c = bVar3;
                this.f1300b = 1;
                return this.f1302d.invoke(bVar3, this) == aVar2 ? aVar2 : bVar3;
        }
    }
}
