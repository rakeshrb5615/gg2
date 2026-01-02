package r6;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final q4.f f5705a;

    /* renamed from: b  reason: collision with root package name */
    public final u6.k f5706b;

    public o(q4.f fVar, u6.k kVar, l7.h hVar, w0 w0Var) {
        kotlin.jvm.internal.j.e(fVar, "firebaseApp");
        kotlin.jvm.internal.j.e(kVar, "settings");
        kotlin.jvm.internal.j.e(hVar, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(w0Var, "sessionsActivityLifecycleCallbacks");
        this.f5705a = fVar;
        this.f5706b = kVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        fVar.a();
        Context applicationContext = fVar.f5386a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(w0Var);
            d8.f0.p(d8.f0.b(hVar), new a1.d(this, w0Var, null, 10));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
