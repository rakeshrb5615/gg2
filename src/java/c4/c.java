package c4;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d4.l f901a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f902b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f903c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f904d;

    /* renamed from: e  reason: collision with root package name */
    public d4.k f905e;

    public c(Context context) {
        d4.l lVar = new d4.l("AppUpdateListenerRegistry", 0);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f904d = new HashSet();
        this.f905e = null;
        this.f901a = lVar;
        this.f902b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f903c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        d4.k kVar;
        HashSet hashSet = this.f904d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.f903c;
        if (!isEmpty && this.f905e == null) {
            d4.k kVar2 = new d4.k(this, 0);
            this.f905e = kVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f902b;
            if (i >= 33) {
                context.registerReceiver(kVar2, intentFilter, 2);
            } else {
                context.registerReceiver(kVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (kVar = this.f905e) == null) {
            return;
        }
        context.unregisterReceiver(kVar);
        this.f905e = null;
    }
}
