package v4;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import m4.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f6297a;

    public b(c cVar) {
        this.f6297a = cVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        c cVar = this.f6297a;
        if (cVar.f6298a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            g gVar = a.f6291a;
            String zza = zzjm.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString("events", str2);
            cVar.f6299b.x(2, bundle2);
        }
    }
}
