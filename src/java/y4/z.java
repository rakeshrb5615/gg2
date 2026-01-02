package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.firebase-auth-api.zzaao;
import com.google.android.gms.internal.firebase-auth-api.zzaiz;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class z extends p {
    public static final Parcelable.Creator<z> CREATOR = new a2.z(27);

    /* renamed from: a  reason: collision with root package name */
    public final String f6898a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6899b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6900c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaiz f6901d;

    public z(String str, String str2, long j, zzaiz zzaizVar) {
        this.f6898a = Preconditions.checkNotEmpty(str);
        this.f6899b = str2;
        this.f6900c = j;
        this.f6901d = (zzaiz) Preconditions.checkNotNull(zzaizVar, "totpInfo cannot be null.");
    }

    public static z y(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new z(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzaiz());
            }
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
    }

    @Override // y4.p
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f6898a);
            jSONObject.putOpt("displayName", this.f6899b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6900c));
            jSONObject.putOpt("totpInfo", this.f6901d);
            return jSONObject;
        } catch (JSONException e9) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e9);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6898a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6899b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f6900c);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f6901d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.p
    public final String x() {
        return "totp";
    }
}
