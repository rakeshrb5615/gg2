package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n extends c {
    public static final Parcelable.Creator<n> CREATOR = new a2.z(22);

    /* renamed from: a  reason: collision with root package name */
    public final String f6886a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6887b;

    public n(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f6886a = str;
        this.f6887b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6886a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6887b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.c
    public final String x() {
        return "google.com";
    }
}
