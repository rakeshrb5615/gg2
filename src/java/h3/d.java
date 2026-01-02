package h3;

import a2.c1;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d extends x0.b {
    public static final Parcelable.Creator<d> CREATOR = new c1(3);

    /* renamed from: c  reason: collision with root package name */
    public final int f2163c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2164d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2165e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2166f;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2167m;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2163c = parcel.readInt();
        this.f2164d = parcel.readInt();
        this.f2165e = parcel.readInt() == 1;
        this.f2166f = parcel.readInt() == 1;
        this.f2167m = parcel.readInt() == 1;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2163c);
        parcel.writeInt(this.f2164d);
        parcel.writeInt(this.f2165e ? 1 : 0);
        parcel.writeInt(this.f2166f ? 1 : 0);
        parcel.writeInt(this.f2167m ? 1 : 0);
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f2163c = bottomSheetBehavior.N;
        this.f2164d = bottomSheetBehavior.e;
        this.f2165e = bottomSheetBehavior.b;
        this.f2166f = bottomSheetBehavior.I;
        this.f2167m = bottomSheetBehavior.J;
    }
}
