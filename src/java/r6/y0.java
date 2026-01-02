package r6;

import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class y0 extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5765a;

    /* renamed from: b  reason: collision with root package name */
    public int f5766b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c1 f5767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(c1 c1Var, l7.c cVar, int i) {
        super(2, cVar);
        this.f5765a = i;
        this.f5767c = c1Var;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f5765a) {
            case 0:
                return new y0(this.f5767c, cVar, 0);
            default:
                return new y0(this.f5767c, cVar, 1);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        d8.c0 c0Var = (d8.c0) obj;
        l7.c cVar = (l7.c) obj2;
        switch (this.f5765a) {
            case 0:
                return ((y0) create(c0Var, cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((y0) create(c0Var, cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5765a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                int i = this.f5766b;
                if (i == 0) {
                    c4.b.e0(obj);
                    c1 c1Var = this.f5767c;
                    k2.c cVar = new k2.c(19, c1Var.f5620e.b(), new x0(c1Var, null));
                    a1.s sVar = new a1.s(c1Var, 2);
                    this.f5766b = 1;
                    if (cVar.f(sVar, this) == aVar) {
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
                int i9 = this.f5766b;
                c1 c1Var2 = this.f5767c;
                try {
                    if (i9 == 0) {
                        c4.b.e0(obj);
                        a1.h hVar = c1Var2.f5620e;
                        a1 a1Var = new a1(c1Var2, null, 0);
                        this.f5766b = 1;
                        if (hVar.a(a1Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        c4.b.e0(obj);
                    }
                } catch (Exception e9) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e9.getMessage());
                    h0 h0Var = c1Var2.f5623h;
                    if (h0Var == null) {
                        kotlin.jvm.internal.j.i("localSessionData");
                        throw null;
                    }
                    c1Var2.f5623h = h0.a(h0Var, null, c1Var2.f5619d.a(), null, 5);
                }
                return h7.l.f2236a;
        }
    }
}
