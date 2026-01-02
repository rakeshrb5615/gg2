package u4;

import a6.e;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c implements b {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f6084c;

    /* renamed from: a  reason: collision with root package name */
    public final AppMeasurementSdk f6085a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f6086b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f6085a = appMeasurementSdk;
        this.f6086b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (v4.a.a(str) && v4.a.b(bundle, str2) && v4.a.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f6085a.logEvent(str, str2, bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a6.e, java.lang.Object] */
    public final e b(String str, k2.c cVar) {
        Preconditions.checkNotNull(cVar);
        if (v4.a.a(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f6086b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f6085a;
                Object cVar2 = equals ? new v4.c(appMeasurementSdk, cVar) : "clx".equals(str) ? new v4.e(appMeasurementSdk, cVar) : null;
                if (cVar2 != null) {
                    concurrentHashMap.put(str, cVar2);
                    return new Object();
                }
            }
        }
        return null;
    }
}
