package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a0 extends c {
    public static final Parcelable.Creator<a0> CREATOR = new a2.z(28);

    /* renamed from: a  reason: collision with root package name */
    public final String f6839a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6840b;

    public a0(String str, String str2) {
        this.f6839a = Preconditions.checkNotEmpty(str);
        this.f6840b = Preconditions.checkNotEmpty(str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6839a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6840b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.c
    public final String x() {
        return "twitter.com";
    }
}
