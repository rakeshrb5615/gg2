package h3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import q0.c1;
import q0.s1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f2189a;

    /* renamed from: b  reason: collision with root package name */
    public int f2190b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2191c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2192d;

    /* renamed from: e  reason: collision with root package name */
    public Serializable f2193e;

    public static String b(q4.f fVar) {
        fVar.a();
        q4.j jVar = fVar.f5388c;
        String str = jVar.f5403e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = jVar.f5400b;
        if (str2.startsWith("1:")) {
            String[] split = str2.split(":");
            if (split.length < 2) {
                return null;
            }
            String str3 = split[1];
            if (str3.isEmpty()) {
                return null;
            }
            return str3;
        }
        return str2;
    }

    public synchronized String a() {
        try {
            if (((String) this.f2192d) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f2192d;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.f2191c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e9) {
            Log.w("FirebaseMessaging", "Failed to find package " + e9);
            return null;
        }
    }

    public boolean d() {
        int i;
        synchronized (this) {
            i = this.f2190b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f2191c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f2190b = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f2190b = 2;
                        } else {
                            this.f2190b = 1;
                        }
                        i = this.f2190b;
                    } else {
                        this.f2190b = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public void e(s1 s1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            if ((c1Var.f5108a.c() & 8) != 0) {
                ((View) this.f2192d).setTranslationY(d3.a.c(this.f2190b, 0, c1Var.f5108a.b()));
                return;
            }
        }
    }

    public synchronized void f() {
        PackageInfo c9 = c(((Context) this.f2191c).getPackageName());
        if (c9 != null) {
            this.f2192d = Integer.toString(c9.versionCode);
            this.f2193e = c9.versionName;
        }
    }
}
