package d6;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final long f1149b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f1150c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static j f1151d;

    /* renamed from: a  reason: collision with root package name */
    public final v3.f f1152a;

    public j(v3.f fVar) {
        this.f1152a = fVar;
    }

    public final boolean a(e6.b bVar) {
        if (TextUtils.isEmpty(bVar.f1322c)) {
            return true;
        }
        long j = bVar.f1325f + bVar.f1324e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f1152a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f1149b;
    }
}
