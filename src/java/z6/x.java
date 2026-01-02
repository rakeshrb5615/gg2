package z6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class x extends w6.z {
    @Override // w6.z
    public final Object b(e7.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.B()) {
            try {
                arrayList.add(Integer.valueOf(aVar.G()));
            } catch (NumberFormatException e9) {
                throw new RuntimeException(e9);
            }
        }
        aVar.x();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bVar.f();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            bVar.G(atomicIntegerArray.get(i));
        }
        bVar.x();
    }
}
