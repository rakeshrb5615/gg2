package y4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a2.z(29);

    /* renamed from: a  reason: collision with root package name */
    public String f6844a;

    /* renamed from: b  reason: collision with root package name */
    public String f6845b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6846c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6847d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f6848e;

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f6844a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f6845b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f6846c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f6847d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
