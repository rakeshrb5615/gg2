package e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1285a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f1286b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f1287c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1288d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient LinkedHashMap f1289e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f1290f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f1291g = new Bundle();

    public final boolean a(int i, int i9, Intent intent) {
        String str = (String) this.f1285a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f1289e.get(str);
        if ((fVar != null ? fVar.f1277a : null) != null) {
            ArrayList arrayList = this.f1288d;
            if (arrayList.contains(str)) {
                fVar.f1277a.onActivityResult(fVar.f1278b.c(i9, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1290f.remove(str);
        this.f1291g.putParcelable(str, new a(i9, intent));
        return true;
    }

    public abstract void b(int i, f.a aVar, Object obj);

    public final h c(final String str, u uVar, final f.a aVar, final b bVar) {
        kotlin.jvm.internal.j.e(str, "key");
        kotlin.jvm.internal.j.e(aVar, "contract");
        kotlin.jvm.internal.j.e(bVar, "callback");
        w lifecycle = uVar.getLifecycle();
        w wVar = lifecycle;
        if (wVar.c.compareTo(o.d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + uVar + " is attempting to register while current state is " + wVar.c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f1287c;
        g gVar = (g) linkedHashMap.get(str);
        if (gVar == null) {
            gVar = new g(lifecycle);
        }
        s sVar = new s() { // from class: e.d
            public final void c(u uVar2, n nVar) {
                i iVar = i.this;
                LinkedHashMap linkedHashMap2 = iVar.f1289e;
                n nVar2 = n.ON_START;
                String str2 = str;
                if (nVar2 != nVar) {
                    if (n.ON_STOP == nVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else if (n.ON_DESTROY == nVar) {
                        iVar.f(str2);
                        return;
                    } else {
                        return;
                    }
                }
                Bundle bundle = iVar.f1291g;
                LinkedHashMap linkedHashMap3 = iVar.f1290f;
                f.a aVar2 = aVar;
                b bVar2 = bVar;
                linkedHashMap2.put(str2, new f(aVar2, bVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.onActivityResult(obj);
                }
                a aVar3 = (a) a.a.z(bundle, str2);
                if (aVar3 != null) {
                    bundle.remove(str2);
                    bVar2.onActivityResult(aVar2.c(aVar3.f1270a, aVar3.f1271b));
                }
            }
        };
        gVar.f1279a.a(sVar);
        gVar.f1280b.add(sVar);
        linkedHashMap.put(str, gVar);
        return new h(this, str, aVar, 0);
    }

    public final h d(String str, f.a aVar, b bVar) {
        kotlin.jvm.internal.j.e(str, "key");
        e(str);
        this.f1289e.put(str, new f(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f1290f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.onActivityResult(obj);
        }
        Bundle bundle = this.f1291g;
        a aVar2 = (a) a.a.z(bundle, str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.onActivityResult(aVar.c(aVar2.f1270a, aVar2.f1271b));
        }
        return new h(this, str, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f1286b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        e eVar = new e();
        Iterator it = new a8.a(new a8.e(eVar, new a6.i(eVar, 1), 0)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f1285a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        kotlin.jvm.internal.j.e(str, "key");
        if (!this.f1288d.contains(str) && (num = (Integer) this.f1286b.remove(str)) != null) {
            this.f1285a.remove(num);
        }
        this.f1289e.remove(str);
        LinkedHashMap linkedHashMap = this.f1290f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder q = v1.a.q("Dropping pending result for request ", str, ": ");
            q.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", q.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1291g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) a.a.z(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1287c;
        g gVar = (g) linkedHashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f1280b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                gVar.f1279a.b((s) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
