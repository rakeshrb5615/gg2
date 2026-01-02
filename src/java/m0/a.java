package m0;

import android.os.Build;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3941a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            e0.b.e(30);
        }
        if (i >= 30) {
            e0.b.e(31);
        }
        if (i >= 30) {
            e0.b.e(33);
        }
        if (i >= 30) {
            e0.b.e(1000000);
        }
    }

    public static final boolean a(String str) {
        String str2 = Build.VERSION.CODENAME;
        kotlin.jvm.internal.j.e(str2, "buildCodename");
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            kotlin.jvm.internal.j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Integer num = upperCase.equals("BAKLAVA") ? r2 : null;
            String upperCase2 = str.toUpperCase(locale);
            kotlin.jvm.internal.j.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            r2 = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num == null || r2 == null) {
                if (num == null && r2 == null) {
                    String upperCase3 = str2.toUpperCase(locale);
                    kotlin.jvm.internal.j.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase4 = str.toUpperCase(locale);
                    kotlin.jvm.internal.j.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= r2.intValue()) {
                return true;
            }
        }
        return false;
    }
}
