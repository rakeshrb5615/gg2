package q0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class u1 extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsetsController f5186b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f5187c;

    public u1(Window window, v3.f fVar) {
        this.f5186b = window.getInsetsController();
        this.f5187c = window;
    }

    @Override // a.a
    public boolean A() {
        this.f5186b.setSystemBarsAppearance(0, 0);
        return (this.f5186b.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // a.a
    public final void P(boolean z9) {
        Window window = this.f5187c;
        if (z9) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f5186b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f5186b.setSystemBarsAppearance(0, 16);
    }

    @Override // a.a
    public final void Q(boolean z9) {
        Window window = this.f5187c;
        if (z9) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f5186b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f5186b.setSystemBarsAppearance(0, 8);
    }
}
