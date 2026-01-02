package v4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f6298a;

    /* renamed from: b  reason: collision with root package name */
    public final k2.c f6299b;

    public c(AppMeasurementSdk appMeasurementSdk, k2.c cVar) {
        this.f6299b = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
        this.f6298a = new HashSet();
    }
}
