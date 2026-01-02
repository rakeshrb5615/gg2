package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.firebase-auth-api.zzaao;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class w extends p {
    public static final Parcelable.Creator<w> CREATOR = new a2.z(25);

    /* renamed from: a  reason: collision with root package name */
    public final String f6893a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6894b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6895c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6896d;

    public w(long j, String str, String str2, String str3) {
        this.f6893a = Preconditions.checkNotEmpty(str);
        this.f6894b = str2;
        this.f6895c = j;
        this.f6896d = Preconditions.checkNotEmpty(str3);
    }

    public static w y(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new w(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // y4.p
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f6893a);
            jSONObject.putOpt("displayName", this.f6894b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6895c));
            jSONObject.putOpt("phoneNumber", this.f6896d);
            return jSONObject;
        } catch (JSONException e9) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e9);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6893a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6894b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f6895c);
        SafeParcelWriter.writeString(parcel, 4, this.f6896d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.p
    public final String x() {
        return "phone";
    }
}
