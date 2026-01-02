package m3;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public Long f3955a;

    @Override // m3.c
    public final boolean b() {
        if (this.f3955a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l5 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l5.longValue();
                this.f3955a = l5;
            } catch (Exception unused) {
                this.f3955a = -1L;
            }
        }
        return this.f3955a.longValue() >= 40100;
    }
}
