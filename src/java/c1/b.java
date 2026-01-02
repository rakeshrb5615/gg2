package c1;

import android.content.Context;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class b {
    public static final boolean a(Context context, String str) {
        j.e(context, "context");
        j.e(str, "name");
        return context.deleteSharedPreferences(str);
    }
}
