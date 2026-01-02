package i7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class r extends c4.b {
    public static Object k0(Map map, Object obj) {
        kotlin.jvm.internal.j.e(map, "<this>");
        if (map instanceof q) {
            return ((q) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int l0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map m0(h7.f fVar) {
        kotlin.jvm.internal.j.e(fVar, "pair");
        Map singletonMap = Collections.singletonMap(fVar.f2225a, fVar.f2226b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map n0(h7.f... fVarArr) {
        if (fVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(l0(fVarArr.length));
            p0(linkedHashMap, fVarArr);
            return linkedHashMap;
        }
        return o.f2746a;
    }

    public static LinkedHashMap o0(h7.f... fVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0(fVarArr.length));
        p0(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final void p0(LinkedHashMap linkedHashMap, h7.f[] fVarArr) {
        for (h7.f fVar : fVarArr) {
            linkedHashMap.put(fVar.f2225a, fVar.f2226b);
        }
    }

    public static Map q0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(l0(arrayList.size()));
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    h7.f fVar = (h7.f) obj;
                    linkedHashMap.put(fVar.f2225a, fVar.f2226b);
                }
                return linkedHashMap;
            }
            return m0((h7.f) arrayList.get(0));
        }
        return o.f2746a;
    }

    public static Map r0(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return s0(map);
            }
            kotlin.jvm.internal.j.e(map, "<this>");
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            kotlin.jvm.internal.j.d(singletonMap, "with(...)");
            return singletonMap;
        }
        return o.f2746a;
    }

    public static LinkedHashMap s0(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
