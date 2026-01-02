package g5;

import android.util.Log;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final h f1791d = new h(0);

    /* renamed from: e  reason: collision with root package name */
    public static final i f1792e = new i(0);

    /* renamed from: a  reason: collision with root package name */
    public final m5.c f1793a;

    /* renamed from: b  reason: collision with root package name */
    public String f1794b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f1795c = null;

    public j(m5.c cVar) {
        this.f1793a = cVar;
    }

    public static void a(m5.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e9);
        }
    }
}
