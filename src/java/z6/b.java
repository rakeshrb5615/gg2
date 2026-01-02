package z6;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b extends w6.z {

    /* renamed from: c  reason: collision with root package name */
    public static final a f7400c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Class f7401a;

    /* renamed from: b  reason: collision with root package name */
    public final m f7402b;

    public b(w6.m mVar, w6.z zVar, Class cls) {
        this.f7402b = new m(mVar, zVar, cls);
        this.f7401a = cls;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.B()) {
            arrayList.add(this.f7402b.f7422c.b(aVar));
        }
        aVar.x();
        int size = arrayList.size();
        Class cls = this.f7401a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        if (obj == null) {
            bVar.B();
            return;
        }
        bVar.f();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f7402b.c(bVar, Array.get(obj, i));
        }
        bVar.x();
    }
}
