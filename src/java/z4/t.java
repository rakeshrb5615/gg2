package z4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.firebase-auth-api.zzaao;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.android.gms.internal.firebase-auth-api.zzba;
import com.google.android.gms.internal.firebase-auth-api.zzco;
import com.google.android.gms.internal.firebase-auth-api.zzmy;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y4.e0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public Context f7366a;

    /* renamed from: b  reason: collision with root package name */
    public String f7367b;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f7368c;

    /* renamed from: d  reason: collision with root package name */
    public Logger f7369d;

    public final String a(String str) {
        String str2;
        String string = this.f7368c.getString(str, null);
        if (string != null) {
            if (string.startsWith("ENCRYPTED:")) {
                r a10 = r.a(this.f7366a, this.f7367b);
                String substring = string.substring(10);
                a10.getClass();
                Preconditions.checkNotNull(substring);
                zzmy zzmyVar = a10.f7364b;
                if (zzmyVar == null) {
                    Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
                    return null;
                }
                try {
                    synchronized (zzmyVar) {
                        str2 = new String(((zzba) a10.f7364b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(substring, 2), (byte[]) null), StandardCharsets.UTF_8);
                    }
                    return str2;
                } catch (IllegalArgumentException | GeneralSecurityException e9) {
                    String message = e9.getMessage();
                    Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
                    return null;
                }
            }
            return string;
        }
        return null;
    }

    public final e b(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        f a10;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z9 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(c.x(jSONArray3.getString(i)));
            }
            e eVar = new e(q4.f.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                eVar.f7325a = (zzahv) Preconditions.checkNotNull(zzahv.zzb(string));
            }
            if (!z9) {
                eVar.f7332n = Boolean.FALSE;
            }
            eVar.f7331m = str;
            if (jSONObject.has("userMetadata") && (a10 = f.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                eVar.f7333o = a10;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i9));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(optString) ? y4.w.y(jSONObject2) : Objects.equals(optString, "totp") ? y4.z.y(jSONObject2) : null);
                }
                eVar.A(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList3.add(e0.y(new JSONObject(jSONArray.getString(i10))));
                }
                eVar.f7336s = arrayList3;
            }
            return eVar;
        } catch (JSONException e9) {
            e = e9;
            this.f7369d.wtf(e);
            return null;
        } catch (zzaao e10) {
            e = e10;
            this.f7369d.wtf(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            this.f7369d.wtf(e);
            return null;
        } catch (IllegalArgumentException e12) {
            e = e12;
            this.f7369d.wtf(e);
            return null;
        }
    }

    public final void c(String str, String str2) {
        String encodeToString;
        r a10 = r.a(this.f7366a, this.f7367b);
        a10.getClass();
        Preconditions.checkNotNull(str2);
        zzmy zzmyVar = a10.f7364b;
        String str3 = null;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmyVar) {
                    encodeToString = Base64.encodeToString(((zzba) a10.f7364b.zza().zza(zzco.zza(), zzba.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), (byte[]) null), 2);
                }
                str3 = encodeToString;
            } catch (GeneralSecurityException e9) {
                String message = e9.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + message);
            }
        }
        if (str3 != null) {
            this.f7368c.edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }
}
