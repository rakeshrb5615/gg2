package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class x extends c {
    public static final Parcelable.Creator<x> CREATOR = new a2.z(26);

    /* renamed from: a  reason: collision with root package name */
    public final String f6897a;

    public x(String str) {
        this.f6897a = Preconditions.checkNotEmpty(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6897a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.c
    public final String x() {
        return "playgames.google.com";
    }
}
