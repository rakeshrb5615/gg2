package a1;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class p extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f169a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f170b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, l7.c cVar, int i) {
        super(2, cVar);
        this.f169a = i;
        this.f171c = obj;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f169a) {
            case 0:
                p pVar = new p((l1) this.f171c, cVar, 0);
                pVar.f170b = obj;
                return pVar;
            case 1:
                p pVar2 = new p((Set) this.f171c, cVar, 1);
                pVar2.f170b = obj;
                return pVar2;
            case 2:
                p pVar3 = new p((u7.l) this.f171c, cVar, 2);
                pVar3.f170b = obj;
                return pVar3;
            default:
                p pVar4 = new p((x1.e) this.f171c, cVar, 3);
                pVar4.f170b = obj;
                return pVar4;
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f169a) {
            case 0:
                return ((p) create((l1) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 1:
                return ((p) create((e1.b) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 2:
                h7.l lVar = h7.l.f2236a;
                ((p) create((e1.b) obj, (l7.c) obj2)).invokeSuspend(lVar);
                return lVar;
            default:
                ((p) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
                throw null;
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f169a;
        boolean z9 = true;
        Object obj2 = this.f171c;
        switch (i) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                c4.b.e0(obj);
                l1 l1Var = (l1) this.f170b;
                return Boolean.valueOf((!(l1Var instanceof c) || l1Var.f138a > ((l1) obj2).f138a) ? false : false);
            case 1:
                m7.a aVar2 = m7.a.f4049a;
                c4.b.e0(obj);
                Set<e1.e> keySet = ((e1.b) this.f170b).a().keySet();
                ArrayList arrayList = new ArrayList(i7.j.X(keySet, 10));
                for (e1.e eVar : keySet) {
                    arrayList.add(eVar.f1304a);
                }
                Set<String> set = (Set) obj2;
                if (set != d1.j.f1067a) {
                    if (set == null || !set.isEmpty()) {
                        for (String str : set) {
                            if (!arrayList.contains(str)) {
                            }
                        }
                    }
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 2:
                m7.a aVar3 = m7.a.f4049a;
                c4.b.e0(obj);
                ((u7.l) obj2).invoke((e1.b) this.f170b);
                return h7.l.f2236a;
            default:
                m7.a aVar4 = m7.a.f4049a;
                c4.b.e0(obj);
                d8.c0 c0Var = (d8.c0) this.f170b;
                throw null;
        }
    }
}
