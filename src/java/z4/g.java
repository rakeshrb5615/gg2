package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import y4.g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g extends y4.q {
    public static final Parcelable.Creator<g> CREATOR = new b(3);

    /* renamed from: a  reason: collision with root package name */
    public final List f7339a;

    /* renamed from: b  reason: collision with root package name */
    public final h f7340b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7341c;

    /* renamed from: d  reason: collision with root package name */
    public final g0 f7342d;

    /* renamed from: e  reason: collision with root package name */
    public final e f7343e;

    /* renamed from: f  reason: collision with root package name */
    public final List f7344f;

    public g(ArrayList arrayList, h hVar, String str, g0 g0Var, e eVar, ArrayList arrayList2) {
        this.f7339a = (List) Preconditions.checkNotNull(arrayList);
        this.f7340b = (h) Preconditions.checkNotNull(hVar);
        this.f7341c = Preconditions.checkNotEmpty(str);
        this.f7342d = g0Var;
        this.f7343e = eVar;
        this.f7344f = (List) Preconditions.checkNotNull(arrayList2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f7339a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f7340b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f7341c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f7342d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f7343e, i, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f7344f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
