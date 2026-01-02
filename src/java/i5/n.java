package i5;

import a5.p;
import a5.t;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2730a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2731b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f2732c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2733d;

    public n(m5.c cVar, boolean z9) {
        this.f2733d = cVar;
        this.f2732c = new AtomicReference(null);
        this.f2730a = z9;
        this.f2731b = new AtomicMarkableReference(new d(z9 ? 8192 : 1024), false);
    }

    public synchronized void a() {
        try {
            if (this.f2730a) {
                return;
            }
            Boolean c9 = c();
            this.f2732c = c9;
            if (c9 == null) {
                t tVar = new t(22);
                p pVar = (p) ((x5.c) this.f2731b);
                pVar.a(pVar.f603c, tVar);
            }
            this.f2730a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        Boolean bool;
        try {
            a();
            bool = (Boolean) this.f2732c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f2733d).a.j();
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        q4.f fVar = ((FirebaseMessaging) this.f2733d).a;
        fVar.a();
        Context context = fVar.f5386a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public n(FirebaseMessaging firebaseMessaging, x5.c cVar) {
        this.f2733d = firebaseMessaging;
        this.f2731b = cVar;
    }
}
