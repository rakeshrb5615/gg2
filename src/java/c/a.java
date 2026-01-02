package c;

import android.os.Build;
import android.window.BackEvent;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f795a;

    /* renamed from: b  reason: collision with root package name */
    public final float f796b;

    /* renamed from: c  reason: collision with root package name */
    public final float f797c;

    /* renamed from: d  reason: collision with root package name */
    public final int f798d;

    /* renamed from: e  reason: collision with root package name */
    public final long f799e;

    public a(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        long frameTimeMillis = Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L;
        this.f795a = touchX;
        this.f796b = touchY;
        this.f797c = progress;
        this.f798d = swipeEdge;
        this.f799e = frameTimeMillis;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f795a + ", touchY=" + this.f796b + ", progress=" + this.f797c + ", swipeEdge=" + this.f798d + ", frameTimeMillis=" + this.f799e + ')';
    }
}
