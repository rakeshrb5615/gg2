package z4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.firebase-auth-api.zzaao;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends AbstractSafeParcelable implements y4.b0 {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: a  reason: collision with root package name */
    public String f7311a;

    /* renamed from: b  reason: collision with root package name */
    public String f7312b;

    /* renamed from: c  reason: collision with root package name */
    public String f7313c;

    /* renamed from: d  reason: collision with root package name */
    public String f7314d;

    /* renamed from: e  reason: collision with root package name */
    public String f7315e;

    /* renamed from: f  reason: collision with root package name */
    public String f7316f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7317m;

    /* renamed from: n  reason: collision with root package name */
    public String f7318n;

    public c(String str, String str2, String str3, String str4, String str5, String str6, boolean z9, String str7) {
        this.f7311a = str;
        this.f7312b = str2;
        this.f7315e = str3;
        this.f7316f = str4;
        this.f7313c = str5;
        this.f7314d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f7317m = z9;
        this.f7318n = str7;
    }

    public static c x(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e9) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaao(e9);
        }
    }

    @Override // y4.b0
    public final String s() {
        return this.f7312b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f7311a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f7312b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f7313c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f7314d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f7315e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f7316f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f7317m);
        SafeParcelWriter.writeString(parcel, 8, this.f7318n, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f7311a);
            jSONObject.putOpt("providerId", this.f7312b);
            jSONObject.putOpt("displayName", this.f7313c);
            jSONObject.putOpt("photoUrl", this.f7314d);
            jSONObject.putOpt("email", this.f7315e);
            jSONObject.putOpt("phoneNumber", this.f7316f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f7317m));
            jSONObject.putOpt("rawUserInfo", this.f7318n);
            return jSONObject.toString();
        } catch (JSONException e9) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaao(e9);
        }
    }
}
