package i2;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class o implements OnCompleteListener, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f2443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2444b;

    public /* synthetic */ o(Object obj, boolean z9) {
        this.f2444b = obj;
        this.f2443a = z9;
    }

    public void onComplete(Task task) {
        q qVar = (q) this.f2444b;
        qVar.getClass();
        try {
            Location location = (Location) task.getResult();
            boolean z9 = this.f2443a;
            if (location != null) {
                qVar.c(location, z9);
                return;
            }
            qVar.f2472a.requestLocationUpdates(new LocationRequest.Builder(10000L).setIntervalMillis(10000L).setMinUpdateIntervalMillis(1000L).setPriority(104).setMaxUpdateDelayMillis(1L).setMaxUpdates(2).build(), new p(qVar, z9), Looper.getMainLooper());
        } catch (RuntimeExecutionException e9) {
            qVar.b(e9);
        }
    }

    public void onSuccess(Object obj) {
        Void r32 = (Void) obj;
        SharedPreferences.Editor edit = c4.b.C((Context) this.f2444b).edit();
        edit.putBoolean("proxy_retention", this.f2443a);
        edit.apply();
    }
}
