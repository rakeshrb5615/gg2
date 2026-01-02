package n;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p0 extends View.BaseSavedState {
    public static final Parcelable.Creator<p0> CREATOR = new a2.z(17);

    /* renamed from: a  reason: collision with root package name */
    public boolean f4245a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f4245a ? (byte) 1 : (byte) 0);
    }
}
