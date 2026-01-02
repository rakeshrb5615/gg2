package d4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f implements h, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f1091a;

    public f(IBinder iBinder) {
        this.f1091a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1091a;
    }

    @Override // d4.h
    public final void b(String str, Bundle bundle, c4.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = e.f1090a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f1091a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // d4.h
    public final void c(String str, Bundle bundle, c4.k kVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = e.f1090a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(kVar);
        try {
            this.f1091a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
