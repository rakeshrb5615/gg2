package d0;

import android.app.Notification;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n extends q {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f1023b;

    @Override // d0.q
    public final void a(j6.s sVar) {
        new Notification.BigTextStyle((Notification.Builder) sVar.f3283c).setBigContentTitle(null).bigText(this.f1023b);
    }

    @Override // d0.q
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
