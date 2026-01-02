package a8;

import i7.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class h extends a.a {
    public static List X(f fVar) {
        kotlin.jvm.internal.j.e(fVar, "<this>");
        Iterator it = fVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return arrayList;
            }
            return a.a.G(next);
        }
        return n.f2745a;
    }
}
