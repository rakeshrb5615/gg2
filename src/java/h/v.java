package h;

import android.window.OnBackInvokedCallback;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class v implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2112b;

    public /* synthetic */ v(Object obj, int i) {
        this.f2111a = i;
        this.f2112b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2111a) {
            case 0:
                ((c0) this.f2112b).G();
                return;
            case 1:
                ((Runnable) this.f2112b).run();
                return;
            case 2:
                ((r3.b) this.f2112b).a();
                return;
            default:
                ((s1.l) this.f2112b).a();
                return;
        }
    }
}
