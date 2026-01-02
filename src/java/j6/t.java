package j6;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final long f3286d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a  reason: collision with root package name */
    public final String f3287a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3288b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3289c;

    public t(String str, String str2, long j) {
        this.f3287a = str;
        this.f3288b = str2;
        this.f3289c = j;
    }

    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e9) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e9);
            return null;
        }
    }

    public static t b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new t(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e9) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e9);
                return null;
            }
        }
        return new t(str, null, 0L);
    }
}
