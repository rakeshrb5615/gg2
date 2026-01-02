package b2;

import android.os.Bundle;
import androidx.lifecycle.k;
import j5.t1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final c2.a f705a;

    /* renamed from: b  reason: collision with root package name */
    public a f706b;

    public e(c2.a aVar) {
        this.f705a = aVar;
    }

    public final Bundle a(String str) {
        c2.a aVar = this.f705a;
        if (aVar.f871g) {
            Bundle bundle = aVar.f870f;
            if (bundle == null) {
                return null;
            }
            Bundle E = bundle.containsKey(str) ? t1.E(bundle, str) : null;
            bundle.remove(str);
            if (bundle.isEmpty()) {
                aVar.f870f = null;
            }
            return E;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public final d b() {
        d dVar;
        c2.a aVar = this.f705a;
        synchronized (aVar.f867c) {
            Iterator it = aVar.f868d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                d dVar2 = (d) entry.getValue();
                if (j.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                    continue;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String str, d dVar) {
        j.e(dVar, "provider");
        c2.a aVar = this.f705a;
        synchronized (aVar.f867c) {
            if (aVar.f868d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f868d.put(str, dVar);
        }
    }

    public final void d() {
        if (!this.f705a.f872h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f706b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f706b = aVar;
        try {
            k.class.getDeclaredConstructor(null);
            a aVar2 = this.f706b;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f702b).add(k.class.getName());
            }
        } catch (NoSuchMethodException e9) {
            throw new IllegalArgumentException("Class " + k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
        }
    }
}
