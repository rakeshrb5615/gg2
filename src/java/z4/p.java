package z4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.firebase-auth-api.zzah;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final zzah f7360a = zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b  reason: collision with root package name */
    public static final p f7361b = new Object();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzah zzahVar = f7360a;
        int size = zzahVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzahVar.get(i);
            i++;
            edit.remove((String) obj);
        }
        edit.commit();
    }
}
