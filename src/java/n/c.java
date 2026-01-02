package n;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4098b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f4097a = i;
        this.f4098b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4097a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4098b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.C = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.D);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4098b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.C = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.D);
                return;
        }
    }
}
