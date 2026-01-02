package r6;

import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class x0 extends n7.i implements u7.q {

    /* renamed from: a  reason: collision with root package name */
    public int f5760a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g8.d f5761b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Throwable f5762c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c1 f5763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(c1 c1Var, l7.c cVar) {
        super(3, cVar);
        this.f5763d = c1Var;
    }

    @Override // u7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        x0 x0Var = new x0(this.f5763d, (l7.c) obj3);
        x0Var.f5761b = (g8.d) obj;
        x0Var.f5762c = (Throwable) obj2;
        return x0Var.invokeSuspend(h7.l.f2236a);
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        m7.a aVar = m7.a.f4049a;
        int i = this.f5760a;
        if (i == 0) {
            c4.b.e0(obj);
            g8.d dVar = this.f5761b;
            Throwable th = this.f5762c;
            m0 a10 = this.f5763d.f5617b.a(null);
            h0 h0Var = new h0(a10, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + a10.f5696a);
            this.f5761b = null;
            this.f5760a = 1;
            if (dVar.a(h0Var, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            c4.b.e0(obj);
        }
        return h7.l.f2236a;
    }
}
