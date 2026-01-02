package q3;

import a2.c1;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends x0.b {
    public static final Parcelable.Creator<a> CREATOR = new c1(6);

    /* renamed from: c  reason: collision with root package name */
    public boolean f5308c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5308c = parcel.readInt() == 1;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5308c ? 1 : 0);
    }
}
