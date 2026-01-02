package s1;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import h.v;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class l extends e {

    /* renamed from: c  reason: collision with root package name */
    public final OnBackInvokedDispatcher f5804c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5805d;

    /* renamed from: e  reason: collision with root package name */
    public final OnBackInvokedCallback f5806e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5807f;

    public l(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f5804c = onBackInvokedDispatcher;
        this.f5805d = i;
        this.f5806e = Build.VERSION.SDK_INT == 33 ? new v(this, 3) : new k(this);
    }

    @Override // s1.e
    public final void b(boolean z9) {
        if (z9 && !this.f5807f) {
            this.f5804c.registerOnBackInvokedCallback(this.f5805d, this.f5806e);
            this.f5807f = true;
        } else if (z9 || !this.f5807f) {
        } else {
            this.f5804c.unregisterOnBackInvokedCallback(this.f5806e);
            this.f5807f = false;
        }
    }
}
