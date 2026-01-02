package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f implements SafeParcelable {
    public static final Parcelable.Creator<f> CREATOR = new b(2);

    /* renamed from: a  reason: collision with root package name */
    public final long f7337a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7338b;

    public f(long j, long j8) {
        this.f7337a = j;
        this.f7338b = j8;
    }

    public static f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f7337a);
        SafeParcelWriter.writeLong(parcel, 2, this.f7338b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
