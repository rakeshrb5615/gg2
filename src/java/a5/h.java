package a5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class h implements c6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f580b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f581c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f579a = i;
        this.f580b = obj;
        this.f581c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [h6.a, java.lang.Object] */
    @Override // c6.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f579a) {
            case 0:
                c cVar = (c) this.f581c;
                return cVar.f574f.e(new z(cVar, (j) this.f580b));
            case 1:
                return new a6.l((Context) this.f580b, (String) this.f581c);
            default:
                q4.f fVar = (q4.f) this.f580b;
                String f9 = fVar.f();
                x5.b bVar = (x5.b) fVar.f5389d.a(x5.b.class);
                ?? obj = new Object();
                Context createDeviceProtectedStorageContext = e0.c.createDeviceProtectedStorageContext((Context) this.f581c);
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + f9, 0);
                boolean z9 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z9 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z9 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f2220a = z9;
                return obj;
        }
    }
}
