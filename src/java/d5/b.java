package d5;

import a5.v;
import android.util.Log;
import g2.g;
import j5.k1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final d f1122c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final v f1123a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f1124b = new AtomicReference(null);

    public b(v vVar) {
        this.f1123a = vVar;
        vVar.a(new a5.a(this, 3));
    }

    public final d a(String str) {
        b bVar = (b) this.f1124b.get();
        return bVar == null ? f1122c : bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.f1124b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c(String str) {
        b bVar = (b) this.f1124b.get();
        return bVar != null && bVar.c(str);
    }

    public final void d(String str, long j, k1 k1Var) {
        String l5 = g.l("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", l5, null);
        }
        this.f1123a.a(new a(str, j, k1Var));
    }
}
