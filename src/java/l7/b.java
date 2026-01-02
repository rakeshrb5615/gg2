package l7;

import d8.x;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b implements h, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final h f3793a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3794b;

    public b(f fVar, h hVar) {
        j.e(hVar, "left");
        j.e(fVar, "element");
        this.f3793a = hVar;
        this.f3794b = fVar;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i = 2;
                b bVar2 = bVar;
                int i9 = 2;
                while (true) {
                    h hVar = bVar2.f3793a;
                    bVar2 = hVar instanceof b ? (b) hVar : null;
                    if (bVar2 == null) {
                        break;
                    }
                    i9++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.f3793a;
                    bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                    if (bVar3 == null) {
                        break;
                    }
                    i++;
                }
                if (i9 == i) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f3794b;
                        if (!j.a(bVar.get(fVar.getKey()), fVar)) {
                            z9 = false;
                            break;
                        }
                        h hVar3 = bVar4.f3793a;
                        if (!(hVar3 instanceof b)) {
                            j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z9 = j.a(bVar.get(fVar2.getKey()), fVar2);
                            break;
                        }
                        bVar4 = (b) hVar3;
                    }
                    if (z9) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // l7.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f3793a.fold(obj, pVar), this.f3794b);
    }

    @Override // l7.h
    public final f get(g gVar) {
        j.e(gVar, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f3794b.get(gVar);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f3793a;
            if (!(hVar instanceof b)) {
                return hVar.get(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final int hashCode() {
        return this.f3794b.hashCode() + this.f3793a.hashCode();
    }

    @Override // l7.h
    public final h minusKey(g gVar) {
        j.e(gVar, "key");
        f fVar = this.f3794b;
        f fVar2 = fVar.get(gVar);
        h hVar = this.f3793a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(gVar);
        return minusKey == hVar ? this : minusKey == i.f3796a ? fVar : new b(fVar, minusKey);
    }

    @Override // l7.h
    public final h plus(h hVar) {
        j.e(hVar, "context");
        return hVar == i.f3796a ? this : (h) hVar.fold(this, new x(8));
    }

    public final String toString() {
        return "[" + ((String) fold("", new x(7))) + ']';
    }
}
