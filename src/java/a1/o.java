package a1;

import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class o extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f160a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, l7.c cVar, int i9) {
        super(i, cVar);
        this.f160a = i9;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f160a) {
            case 0:
                o oVar = new o(2, cVar, 0);
                oVar.f161b = obj;
                return oVar;
            case 1:
                o oVar2 = new o(2, cVar, 1);
                oVar2.f161b = obj;
                return oVar2;
            default:
                return new o((u6.h) this.f161b, cVar);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f160a) {
            case 0:
                return ((o) create((l1) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 1:
                h7.l lVar = h7.l.f2236a;
                ((o) create((String) obj, (l7.c) obj2)).invokeSuspend(lVar);
                return lVar;
            default:
                return ((o) create((u6.h) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f160a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                c4.b.e0(obj);
                return Boolean.valueOf(!(((l1) this.f161b) instanceof r0));
            case 1:
                m7.a aVar2 = m7.a.f4049a;
                c4.b.e0(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f161b));
                return h7.l.f2236a;
            default:
                m7.a aVar3 = m7.a.f4049a;
                c4.b.e0(obj);
                return (u6.h) this.f161b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u6.h hVar, l7.c cVar) {
        super(2, cVar);
        this.f160a = 2;
        this.f161b = hVar;
    }
}
