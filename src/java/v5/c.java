package v5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import t5.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c implements t5.f {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f6304a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f6304a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // t5.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).e(f6304a.format((Date) obj));
    }
}
