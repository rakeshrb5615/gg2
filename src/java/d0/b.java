package d0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f998a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f999b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1000c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1001d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1002e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1003f = false;

    public b(Activity activity) {
        this.f999b = activity;
        this.f1000c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f999b == activity) {
            this.f999b = null;
            this.f1002e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f1002e || this.f1003f || this.f1001d) {
            return;
        }
        Object obj = this.f998a;
        try {
            Object obj2 = c.f1006c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f1000c) {
                c.f1010g.postAtFrontOfQueue(new b5.l(3, c.f1005b.get(activity), obj2));
                this.f1003f = true;
                this.f998a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f999b == activity) {
            this.f1001d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
