package k4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends a0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ IBinder f3371m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ d4.q f3372n;

    public b(d4.q qVar, IBinder iBinder) {
        this.f3372n = qVar;
        this.f3371m = iBinder;
    }

    @Override // k4.a0
    public final void b() {
        d dVar = (d) this.f3372n.f1106b;
        dVar.f3390n = (IInterface) dVar.i.a(this.f3371m);
        z zVar = dVar.f3380b;
        int i = 0;
        zVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f3390n.asBinder().linkToDeath(dVar.f3387k, 0);
        } catch (RemoteException e9) {
            zVar.a(e9, "linkToDeath failed", new Object[0]);
        }
        dVar.f3385g = false;
        ArrayList arrayList = dVar.f3382d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        dVar.f3382d.clear();
    }
}
