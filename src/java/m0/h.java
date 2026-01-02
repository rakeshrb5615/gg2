package m0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f3949b = new h(new i(new LocaleList(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final i f3950a;

    public h(i iVar) {
        this.f3950a = iVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return f3949b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i9 = g.f3948a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new h(new i(new LocaleList(localeArr)));
    }

    public final boolean b() {
        return this.f3950a.f3951a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3950a.equals(((h) obj).f3950a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3950a.f3951a.hashCode();
    }

    public final String toString() {
        return this.f3950a.f3951a.toString();
    }
}
