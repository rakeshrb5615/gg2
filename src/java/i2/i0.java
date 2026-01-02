package i2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.chilllive.chillwallpaperproject.MainActivity;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i0 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2386b;

    public /* synthetic */ i0(Object obj, int i) {
        this.f2385a = i;
        this.f2386b = obj;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i9 = this.f2385a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f2385a) {
            case 0:
                ((MainActivity) this.f2386b).T.q(sensorEvent);
                return;
            default:
                v0 v0Var = ((n0) this.f2386b).f2418b;
                if (v0Var != null) {
                    v0Var.q(sensorEvent);
                    return;
                }
                return;
        }
    }
}
