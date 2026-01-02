package j6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class q extends AbstractSafeParcelable {
    public static final Parcelable.Creator<q> CREATOR = new a2.z(15);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f3277a;

    /* renamed from: b  reason: collision with root package name */
    public j f3278b;

    public q(Bundle bundle) {
        this.f3277a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f3277a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final j x() {
        if (this.f3278b == null) {
            Bundle bundle = this.f3277a;
            if (o.C(bundle)) {
                this.f3278b = new j(new o(bundle));
            }
        }
        return this.f3278b;
    }
}
