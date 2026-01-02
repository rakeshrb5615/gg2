package d4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class q implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1106b;

    public /* synthetic */ q(Object obj, int i) {
        this.f1105a = i;
        this.f1106b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f1105a) {
            case 0:
                r rVar = (r) this.f1106b;
                rVar.f1109b.h("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                rVar.a().post(new p(this, iBinder));
                return;
            case 1:
                i4.h hVar = (i4.h) this.f1106b;
                hVar.f2683b.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hVar.a().post(new h4.d(this, iBinder));
                return;
            default:
                k4.d dVar = (k4.d) this.f1106b;
                dVar.f3380b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new k4.b(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f1105a) {
            case 0:
                r rVar = (r) this.f1106b;
                rVar.f1109b.h("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                rVar.a().post(new o(this, 1));
                return;
            case 1:
                i4.h hVar = (i4.h) this.f1106b;
                hVar.f2683b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hVar.a().post(new i4.g(this, 1));
                return;
            default:
                k4.d dVar = (k4.d) this.f1106b;
                dVar.f3380b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new k4.c(this, 0));
                return;
        }
    }
}
