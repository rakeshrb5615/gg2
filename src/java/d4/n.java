package d4;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import k4.a0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class n implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1100b;

    public /* synthetic */ n(Object obj, int i) {
        this.f1099a = i;
        this.f1100b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f1099a) {
            case 0:
                r rVar = (r) this.f1100b;
                int i = 0;
                rVar.f1109b.h("reportBinderDeath", new Object[0]);
                if (rVar.i.get() != null) {
                    throw new ClassCastException();
                }
                rVar.f1109b.h("%s : Binder has died.", rVar.f1110c);
                ArrayList arrayList = rVar.f1111d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(rVar.f1110c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((m) obj).f1098a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                rVar.f1111d.clear();
                synchronized (rVar.f1113f) {
                    rVar.d();
                }
                return;
            case 1:
                i4.h hVar = (i4.h) this.f1100b;
                int i9 = 0;
                hVar.f2683b.g("reportBinderDeath", new Object[0]);
                if (hVar.i.get() != null) {
                    throw new ClassCastException();
                }
                hVar.f2683b.g("%s : Binder has died.", hVar.f2684c);
                ArrayList arrayList2 = hVar.f2685d;
                int size2 = arrayList2.size();
                while (i9 < size2) {
                    Object obj2 = arrayList2.get(i9);
                    i9++;
                    RemoteException remoteException2 = new RemoteException(String.valueOf(hVar.f2684c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource2 = ((i4.e) obj2).f2675a;
                    if (taskCompletionSource2 != null) {
                        taskCompletionSource2.trySetException(remoteException2);
                    }
                }
                hVar.f2685d.clear();
                synchronized (hVar.f2687f) {
                    hVar.c();
                }
                return;
            default:
                k4.d dVar = (k4.d) this.f1100b;
                int i10 = 0;
                dVar.f3380b.b("reportBinderDeath", new Object[0]);
                if (dVar.j.get() != null) {
                    throw new ClassCastException();
                }
                dVar.f3380b.b("%s : Binder has died.", dVar.f3381c);
                ArrayList arrayList3 = dVar.f3382d;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    ((a0) obj3).a(new RemoteException(String.valueOf(dVar.f3381c).concat(" : Binder has died.")));
                }
                dVar.f3382d.clear();
                synchronized (dVar.f3384f) {
                    dVar.e();
                }
                return;
        }
    }
}
