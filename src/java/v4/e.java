package v4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final k2.c f6301a;

    public e(AppMeasurementSdk appMeasurementSdk, k2.c cVar) {
        this.f6301a = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
    }
}
