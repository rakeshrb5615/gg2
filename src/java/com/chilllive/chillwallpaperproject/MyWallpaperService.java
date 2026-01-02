package com.chilllive.chillwallpaperproject;

import android.service.wallpaper.WallpaperService;
import i2.n0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class MyWallpaperService extends WallpaperService {
    @Override // android.service.wallpaper.WallpaperService
    public final WallpaperService.Engine onCreateEngine() {
        return new n0(this);
    }
}
