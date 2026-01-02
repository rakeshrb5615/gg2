package q4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f5399a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5400b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5401c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5402d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5403e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5404f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5405g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f5400b = str;
        this.f5399a = str2;
        this.f5401c = str3;
        this.f5402d = str4;
        this.f5403e = str5;
        this.f5404f = str6;
        this.f5405g = str7;
    }

    public static j a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new j(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return Objects.equal(this.f5400b, jVar.f5400b) && Objects.equal(this.f5399a, jVar.f5399a) && Objects.equal(this.f5401c, jVar.f5401c) && Objects.equal(this.f5402d, jVar.f5402d) && Objects.equal(this.f5403e, jVar.f5403e) && Objects.equal(this.f5404f, jVar.f5404f) && Objects.equal(this.f5405g, jVar.f5405g);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.f5400b, this.f5399a, this.f5401c, this.f5402d, this.f5403e, this.f5404f, this.f5405g});
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f5400b).add("apiKey", this.f5399a).add("databaseUrl", this.f5401c).add("gcmSenderId", this.f5403e).add("storageBucket", this.f5404f).add("projectId", this.f5405g).toString();
    }
}
