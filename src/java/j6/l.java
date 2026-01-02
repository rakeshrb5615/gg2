package j6;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3267a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3268b;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i) {
        this.f3267a = i;
        this.f3268b = firebaseMessaging;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3267a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.f3268b;
                if (firebaseMessaging.e.b() && firebaseMessaging.g(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.f(0L);
                        }
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging2 = this.f3268b;
                Context context = firebaseMessaging2.b;
                f2.b0.f(context);
                a5.z zVar = firebaseMessaging2.c;
                boolean e9 = firebaseMessaging2.e();
                if (PlatformVersion.isAtLeastQ()) {
                    SharedPreferences C = c4.b.C(context);
                    if (!C.contains("proxy_retention") || C.getBoolean("proxy_retention", false) != e9) {
                        ((Rpc) zVar.f621c).setRetainProxiedNotifications(e9).addOnSuccessListener((Executor) new Object(), new i2.o(context, e9));
                    }
                }
                if (firebaseMessaging2.e()) {
                    ((Rpc) zVar.f621c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new m(firebaseMessaging2, 1));
                    return;
                }
                return;
        }
    }
}
