package z4;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzbc;
import com.google.android.gms.internal.firebase-auth-api.zzbd;
import com.google.android.gms.internal.firebase-auth-api.zzby;
import com.google.android.gms.internal.firebase-auth-api.zzks;
import com.google.android.gms.internal.firebase-auth-api.zzkt;
import com.google.android.gms.internal.firebase-auth-api.zzlh;
import com.google.android.gms.internal.firebase-auth-api.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static a0 f7302c;

    /* renamed from: a  reason: collision with root package name */
    public final String f7303a;

    /* renamed from: b  reason: collision with root package name */
    public final zzmy f7304b;

    public a0(Context context, String str) {
        zzmy zzmyVar;
        this.f7303a = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVar = new zzmy.zza();
            zzmy.zza zza = zzaVar.zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlh.zza);
            zza.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVar = zza.zza();
        } catch (IOException | GeneralSecurityException e9) {
            String message = e9.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message);
            zzmyVar = null;
        }
        this.f7304b = zzmyVar;
    }

    public static a0 c(Context context, String str) {
        a0 a0Var = f7302c;
        if (a0Var == null || !Objects.equals(a0Var.f7303a, str)) {
            f7302c = new a0(context, str);
        }
        return f7302c;
    }

    public final String a() {
        if (this.f7304b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzby zza = zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.f7304b) {
                this.f7304b.zza().zzb().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e9) {
            String message = e9.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + message);
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzmy zzmyVar = this.f7304b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbd) this.f7304b.zza().zza(zzks.zza(), zzbd.class)).zza(Base64.decode(str, 8), (byte[]) null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e9) {
            String message = e9.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }
}
