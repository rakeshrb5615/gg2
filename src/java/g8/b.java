package g8;

import d8.f0;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b implements h8.d {

    /* renamed from: a  reason: collision with root package name */
    public final l7.h f1880a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1881b;

    /* renamed from: c  reason: collision with root package name */
    public final f8.a f1882c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1883d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1884e;

    public b(Object obj, l7.h hVar, int i, f8.a aVar, int i9) {
        this.f1883d = i9;
        this.f1880a = hVar;
        this.f1881b = i;
        this.f1882c = aVar;
        this.f1884e = obj;
    }

    public final Object a(d dVar, n7.c cVar) {
        Object e9 = f0.e(new a1.t(dVar, this, (l7.c) null), cVar);
        return e9 == m7.a.f4049a ? e9 : h7.l.f2236a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        l7.i iVar = l7.i.f3796a;
        l7.h hVar = this.f1880a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i = this.f1881b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        f8.a aVar = f8.a.f1523a;
        f8.a aVar2 = this.f1882c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + i7.i.c0(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // h8.d
    public final c c(l7.h hVar, int i, f8.a aVar) {
        f8.a aVar2;
        l7.h hVar2 = this.f1880a;
        l7.h plus = hVar.plus(hVar2);
        f8.a aVar3 = f8.a.f1523a;
        f8.a aVar4 = this.f1882c;
        int i9 = this.f1881b;
        if (aVar != aVar3) {
            aVar2 = aVar;
        } else {
            if (i9 != -3) {
                if (i != -3) {
                    if (i9 != -2) {
                        if (i != -2) {
                            i += i9;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i9;
            }
            aVar2 = aVar4;
        }
        int i10 = i;
        if (kotlin.jvm.internal.j.a(plus, hVar2) && i10 == i9 && aVar2 == aVar4) {
            return this;
        }
        switch (this.f1883d) {
            case 0:
                return new b((a1.t) this.f1884e, plus, i10, aVar2, 0);
            default:
                return new b((c) this.f1884e, plus, i10, aVar2, 1);
        }
    }

    @Override // g8.c
    public Object f(d dVar, n7.c cVar) {
        Object a10;
        switch (this.f1883d) {
            case 1:
                int i = this.f1881b;
                h7.l lVar = h7.l.f2236a;
                if (i == -3) {
                    l7.h context = cVar.getContext();
                    Boolean bool = Boolean.FALSE;
                    d8.x xVar = new d8.x(0);
                    l7.h hVar = this.f1880a;
                    l7.h plus = !((Boolean) hVar.fold(bool, xVar)).booleanValue() ? context.plus(hVar) : f0.h(context, hVar, false);
                    if (kotlin.jvm.internal.j.a(plus, context)) {
                        a10 = ((c) this.f1884e).f(dVar, cVar);
                        m7.a aVar = m7.a.f4049a;
                        if (a10 != aVar) {
                            a10 = lVar;
                        }
                        if (a10 != aVar) {
                            return lVar;
                        }
                    } else {
                        l7.d dVar2 = l7.d.f3795a;
                        if (kotlin.jvm.internal.j.a(plus.get(dVar2), context.get(dVar2))) {
                            l7.h context2 = cVar.getContext();
                            if (!(dVar instanceof h8.j)) {
                                dVar = new o(dVar, context2);
                            }
                            a10 = h8.f.a(plus, dVar, i8.a.k(plus), new a1.d(this, (l7.c) null, 6), cVar);
                            if (a10 != m7.a.f4049a) {
                                return lVar;
                            }
                        }
                    }
                    return a10;
                }
                a10 = a(dVar, cVar);
                if (a10 != m7.a.f4049a) {
                    return lVar;
                }
                return a10;
            default:
                return a(dVar, cVar);
        }
    }

    public final String toString() {
        switch (this.f1883d) {
            case 0:
                return "block[" + ((a1.t) this.f1884e) + "] -> " + b();
            default:
                return ((c) this.f1884e) + " -> " + b();
        }
    }
}
