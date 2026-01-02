package z6;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class l extends w6.z {

    /* renamed from: a  reason: collision with root package name */
    public static final l f7419a = new l();

    private l() {
    }

    public static w6.o d(e7.a aVar, int i) {
        int c9 = u.e.c(i);
        if (c9 != 5) {
            if (c9 != 6) {
                if (c9 != 7) {
                    if (c9 == 8) {
                        aVar.K();
                        return w6.q.f6481a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(v1.a.z(i)));
                }
                return new w6.s(Boolean.valueOf(aVar.E()));
            }
            return new w6.s(new y6.k(aVar.M()));
        }
        return new w6.s(aVar.M());
    }

    public static void e(e7.b bVar, w6.o oVar) {
        if (oVar == null || (oVar instanceof w6.q)) {
            bVar.B();
            return;
        }
        boolean z9 = oVar instanceof w6.s;
        if (z9) {
            if (!z9) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            w6.s sVar = (w6.s) oVar;
            Serializable serializable = sVar.f6483a;
            if (serializable instanceof Number) {
                bVar.H(sVar.b());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.J(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.c()));
                return;
            } else {
                bVar.I(sVar.c());
                return;
            }
        }
        boolean z10 = oVar instanceof w6.n;
        if (z10) {
            bVar.f();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            ArrayList arrayList = ((w6.n) oVar).f6480a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e(bVar, (w6.o) obj);
            }
            bVar.x();
            return;
        }
        boolean z11 = oVar instanceof w6.r;
        if (!z11) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        bVar.i();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Object: " + oVar);
        }
        Iterator it = ((y6.m) ((w6.r) oVar).f6482a.entrySet()).iterator();
        while (((y6.l) it).hasNext()) {
            y6.n b10 = ((y6.l) it).b();
            bVar.z((String) b10.getKey());
            e(bVar, (w6.o) b10.getValue());
        }
        bVar.y();
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        w6.o nVar;
        w6.o nVar2;
        int O = aVar.O();
        int c9 = u.e.c(O);
        if (c9 == 0) {
            aVar.c();
            nVar = new w6.n();
        } else if (c9 != 2) {
            nVar = null;
        } else {
            aVar.f();
            nVar = new w6.r();
        }
        if (nVar == null) {
            return d(aVar, O);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.B()) {
                String I = nVar instanceof w6.r ? aVar.I() : null;
                int O2 = aVar.O();
                int c10 = u.e.c(O2);
                if (c10 == 0) {
                    aVar.c();
                    nVar2 = new w6.n();
                } else if (c10 != 2) {
                    nVar2 = null;
                } else {
                    aVar.f();
                    nVar2 = new w6.r();
                }
                boolean z9 = nVar2 != null;
                if (nVar2 == null) {
                    nVar2 = d(aVar, O2);
                }
                if (nVar instanceof w6.n) {
                    ((w6.n) nVar).f6480a.add(nVar2);
                } else {
                    ((w6.r) nVar).f6482a.put(I, nVar2);
                }
                if (z9) {
                    arrayDeque.addLast(nVar);
                    nVar = nVar2;
                }
            } else {
                if (nVar instanceof w6.n) {
                    aVar.x();
                } else {
                    aVar.y();
                }
                if (arrayDeque.isEmpty()) {
                    return nVar;
                }
                nVar = (w6.o) arrayDeque.removeLast();
            }
        }
    }

    @Override // w6.z
    public final /* bridge */ /* synthetic */ void c(e7.b bVar, Object obj) {
        e(bVar, (w6.o) obj);
    }
}
