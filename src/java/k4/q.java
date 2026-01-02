package k4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class q extends k implements r {
    @Override // k4.k
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i9) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            l.b(parcel);
            e((Bundle) l.a(parcel));
            return true;
        } else if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            l.b(parcel);
            c((Bundle) l.a(parcel));
            return true;
        } else if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            l.b(parcel);
            d((Bundle) l.a(parcel));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            Parcelable.Creator creator4 = Bundle.CREATOR;
            l.b(parcel);
            b((Bundle) l.a(parcel));
            return true;
        }
    }
}
