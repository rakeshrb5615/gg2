package i2;

import android.app.WallpaperColors;
import android.content.ClipData;
import android.graphics.Color;
import android.view.ContentInfo;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract /* synthetic */ class u0 {
    public static /* synthetic */ WallpaperColors a(Color color, int i) {
        return new WallpaperColors(color, null, null, i);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
