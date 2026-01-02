package d4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class p extends m {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f1103b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f1104c;

    public p(q qVar, IBinder iBinder) {
        this.f1104c = qVar;
        this.f1103b = iBinder;
    }

    @Override // d4.m
    public final void a() {
        h fVar;
        r rVar = (r) this.f1104c.f1106b;
        int i = g.f1092b;
        IBinder iBinder = this.f1103b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
        }
        rVar.f1118m = fVar;
        l lVar = rVar.f1109b;
        int i9 = 0;
        lVar.h("linkToDeath", new Object[0]);
        try {
            rVar.f1118m.asBinder().linkToDeath(rVar.j, 0);
        } catch (RemoteException e9) {
            lVar.f(e9, "linkToDeath failed", new Object[0]);
        }
        rVar.f1114g = false;
        ArrayList arrayList = rVar.f1111d;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        rVar.f1111d.clear();
    }
}
