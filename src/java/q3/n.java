package q3;

import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class n {
    public static Rect a(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }
}
