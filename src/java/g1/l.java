package g1;

import android.os.Trace;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = m0.j.f3953b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (i.f1647k != null) {
                i.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = m0.j.f3953b;
            Trace.endSection();
            throw th;
        }
    }
}
