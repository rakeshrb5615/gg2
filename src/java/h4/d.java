package h4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.l;
import d4.q;
import i4.h;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d extends i4.e {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2197b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2198c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2199d;

    public d(q qVar, IBinder iBinder) {
        this.f2198c = iBinder;
        this.f2199d = qVar;
    }

    @Override // i4.e
    public final void a() {
        HashMap hashMap;
        i4.d dVar = null;
        int i = 0;
        switch (this.f2197b) {
            case 0:
                try {
                    f fVar = (f) this.f2199d;
                    i4.d dVar2 = fVar.f2204a.f2692m;
                    String str = fVar.f2205b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = g.f2206a;
                    synchronized (g.class) {
                        hashMap = g.f2206a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    f fVar2 = (f) this.f2199d;
                    String str2 = fVar2.f2205b;
                    e eVar = new e(fVar2, (TaskCompletionSource) this.f2198c);
                    i4.b bVar = (i4.b) dVar2;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i9 = i4.a.f2672a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(eVar);
                    bVar.f2673a.transact(2, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e9) {
                    l lVar = f.f2203c;
                    Object[] objArr = {((f) this.f2199d).f2205b};
                    lVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", l.i(lVar.f1097b, "error requesting in-app review for %s", objArr), e9);
                    }
                    ((TaskCompletionSource) this.f2198c).trySetException(new RuntimeException(e9));
                    return;
                }
            default:
                h hVar = (h) ((q) this.f2199d).f1106b;
                IBinder iBinder = (IBinder) this.f2198c;
                int i10 = i4.c.f2674b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    dVar = queryLocalInterface instanceof i4.d ? (i4.d) queryLocalInterface : new i4.b(iBinder);
                }
                hVar.f2692m = dVar;
                l lVar2 = hVar.f2683b;
                lVar2.g("linkToDeath", new Object[0]);
                try {
                    hVar.f2692m.asBinder().linkToDeath(hVar.j, 0);
                } catch (RemoteException e10) {
                    Object[] objArr2 = new Object[0];
                    lVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", l.i(lVar2.f1097b, "linkToDeath failed", objArr2), e10);
                    }
                }
                hVar.f2688g = false;
                ArrayList arrayList = hVar.f2685d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                hVar.f2685d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f2198c = taskCompletionSource2;
        this.f2199d = fVar;
    }
}
