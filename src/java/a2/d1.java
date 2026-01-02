package a2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d1 extends x0.b {
    public static final Parcelable.Creator<d1> CREATOR = new c1(0);

    /* renamed from: c  reason: collision with root package name */
    public Parcelable f299c;

    public d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f299c = parcel.readParcelable(classLoader == null ? t0.class.getClassLoader() : classLoader);
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f299c, 0);
    }
}
