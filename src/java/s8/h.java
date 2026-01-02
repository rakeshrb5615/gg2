package s8;

import i7.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h implements o8.a {

    /* renamed from: a  reason: collision with root package name */
    public final o8.a f5870a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5871b;

    public h(o8.a aVar) {
        p pVar = p.f5893a;
        this.f5870a = aVar;
        this.f5871b = new g(p.f5894b, aVar.d());
    }

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.j.e(map, "<this>");
        map.size();
        g gVar = this.f5871b;
        kotlin.jvm.internal.j.e(gVar, "descriptor");
        u8.i a10 = iVar.a(gVar);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.j.e(map2, "<this>");
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i9 = i + 1;
            a10.h(gVar, i, p.f5893a, key);
            i += 2;
            a10.h(gVar, i9, this.f5870a, value);
        }
        a10.l(gVar);
    }

    @Override // o8.a
    public Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        kotlin.jvm.internal.j.e(pVar, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        n.p b10 = pVar.b(d());
        while (true) {
            int c9 = b10.c(d());
            if (c9 == -1) {
                b10.n(d());
                kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i = c9 + size;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            kotlin.jvm.internal.j.e(linkedHashMap2, "builder");
            p pVar2 = p.f5893a;
            g gVar = this.f5871b;
            Object j = b10.j(gVar, i, pVar2, null);
            int c10 = b10.c(gVar);
            if (c10 != i + 1) {
                throw new IllegalArgumentException(v1.a.i("Value must follow key in a map, index for key: ", i, c10, ", returned index for value: ").toString());
            }
            boolean containsKey = linkedHashMap2.containsKey(j);
            o8.a aVar = this.f5870a;
            linkedHashMap2.put(j, (!containsKey || (aVar.d().c() instanceof q8.c)) ? b10.j(gVar, c10, aVar, null) : b10.j(gVar, c10, aVar, r.k0(linkedHashMap2, j)));
        }
    }

    @Override // o8.a
    public final q8.d d() {
        return this.f5871b;
    }
}
