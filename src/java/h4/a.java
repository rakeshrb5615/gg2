package h4;

import a2.z;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new z(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f2194a, 0);
        parcel.writeInt(bVar.f2195b ? 1 : 0);
    }
}
