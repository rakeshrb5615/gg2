package z4;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzcl;
import com.google.android.gms.internal.firebase-auth-api.zzcv;
import com.google.android.gms.internal.firebase-auth-api.zzmy;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static r f7362c;

    /* renamed from: a  reason: collision with root package name */
    public final String f7363a;

    /* renamed from: b  reason: collision with root package name */
    public final zzmy f7364b;

    public r(String str, zzmy zzmyVar) {
        this.f7363a = str;
        this.f7364b = zzmyVar;
    }

    public static r a(Context context, String str) {
        zzmy zzmyVar;
        r rVar = f7362c;
        if (rVar == null || !Objects.equals(rVar.f7363a, str)) {
            try {
                zzcl.zza();
                zzmyVar = b(context, str);
            } catch (IOException | GeneralSecurityException e9) {
                String message = e9.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + message);
                if (e9 instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto." + str, 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        zzmyVar = b(context, str);
                    } catch (IOException | GeneralSecurityException e10) {
                        String message2 = e10.getMessage();
                        Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + message2);
                        zzmyVar = null;
                        f7362c = new r(str, zzmyVar);
                        return f7362c;
                    }
                }
                zzmyVar = null;
            }
            f7362c = new r(str, zzmyVar);
        }
        return f7362c;
    }

    public static zzmy b(Context context, String str) {
        zzmy.zza zzaVar = new zzmy.zza();
        zzmy.zza zza = zzaVar.zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcv.zzb);
        return zza.zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
    }
}
