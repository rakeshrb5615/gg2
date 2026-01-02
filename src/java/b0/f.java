package b0;

import a2.c1;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f extends x0.b {
    public static final Parcelable.Creator<f> CREATOR = new c1(2);

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f698c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f698c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f698c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f698c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = this.f698c.keyAt(i9);
            parcelableArr[i9] = (Parcelable) this.f698c.valueAt(i9);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
