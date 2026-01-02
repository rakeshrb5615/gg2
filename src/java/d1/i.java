package d1;

import h7.l;
import i7.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import u7.q;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class i extends n7.i implements q {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ c1.f f1065a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ e1.b f1066b;

    /* JADX WARN: Type inference failed for: r0v0, types: [n7.i, d1.i] */
    @Override // u7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        ?? iVar = new n7.i(3, (l7.c) obj3);
        iVar.f1065a = (c1.f) obj;
        iVar.f1066b = (e1.b) obj2;
        return iVar.invokeSuspend(l.f2236a);
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        m7.a aVar = m7.a.f4049a;
        c4.b.e0(obj);
        c1.f fVar = this.f1065a;
        e1.b bVar = this.f1066b;
        Set<e1.e> keySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(i7.j.X(keySet, 10));
        for (e1.e eVar : keySet) {
            arrayList.add(eVar.f1304a);
        }
        Map<String, ?> all = fVar.f863a.getAll();
        kotlin.jvm.internal.j.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            Set set = fVar.f864b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r.l0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = i7.i.n0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        e1.b bVar2 = new e1.b(r.s0(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                kotlin.jvm.internal.j.e(str, "name");
                bVar2.e(new e1.e(str), value2);
            } else if (value2 instanceof Float) {
                kotlin.jvm.internal.j.e(str, "name");
                bVar2.e(new e1.e(str), value2);
            } else if (value2 instanceof Integer) {
                kotlin.jvm.internal.j.e(str, "name");
                bVar2.e(new e1.e(str), value2);
            } else if (value2 instanceof Long) {
                kotlin.jvm.internal.j.e(str, "name");
                bVar2.e(new e1.e(str), value2);
            } else if (value2 instanceof String) {
                kotlin.jvm.internal.j.e(str, "name");
                bVar2.e(new e1.e(str), value2);
            } else if (value2 instanceof Set) {
                bVar2.e(c4.b.c0(str), (Set) value2);
            }
        }
        return new e1.b(r.s0(bVar2.a()), true);
    }
}
