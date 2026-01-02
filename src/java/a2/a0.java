package a2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new z(0);

    /* renamed from: a  reason: collision with root package name */
    public int f259a;

    /* renamed from: b  reason: collision with root package name */
    public int f260b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f261c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f259a);
        parcel.writeInt(this.f260b);
        parcel.writeInt(this.f261c ? 1 : 0);
    }
}
