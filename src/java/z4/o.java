package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class o extends AbstractSafeParcelable {
    public static final Parcelable.Creator<o> CREATOR = new b(5);

    /* renamed from: a  reason: collision with root package name */
    public final List f7358a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7359b;

    public o(ArrayList arrayList, ArrayList arrayList2) {
        this.f7358a = arrayList == null ? new ArrayList() : arrayList;
        this.f7359b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f7358a, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f7359b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
