package i2;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.widget.Toast;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.RuntimeExecutionException;
import j5.t1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final FusedLocationProviderClient f2472a;

    /* renamed from: b  reason: collision with root package name */
    public double f2473b;

    /* renamed from: c  reason: collision with root package name */
    public double f2474c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2475d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2476e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2477f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2478g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2479h;
    public final String i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2480k;

    /* renamed from: l  reason: collision with root package name */
    public final SharedPreferences f2481l;

    /* renamed from: m  reason: collision with root package name */
    public final SharedPreferences.Editor f2482m;

    /* renamed from: n  reason: collision with root package name */
    public final Context f2483n;

    /* renamed from: o  reason: collision with root package name */
    public final j2.j f2484o;

    /* renamed from: p  reason: collision with root package name */
    public final Locale f2485p = new Locale.Builder().setLanguage("en").setRegion("US").build();
    public final c5.c q;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, c5.c] */
    public q(Context context, j2.j jVar) {
        new m2.a();
        this.q = new Object();
        this.f2483n = context;
        this.f2484o = jVar;
        SharedPreferences z9 = t1.z(context);
        this.f2481l = z9;
        SharedPreferences.Editor edit = z9.edit();
        this.f2482m = edit;
        this.f2477f = context.getResources().getString(2131951927);
        this.f2476e = context.getResources().getString(2131951954);
        this.f2475d = context.getResources().getString(2131951926);
        this.f2478g = context.getResources().getString(2131952461);
        this.f2479h = context.getResources().getString(2131951921);
        this.i = context.getResources().getString(2131951934);
        this.j = context.getResources().getString(2131951970);
        this.f2480k = context.getResources().getString(2131951855);
        this.f2472a = LocationServices.getFusedLocationProviderClient(context);
        if (z9.getFloat(this.f2475d, 0.0f) == 0.0f) {
            edit.putFloat(this.f2475d, 0.0f);
            edit.apply();
        }
    }

    public final void a(boolean z9) {
        boolean z10;
        float f9;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = this.f2483n;
        if (googleApiAvailability.isGooglePlayServicesAvailable(context) != 0) {
            Toast.makeText(context, 2131952462, 0).show();
            return;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
        SharedPreferences sharedPreferences = this.f2481l;
        SharedPreferences.Editor editor = this.f2482m;
        if (!isProviderEnabled && !locationManager.isProviderEnabled("network")) {
            String str = this.f2480k;
            try {
                z10 = sharedPreferences.getBoolean(str, false);
            } catch (ClassCastException unused) {
                sharedPreferences.edit().remove(str).apply();
                z10 = false;
            }
            if (!z10) {
                if (z9) {
                    Toast.makeText(context, 2131952459, 0).show();
                    editor.putBoolean(this.f2476e, false);
                }
                editor.apply();
                return;
            }
            d();
            String str2 = this.i;
            float f10 = 999.0f;
            try {
                f9 = sharedPreferences.getFloat(str2, 999.0f);
            } catch (ClassCastException unused2) {
                sharedPreferences.edit().remove(str2).apply();
                f9 = 999.0f;
            }
            this.f2473b = f9;
            String str3 = this.j;
            try {
                f10 = sharedPreferences.getFloat(str3, 999.0f);
            } catch (ClassCastException unused3) {
                sharedPreferences.edit().remove(str3).apply();
            }
            double d9 = f10;
            this.f2474c = d9;
            this.f2484o.f(this.f2473b, d9, this.f2482m);
            this.f2484o.c(this.f2473b, this.f2474c, !z9, this.q);
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM yyyy, HH:mm", this.f2485p);
        String string = sharedPreferences.getString(this.f2479h, "No update");
        String format = simpleDateFormat.format(Calendar.getInstance().getTime());
        o0.c(context).b();
        if (z9 && !string.contains("No update") && !string.contains("failed")) {
            try {
                Date parse = simpleDateFormat.parse(string);
                Date parse2 = simpleDateFormat.parse(format);
                if (parse != null && parse2 != null) {
                    if ((parse2.getTime() - parse.getTime()) / 60000 >= 1) {
                        if (string.contains("Not")) {
                        }
                    }
                    Toast.makeText(context, this.f2478g, 0).show();
                    return;
                }
                return;
            } catch (ParseException e9) {
                e9.printStackTrace();
            }
        }
        editor.putString("lastLocationRefresh", format);
        editor.apply();
        if (e0.c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || e0.c.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                Toast.makeText(context, 2131952462, 0).show();
                editor.apply();
            } else if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                Toast.makeText(context, 2131952462, 0).show();
            } else {
                try {
                    this.f2472a.getLastLocation().addOnCompleteListener(new o(this, z9));
                } catch (RuntimeExecutionException e10) {
                    b(e10);
                }
            }
        }
    }

    public final void b(RuntimeExecutionException runtimeExecutionException) {
        if ((runtimeExecutionException.getCause() instanceof ApiException) && runtimeExecutionException.getCause().getStatusCode() == 16) {
            Toast.makeText(this.f2483n, 2131952462, 0).show();
        }
    }

    public final void c(Location location, boolean z9) {
        this.f2473b = location.getLatitude();
        this.f2474c = location.getLongitude();
        d();
        this.f2484o.f(this.f2473b, this.f2474c, this.f2482m);
        c5.c cVar = this.q;
        this.f2484o.c(this.f2473b, this.f2474c, !z9, cVar);
    }

    public final void d() {
        Locale locale = this.f2485p;
        float parseFloat = Float.parseFloat(new SimpleDateFormat("dd", locale).format(Calendar.getInstance().getTime()));
        String str = this.f2475d;
        SharedPreferences.Editor editor = this.f2482m;
        editor.putFloat(str, parseFloat);
        editor.putString("locationUpdateTime", new SimpleDateFormat("dd/MM yyyy, HH:mm", locale).format(Calendar.getInstance().getTime()));
        editor.putString(this.f2477f, new SimpleDateFormat("dd/MM yyyy, HH:mm", locale).format(Calendar.getInstance().getTime()));
        editor.apply();
    }
}
