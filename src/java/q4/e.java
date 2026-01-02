package q4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f5382b = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final Context f5383a;

    public e(Context context) {
        this.f5383a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f5384k) {
            try {
                Iterator it = ((r.d) f.f5385l.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5383a.unregisterReceiver(this);
    }
}
