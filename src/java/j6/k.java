package j6;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f3266a = new ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        ArrayDeque arrayDeque = this.f3266a;
        Bundle bundle2 = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    }
                    arrayDeque.add(string);
                }
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e9) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e9);
        }
        if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
            if (bundle2 != null) {
                if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                    u4.b bVar = (u4.b) q4.f.d().b(u4.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle2.getString("google.c.a.c_id");
                        u4.c cVar = (u4.c) bVar;
                        if (v4.a.a("fcm") && v4.a.c("fcm", "_ln")) {
                            cVar.f6085a.setUserProperty("fcm", "_ln", string2);
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("source", "Firebase");
                        bundle3.putString("medium", "notification");
                        bundle3.putString("campaign", string2);
                        cVar.a("fcm", "_cmp", bundle3);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            a.a.K(bundle2, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
