package a1;

import androidx.datastore.core.NativeSharedCounter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class v0 extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f212a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z0 f213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(z0 z0Var, l7.c cVar, int i) {
        super(2, cVar);
        this.f212a = i;
        this.f213b = z0Var;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f212a) {
            case 0:
                return new v0(this.f213b, cVar, 0);
            default:
                return new v0(this.f213b, cVar, 1);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        d8.c0 c0Var = (d8.c0) obj;
        l7.c cVar = (l7.c) obj2;
        switch (this.f212a) {
            case 0:
                return ((v0) create(c0Var, cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((v0) create(c0Var, cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f212a;
        NativeSharedCounter nativeSharedCounter = g1.f82b;
        z0 z0Var = this.f213b;
        switch (i) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                c4.b.e0(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((g1) z0Var.i.getValue()).f83a));
            default:
                m7.a aVar2 = m7.a.f4049a;
                c4.b.e0(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((g1) z0Var.i.getValue()).f83a));
        }
    }
}
