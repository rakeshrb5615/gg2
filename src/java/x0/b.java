package x0;

import a2.c1;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class b implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f6540a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f6539b = new b();
    public static final Parcelable.Creator<b> CREATOR = new c1(8);

    public b() {
        this.f6540a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6540a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6540a = parcelable == f6539b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f6540a = readParcelable == null ? f6539b : readParcelable;
    }
}
