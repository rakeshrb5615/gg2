package x3;

import a2.z;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new z(19);

    /* renamed from: a  reason: collision with root package name */
    public float f6564a;

    /* renamed from: b  reason: collision with root package name */
    public float f6565b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f6566c;

    /* renamed from: d  reason: collision with root package name */
    public float f6567d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6568e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f6564a);
        parcel.writeFloat(this.f6565b);
        parcel.writeList(this.f6566c);
        parcel.writeFloat(this.f6567d);
        parcel.writeBooleanArray(new boolean[]{this.f6568e});
    }
}
