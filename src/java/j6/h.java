package j6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3256a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3257b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3258c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f3256a = i;
        this.f3257b = obj;
        this.f3258c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName startService;
        switch (this.f3256a) {
            case 0:
                Context context = (Context) this.f3257b;
                Intent intent = (Intent) this.f3258c;
                s g3 = s.g();
                g3.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) g3.f3285e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (g3) {
                    try {
                        str = (String) g3.f3282b;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        g3.f3282b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        g3.f3282b = serviceInfo.name;
                                    }
                                    str = (String) g3.f3282b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (g3.k(context)) {
                        startService = c0.b(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e9) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e9);
                    i = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                m6.g gVar = (m6.g) this.f3258c;
                n6.n nVar = ((m6.b) this.f3257b).f4033g;
                synchronized (nVar.f4963b) {
                    SharedPreferences.Editor edit = nVar.f4962a.edit();
                    gVar.getClass();
                    edit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", gVar.f4036a).commit();
                }
                return null;
            default:
                n6.f fVar = (n6.f) this.f3258c;
                n6.o oVar = ((n6.d) this.f3257b).f4901b;
                synchronized (oVar) {
                    FileOutputStream openFileOutput = oVar.f4967a.openFileOutput(oVar.f4968b, 0);
                    openFileOutput.write(fVar.f4910a.toString().getBytes("UTF-8"));
                    openFileOutput.close();
                }
                return null;
        }
    }
}
