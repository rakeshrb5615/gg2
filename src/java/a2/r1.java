package a2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class r1 implements Parcelable {
    public static final Parcelable.Creator<r1> CREATOR = new z(2);

    /* renamed from: a  reason: collision with root package name */
    public int f456a;

    /* renamed from: b  reason: collision with root package name */
    public int f457b;

    /* renamed from: c  reason: collision with root package name */
    public int f458c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f459d;

    /* renamed from: e  reason: collision with root package name */
    public int f460e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f461f;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f462m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f463n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f464o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f465p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f456a);
        parcel.writeInt(this.f457b);
        parcel.writeInt(this.f458c);
        if (this.f458c > 0) {
            parcel.writeIntArray(this.f459d);
        }
        parcel.writeInt(this.f460e);
        if (this.f460e > 0) {
            parcel.writeIntArray(this.f461f);
        }
        parcel.writeInt(this.f463n ? 1 : 0);
        parcel.writeInt(this.f464o ? 1 : 0);
        parcel.writeInt(this.f465p ? 1 : 0);
        parcel.writeList(this.f462m);
    }
}
