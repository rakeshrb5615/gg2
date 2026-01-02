package b2;

import android.os.Bundle;
import androidx.lifecycle.o;
import j5.t1;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c2.a f707a;

    /* renamed from: b  reason: collision with root package name */
    public final e f708b;

    public f(c2.a aVar) {
        this.f707a = aVar;
        this.f708b = new e(aVar);
    }

    public final void a(Bundle bundle) {
        c2.a aVar = this.f707a;
        g gVar = aVar.f865a;
        if (!aVar.f869e) {
            aVar.a();
        }
        if (gVar.getLifecycle().c.compareTo(o.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + gVar.getLifecycle().c).toString());
        } else if (aVar.f871g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        } else {
            Bundle bundle2 = null;
            if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle2 = t1.E(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            aVar.f870f = bundle2;
            aVar.f871g = true;
        }
    }

    public final void b(Bundle bundle) {
        c2.a aVar = this.f707a;
        Bundle f9 = c4.b.f((h7.f[]) Arrays.copyOf(new h7.f[0], 0));
        Bundle bundle2 = aVar.f870f;
        if (bundle2 != null) {
            f9.putAll(bundle2);
        }
        synchronized (aVar.f867c) {
            for (Map.Entry entry : aVar.f868d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a10 = ((d) entry.getValue()).a();
                j.e(str, "key");
                f9.putBundle(str, a10);
            }
        }
        if (f9.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", f9);
    }
}
