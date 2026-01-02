package h;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static m0.h b(Configuration configuration) {
        return m0.h.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(m0.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hVar.f3950a.f3951a.toLanguageTags()));
    }

    public static void d(Configuration configuration, m0.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(hVar.f3950a.f3951a.toLanguageTags()));
    }
}
