package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class y extends z {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2118c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0 f2119d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, b8.g gVar) {
        super(c0Var);
        this.f2119d = c0Var;
        this.f2120e = gVar;
    }

    @Override // h.z
    public final IntentFilter d() {
        switch (this.f2118c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, h.j0] */
    @Override // h.z
    public final int e() {
        Location location;
        boolean z9;
        long j;
        Location location2;
        switch (this.f2118c) {
            case 0:
                return t.a((PowerManager) this.f2120e) ? 2 : 1;
            default:
                b8.g gVar = (b8.g) this.f2120e;
                k0 k0Var = (k0) gVar.f791d;
                LocationManager locationManager = (LocationManager) gVar.f790c;
                if (k0Var.f2064b > System.currentTimeMillis()) {
                    z9 = k0Var.f2063a;
                } else {
                    Context context = (Context) gVar.f789b;
                    Location location3 = null;
                    if (a.a.k(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (a.a.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (j0.f2057d == null) {
                            j0.f2057d = new Object();
                        }
                        j0 j0Var = j0.f2057d;
                        j0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        j0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z9 = j0Var.f2060c == 1;
                        long j8 = j0Var.f2059b;
                        long j9 = j0Var.f2058a;
                        j0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j10 = j0Var.f2059b;
                        if (j8 == -1 || j9 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j9) {
                                j8 = j10;
                            } else if (currentTimeMillis > j8) {
                                j8 = j9;
                            }
                            j = j8 + 60000;
                        }
                        k0Var.f2063a = z9;
                        k0Var.f2064b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z9 = true;
                        }
                    }
                }
                return z9 ? 2 : 1;
        }
    }

    @Override // h.z
    public final void g() {
        switch (this.f2118c) {
            case 0:
                this.f2119d.q(true, true);
                return;
            default:
                this.f2119d.q(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, Context context) {
        super(c0Var);
        this.f2119d = c0Var;
        this.f2120e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
