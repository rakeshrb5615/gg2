package com.chilllive.chillwallpaperproject.firebase;

import android.app.Notification;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import d0.p;
import d0.t;
import d0.w;
import d0.x;
import e0.c;
import j6.q;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(q qVar) {
        if (qVar.x() != null) {
            p pVar = new p(this, "news_channel");
            pVar.f1039s.icon = 2131231060;
            pVar.f1028e = p.b((String) qVar.x().f3264a);
            pVar.f1029f = p.b((String) qVar.x().f3265b);
            pVar.j = 1;
            x xVar = new x(this);
            if (c.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            Notification a10 = pVar.a();
            Bundle bundle = a10.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                xVar.f1060a.notify(null, 123, a10);
                return;
            }
            t tVar = new t(getPackageName(), a10);
            synchronized (x.f1058e) {
                try {
                    if (x.f1059f == null) {
                        x.f1059f = new w(getApplicationContext());
                    }
                    x.f1059f.f1052b.obtainMessage(0, tVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            xVar.f1060a.cancel(null, 123);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str) {
        getSharedPreferences("my_app_prefs", 0).edit().putString("fcm_token", str).apply();
    }
}
