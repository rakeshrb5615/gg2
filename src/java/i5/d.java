package i5;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2705a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f2706b = 64;

    /* renamed from: c  reason: collision with root package name */
    public final int f2707c;

    public d(int i) {
        this.f2707c = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        String a10 = a(this.f2707c, "com.crashlytics.version-control-info");
        if (this.f2705a.size() >= this.f2706b && !this.f2705a.containsKey(a10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f2706b, null);
            return false;
        }
        String a11 = a(this.f2707c, str);
        String str2 = (String) this.f2705a.get(a10);
        if (str2 == null ? a11 == null : str2.equals(a11)) {
            return false;
        }
        this.f2705a.put(a10, a11);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String a10 = a(this.f2707c, str);
                if (this.f2705a.size() >= this.f2706b && !this.f2705a.containsKey(a10)) {
                    i++;
                }
                String str2 = (String) entry.getValue();
                this.f2705a.put(a10, str2 == null ? "" : a(this.f2707c, str2));
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f2706b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
