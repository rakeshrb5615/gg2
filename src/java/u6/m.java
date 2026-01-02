package u6;

import d8.c0;
import g8.z;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6123a;

    /* renamed from: b  reason: collision with root package name */
    public int f6124b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f6125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, l7.c cVar, int i) {
        super(2, cVar);
        this.f6123a = i;
        this.f6125c = oVar;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f6123a) {
            case 0:
                return new m(this.f6125c, cVar, 0);
            default:
                return new m(this.f6125c, cVar, 1);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        l7.c cVar = (l7.c) obj2;
        switch (this.f6123a) {
            case 0:
                return ((m) create(c0Var, cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((m) create(c0Var, cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6123a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                int i = this.f6124b;
                if (i == 0) {
                    c4.b.e0(obj);
                    o oVar = this.f6125c;
                    g8.c b10 = oVar.f6130b.b();
                    final AtomicReference atomicReference = oVar.f6131c;
                    g8.d dVar = new g8.d() { // from class: u6.l
                        @Override // g8.d
                        public final Object a(Object obj2, l7.c cVar) {
                            atomicReference.set((h) obj2);
                            m7.a aVar2 = m7.a.f4049a;
                            return h7.l.f2236a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof g8.d) && (obj2 instanceof l)) {
                                return new kotlin.jvm.internal.a(atomicReference).equals(new kotlin.jvm.internal.a(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            AtomicReference atomicReference2 = atomicReference;
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference2 != null ? atomicReference2.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.f6124b = 1;
                    if (b10.f(dVar, this) == aVar) {
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
                int i9 = this.f6124b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        c4.b.e0(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4.b.e0(obj);
                g8.c b11 = this.f6125c.f6130b.b();
                this.f6124b = 1;
                Object d9 = z.d(b11, this);
                return d9 == aVar2 ? aVar2 : d9;
        }
    }
}
