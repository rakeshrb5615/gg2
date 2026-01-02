package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.u1;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class m extends u1 {
    public final void a(View view, Object obj) {
        ((s) obj).b(view);
    }

    public final void b(Object obj, ArrayList arrayList) {
        s sVar = (s) obj;
        if (sVar == null) {
            return;
        }
        int i = 0;
        if (sVar instanceof y) {
            y yVar = (y) sVar;
            int size = yVar.H.size();
            while (i < size) {
                b((i < 0 || i >= yVar.H.size()) ? null : (s) yVar.H.get(i), arrayList);
                i++;
            }
        } else if (u1.h(sVar.f1462e) && u1.h(sVar.f1463f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                sVar.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        w.a(viewGroup, (s) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof s;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((s) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        s sVar3 = (s) obj3;
        if (sVar != null && sVar2 != null) {
            y yVar = new y();
            yVar.M(sVar);
            yVar.M(sVar2);
            yVar.I = false;
            sVar = yVar;
        } else if (sVar == null) {
            sVar = sVar2 != null ? sVar2 : null;
        }
        if (sVar3 != null) {
            y yVar2 = new y();
            if (sVar != null) {
                yVar2.M(sVar);
            }
            yVar2.M(sVar3);
            return yVar2;
        }
        return sVar;
    }

    public final Object j(Object obj, Object obj2) {
        y yVar = new y();
        if (obj != null) {
            yVar.M((s) obj);
        }
        yVar.M((s) obj2);
        return yVar;
    }

    public final void k(Object obj, View view, ArrayList arrayList) {
        ((s) obj).a(new j(view, arrayList));
    }

    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((s) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.a, java.lang.Object] */
    public final void m(View view, Object obj) {
        if (view != null) {
            u1.g(view, new Rect());
            ((s) obj).F(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.a, java.lang.Object] */
    public final void n(Object obj, Rect rect) {
        ((s) obj).F(new Object());
    }

    public final void o(Object obj, m0.d dVar, androidx.fragment.app.d dVar2) {
        s sVar = (s) obj;
        dVar.a(new a5.u(1, sVar, dVar2));
        sVar.a(new l(dVar2));
    }

    public final void p(Object obj, View view, ArrayList arrayList) {
        y yVar = (y) obj;
        ArrayList arrayList2 = yVar.f1463f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u1.d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(yVar, arrayList);
    }

    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y yVar = (y) obj;
        if (yVar != null) {
            ArrayList arrayList3 = yVar.f1463f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(yVar, arrayList, arrayList2);
        }
    }

    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        y yVar = new y();
        yVar.M((s) obj);
        return yVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        s sVar = (s) obj;
        int i = 0;
        if (sVar instanceof y) {
            y yVar = (y) sVar;
            int size = yVar.H.size();
            while (i < size) {
                s((i < 0 || i >= yVar.H.size()) ? null : (s) yVar.H.get(i), arrayList, arrayList2);
                i++;
            }
        } else if (u1.h(sVar.f1462e)) {
            ArrayList arrayList3 = sVar.f1463f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    sVar.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    sVar.B((View) arrayList.get(size3));
                }
            }
        }
    }
}
