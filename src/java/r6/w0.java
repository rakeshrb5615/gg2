package r6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class w0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final c1 f5756a;

    public w0(c1 c1Var) {
        kotlin.jvm.internal.j.e(c1Var, "sharedSessionRepository");
        this.f5756a = c1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.f5756a.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        c1 c1Var = this.f5756a;
        c1Var.i = true;
        h0 h0Var = c1Var.f5623h;
        if (h0Var == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (h0Var == null) {
            kotlin.jvm.internal.j.i("localSessionData");
            throw null;
        } else {
            Log.d("FirebaseSessions", "App foregrounded on " + c1Var.f5621f.a());
            if (c1Var.d(h0Var) || c1Var.c(h0Var)) {
                d8.f0.p(d8.f0.b(c1Var.f5622g), new a1.d(c1Var, h0Var, null, 11));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }
}
