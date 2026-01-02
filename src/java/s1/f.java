package s1;

import c.r;
import c.s;
import g8.v;
import g8.y;
import i7.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final y f5789a = new y(g.f5801b);

    /* renamed from: b  reason: collision with root package name */
    public final y f5790b;

    /* renamed from: c  reason: collision with root package name */
    public final v f5791c;

    /* renamed from: d  reason: collision with root package name */
    public final i7.g f5792d;

    /* renamed from: e  reason: collision with root package name */
    public final i7.g f5793e;

    /* renamed from: f  reason: collision with root package name */
    public r f5794f;

    /* renamed from: g  reason: collision with root package name */
    public int f5795g;

    /* renamed from: h  reason: collision with root package name */
    public e f5796h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashSet f5797k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5798l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5799m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5800n;

    public f() {
        y yVar = new y(new d());
        this.f5790b = yVar;
        this.f5791c = new v(yVar);
        this.f5792d = new i7.g();
        this.f5793e = new i7.g();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.f5797k = new LinkedHashSet();
    }

    public final void a(c cVar, e eVar, int i) {
        kotlin.jvm.internal.j.e(cVar, "dispatcher");
        if (eVar.f5787a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.f5797k).add(eVar);
            eVar.f5787a = cVar;
            kotlin.jvm.internal.j.e((d) this.f5791c.f1951a.b(), "history");
            eVar.b(i != 0 ? i != 1 ? this.f5800n : this.f5798l : this.f5799m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + eVar + "' is already added to dispatcher " + eVar.f5787a + '.').toString());
    }

    public final void b() {
        boolean z9;
        boolean z10;
        d dVar;
        i7.g gVar = this.f5792d;
        if (gVar == null || !gVar.isEmpty()) {
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                if (((r) it.next()).f833b) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        i7.g gVar2 = this.f5793e;
        if (gVar2 == null || !gVar2.isEmpty()) {
            Iterator it2 = gVar2.iterator();
            while (it2.hasNext()) {
                if (((r) it2.next()).f833b) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z11 = z9 || z10;
        boolean z12 = this.f5799m != z9;
        boolean z13 = this.f5798l != z10;
        boolean z14 = this.f5800n != z11;
        LinkedHashSet<e> linkedHashSet = this.f5797k;
        if (z12) {
            for (e eVar : linkedHashSet) {
                eVar.b(z9);
            }
        }
        LinkedHashSet<e> linkedHashSet2 = this.j;
        if (z13) {
            for (e eVar2 : linkedHashSet2) {
                eVar2.b(z10);
            }
        }
        LinkedHashSet<e> linkedHashSet3 = this.i;
        if (z14) {
            for (e eVar3 : linkedHashSet3) {
                eVar3.b(z11);
            }
        }
        this.f5799m = z9;
        this.f5798l = z10;
        this.f5800n = z11;
        r rVar = this.f5794f;
        if (rVar == null) {
            rVar = c(0);
        }
        r rVar2 = this.f5794f;
        if (rVar2 == null) {
            rVar2 = c(0);
        }
        if (kotlin.jvm.internal.j.a(rVar2, rVar)) {
            if (rVar2 == null) {
                dVar = new d();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = gVar.iterator();
                while (it3.hasNext()) {
                    ((r) it3.next()).getClass();
                }
                Iterator<E> it4 = gVar2.iterator();
                while (it4.hasNext()) {
                    ((r) it4.next()).getClass();
                }
                s sVar = rVar2.f832a;
                j7.c cVar = new j7.c(10);
                i7.i.Y(arrayList, cVar);
                cVar.add(sVar);
                i7.i.Y(n.f2745a, cVar);
                cVar.g();
                cVar.f3327c = true;
                if (cVar.f3326b <= 0) {
                    cVar = j7.c.f3324d;
                }
                dVar = new d(cVar, arrayList.size());
            }
            y yVar = this.f5790b;
            if (kotlin.jvm.internal.j.a((d) yVar.b(), dVar)) {
                return;
            }
            yVar.e(null, dVar);
            for (e eVar4 : linkedHashSet) {
                eVar4.getClass();
            }
            for (e eVar5 : linkedHashSet2) {
                eVar5.getClass();
            }
            for (e eVar6 : linkedHashSet3) {
                eVar6.getClass();
            }
        }
    }

    public final r c(int i) {
        Object obj;
        Object obj2;
        i7.g gVar = this.f5793e;
        i7.g gVar2 = this.f5792d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = gVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r) obj).f833b) {
                    break;
                }
            }
            r rVar = (r) obj;
            if (rVar == null) {
                Iterator it2 = gVar.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((r) next).f833b) {
                        obj3 = next;
                        break;
                    }
                }
                return (r) obj3;
            }
            return rVar;
        } else if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = gVar2.iterator();
            while (it3.hasNext()) {
                ((r) it3.next()).getClass();
            }
            Iterator it4 = gVar.iterator();
            while (it4.hasNext()) {
                ((r) it4.next()).getClass();
            }
            return null;
        } else {
            Iterator it5 = gVar2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it5.next();
                if (((r) obj2).f833b) {
                    break;
                }
            }
            r rVar2 = (r) obj2;
            if (rVar2 == null) {
                Iterator it6 = gVar.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next2 = it6.next();
                    if (((r) next2).f833b) {
                        obj3 = next2;
                        break;
                    }
                }
                return (r) obj3;
            }
            return rVar2;
        }
    }
}
