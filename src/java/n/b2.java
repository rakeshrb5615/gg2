package n;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class b2 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z9) {
        popupWindow.setIsClippedToScreen(z9);
    }
}
