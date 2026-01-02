package z4;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f7374a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static z f7375b;

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : sharedPreferences.getAll().keySet()) {
            edit.remove(str);
        }
        edit.apply();
    }
}
