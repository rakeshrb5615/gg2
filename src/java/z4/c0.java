package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c0 implements SafeParcelable {
    public static final Parcelable.Creator<c0> CREATOR = new b(6);

    /* renamed from: a  reason: collision with root package name */
    public final String f7319a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7320b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7321c;

    public c0(boolean z9) {
        this.f7321c = z9;
        this.f7320b = null;
        this.f7319a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f7319a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f7320b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f7321c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public c0(String str, String str2, boolean z9) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.f7319a = str;
        this.f7320b = str2;
        m.d(str2);
        this.f7321c = z9;
    }
}
