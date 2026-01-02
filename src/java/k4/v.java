package k4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class v extends k implements w {
    @Override // k4.k
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i9) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            l.b(parcel);
            b((Bundle) l.a(parcel));
            return true;
        }
        return false;
    }
}
