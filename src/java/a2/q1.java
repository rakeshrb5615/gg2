package a2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class q1 implements Parcelable {
    public static final Parcelable.Creator<q1> CREATOR = new z(1);

    /* renamed from: a  reason: collision with root package name */
    public int f446a;

    /* renamed from: b  reason: collision with root package name */
    public int f447b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f448c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f449d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f446a + ", mGapDir=" + this.f447b + ", mHasUnwantedGapAfter=" + this.f449d + ", mGapPerSpan=" + Arrays.toString(this.f448c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f446a);
        parcel.writeInt(this.f447b);
        parcel.writeInt(this.f449d ? 1 : 0);
        int[] iArr = this.f448c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f448c);
    }
}
