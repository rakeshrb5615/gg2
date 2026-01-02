package i2;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class p extends LocationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f2468a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f2469b;

    public p(q qVar, boolean z9) {
        this.f2469b = qVar;
        this.f2468a = z9;
    }

    public final void onLocationResult(LocationResult locationResult) {
        Location lastLocation = locationResult.getLastLocation();
        if (lastLocation != null) {
            this.f2469b.c(lastLocation, this.f2468a);
        }
    }
}
