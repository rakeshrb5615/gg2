package r3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f5566b;

    public d(e eVar, b bVar) {
        this.f5566b = eVar;
        this.f5565a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f5566b.f5564a != null) {
            this.f5565a.d();
        }
    }

    public final void onBackInvoked() {
        this.f5565a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f5566b.f5564a != null) {
            this.f5565a.b(new c.a(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f5566b.f5564a != null) {
            this.f5565a.c(new c.a(backEvent));
        }
    }
}
