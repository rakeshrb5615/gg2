package z4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import y4.g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d0 implements SafeParcelable {
    public static final Parcelable.Creator<d0> CREATOR = new b(7);

    /* renamed from: a  reason: collision with root package name */
    public e f7322a;

    /* renamed from: b  reason: collision with root package name */
    public c0 f7323b;

    /* renamed from: c  reason: collision with root package name */
    public g0 f7324c;

    public d0(e eVar) {
        e eVar2 = (e) Preconditions.checkNotNull(eVar);
        this.f7322a = eVar2;
        ArrayList arrayList = eVar2.f7329e;
        this.f7323b = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.isEmpty(((c) arrayList.get(i)).f7318n)) {
                this.f7323b = new c0(((c) arrayList.get(i)).f7312b, ((c) arrayList.get(i)).f7318n, eVar.f7334p);
            }
        }
        if (this.f7323b == null) {
            this.f7323b = new c0(eVar.f7334p);
        }
        this.f7324c = eVar.q;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f7322a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f7323b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f7324c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
