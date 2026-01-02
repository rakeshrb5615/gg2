package z6;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class p extends w6.z {

    /* renamed from: c  reason: collision with root package name */
    public static final n f7428c = new n(w6.x.f6484a, 1);

    /* renamed from: a  reason: collision with root package name */
    public final w6.m f7429a;

    /* renamed from: b  reason: collision with root package name */
    public final w6.x f7430b;

    public p(w6.m mVar, w6.x xVar) {
        this.f7429a = mVar;
        this.f7430b = xVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int O = aVar.O();
        int c9 = u.e.c(O);
        if (c9 == 0) {
            aVar.c();
            arrayList = new ArrayList();
        } else if (c9 != 2) {
            arrayList = null;
        } else {
            aVar.f();
            arrayList = new y6.o(true);
        }
        if (arrayList == null) {
            return d(aVar, O);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.B()) {
                String I = arrayList instanceof Map ? aVar.I() : null;
                int O2 = aVar.O();
                int c10 = u.e.c(O2);
                if (c10 == 0) {
                    aVar.c();
                    arrayList2 = new ArrayList();
                } else if (c10 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.f();
                    arrayList2 = new y6.o(true);
                }
                boolean z9 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, O2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(I, arrayList2);
                }
                if (z9) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.x();
                } else {
                    aVar.y();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        if (obj == null) {
            bVar.B();
            return;
        }
        Class<?> cls = obj.getClass();
        w6.m mVar = this.f7429a;
        mVar.getClass();
        w6.z b10 = mVar.b(new d7.a(cls));
        if (!(b10 instanceof p)) {
            b10.c(bVar, obj);
            return;
        }
        bVar.i();
        bVar.y();
    }

    public final Serializable d(e7.a aVar, int i) {
        int c9 = u.e.c(i);
        if (c9 != 5) {
            if (c9 != 6) {
                if (c9 != 7) {
                    if (c9 == 8) {
                        aVar.K();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(v1.a.z(i)));
                }
                return Boolean.valueOf(aVar.E());
            }
            return this.f7430b.a(aVar);
        }
        return aVar.M();
    }
}
