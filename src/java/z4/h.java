package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h extends y4.q {
    public static final Parcelable.Creator<h> CREATOR = new b(4);

    /* renamed from: a  reason: collision with root package name */
    public String f7345a;

    /* renamed from: b  reason: collision with root package name */
    public String f7346b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f7347c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f7348d;

    /* renamed from: e  reason: collision with root package name */
    public e f7349e;

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f7345a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f7346b, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f7347c, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f7348d, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f7349e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
