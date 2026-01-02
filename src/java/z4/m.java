package z4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.firebase-auth-api.zzaao;
import com.google.android.gms.internal.firebase-auth-api.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7356a = new Logger("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        Preconditions.checkNotEmpty(str);
        List zza = zzt.zza('.').zza(str);
        int size = zza.size();
        Logger logger = f7356a;
        if (size < 2) {
            logger.e(g2.g.l("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            r.e d9 = d(new String(Base64Utils.decodeUrlSafeNoPadding((String) zza.get(1)), "UTF-8"));
            return d9 == null ? new HashMap() : d9;
        } catch (UnsupportedEncodingException e9) {
            logger.e("Unable to decode token", e9, new Object[0]);
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.e, r.j] */
    public static r.e c(JSONObject jSONObject) {
        ?? jVar = new r.j(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            jVar.put(next, obj);
        }
        return jVar;
    }

    public static r.e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e9) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e9);
        }
    }
}
