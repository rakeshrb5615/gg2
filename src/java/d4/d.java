package d4;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class d extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1089a;

    public /* synthetic */ d(int i) {
        this.f1089a = i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f1089a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i9) {
        switch (this.f1089a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i9)) {
                    return true;
                }
                c4.i iVar = (c4.i) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i10 = e.f1090a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        iVar.a(bundle);
                        return true;
                    }
                    throw new BadParcelableException(g2.g.c(dataAvail, "Parcel data not fully consumed, unread size: "));
                } else if (i != 3) {
                    return false;
                } else {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i11 = e.f1090a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 <= 0) {
                        iVar.zzb(bundle2);
                        return true;
                    }
                    throw new BadParcelableException(g2.g.c(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i9)) {
                    return true;
                }
                h4.e eVar = (h4.e) this;
                if (i == 2) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i12 = i4.a.f2672a;
                    Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 <= 0) {
                        i4.h hVar = eVar.f2202d.f2204a;
                        if (hVar != null) {
                            TaskCompletionSource taskCompletionSource = eVar.f2201c;
                            synchronized (hVar.f2687f) {
                                hVar.f2686e.remove(taskCompletionSource);
                            }
                            hVar.a().post(new i4.g(hVar, 0));
                        }
                        eVar.f2200b.g("onGetLaunchReviewFlowInfo", new Object[0]);
                        eVar.f2201c.trySetResult(new h4.b((PendingIntent) bundle3.get("confirmation_intent"), bundle3.getBoolean("is_review_no_op")));
                        return true;
                    }
                    throw new BadParcelableException(g2.g.c(dataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                return false;
        }
    }
}
