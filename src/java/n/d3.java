package n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d3 extends x0.b {
    public static final Parcelable.Creator<d3> CREATOR = new a2.c1(5);

    /* renamed from: c  reason: collision with root package name */
    public int f4110c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4111d;

    public d3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4110c = parcel.readInt();
        this.f4111d = parcel.readInt() != 0;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4110c);
        parcel.writeInt(this.f4111d ? 1 : 0);
    }
}
