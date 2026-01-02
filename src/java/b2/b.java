package b2;

import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.n;
import androidx.lifecycle.q0;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f703a;

    /* renamed from: b  reason: collision with root package name */
    public final g f704b;

    public /* synthetic */ b(g gVar, int i) {
        this.f703a = i;
        this.f704b = gVar;
    }

    public final void c(u uVar, n nVar) {
        switch (this.f703a) {
            case 0:
                if (nVar != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                uVar.getLifecycle().b(this);
                b1 b1Var = this.f704b;
                Bundle a10 = b1Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a10 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        j.b(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                j.b(newInstance);
                                c cVar = (c) newInstance;
                                if (!(b1Var instanceof b1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + b1Var).toString());
                                }
                                a1 viewModelStore = b1Var.getViewModelStore();
                                e savedStateRegistry = b1Var.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    j.e(str3, "key");
                                    v0 v0Var = (v0) linkedHashMap.get(str3);
                                    if (v0Var != null) {
                                        q0.a(v0Var, savedStateRegistry, b1Var.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e9) {
                                throw new RuntimeException(g2.g.l("Failed to instantiate ", str2), e9);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(v1.a.l("Class ", str2, " wasn't found"), e11);
                    }
                }
                return;
            default:
                c.n nVar2 = (c.n) this.f704b;
                c.n.access$ensureViewModelStore(nVar2);
                nVar2.getLifecycle().b(this);
                return;
        }
    }
}
