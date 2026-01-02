package a5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j5.t1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class j implements d {

    /* renamed from: h  reason: collision with root package name */
    public static final g f585h = new g(0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f586a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f587b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f588c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f589d;

    /* renamed from: e  reason: collision with root package name */
    public final p f590e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference f591f;

    /* renamed from: g  reason: collision with root package name */
    public final a6.e f592g;

    public j(ArrayList arrayList, ArrayList arrayList2, a6.e eVar) {
        b5.n nVar = b5.n.f759a;
        this.f586a = new HashMap();
        this.f587b = new HashMap();
        this.f588c = new HashMap();
        this.f589d = new HashSet();
        this.f591f = new AtomicReference();
        p pVar = new p();
        this.f590e = pVar;
        this.f592g = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(c.c(pVar, p.class, x5.c.class, x5.b.class));
        int i = 0;
        arrayList3.add(c.c(this, j.class, new Class[0]));
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            c cVar = (c) obj;
            if (cVar != null) {
                arrayList3.add(cVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((c6.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f592g.f(componentRegistrar));
                        it.remove();
                    }
                } catch (q e9) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((c) it2.next()).f570b.toArray();
                int length = array.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        Object obj3 = array[i11];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f589d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f589d.add(obj3.toString());
                        }
                        i11++;
                    }
                }
            }
            if (this.f586a.isEmpty()) {
                t1.n(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f586a.keySet());
                arrayList6.addAll(arrayList3);
                t1.n(arrayList6);
            }
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                c cVar2 = (c) obj4;
                this.f586a.put(cVar2, new r(new h(0, this, cVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f591f.get();
        if (bool != null) {
            i(this.f586a, bool.booleanValue());
        }
    }

    @Override // a5.d
    public final synchronized c6.b b(x xVar) {
        q4.b.f(xVar, "Null interface requested.");
        return (c6.b) this.f587b.get(xVar);
    }

    @Override // a5.d
    public final synchronized c6.b d(x xVar) {
        s sVar = (s) this.f588c.get(xVar);
        if (sVar != null) {
            return sVar;
        }
        return f585h;
    }

    @Override // a5.d
    public final v g(x xVar) {
        c6.b b10 = b(xVar);
        return b10 == null ? new v(v.f613c, v.f614d) : b10 instanceof v ? (v) b10 : new v(null, b10);
    }

    public final void i(HashMap hashMap, boolean z9) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            c6.b bVar = (c6.b) entry.getValue();
            int i = ((c) entry.getKey()).f572d;
            if (i == 1 || (i == 2 && z9)) {
                bVar.get();
            }
        }
        p pVar = this.f590e;
        synchronized (pVar) {
            try {
                arrayDeque = pVar.f602b;
                if (arrayDeque != null) {
                    pVar.f602b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw v1.a.e(it);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [a5.s, java.lang.Object] */
    public final void j() {
        HashMap hashMap = this.f587b;
        HashMap hashMap2 = this.f588c;
        for (c cVar : this.f586a.keySet()) {
            for (m mVar : cVar.f571c) {
                boolean z9 = mVar.f599b == 2;
                x xVar = mVar.f598a;
                if (z9 && !hashMap2.containsKey(xVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f608b = null;
                    obj.f607a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f607a.addAll(set);
                    hashMap2.put(xVar, obj);
                } else if (hashMap.containsKey(xVar)) {
                    continue;
                } else {
                    int i = mVar.f599b;
                    if (i == 1) {
                        throw new RuntimeException("Unsatisfied dependency for component " + cVar + ": " + xVar);
                    } else if (i != 2) {
                        hashMap.put(xVar, new v(v.f613c, v.f614d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (cVar.f573e == 0) {
                c6.b bVar = (c6.b) this.f586a.get(cVar);
                for (x xVar : cVar.f570b) {
                    HashMap hashMap = this.f587b;
                    if (hashMap.containsKey(xVar)) {
                        arrayList2.add(new i(0, (v) ((c6.b) hashMap.get(xVar)), bVar));
                    } else {
                        hashMap.put(xVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [a5.s, java.lang.Object] */
    public final ArrayList l() {
        HashMap hashMap = this.f588c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f586a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (cVar.f573e != 0) {
                c6.b bVar = (c6.b) entry.getValue();
                for (x xVar : cVar.f570b) {
                    if (!hashMap2.containsKey(xVar)) {
                        hashMap2.put(xVar, new HashSet());
                    }
                    ((Set) hashMap2.get(xVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                s sVar = (s) hashMap.get(entry2.getKey());
                for (c6.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new i(1, sVar, bVar2));
                }
            } else {
                ?? obj = new Object();
                obj.f608b = null;
                obj.f607a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f607a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((x) entry2.getKey(), obj);
            }
        }
        return arrayList;
    }
}
