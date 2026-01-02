package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public b0 f3222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f3223b;

    public a0(b0 b0Var, b0 b0Var2) {
        this.f3223b = b0Var;
        this.f3222a = b0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f3223b.f3229a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            b0 b0Var = this.f3222a;
            if (b0Var == null) {
                return;
            }
            if (b0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                b0 b0Var2 = this.f3222a;
                b0Var2.f3232d.f3311f.schedule(b0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f3222a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
