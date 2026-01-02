package z4;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class u implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f7370a;

    public u(s sVar) {
        this.f7370a = sVar;
    }

    public final void onBackgroundStateChanged(boolean z9) {
        s sVar = this.f7370a;
        if (!z9) {
            sVar.getClass();
            sVar.getClass();
            return;
        }
        sVar.getClass();
        i iVar = sVar.f7365a;
        iVar.f7353c.removeCallbacks(iVar.f7354d);
    }
}
