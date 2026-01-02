package a1;

import android.net.Uri;
import android.view.InputEvent;
import java.io.File;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class t extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* renamed from: b  reason: collision with root package name */
    public int f189b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f190c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f191d;

    /* renamed from: e  reason: collision with root package name */
    public Object f192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g0 g0Var, u7.p pVar, l7.c cVar) {
        super(2, cVar);
        this.f188a = 1;
        this.f191d = g0Var;
        this.f192e = (n7.i) pVar;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f188a) {
            case 0:
                t tVar = new t((g0) this.f191d, cVar, 0);
                tVar.f190c = obj;
                return tVar;
            case 1:
                t tVar2 = new t((g0) this.f191d, (u7.p) ((n7.i) this.f192e), cVar);
                tVar2.f190c = obj;
                return tVar2;
            case 2:
                t tVar3 = new t((File) this.f191d, cVar, 2);
                tVar3.f190c = obj;
                return tVar3;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                t tVar4 = new t((g8.d) this.f192e, (g8.b) this.f191d, cVar);
                tVar4.f190c = obj;
                return tVar4;
            case 4:
                return new t((q5.d) this.f192e, (e1.e) this.f190c, (Long) this.f191d, cVar, 4);
            default:
                return new t((w1.a) this.f192e, (Uri) this.f190c, (InputEvent) this.f191d, cVar, 5);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f188a) {
            case 0:
                return ((t) create((g8.d) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 1:
                return ((t) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 2:
                return ((t) create((f8.q) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return ((t) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 4:
                return ((t) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            default:
                return ((t) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x025a, code lost:
        if (r8.a(r9, r12) == r7) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b9  */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g8.d dVar, g8.b bVar, l7.c cVar) {
        super(2, cVar);
        this.f188a = 3;
        this.f192e = dVar;
        this.f191d = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, l7.c cVar, int i) {
        super(2, cVar);
        this.f188a = i;
        this.f192e = obj;
        this.f190c = obj2;
        this.f191d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, l7.c cVar, int i) {
        super(2, cVar);
        this.f188a = i;
        this.f191d = obj;
    }
}
