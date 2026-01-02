package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.firebase-auth-api.zzah;
import com.google.android.gms.internal.firebase-auth-api.zzak;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a2.z(23);

    /* renamed from: a  reason: collision with root package name */
    public final String f6859a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6860b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6861c;

    public e0(String str, String str2, String str3) {
        this.f6859a = str;
        this.f6860b = str2;
        this.f6861c = str3;
    }

    public static zzah x(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzah.zzg();
        }
        zzak zzf = zzah.zzf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzf.zza(new e0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzf.zza();
    }

    public static final e0 y(JSONObject jSONObject) {
        return new e0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6859a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6860b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f6861c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
