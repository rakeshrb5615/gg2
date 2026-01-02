package d0;

import android.app.Notification;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f1042a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification f1043b;

    public t(String str, Notification notification) {
        this.f1042a = str;
        this.f1043b = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f1042a;
        Notification notification = this.f1043b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f681g);
            obtain.writeString(str);
            obtain.writeInt(123);
            obtain.writeString(null);
            obtain.writeInt(1);
            notification.writeToParcel(obtain, 0);
            aVar.f679a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return v1.a.n(new StringBuilder("NotifyTask[packageName:"), this.f1042a, ", id:123, tag:null]");
    }
}
