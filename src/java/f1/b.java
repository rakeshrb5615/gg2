package f1;

import android.animation.ValueAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f1361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1362b;

    public b(d dVar) {
        this.f1362b = dVar;
    }

    public final boolean a() {
        boolean unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f1361a);
        this.f1361a = null;
        return unregisterDurationScaleChangeListener;
    }
}
