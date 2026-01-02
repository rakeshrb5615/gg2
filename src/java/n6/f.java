package n6;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final Date f4909h = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f4910a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f4911b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f4912c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONArray f4913d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f4914e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4915f;

    /* renamed from: g  reason: collision with root package name */
    public final JSONArray f4916g;

    public f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f4911b = jSONObject;
        this.f4912c = date;
        this.f4913d = jSONArray;
        this.f4914e = jSONObject2;
        this.f4915f = j;
        this.f4916g = jSONArray2;
        this.f4910a = jSONObject3;
    }

    public static f a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n6.e] */
    public static e c() {
        ?? obj = new Object();
        obj.f4903a = new JSONObject();
        obj.f4904b = f4909h;
        obj.f4905c = new JSONArray();
        obj.f4906d = new JSONObject();
        obj.f4907e = 0L;
        obj.f4908f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f4916g;
            if (i >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                String string3 = jSONArray2.getString(i9);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f4910a.toString().equals(((f) obj).f4910a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4910a.hashCode();
    }

    public final String toString() {
        return this.f4910a.toString();
    }
}
