package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class u extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public v f3290a;

    /* renamed from: b  reason: collision with root package name */
    public Context f3291b;

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        v vVar = this.f3290a;
        if (vVar != null) {
            Context context = vVar.f3294c.b;
            this.f3291b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v vVar = this.f3290a;
        if (vVar != null && vVar.a()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            v vVar2 = this.f3290a;
            vVar2.f3294c.getClass();
            FirebaseMessaging.b(vVar2, 0L);
            Context context2 = this.f3291b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.f3290a = null;
        }
    }
}
