package i3;

import a2.c1;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends x0.b {
    public static final Parcelable.Creator<c> CREATOR = new c1(4);

    /* renamed from: c  reason: collision with root package name */
    public boolean f2640c;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.f2640c = parcel.readInt() == 1;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2640c ? 1 : 0);
    }
}
