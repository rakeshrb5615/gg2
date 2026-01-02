package v4;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f6300a;

    public d(e eVar) {
        this.f6300a = eVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || a.f6291a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.f6300a.f6301a.x(3, bundle2);
    }
}
