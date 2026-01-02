package q0;

import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class t1 extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final Window f5185b;

    public t1(Window window, v3.f fVar) {
        this.f5185b = window;
    }

    @Override // a.a
    public final boolean A() {
        return (this.f5185b.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // a.a
    public final void P(boolean z9) {
        if (!z9) {
            X(16);
            return;
        }
        Window window = this.f5185b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // a.a
    public final void Q(boolean z9) {
        if (!z9) {
            X(8192);
            return;
        }
        Window window = this.f5185b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void X(int i) {
        View decorView = this.f5185b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
