package m2;

import android.content.Context;
import android.content.SharedPreferences;
import j5.t1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat[] f3954a;

    static {
        Locale locale = Locale.US;
        f3954a = new SimpleDateFormat[]{new SimpleDateFormat("yyyy-MM-dd HH:mm", locale), new SimpleDateFormat("dd/MM yyyy, HH:mm", locale)};
    }

    public a() {
        new SimpleDateFormat("dd/MM yyyy, HH:mm", new Locale.Builder().setLanguage("en").setRegion("US").build());
    }

    public static float a() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(12) / 60.0f) + calendar.get(11);
    }

    public static String b(float f9) {
        int i = (int) f9;
        return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i), Integer.valueOf((int) ((f9 - i) * 60.0f)));
    }

    public static float[] c(Context context, int i) {
        float f9;
        float f10;
        SharedPreferences z9 = t1.z(context);
        float f11 = z9.getFloat("sunriseTimeFloatKey", 6.0f);
        float f12 = z9.getFloat("sunsetTimeFloatKey", 18.0f);
        float f13 = z9.getFloat("systemTime", 12.0f);
        float f14 = i == 9 ? 2.0f : 1.0f;
        float f15 = 2.0f * f14;
        if (f13 > f11 - f14 && f13 < f11 + f14) {
            f10 = f13 - f11;
        } else if (f13 <= f12 - f14 || f13 >= f12 + f14) {
            f9 = -1.0f;
            return new float[]{f13, f11, f12, f9};
        } else {
            f10 = f13 - f12;
        }
        f9 = (f10 + f14) / f15;
        return new float[]{f13, f11, f12, f9};
    }

    public static boolean d() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2);
        int i9 = calendar.get(5);
        return i == 11 && i9 >= 24 && i9 <= 27;
    }

    public static boolean e(Context context) {
        SharedPreferences z9 = t1.z(context);
        float[] fArr = {z9.getFloat("systemTime", 12.0f), z9.getFloat("sunriseTimeFloatKey", 6.0f), z9.getFloat("sunsetTimeFloatKey", 18.0f)};
        float f9 = fArr[0];
        return f9 >= fArr[1] && f9 <= fArr[2];
    }

    public static boolean f(int i, String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        Date date = null;
        for (SimpleDateFormat simpleDateFormat : f3954a) {
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
        }
        return date == null || System.currentTimeMillis() - date.getTime() >= ((long) i) * 60000;
    }
}
