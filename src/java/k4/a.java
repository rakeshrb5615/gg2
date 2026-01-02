package k4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3368a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3369b;

    public a(IBinder iBinder, String str) {
        this.f3368a = iBinder;
        this.f3369b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3368a;
    }

    public final void d(int i, Parcel parcel) {
        try {
            this.f3368a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
